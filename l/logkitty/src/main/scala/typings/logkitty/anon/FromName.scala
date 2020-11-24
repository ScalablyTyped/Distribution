package typings.logkitty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromName extends js.Object {
  
  def fromName(key: js.Any): Double = js.native
}
object FromName {
  
  @scala.inline
  def apply(fromName: js.Any => Double): FromName = {
    val __obj = js.Dynamic.literal(fromName = js.Any.fromFunction1(fromName))
    __obj.asInstanceOf[FromName]
  }
  
  @scala.inline
  implicit class FromNameOps[Self <: FromName] (val x: Self) extends AnyVal {
    
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
    def setFromName(value: js.Any => Double): Self = this.set("fromName", js.Any.fromFunction1(value))
  }
}
