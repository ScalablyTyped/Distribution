package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZone extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This Zone's boundary.
    */
  var boundary: js.UndefOr[SchemaZoneBoundary] = js.undefined
  
  /**
    * Containers that are children of this Zone.
    */
  var childContainer: js.UndefOr[js.Array[SchemaZoneChildContainer]] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fingerprint of the GTM Zone as computed at storage time. This value is recomputed whenever the zone is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zone display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User notes on how to apply this zone in the container.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Zone's API relative path.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This Zone's type restrictions.
    */
  var typeRestriction: js.UndefOr[SchemaZoneTypeRestriction] = js.undefined
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Zone ID uniquely identifies the GTM Zone.
    */
  var zoneId: js.UndefOr[String | Null] = js.undefined
}
object SchemaZone {
  
  inline def apply(): SchemaZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZone]
  }
  
  extension [Self <: SchemaZone](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBoundary(value: SchemaZoneBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setChildContainer(value: js.Array[SchemaZoneChildContainer]): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    inline def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    inline def setChildContainerVarargs(value: SchemaZoneChildContainer*): Self = StObject.set(x, "childContainer", js.Array(value*))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlNull: Self = StObject.set(x, "tagManagerUrl", null)
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTypeRestriction(value: SchemaZoneTypeRestriction): Self = StObject.set(x, "typeRestriction", value.asInstanceOf[js.Any])
    
    inline def setTypeRestrictionUndefined: Self = StObject.set(x, "typeRestriction", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdNull: Self = StObject.set(x, "workspaceId", null)
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    inline def setZoneIdNull: Self = StObject.set(x, "zoneId", null)
    
    inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
