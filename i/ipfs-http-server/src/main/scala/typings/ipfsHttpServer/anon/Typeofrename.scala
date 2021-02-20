package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrename extends StObject {
  
  def handler_2(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_4: Typeofoptions4 = js.native
}
object Typeofrename {
  
  @scala.inline
  def apply(handler_2: (js.Any, js.Any) => js.Promise[_], options_4: Typeofoptions4): Typeofrename = {
    val __obj = js.Dynamic.literal(handler_2 = js.Any.fromFunction2(handler_2), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrename]
  }
  
  @scala.inline
  implicit class TypeofrenameMutableBuilder[Self <: Typeofrename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_2(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
