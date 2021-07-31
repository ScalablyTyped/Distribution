package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdata extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_8: Typeofoptions8
}
object Typeofdata {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_8: Typeofoptions8): Typeofdata = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdata]
  }
  
  @scala.inline
  implicit class TypeofdataMutableBuilder[Self <: Typeofdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
