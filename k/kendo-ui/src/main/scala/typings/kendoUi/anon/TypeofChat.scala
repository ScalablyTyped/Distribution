package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofChat extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Chat = js.native
  
  /* static member */
  var fn: Chat = js.native
}
object TypeofChat {
  
  @scala.inline
  def apply(extend: js.Object => Chat, fn: Chat): TypeofChat = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChat]
  }
  
  @scala.inline
  implicit class TypeofChatMutableBuilder[Self <: TypeofChat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Chat): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Chat): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
