package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ext extends StObject {
  
  var ext: OnPostHandler
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  var response: Ranges
}
object Ext {
  
  @scala.inline
  def apply(ext: OnPostHandler, handler: (js.Any, js.Any) => js.Promise[js.Any], response: Ranges): Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  
  @scala.inline
  implicit class ExtMutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
