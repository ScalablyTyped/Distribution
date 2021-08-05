package typings.ionicReact

import typings.ionicCore.componentsMod.global.HTMLIonTabButtonElement
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.routerOptionsMod.RouterOptions
import typings.react.mod.Component
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabButtonMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton")
  @js.native
  class IonTabButton protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    
    def handleIonTabButtonClick(): Unit = js.native
  }
  
  trait Props
    extends StObject
       with typings.ionicCore.componentsMod.LocalJSX.IonTabButton
       with IonicReactProps {
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var ref: js.UndefOr[RefObject[HTMLIonTabButtonElement]] = js.undefined
    
    var routerOptions: js.UndefOr[RouterOptions] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRef(value: RefObject[HTMLIonTabButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRouterOptions(value: RouterOptions): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
      
      inline def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
    }
  }
}
