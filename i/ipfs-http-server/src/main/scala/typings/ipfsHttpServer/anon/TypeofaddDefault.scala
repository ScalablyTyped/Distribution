package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofaddDefault extends StObject {
  
  def handler_1(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_4: Typeofoptions4 = js.native
}
object TypeofaddDefault {
  
  @scala.inline
  def apply(handler_1: (js.Any, js.Any) => js.Promise[_], options_4: Typeofoptions4): TypeofaddDefault = {
    val __obj = js.Dynamic.literal(handler_1 = js.Any.fromFunction2(handler_1), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaddDefault]
  }
  
  @scala.inline
  implicit class TypeofaddDefaultMutableBuilder[Self <: TypeofaddDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_1(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
