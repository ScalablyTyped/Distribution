package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFleetsResponse extends StObject {
  
  /**
    * The list of matching fleets.
    */
  var fleets: js.UndefOr[js.Array[SchemaFleet]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. The token is only valid for 1h.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFleetsResponse {
  
  inline def apply(): SchemaListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFleetsResponse]
  }
  
  extension [Self <: SchemaListFleetsResponse](x: Self) {
    
    inline def setFleets(value: js.Array[SchemaFleet]): Self = StObject.set(x, "fleets", value.asInstanceOf[js.Any])
    
    inline def setFleetsUndefined: Self = StObject.set(x, "fleets", js.undefined)
    
    inline def setFleetsVarargs(value: SchemaFleet*): Self = StObject.set(x, "fleets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
