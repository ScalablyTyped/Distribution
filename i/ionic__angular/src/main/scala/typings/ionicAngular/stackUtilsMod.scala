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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackUtilsMod {
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "computeStackId")
  @js.native
  def computeStackId(prefixUrl: js.Array[String], url: String): String = js.native
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "destroyView")
  @js.native
  def destroyView(view: RouteView): Unit = js.native
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "getUrl")
  @js.native
  def getUrl(router: Router, activatedRoute: ActivatedRoute): String = js.native
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "insertView")
  @js.native
  def insertView(views: js.Array[RouteView], view: RouteView, direction: RouterDirection): js.Array[RouteView] = js.native
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "isTabSwitch")
  @js.native
  def isTabSwitch(enteringView: RouteView, leavingView: RouteView): Boolean = js.native
  
  @JSImport("@ionic/angular/directives/navigation/stack-utils", "toSegments")
  @js.native
  def toSegments(path: String): js.Array[String] = js.native
  
  @js.native
  trait RouteView extends StObject {
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
    
    var element: HTMLElement = js.native
    
    var id: Double = js.native
    
    var ref: ComponentRef[_] = js.native
    
    var savedData: js.UndefOr[js.Any] = js.native
    
    var savedExtras: js.UndefOr[NavigationExtras] = js.native
    
    var stackId: js.UndefOr[String] = js.native
    
    def unlistenEvents(): Unit = js.native
    
    var url: String = js.native
  }
  object RouteView {
    
    @scala.inline
    def apply(element: HTMLElement, id: Double, ref: ComponentRef[_], unlistenEvents: () => Unit, url: String): RouteView = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteView]
    }
    
    @scala.inline
    implicit class RouteViewMutableBuilder[Self <: RouteView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationBuilder(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationBuilderUndefined: Self = StObject.set(x, "animationBuilder", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: ComponentRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedData(value: js.Any): Self = StObject.set(x, "savedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedDataUndefined: Self = StObject.set(x, "savedData", js.undefined)
      
      @scala.inline
      def setSavedExtras(value: NavigationExtras): Self = StObject.set(x, "savedExtras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedExtrasUndefined: Self = StObject.set(x, "savedExtras", js.undefined)
      
      @scala.inline
      def setStackId(value: String): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      @scala.inline
      def setUnlistenEvents(value: () => Unit): Self = StObject.set(x, "unlistenEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackEvent extends StObject {
    
    var animation: js.UndefOr[NavDirection] = js.native
    
    var direction: RouterDirection = js.native
    
    var enteringView: RouteView = js.native
    
    var tabSwitch: Boolean = js.native
  }
  object StackEvent {
    
    @scala.inline
    def apply(direction: RouterDirection, enteringView: RouteView, tabSwitch: Boolean): StackEvent = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enteringView = enteringView.asInstanceOf[js.Any], tabSwitch = tabSwitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackEvent]
    }
    
    @scala.inline
    implicit class StackEventMutableBuilder[Self <: StackEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: NavDirection): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setDirection(value: RouterDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringView(value: RouteView): Self = StObject.set(x, "enteringView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSwitch(value: Boolean): Self = StObject.set(x, "tabSwitch", value.asInstanceOf[js.Any])
    }
  }
}
