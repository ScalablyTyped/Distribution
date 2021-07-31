package typings.ionicCore.componentsMod.Components

import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTab extends StObject {
  
  var active: Boolean
  
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  
  /**
    * Set the active component for the tab
    */
  def setActive(): js.Promise[Unit]
  
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String
}
object IonTab {
  
  @scala.inline
  def apply(active: Boolean, setActive: () => js.Promise[Unit], tab: String): IonTab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction0(setActive), tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTab]
  }
  
  @scala.inline
  implicit class IonTabMutableBuilder[Self <: IonTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    @scala.inline
    def setSetActive(value: () => js.Promise[Unit]): Self = StObject.set(x, "setActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
