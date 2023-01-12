package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenLink extends StObject {
  
  /** Next available ID: 5 */
  var loadIndicator: js.UndefOr[String] = js.undefined
  
  var onClose: js.UndefOr[String] = js.undefined
  
  var openAs: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object OpenLink {
  
  inline def apply(): OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenLink] (val x: Self) extends AnyVal {
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setOnClose(value: String): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpenAs(value: String): Self = StObject.set(x, "openAs", value.asInstanceOf[js.Any])
    
    inline def setOpenAsUndefined: Self = StObject.set(x, "openAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
