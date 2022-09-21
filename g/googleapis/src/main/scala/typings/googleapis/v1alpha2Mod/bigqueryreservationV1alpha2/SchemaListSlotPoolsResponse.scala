package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSlotPoolsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of slot pools visible to the user.
    */
  var slotPools: js.UndefOr[js.Array[SchemaSlotPool]] = js.undefined
}
object SchemaListSlotPoolsResponse {
  
  inline def apply(): SchemaListSlotPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSlotPoolsResponse]
  }
  
  extension [Self <: SchemaListSlotPoolsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSlotPools(value: js.Array[SchemaSlotPool]): Self = StObject.set(x, "slotPools", value.asInstanceOf[js.Any])
    
    inline def setSlotPoolsUndefined: Self = StObject.set(x, "slotPools", js.undefined)
    
    inline def setSlotPoolsVarargs(value: SchemaSlotPool*): Self = StObject.set(x, "slotPools", js.Array(value*))
  }
}
