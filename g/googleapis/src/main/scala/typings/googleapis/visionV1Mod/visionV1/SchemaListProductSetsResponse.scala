package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListProductSets` method.
  */
trait SchemaListProductSetsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of ProductSets.
    */
  var productSets: js.UndefOr[js.Array[SchemaProductSet]] = js.undefined
}
object SchemaListProductSetsResponse {
  
  inline def apply(): SchemaListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductSetsResponse]
  }
  
  extension [Self <: SchemaListProductSetsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProductSets(value: js.Array[SchemaProductSet]): Self = StObject.set(x, "productSets", value.asInstanceOf[js.Any])
    
    inline def setProductSetsUndefined: Self = StObject.set(x, "productSets", js.undefined)
    
    inline def setProductSetsVarargs(value: SchemaProductSet*): Self = StObject.set(x, "productSets", js.Array(value :_*))
  }
}
