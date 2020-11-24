package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZone]
  }
  
  @scala.inline
  implicit class SchemaZoneOps[Self <: SchemaZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setBoundary(value: SchemaZoneBoundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setChildContainerVarargs(value: SchemaZoneChildContainer*): Self = this.set("childContainer", js.Array(value :_*))
    
    @scala.inline
    def setChildContainer(value: js.Array[SchemaZoneChildContainer]): Self = this.set("childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildContainer: Self = this.set("childContainer", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTypeRestriction(value: SchemaZoneTypeRestriction): Self = this.set("typeRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeRestriction: Self = this.set("typeRestriction", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
