package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoffindProvs extends js.Object {
  
  def handler(request: js.Any, h: js.Any): js.Any = js.native
  
  val options_2: Typeofoptions2 = js.native
}
object TypeoffindProvs {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, options_2: Typeofoptions2): TypeoffindProvs = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoffindProvs]
  }
  
  @scala.inline
  implicit class TypeoffindProvsOps[Self <: TypeoffindProvs] (val x: Self) extends AnyVal {
    
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
    def setOptions_2(value: Typeofoptions2): Self = this.set("options_2", value.asInstanceOf[js.Any])
  }
}
