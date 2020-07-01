package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container Version.
  */
@js.native
trait SchemaContainerVersion extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The built-in variables in the container that this version was taken from.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
  /**
    * The container that this version was taken from.
    */
  var container: js.UndefOr[SchemaContainer] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * The custom templates in the container that this version was taken from.
    */
  var customTemplate: js.UndefOr[js.Array[SchemaCustomTemplate]] = js.native
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Container version description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Container Version as computed at storage time.
    * This value is recomputed whenever the container version is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The folders in the container that this version was taken from.
    */
  var folder: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM ContainerVersions&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The tags in the container that this version was taken from.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * The triggers in the container that this version was taken from.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.native
  /**
    * The variables in the container that this version was taken from.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * The zones in the container that this version was taken from.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.native
}

object SchemaContainerVersion {
  @scala.inline
  def apply(
    accountId: String = null,
    builtInVariable: js.Array[SchemaBuiltInVariable] = null,
    container: SchemaContainer = null,
    containerId: String = null,
    containerVersionId: String = null,
    customTemplate: js.Array[SchemaCustomTemplate] = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    fingerprint: String = null,
    folder: js.Array[SchemaFolder] = null,
    name: String = null,
    path: String = null,
    tag: js.Array[SchemaTag] = null,
    tagManagerUrl: String = null,
    trigger: js.Array[SchemaTrigger] = null,
    variable: js.Array[SchemaVariable] = null,
    zone: js.Array[SchemaZone] = null
  ): SchemaContainerVersion = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (customTemplate != null) __obj.updateDynamic("customTemplate")(customTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerVersion]
  }
}

