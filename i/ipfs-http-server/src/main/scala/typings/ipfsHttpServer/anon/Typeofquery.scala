package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofquery extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Any = js.native
  
  val options_10: Typeofoptions10 = js.native
}
object Typeofquery {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, options_10: Typeofoptions10): Typeofquery = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_10 = options_10.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofquery]
  }
  
  @scala.inline
  implicit class TypeofqueryMutableBuilder[Self <: Typeofquery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_10(value: Typeofoptions10): Self = StObject.set(x, "options_10", value.asInstanceOf[js.Any])
  }
}
