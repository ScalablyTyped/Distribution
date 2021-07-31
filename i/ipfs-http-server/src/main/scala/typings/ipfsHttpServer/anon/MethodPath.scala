package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodPath extends StObject {
  
  def handler(_request: js.Any, h: js.Any): js.Any
  
  var method: String
  
  var path: String
}
object MethodPath {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, method: String, path: String): MethodPath = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPath]
  }
  
  @scala.inline
  implicit class MethodPathMutableBuilder[Self <: MethodPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
