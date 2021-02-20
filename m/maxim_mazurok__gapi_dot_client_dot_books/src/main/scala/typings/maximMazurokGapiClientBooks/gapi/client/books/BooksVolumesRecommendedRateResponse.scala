package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooksVolumesRecommendedRateResponse extends StObject {
  
  var consistency_token: js.UndefOr[String] = js.native
}
object BooksVolumesRecommendedRateResponse {
  
  @scala.inline
  def apply(): BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksVolumesRecommendedRateResponse]
  }
  
  @scala.inline
  implicit class BooksVolumesRecommendedRateResponseMutableBuilder[Self <: BooksVolumesRecommendedRateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistency_token(value: String): Self = StObject.set(x, "consistency_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistency_tokenUndefined: Self = StObject.set(x, "consistency_token", js.undefined)
  }
}
