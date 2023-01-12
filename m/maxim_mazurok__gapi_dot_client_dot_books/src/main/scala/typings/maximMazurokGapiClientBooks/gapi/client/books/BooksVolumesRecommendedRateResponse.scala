package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooksVolumesRecommendedRateResponse extends StObject {
  
  var consistency_token: js.UndefOr[String] = js.undefined
}
object BooksVolumesRecommendedRateResponse {
  
  inline def apply(): BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksVolumesRecommendedRateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooksVolumesRecommendedRateResponse] (val x: Self) extends AnyVal {
    
    inline def setConsistency_token(value: String): Self = StObject.set(x, "consistency_token", value.asInstanceOf[js.Any])
    
    inline def setConsistency_tokenUndefined: Self = StObject.set(x, "consistency_token", js.undefined)
  }
}
