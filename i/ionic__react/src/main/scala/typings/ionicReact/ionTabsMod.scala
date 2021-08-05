package typings.ionicReact

import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typings.ionicReact.ionTabsContextMod.IonTabsContextState
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabsMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
  @js.native
  class IonTabs protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MIonTabs(): Unit = js.native
    
    @JSName("context")
    var context_IonTabs: ContextType[Context[NavContextState]] = js.native
    
    var ionTabContextState: IonTabsContextState = js.native
    
    var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
    
    var selectTabHandler: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
    
    var tabBarRef: RefObject[js.Any] = js.native
  }
  
  type ChildFunction = js.Function1[/* ionTabContext */ IonTabsContextState, ReactNode]
  
  trait Props
    extends StObject
       with typings.ionicCore.componentsMod.LocalJSX.IonTabs {
    
    var children: ChildFunction | ReactNode
    
    var className: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ChildFunction | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ionTabContext */ IonTabsContextState => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  object global {
    
    object JSX {
      
      trait IntrinsicElements extends StObject {
        
        var `ion-tabs`: js.Any
      }
      object IntrinsicElements {
        
        inline def apply(`ion-tabs`: js.Any): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        extension [Self <: IntrinsicElements](x: Self) {
          
          inline def `setIon-tabs`(value: js.Any): Self = StObject.set(x, "ion-tabs", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
