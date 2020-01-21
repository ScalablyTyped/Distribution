package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container.
  */
@js.native
trait SchemaContainer extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The Container ID uniquely identifies the GTM Container.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Optional list of domain names associated with the Container.
    */
  var domainName: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of enabled built-in variables. Valid values include: pageUrl,
    * pageHostname, pagePath, referrer, event, clickElement, clickClasses,
    * clickId, clickTarget, clickUrl, clickText, formElement, formClasses,
    * formId, formTarget, formUrl, formText, errorMessage, errorUrl, errorLine,
    * newHistoryFragment, oldHistoryFragment, newHistoryState, oldHistoryState,
    * historySource, containerVersion, debugMode, randomNumber, containerId.
    */
  var enabledBuiltInVariable: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fingerprint of the GTM Container as computed at storage time. This
    * value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Container display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Container Notes.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Container Public ID.
    */
  var publicId: js.UndefOr[String] = js.native
  /**
    * Container Country ID.
    */
  var timeZoneCountryId: js.UndefOr[String] = js.native
  /**
    * Container Time Zone ID.
    */
  var timeZoneId: js.UndefOr[String] = js.native
  /**
    * List of Usage Contexts for the Container. Valid values include: web,
    * android, ios.
    */
  var usageContext: js.UndefOr[js.Array[String]] = js.native
}

object SchemaContainer {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    domainName: js.Array[String] = null,
    enabledBuiltInVariable: js.Array[String] = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    publicId: String = null,
    timeZoneCountryId: String = null,
    timeZoneId: String = null,
    usageContext: js.Array[String] = null
  ): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (enabledBuiltInVariable != null) __obj.updateDynamic("enabledBuiltInVariable")(enabledBuiltInVariable.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (publicId != null) __obj.updateDynamic("publicId")(publicId.asInstanceOf[js.Any])
    if (timeZoneCountryId != null) __obj.updateDynamic("timeZoneCountryId")(timeZoneCountryId.asInstanceOf[js.Any])
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId.asInstanceOf[js.Any])
    if (usageContext != null) __obj.updateDynamic("usageContext")(usageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainer]
  }
}

