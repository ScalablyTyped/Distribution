package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepricingProductReportsResponse extends StObject {
  
  /** A token for retrieving the next page. Its absence means there is no subsequent page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Periodic reports for the given Repricing product. */
  var repricingProductReports: js.UndefOr[js.Array[RepricingProductReport]] = js.undefined
}
object ListRepricingProductReportsResponse {
  
  inline def apply(): ListRepricingProductReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepricingProductReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRepricingProductReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingProductReports(value: js.Array[RepricingProductReport]): Self = StObject.set(x, "repricingProductReports", value.asInstanceOf[js.Any])
    
    inline def setRepricingProductReportsUndefined: Self = StObject.set(x, "repricingProductReports", js.undefined)
    
    inline def setRepricingProductReportsVarargs(value: RepricingProductReport*): Self = StObject.set(x, "repricingProductReports", js.Array(value*))
  }
}
