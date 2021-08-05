package typings.ionicReact

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabsContextMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabsContext", "IonTabsContext")
  @js.native
  val IonTabsContext: Context[IonTabsContextState] = js.native
  
  trait IonTabsContextState extends StObject {
    
    var activeTab: js.UndefOr[String] = js.undefined
    
    def selectTab(tab: String): Boolean
  }
  object IonTabsContextState {
    
    inline def apply(selectTab: String => Boolean): IonTabsContextState = {
      val __obj = js.Dynamic.literal(selectTab = js.Any.fromFunction1(selectTab))
      __obj.asInstanceOf[IonTabsContextState]
    }
    
    extension [Self <: IonTabsContextState](x: Self) {
      
      inline def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setSelectTab(value: String => Boolean): Self = StObject.set(x, "selectTab", js.Any.fromFunction1(value))
    }
  }
}
