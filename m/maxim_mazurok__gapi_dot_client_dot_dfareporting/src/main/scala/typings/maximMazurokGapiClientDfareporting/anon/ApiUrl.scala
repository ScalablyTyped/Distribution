package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiUrl extends StObject {
  
  /** The URL for downloading the report data through the API. */
  var apiUrl: js.UndefOr[String] = js.undefined
  
  /** The URL for downloading the report data through a browser. */
  var browserUrl: js.UndefOr[String] = js.undefined
}
object ApiUrl {
  
  inline def apply(): ApiUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiUrl] (val x: Self) extends AnyVal {
    
    inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    inline def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
  }
}
