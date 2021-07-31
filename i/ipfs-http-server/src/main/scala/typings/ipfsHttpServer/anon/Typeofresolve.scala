package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofresolve extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_4: Typeofoptions4
}
object Typeofresolve {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_4: Typeofoptions4): Typeofresolve = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofresolve]
  }
  
  @scala.inline
  implicit class TypeofresolveMutableBuilder[Self <: Typeofresolve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
