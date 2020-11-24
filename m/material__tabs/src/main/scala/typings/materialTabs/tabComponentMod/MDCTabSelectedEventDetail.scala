package typings.materialTabs.tabComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTabSelectedEventDetail extends js.Object {
  
  var tab: MDCTab = js.native
}
object MDCTabSelectedEventDetail {
  
  @scala.inline
  def apply(tab: MDCTab): MDCTabSelectedEventDetail = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabSelectedEventDetail]
  }
  
  @scala.inline
  implicit class MDCTabSelectedEventDetailOps[Self <: MDCTabSelectedEventDetail] (val x: Self) extends AnyVal {
    
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
    def setTab(value: MDCTab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
}
