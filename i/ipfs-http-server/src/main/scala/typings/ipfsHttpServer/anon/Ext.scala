package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ext extends StObject {
  
  var ext: OnPostHandler = js.native
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  var response: Ranges = js.native
}
object Ext {
  
  @scala.inline
  def apply(ext: OnPostHandler, handler: (js.Any, js.Any) => js.Promise[_], response: Ranges): Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  
  @scala.inline
  implicit class ExtMutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
