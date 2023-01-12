package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteRoomUpdatedMetadata extends StObject {
  
  var groupDetailsMetadata: js.UndefOr[AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata] = js.undefined
  
  var groupLinkSharingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The user who initiated this room update. Complete member profiles, when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in. */
  var initiator: js.UndefOr[AppsDynamiteFrontendUser] = js.undefined
  
  /** The type of the user who initiated this room update. */
  var initiatorType: js.UndefOr[String] = js.undefined
  
  /** What was updated in the room. */
  var name: js.UndefOr[String] = js.undefined
  
  var renameMetadata: js.UndefOr[AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata] = js.undefined
  
  /** DEPRECATED: See GroupVisibility proto definition. */
  var visibility: js.UndefOr[AppsDynamiteSharedGroupVisibility] = js.undefined
}
object AppsDynamiteRoomUpdatedMetadata {
  
  inline def apply(): AppsDynamiteRoomUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteRoomUpdatedMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteRoomUpdatedMetadata] (val x: Self) extends AnyVal {
    
    inline def setGroupDetailsMetadata(value: AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata): Self = StObject.set(x, "groupDetailsMetadata", value.asInstanceOf[js.Any])
    
    inline def setGroupDetailsMetadataUndefined: Self = StObject.set(x, "groupDetailsMetadata", js.undefined)
    
    inline def setGroupLinkSharingEnabled(value: Boolean): Self = StObject.set(x, "groupLinkSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setGroupLinkSharingEnabledUndefined: Self = StObject.set(x, "groupLinkSharingEnabled", js.undefined)
    
    inline def setInitiator(value: AppsDynamiteFrontendUser): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorType(value: String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setInitiatorTypeUndefined: Self = StObject.set(x, "initiatorType", js.undefined)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRenameMetadata(value: AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata): Self = StObject.set(x, "renameMetadata", value.asInstanceOf[js.Any])
    
    inline def setRenameMetadataUndefined: Self = StObject.set(x, "renameMetadata", js.undefined)
    
    inline def setVisibility(value: AppsDynamiteSharedGroupVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
