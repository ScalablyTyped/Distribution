package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLinkedAdUnitsResponse extends StObject {
  
  /**
    * The ad units returned in the list response.
    */
  var adUnits: js.UndefOr[js.Array[SchemaAdUnit]] = js.undefined
  
  /**
    * Continuation token used to page through ad units. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListLinkedAdUnitsResponse {
  
  inline def apply(): SchemaListLinkedAdUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLinkedAdUnitsResponse]
  }
  
  extension [Self <: SchemaListLinkedAdUnitsResponse](x: Self) {
    
    inline def setAdUnits(value: js.Array[SchemaAdUnit]): Self = StObject.set(x, "adUnits", value.asInstanceOf[js.Any])
    
    inline def setAdUnitsUndefined: Self = StObject.set(x, "adUnits", js.undefined)
    
    inline def setAdUnitsVarargs(value: SchemaAdUnit*): Self = StObject.set(x, "adUnits", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
