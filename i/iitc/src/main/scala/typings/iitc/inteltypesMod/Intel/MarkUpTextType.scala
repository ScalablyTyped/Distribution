package typings.iitc.inteltypesMod.Intel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkUpTextType extends js.Object {
  
  var plain: String = js.native
}
object MarkUpTextType {
  
  @scala.inline
  def apply(plain: String): MarkUpTextType = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkUpTextType]
  }
  
  @scala.inline
  implicit class MarkUpTextTypeOps[Self <: MarkUpTextType] (val x: Self) extends AnyVal {
    
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
    def setPlain(value: String): Self = this.set("plain", value.asInstanceOf[js.Any])
  }
}
