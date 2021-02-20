package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoflistHandler3 extends StObject {
  
  def handler_3(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_10: Typeofoptions10 = js.native
}
object TypeoflistHandler3 {
  
  @scala.inline
  def apply(handler_3: (js.Any, js.Any) => js.Promise[_], options_10: Typeofoptions10): TypeoflistHandler3 = {
    val __obj = js.Dynamic.literal(handler_3 = js.Any.fromFunction2(handler_3), options_10 = options_10.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoflistHandler3]
  }
  
  @scala.inline
  implicit class TypeoflistHandler3MutableBuilder[Self <: TypeoflistHandler3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_3(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_3", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_10(value: Typeofoptions10): Self = StObject.set(x, "options_10", value.asInstanceOf[js.Any])
  }
}
