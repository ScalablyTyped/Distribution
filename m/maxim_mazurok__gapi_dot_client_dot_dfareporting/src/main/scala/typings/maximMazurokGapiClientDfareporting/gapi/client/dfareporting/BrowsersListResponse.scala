package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowsersListResponse extends StObject {
  
  /** Browser collection. */
  var browsers: js.UndefOr[js.Array[Browser]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#browsersListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object BrowsersListResponse {
  
  @scala.inline
  def apply(): BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowsersListResponse]
  }
  
  @scala.inline
  implicit class BrowsersListResponseMutableBuilder[Self <: BrowsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowsers(value: js.Array[Browser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    @scala.inline
    def setBrowsersVarargs(value: Browser*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
