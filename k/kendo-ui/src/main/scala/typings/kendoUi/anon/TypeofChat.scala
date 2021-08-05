package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChat extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Chat
  
  /* static member */
  var fn: Chat
}
object TypeofChat {
  
  inline def apply(extend: js.Object => Chat, fn: Chat): TypeofChat = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChat]
  }
  
  extension [Self <: TypeofChat](x: Self) {
    
    inline def setExtend(value: js.Object => Chat): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Chat): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
