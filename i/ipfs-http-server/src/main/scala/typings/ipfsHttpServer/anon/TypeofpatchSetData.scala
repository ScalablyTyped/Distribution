package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpatchSetData extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_14: Typeofoptions14
}
object TypeofpatchSetData {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_14: Typeofoptions14): TypeofpatchSetData = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_14 = options_14.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchSetData]
  }
  
  @scala.inline
  implicit class TypeofpatchSetDataMutableBuilder[Self <: TypeofpatchSetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_14(value: Typeofoptions14): Self = StObject.set(x, "options_14", value.asInstanceOf[js.Any])
  }
}
