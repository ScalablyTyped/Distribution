package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpatchAddLink extends js.Object {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_16: Typeofoptions16 = js.native
}
object TypeofpatchAddLink {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_16: Typeofoptions16): TypeofpatchAddLink = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_16 = options_16.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchAddLink]
  }
  
  @scala.inline
  implicit class TypeofpatchAddLinkOps[Self <: TypeofpatchAddLink] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = this.set("handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_16(value: Typeofoptions16): Self = this.set("options_16", value.asInstanceOf[js.Any])
  }
}
