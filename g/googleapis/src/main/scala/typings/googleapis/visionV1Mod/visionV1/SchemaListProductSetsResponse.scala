package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListProductSets` method.
  */
@js.native
trait SchemaListProductSetsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of ProductSets.
    */
  var productSets: js.UndefOr[js.Array[SchemaProductSet]] = js.native
}
object SchemaListProductSetsResponse {
  
  @scala.inline
  def apply(): SchemaListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductSetsResponse]
  }
  
  @scala.inline
  implicit class SchemaListProductSetsResponseMutableBuilder[Self <: SchemaListProductSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProductSets(value: js.Array[SchemaProductSet]): Self = StObject.set(x, "productSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetsUndefined: Self = StObject.set(x, "productSets", js.undefined)
    
    @scala.inline
    def setProductSetsVarargs(value: SchemaProductSet*): Self = StObject.set(x, "productSets", js.Array(value :_*))
  }
}
