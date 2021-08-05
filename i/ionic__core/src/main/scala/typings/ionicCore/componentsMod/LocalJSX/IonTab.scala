package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.ComponentRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTab extends StObject {
  
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String
}
object IonTab {
  
  inline def apply(tab: String): IonTab = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTab]
  }
  
  extension [Self <: IonTab](x: Self) {
    
    inline def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
