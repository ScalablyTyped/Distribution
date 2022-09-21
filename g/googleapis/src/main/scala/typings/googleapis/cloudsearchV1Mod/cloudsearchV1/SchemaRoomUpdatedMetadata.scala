package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoomUpdatedMetadata extends StObject {
  
  var groupDetailsMetadata: js.UndefOr[SchemaGroupDetailsUpdatedMetadata] = js.undefined
  
  var groupLinkSharingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The user who initiated this room update. Complete member profiles, when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in.
    */
  var initiator: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The type of the user who initiated this room update.
    */
  var initiatorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * What was updated in the room.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var renameMetadata: js.UndefOr[SchemaRoomRenameMetadata] = js.undefined
  
  /**
    * DEPRECATED: See GroupVisibility proto definition.
    */
  var visibility: js.UndefOr[SchemaAppsDynamiteSharedGroupVisibility] = js.undefined
}
object SchemaRoomUpdatedMetadata {
  
  inline def apply(): SchemaRoomUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomUpdatedMetadata]
  }
  
  extension [Self <: SchemaRoomUpdatedMetadata](x: Self) {
    
    inline def setGroupDetailsMetadata(value: SchemaGroupDetailsUpdatedMetadata): Self = StObject.set(x, "groupDetailsMetadata", value.asInstanceOf[js.Any])
    
    inline def setGroupDetailsMetadataUndefined: Self = StObject.set(x, "groupDetailsMetadata", js.undefined)
    
    inline def setGroupLinkSharingEnabled(value: Boolean): Self = StObject.set(x, "groupLinkSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setGroupLinkSharingEnabledNull: Self = StObject.set(x, "groupLinkSharingEnabled", null)
    
    inline def setGroupLinkSharingEnabledUndefined: Self = StObject.set(x, "groupLinkSharingEnabled", js.undefined)
    
    inline def setInitiator(value: SchemaUser): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorType(value: String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setInitiatorTypeNull: Self = StObject.set(x, "initiatorType", null)
    
    inline def setInitiatorTypeUndefined: Self = StObject.set(x, "initiatorType", js.undefined)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRenameMetadata(value: SchemaRoomRenameMetadata): Self = StObject.set(x, "renameMetadata", value.asInstanceOf[js.Any])
    
    inline def setRenameMetadataUndefined: Self = StObject.set(x, "renameMetadata", js.undefined)
    
    inline def setVisibility(value: SchemaAppsDynamiteSharedGroupVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
