package typings.gulpConnect.anon

import org.scalablytyped.runtime.Instantiable0
import typings.connect.mod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofconnectModule extends js.Object {
  
  var IncomingMessage: Instantiable0[typings.connect.mod.IncomingMessage] = js.native
}
object TypeofconnectModule {
  
  @scala.inline
  def apply(IncomingMessage: Instantiable0[IncomingMessage]): TypeofconnectModule = {
    val __obj = js.Dynamic.literal(IncomingMessage = IncomingMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofconnectModule]
  }
  
  @scala.inline
  implicit class TypeofconnectModuleOps[Self <: TypeofconnectModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncomingMessage(value: Instantiable0[IncomingMessage]): Self = this.set("IncomingMessage", value.asInstanceOf[js.Any])
  }
}
