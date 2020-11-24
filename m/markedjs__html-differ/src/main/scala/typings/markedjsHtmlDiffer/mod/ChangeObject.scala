package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeObject extends js.Object {
  
  /** True if the value was inserted into the new string */
  val added: js.UndefOr[Boolean] = js.native
  
  /** True if the value was removed from the old string */
  val removed: js.UndefOr[Boolean] = js.native
  
  /** Text content */
  val value: js.UndefOr[String] = js.native
}
object ChangeObject {
  
  @scala.inline
  def apply(): ChangeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeObject]
  }
  
  @scala.inline
  implicit class ChangeObjectOps[Self <: ChangeObject] (val x: Self) extends AnyVal {
    
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
    def setAdded(value: Boolean): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
