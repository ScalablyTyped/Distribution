package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSharesResponse extends StObject {
  
  /**
    * The token you can use to retrieve the next page of results. Not returned if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of shares in the project for the specified instance.
    */
  var shares: js.UndefOr[js.Array[SchemaShare]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListSharesResponse {
  
  inline def apply(): SchemaListSharesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSharesResponse]
  }
  
  extension [Self <: SchemaListSharesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setShares(value: js.Array[SchemaShare]): Self = StObject.set(x, "shares", value.asInstanceOf[js.Any])
    
    inline def setSharesUndefined: Self = StObject.set(x, "shares", js.undefined)
    
    inline def setSharesVarargs(value: SchemaShare*): Self = StObject.set(x, "shares", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
