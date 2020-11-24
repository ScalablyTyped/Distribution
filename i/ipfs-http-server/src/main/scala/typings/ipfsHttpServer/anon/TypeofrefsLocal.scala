package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrefsLocal extends js.Object {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_10: Typeofoptions10 = js.native
}
object TypeofrefsLocal {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_10: Typeofoptions10): TypeofrefsLocal = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_10 = options_10.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrefsLocal]
  }
  
  @scala.inline
  implicit class TypeofrefsLocalOps[Self <: TypeofrefsLocal] (val x: Self) extends AnyVal {
    
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
    def setOptions_10(value: Typeofoptions10): Self = this.set("options_10", value.asInstanceOf[js.Any])
  }
}
