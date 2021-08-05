package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowsersListResponse extends StObject {
  
  /** Browser collection. */
  var browsers: js.UndefOr[js.Array[Browser]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#browsersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object BrowsersListResponse {
  
  inline def apply(): BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowsersListResponse]
  }
  
  extension [Self <: BrowsersListResponse](x: Self) {
    
    inline def setBrowsers(value: js.Array[Browser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: Browser*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
