package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata extends StObject {
  
  var newName: js.UndefOr[String] = js.undefined
  
  /** NEXT_TAG: 3 */
  var prevName: js.UndefOr[String] = js.undefined
}
object AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata {
  
  inline def apply(): AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata]
  }
  
  extension [Self <: AppsDynamiteRoomUpdatedMetadataRoomRenameMetadata](x: Self) {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
    
    inline def setPrevName(value: String): Self = StObject.set(x, "prevName", value.asInstanceOf[js.Any])
    
    inline def setPrevNameUndefined: Self = StObject.set(x, "prevName", js.undefined)
  }
}
