package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.anon.Tab
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTabs extends js.Object {
  
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.native
  
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.native
}
object IonTabs {
  
  @scala.inline
  def apply(): IonTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTabs]
  }
  
  @scala.inline
  implicit class IonTabsOps[Self <: IonTabs] (val x: Self) extends AnyVal {
    
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
    def setOnIonTabsDidChange(value: /* event */ CustomEvent[Tab] => Unit): Self = this.set("onIonTabsDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonTabsDidChange: Self = this.set("onIonTabsDidChange", js.undefined)
    
    @scala.inline
    def setOnIonTabsWillChange(value: /* event */ CustomEvent[Tab] => Unit): Self = this.set("onIonTabsWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonTabsWillChange: Self = this.set("onIonTabsWillChange", js.undefined)
  }
}
