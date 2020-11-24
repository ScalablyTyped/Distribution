package typings.ionicReact.ionTabsContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTabsContextState extends js.Object {
  
  var activeTab: js.UndefOr[String] = js.native
  
  def selectTab(tab: String): Boolean = js.native
}
object IonTabsContextState {
  
  @scala.inline
  def apply(selectTab: String => Boolean): IonTabsContextState = {
    val __obj = js.Dynamic.literal(selectTab = js.Any.fromFunction1(selectTab))
    __obj.asInstanceOf[IonTabsContextState]
  }
  
  @scala.inline
  implicit class IonTabsContextStateOps[Self <: IonTabsContextState] (val x: Self) extends AnyVal {
    
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
    def setSelectTab(value: String => Boolean): Self = this.set("selectTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActiveTab(value: String): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
  }
}
