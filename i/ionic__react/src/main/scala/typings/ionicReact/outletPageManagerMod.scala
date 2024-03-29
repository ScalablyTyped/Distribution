package typings.ionicReact

import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typings.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.stackContextMod.StackContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outletPageManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", JSImport.Default)
  @js.native
  class default protected () extends OutletPageManager {
    def this(props: OutletPageManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", "OutletPageManager")
  @js.native
  class OutletPageManager protected ()
    extends Component[OutletPageManagerProps, js.Object, js.Any] {
    def this(props: OutletPageManagerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOutletPageManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOutletPageManager(): Unit = js.native
    
    @JSName("context")
    var context_OutletPageManager: ContextType[Context[StackContextState]] = js.native
    
    var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
    
    var ionRouterOutlet: js.UndefOr[HTMLIonRouterOutletElement] = js.native
    
    def ionViewDidEnterHandler(): Unit = js.native
    
    def ionViewDidLeaveHandler(): Unit = js.native
    
    def ionViewWillEnterHandler(): Unit = js.native
    
    def ionViewWillLeaveHandler(): Unit = js.native
  }
  
  trait OutletPageManagerProps extends StObject {
    
    var StackManager: js.Any
    
    var className: js.UndefOr[String] = js.undefined
    
    var forwardedRef: js.UndefOr[RefObject[HTMLIonRouterOutletElement]] = js.undefined
    
    var routeInfo: js.UndefOr[RouteInfo[js.Any]] = js.undefined
  }
  object OutletPageManagerProps {
    
    inline def apply(StackManager: js.Any): OutletPageManagerProps = {
      val __obj = js.Dynamic.literal(StackManager = StackManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutletPageManagerProps]
    }
    
    extension [Self <: OutletPageManagerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setForwardedRef(value: RefObject[HTMLIonRouterOutletElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setRouteInfo(value: RouteInfo[js.Any]): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
      
      inline def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
      
      inline def setStackManager(value: js.Any): Self = StObject.set(x, "StackManager", value.asInstanceOf[js.Any])
    }
  }
}
