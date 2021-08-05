package typings.ionicAngular

import typings.angularCore.mod.ComponentRef
import typings.angularRouter.mod.ActivatedRoute
import typings.angularRouter.mod.NavigationExtras
import typings.angularRouter.mod.Router
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackUtilsMod {
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeStackId(prefixUrl: js.Array[String], url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeStackId")(prefixUrl.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def destroyView(view: RouteView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyView")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getUrl(router: Router, activatedRoute: ActivatedRoute): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(router.asInstanceOf[js.Any], activatedRoute.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def insertView(views: js.Array[RouteView], view: RouteView, direction: RouterDirection): js.Array[RouteView] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertView")(views.asInstanceOf[js.Any], view.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteView]]
  
  inline def isTabSwitch(enteringView: RouteView, leavingView: RouteView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTabSwitch")(enteringView.asInstanceOf[js.Any], leavingView.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toSegments(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSegments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait RouteView extends StObject {
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.undefined
    
    var element: HTMLElement
    
    var id: Double
    
    var ref: ComponentRef[js.Any]
    
    var savedData: js.UndefOr[js.Any] = js.undefined
    
    var savedExtras: js.UndefOr[NavigationExtras] = js.undefined
    
    var stackId: js.UndefOr[String] = js.undefined
    
    def unlistenEvents(): Unit
    
    var url: String
  }
  object RouteView {
    
    inline def apply(
      element: HTMLElement,
      id: Double,
      ref: ComponentRef[js.Any],
      unlistenEvents: () => Unit,
      url: String
    ): RouteView = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteView]
    }
    
    extension [Self <: RouteView](x: Self) {
      
      inline def setAnimationBuilder(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
      
      inline def setAnimationBuilderUndefined: Self = StObject.set(x, "animationBuilder", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: ComponentRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSavedData(value: js.Any): Self = StObject.set(x, "savedData", value.asInstanceOf[js.Any])
      
      inline def setSavedDataUndefined: Self = StObject.set(x, "savedData", js.undefined)
      
      inline def setSavedExtras(value: NavigationExtras): Self = StObject.set(x, "savedExtras", value.asInstanceOf[js.Any])
      
      inline def setSavedExtrasUndefined: Self = StObject.set(x, "savedExtras", js.undefined)
      
      inline def setStackId(value: String): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      inline def setUnlistenEvents(value: () => Unit): Self = StObject.set(x, "unlistenEvents", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackEvent extends StObject {
    
    var animation: js.UndefOr[NavDirection] = js.undefined
    
    var direction: RouterDirection
    
    var enteringView: RouteView
    
    var tabSwitch: Boolean
  }
  object StackEvent {
    
    inline def apply(direction: RouterDirection, enteringView: RouteView, tabSwitch: Boolean): StackEvent = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enteringView = enteringView.asInstanceOf[js.Any], tabSwitch = tabSwitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackEvent]
    }
    
    extension [Self <: StackEvent](x: Self) {
      
      inline def setAnimation(value: NavDirection): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setDirection(value: RouterDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEnteringView(value: RouteView): Self = StObject.set(x, "enteringView", value.asInstanceOf[js.Any])
      
      inline def setTabSwitch(value: Boolean): Self = StObject.set(x, "tabSwitch", value.asInstanceOf[js.Any])
    }
  }
}
