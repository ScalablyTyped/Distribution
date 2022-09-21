package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of results. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of rooms.
    */
  var rooms: js.UndefOr[js.Array[SchemaGoogleHomeEnterpriseSdmV1Room]] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRooms(value: js.Array[SchemaGoogleHomeEnterpriseSdmV1Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
    
    inline def setRoomsVarargs(value: SchemaGoogleHomeEnterpriseSdmV1Room*): Self = StObject.set(x, "rooms", js.Array(value*))
  }
}
