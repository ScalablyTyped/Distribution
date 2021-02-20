package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrmHandler1 extends StObject {
  
  def handler_1(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_2: Typeofoptions2 = js.native
}
object TypeofrmHandler1 {
  
  @scala.inline
  def apply(handler_1: (js.Any, js.Any) => js.Promise[_], options_2: Typeofoptions2): TypeofrmHandler1 = {
    val __obj = js.Dynamic.literal(handler_1 = js.Any.fromFunction2(handler_1), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrmHandler1]
  }
  
  @scala.inline
  implicit class TypeofrmHandler1MutableBuilder[Self <: TypeofrmHandler1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_1(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_2(value: Typeofoptions2): Self = StObject.set(x, "options_2", value.asInstanceOf[js.Any])
  }
}
