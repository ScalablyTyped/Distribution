package typings.libp2pGossipsub.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlGraft extends js.Object {
  
  var topicID: js.UndefOr[String] = js.native
}
object ControlGraft {
  
  @scala.inline
  def apply(): ControlGraft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlGraft]
  }
  
  @scala.inline
  implicit class ControlGraftOps[Self <: ControlGraft] (val x: Self) extends AnyVal {
    
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
    def setTopicID(value: String): Self = this.set("topicID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicID: Self = this.set("topicID", js.undefined)
  }
}
