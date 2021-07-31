package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflist extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options: Typeofoptions
}
object Typeoflist {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options: Typeofoptions): Typeoflist = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflist]
  }
  
  @scala.inline
  implicit class TypeoflistMutableBuilder[Self <: Typeoflist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Typeofoptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
