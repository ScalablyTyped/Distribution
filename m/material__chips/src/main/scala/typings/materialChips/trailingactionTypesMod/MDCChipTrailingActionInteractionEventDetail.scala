package typings.materialChips.trailingactionTypesMod

import typings.materialChips.trailingactionConstantsMod.InteractionTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCChipTrailingActionInteractionEventDetail extends js.Object {
  
  var trigger: InteractionTrigger = js.native
}
object MDCChipTrailingActionInteractionEventDetail {
  
  @scala.inline
  def apply(trigger: InteractionTrigger): MDCChipTrailingActionInteractionEventDetail = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCChipTrailingActionInteractionEventDetail]
  }
  
  @scala.inline
  implicit class MDCChipTrailingActionInteractionEventDetailOps[Self <: MDCChipTrailingActionInteractionEventDetail] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: InteractionTrigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
}
