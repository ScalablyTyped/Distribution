package typings.materialChips.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCChipInteractionEventDetail extends js.Object {
  
  var chipId: String = js.native
}
object MDCChipInteractionEventDetail {
  
  @scala.inline
  def apply(chipId: String): MDCChipInteractionEventDetail = {
    val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCChipInteractionEventDetail]
  }
  
  @scala.inline
  implicit class MDCChipInteractionEventDetailOps[Self <: MDCChipInteractionEventDetail] (val x: Self) extends AnyVal {
    
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
    def setChipId(value: String): Self = this.set("chipId", value.asInstanceOf[js.Any])
  }
}
