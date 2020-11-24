package typings.ionicCore.tabBarInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarChangedEventDetail extends js.Object {
  
  var tab: js.UndefOr[String] = js.native
}
object TabBarChangedEventDetail {
  
  @scala.inline
  def apply(): TabBarChangedEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarChangedEventDetail]
  }
  
  @scala.inline
  implicit class TabBarChangedEventDetailOps[Self <: TabBarChangedEventDetail] (val x: Self) extends AnyVal {
    
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
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
}
