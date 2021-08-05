package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeProtocols extends StObject {
  
  var file: js.UndefOr[Boolean] = js.undefined
  
  var http: js.UndefOr[Boolean] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var javascript: js.UndefOr[Boolean] = js.undefined
}
object SafeProtocols {
  
  inline def apply(): SafeProtocols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeProtocols]
  }
  
  extension [Self <: SafeProtocols](x: Self) {
    
    inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setJavascript(value: Boolean): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
  }
}
