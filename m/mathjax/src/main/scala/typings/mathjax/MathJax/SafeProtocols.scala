package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeProtocols extends StObject {
  
  var file: js.UndefOr[Boolean] = js.native
  
  var http: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var javascript: js.UndefOr[Boolean] = js.native
}
object SafeProtocols {
  
  @scala.inline
  def apply(): SafeProtocols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeProtocols]
  }
  
  @scala.inline
  implicit class SafeProtocolsMutableBuilder[Self <: SafeProtocols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    @scala.inline
    def setJavascript(value: Boolean): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
  }
}
