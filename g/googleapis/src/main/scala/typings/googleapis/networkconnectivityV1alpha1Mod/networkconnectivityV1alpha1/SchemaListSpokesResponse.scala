package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSpokesResponse extends StObject {
  
  /**
    * The next pagination token in the List response. It should be used as page_token for the following request. An empty value means no more result.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Spokes to be returned.
    */
  var spokes: js.UndefOr[js.Array[SchemaSpoke]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListSpokesResponse {
  
  inline def apply(): SchemaListSpokesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSpokesResponse]
  }
  
  extension [Self <: SchemaListSpokesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSpokes(value: js.Array[SchemaSpoke]): Self = StObject.set(x, "spokes", value.asInstanceOf[js.Any])
    
    inline def setSpokesUndefined: Self = StObject.set(x, "spokes", js.undefined)
    
    inline def setSpokesVarargs(value: SchemaSpoke*): Self = StObject.set(x, "spokes", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
