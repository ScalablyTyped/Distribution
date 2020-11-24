package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofaddHandler extends js.Object {
  
  def handler(request: js.Any, h: js.Any): js.Any = js.native
  
  val options_4: Typeofoptions4Validate2 = js.native
}
object TypeofaddHandler {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, options_4: Typeofoptions4Validate2): TypeofaddHandler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaddHandler]
  }
  
  @scala.inline
  implicit class TypeofaddHandlerOps[Self <: TypeofaddHandler] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: (js.Any, js.Any) => js.Any): Self = this.set("handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4Validate2): Self = this.set("options_4", value.asInstanceOf[js.Any])
  }
}
