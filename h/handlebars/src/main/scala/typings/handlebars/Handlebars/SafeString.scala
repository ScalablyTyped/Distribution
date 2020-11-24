package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeString extends js.Object {
  
  def toHTML(): String = js.native
}
object SafeString {
  
  @scala.inline
  def apply(toHTML: () => String): SafeString = {
    val __obj = js.Dynamic.literal(toHTML = js.Any.fromFunction0(toHTML))
    __obj.asInstanceOf[SafeString]
  }
  
  @scala.inline
  implicit class SafeStringOps[Self <: SafeString] (val x: Self) extends AnyVal {
    
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
    def setToHTML(value: () => String): Self = this.set("toHTML", js.Any.fromFunction0(value))
  }
}
