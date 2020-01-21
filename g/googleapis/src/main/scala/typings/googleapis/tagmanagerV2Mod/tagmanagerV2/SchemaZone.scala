package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Zone&#39;s contents.
  */
@js.native
trait SchemaZone extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * This Zone&#39;s boundary.
    */
  var boundary: js.UndefOr[SchemaZoneBoundary] = js.native
  /**
    * Containers that are children of this Zone.
    */
  var childContainer: js.UndefOr[js.Array[SchemaZoneChildContainer]] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Zone as computed at storage time. This value
    * is recomputed whenever the zone is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Zone display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this zone in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * GTM Zone&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * This Zone&#39;s type restrictions.
    */
  var typeRestriction: js.UndefOr[SchemaZoneTypeRestriction] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
  /**
    * The Zone ID uniquely identifies the GTM Zone.
    */
  var zoneId: js.UndefOr[String] = js.native
}

object SchemaZone {
  @scala.inline
  def apply(
    accountId: String = null,
    boundary: SchemaZoneBoundary = null,
    childContainer: js.Array[SchemaZoneChildContainer] = null,
    containerId: String = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    typeRestriction: SchemaZoneTypeRestriction = null,
    workspaceId: String = null,
    zoneId: String = null
  ): SchemaZone = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (typeRestriction != null) __obj.updateDynamic("typeRestriction")(typeRestriction.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaZone]
  }
}

