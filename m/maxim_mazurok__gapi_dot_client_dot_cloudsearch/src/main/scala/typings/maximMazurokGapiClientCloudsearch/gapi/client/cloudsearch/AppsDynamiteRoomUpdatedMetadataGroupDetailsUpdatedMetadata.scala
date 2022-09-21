package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata extends StObject {
  
  var newGroupDetails: js.UndefOr[AppsDynamiteSharedGroupDetails] = js.undefined
  
  var prevGroupDetails: js.UndefOr[AppsDynamiteSharedGroupDetails] = js.undefined
}
object AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata {
  
  inline def apply(): AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata]
  }
  
  extension [Self <: AppsDynamiteRoomUpdatedMetadataGroupDetailsUpdatedMetadata](x: Self) {
    
    inline def setNewGroupDetails(value: AppsDynamiteSharedGroupDetails): Self = StObject.set(x, "newGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setNewGroupDetailsUndefined: Self = StObject.set(x, "newGroupDetails", js.undefined)
    
    inline def setPrevGroupDetails(value: AppsDynamiteSharedGroupDetails): Self = StObject.set(x, "prevGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setPrevGroupDetailsUndefined: Self = StObject.set(x, "prevGroupDetails", js.undefined)
  }
}
