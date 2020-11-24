package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrename extends js.Object {
  
  def handler_2(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_4: Typeofoptions4 = js.native
}
object Typeofrename {
  
  @scala.inline
  def apply(handler_2: (js.Any, js.Any) => js.Promise[_], options_4: Typeofoptions4): Typeofrename = {
    val __obj = js.Dynamic.literal(handler_2 = js.Any.fromFunction2(handler_2), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrename]
  }
  
  @scala.inline
  implicit class TypeofrenameOps[Self <: Typeofrename] (val x: Self) extends AnyVal {
    
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
    def setHandler_2(value: (js.Any, js.Any) => js.Promise[_]): Self = this.set("handler_2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4): Self = this.set("options_4", value.asInstanceOf[js.Any])
  }
}
