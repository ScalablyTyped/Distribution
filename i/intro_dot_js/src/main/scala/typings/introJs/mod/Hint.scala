package typings.introJs.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends js.Object {
  
  var element: js.UndefOr[String | HTMLElement | Element] = js.native
  
  var hint: String = js.native
  
  var hintPosition: js.UndefOr[String] = js.native
}
object Hint {
  
  @scala.inline
  def apply(hint: String): Hint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
    
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
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: String | HTMLElement | Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setHintPosition(value: String): Self = this.set("hintPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintPosition: Self = this.set("hintPosition", js.undefined)
  }
}
