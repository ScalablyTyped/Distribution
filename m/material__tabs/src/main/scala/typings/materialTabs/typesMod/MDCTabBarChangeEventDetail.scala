package typings.materialTabs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTabBarChangeEventDetail extends js.Object {
  
  var activeTabIndex: Double = js.native
}
object MDCTabBarChangeEventDetail {
  
  @scala.inline
  def apply(activeTabIndex: Double): MDCTabBarChangeEventDetail = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabBarChangeEventDetail]
  }
  
  @scala.inline
  implicit class MDCTabBarChangeEventDetailOps[Self <: MDCTabBarChangeEventDetail] (val x: Self) extends AnyVal {
    
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
    def setActiveTabIndex(value: Double): Self = this.set("activeTabIndex", value.asInstanceOf[js.Any])
  }
}
