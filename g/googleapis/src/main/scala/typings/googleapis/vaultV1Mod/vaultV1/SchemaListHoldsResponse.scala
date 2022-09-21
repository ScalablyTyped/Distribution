package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHoldsResponse extends StObject {
  
  /**
    * The list of holds.
    */
  var holds: js.UndefOr[js.Array[SchemaHold]] = js.undefined
  
  /**
    * Page token to retrieve the next page of results in the list. If this is empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListHoldsResponse {
  
  inline def apply(): SchemaListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHoldsResponse]
  }
  
  extension [Self <: SchemaListHoldsResponse](x: Self) {
    
    inline def setHolds(value: js.Array[SchemaHold]): Self = StObject.set(x, "holds", value.asInstanceOf[js.Any])
    
    inline def setHoldsUndefined: Self = StObject.set(x, "holds", js.undefined)
    
    inline def setHoldsVarargs(value: SchemaHold*): Self = StObject.set(x, "holds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
