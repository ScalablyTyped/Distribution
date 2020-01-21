package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Macro.
  */
@js.native
trait SchemaMacro extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * For mobile containers only: A list of rule IDs for disabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var disablingRuleId: js.UndefOr[js.Array[String]] = js.native
  /**
    * For mobile containers only: A list of rule IDs for enabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var enablingRuleId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fingerprint of the GTM Macro as computed at storage time. This value
    * is recomputed whenever the macro is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The Macro ID uniquely identifies the GTM Macro.
    */
  var macroId: js.UndefOr[String] = js.native
  /**
    * Macro display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this macro in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The macro&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  /**
    * The end timestamp in milliseconds to schedule a macro.
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  /**
    * The start timestamp in milliseconds to schedule a macro.
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  /**
    * GTM Macro Type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMacro {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    disablingRuleId: js.Array[String] = null,
    enablingRuleId: js.Array[String] = null,
    fingerprint: String = null,
    macroId: String = null,
    name: String = null,
    notes: String = null,
    parameter: js.Array[SchemaParameter] = null,
    parentFolderId: String = null,
    scheduleEndMs: String = null,
    scheduleStartMs: String = null,
    `type`: String = null
  ): SchemaMacro = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (disablingRuleId != null) __obj.updateDynamic("disablingRuleId")(disablingRuleId.asInstanceOf[js.Any])
    if (enablingRuleId != null) __obj.updateDynamic("enablingRuleId")(enablingRuleId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (macroId != null) __obj.updateDynamic("macroId")(macroId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (scheduleEndMs != null) __obj.updateDynamic("scheduleEndMs")(scheduleEndMs.asInstanceOf[js.Any])
    if (scheduleStartMs != null) __obj.updateDynamic("scheduleStartMs")(scheduleStartMs.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMacro]
  }
}

