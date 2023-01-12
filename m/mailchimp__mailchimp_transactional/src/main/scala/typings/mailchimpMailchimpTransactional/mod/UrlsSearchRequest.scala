package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsSearchRequest
  extends StObject
     with BaseRequest {
  
  /** a search query */
  var q: String
}
object UrlsSearchRequest {
  
  inline def apply(q: String): UrlsSearchRequest = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlsSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
