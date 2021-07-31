package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpatchAddLink extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_16: Typeofoptions16
}
object TypeofpatchAddLink {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_16: Typeofoptions16): TypeofpatchAddLink = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_16 = options_16.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchAddLink]
  }
  
  @scala.inline
  implicit class TypeofpatchAddLinkMutableBuilder[Self <: TypeofpatchAddLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_16(value: Typeofoptions16): Self = StObject.set(x, "options_16", value.asInstanceOf[js.Any])
  }
}
