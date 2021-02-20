package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Zone&#39;s contents.
  */
@js.native
trait SchemaZone extends StObject {
  
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
  implicit class SchemaZoneMutableBuilder[Self <: SchemaZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBoundary(value: SchemaZoneBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setChildContainer(value: js.Array[SchemaZoneChildContainer]): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    @scala.inline
    def setChildContainerVarargs(value: SchemaZoneChildContainer*): Self = StObject.set(x, "childContainer", js.Array(value :_*))
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTypeRestriction(value: SchemaZoneTypeRestriction): Self = StObject.set(x, "typeRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeRestrictionUndefined: Self = StObject.set(x, "typeRestriction", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
