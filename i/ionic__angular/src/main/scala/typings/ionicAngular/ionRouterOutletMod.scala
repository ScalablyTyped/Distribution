package typings.ionicAngular

import typings.angularCommon.mod.Location
import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.ViewContainerRef
import typings.angularRouter.mod.ActivatedRoute
import typings.angularRouter.mod.ChildrenOutletContexts
import typings.angularRouter.mod.OutletContext
import typings.angularRouter.mod.Router
import typings.ionicAngular.configMod.Config
import typings.ionicAngular.navControllerMod.NavController
import typings.ionicAngular.stackUtilsMod.RouteView
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRouterOutletMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet")
  @js.native
  class IonRouterOutlet protected ()
    extends StObject
       with OnDestroy
       with OnInit {
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      resolver: ComponentFactoryResolver,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      commonLocation: Location,
      elementRef: ElementRef[js.Any],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute
    ) = this()
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      resolver: ComponentFactoryResolver,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      commonLocation: Location,
      elementRef: ElementRef[js.Any],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute,
      parentOutlet: IonRouterOutlet
    ) = this()
    
    /* private */ var _activatedRoute: js.Any = js.native
    
    /* private */ var _swipeGesture: js.Any = js.native
    
    var activateEvents: EventEmitter[js.Any] = js.native
    
    def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
    def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
    
    /* private */ var activated: js.Any = js.native
    
    val activatedRoute: ActivatedRoute = js.native
    
    val activatedRouteData: js.Any = js.native
    
    var activatedView: RouteView | Null = js.native
    
    var animated: Boolean = js.native
    
    def animation(baseEl: js.Any): Animation = js.native
    def animation(baseEl: js.Any, opts: js.Any): Animation = js.native
    @JSName("animation")
    var animation_Original: AnimationBuilder = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
      */
    def attach(_ref: ComponentRef[js.Any], _activatedRoute: ActivatedRoute): Unit = js.native
    
    /**
      * Returns `true` if there are pages in the stack to go back.
      */
    def canGoBack(): Boolean = js.native
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    def canGoBack(deep: Unit, stackId: String): Boolean = js.native
    
    val component: js.Object = js.native
    
    /* private */ var config: js.Any = js.native
    
    /**
      * Since the activated route can change over the life time of a component in an ion router outlet, we create
      * a proxy so that we can update the values over time as a user navigates back to components already in the stack.
      */
    /* private */ var createActivatedRouteProxy: js.Any = js.native
    
    /* private */ @JSName("currentActivatedRoute$")
    var currentActivatedRoute$: js.Any = js.native
    
    def deactivate(): Unit = js.native
    
    var deactivateEvents: EventEmitter[js.Any] = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to detach the subtree
      */
    def detach(): ComponentRef[js.Any] = js.native
    
    /**
      * Returns the active stack ID. In the context of ion-tabs, it means the active tab.
      */
    def getActiveStackId(): js.UndefOr[String] = js.native
    
    def getContext(): OutletContext | Null = js.native
    
    /**
      * Returns the RouteView of the active page of each stack.
      * @internal
      */
    def getLastRouteView(): js.UndefOr[RouteView] = js.native
    def getLastRouteView(stackId: String): js.UndefOr[RouteView] = js.native
    
    /**
      * Returns the URL of the active page of each stack.
      */
    def getLastUrl(): js.UndefOr[String] = js.native
    def getLastUrl(stackId: String): js.UndefOr[String] = js.native
    
    /**
      * Returns the root view in the tab stack.
      * @internal
      */
    def getRootView(): js.UndefOr[RouteView] = js.native
    def getRootView(stackId: String): js.UndefOr[RouteView] = js.native
    
    val isActivated: Boolean = js.native
    
    /* private */ var location: js.Any = js.native
    
    /* private */ var name: js.Any = js.native
    
    var nativeEl: HTMLIonRouterOutletElement = js.native
    
    /* private */ var navCtrl: js.Any = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    /* private */ var parentContexts: js.Any = js.native
    
    val parentOutlet: js.UndefOr[IonRouterOutlet] = js.native
    
    /**
      * Resolves to `true` if it the outlet was able to sucessfully pop the last N pages.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    def pop(deep: Unit, stackId: String): js.Promise[Boolean] = js.native
    
    /* private */ var proxyMap: js.Any = js.native
    
    /**
      * Create a wrapped observable that will switch to the latest activated route matched by the given component
      */
    /* private */ var proxyObservable: js.Any = js.native
    
    /* private */ var resolver: js.Any = js.native
    
    /* private */ var stackCtrl: js.Any = js.native
    
    var stackEvents: EventEmitter[js.Any] = js.native
    
    var swipeGesture: Boolean = js.native
    
    var tabsPrefix: js.UndefOr[String] = js.native
    
    /**
      * Updates the activated route proxy for the given component to the new incoming router state
      */
    /* private */ var updateActivatedRouteProxy: js.Any = js.native
  }
}
