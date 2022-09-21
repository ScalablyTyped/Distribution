package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRepricingProductReportsResponse extends StObject {
  
  /**
    * A token for retrieving the next page. Its absence means there is no subsequent page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Periodic reports for the given Repricing product.
    */
  var repricingProductReports: js.UndefOr[js.Array[SchemaRepricingProductReport]] = js.undefined
}
object SchemaListRepricingProductReportsResponse {
  
  inline def apply(): SchemaListRepricingProductReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRepricingProductReportsResponse]
  }
  
  extension [Self <: SchemaListRepricingProductReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingProductReports(value: js.Array[SchemaRepricingProductReport]): Self = StObject.set(x, "repricingProductReports", value.asInstanceOf[js.Any])
    
    inline def setRepricingProductReportsUndefined: Self = StObject.set(x, "repricingProductReports", js.undefined)
    
    inline def setRepricingProductReportsVarargs(value: SchemaRepricingProductReport*): Self = StObject.set(x, "repricingProductReports", js.Array(value*))
  }
}
