package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpatchAppendData extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_12: Typeofoptions12 = js.native
}
object TypeofpatchAppendData {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_12: Typeofoptions12): TypeofpatchAppendData = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_12 = options_12.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchAppendData]
  }
  
  @scala.inline
  implicit class TypeofpatchAppendDataMutableBuilder[Self <: TypeofpatchAppendData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_12(value: Typeofoptions12): Self = StObject.set(x, "options_12", value.asInstanceOf[js.Any])
  }
}
