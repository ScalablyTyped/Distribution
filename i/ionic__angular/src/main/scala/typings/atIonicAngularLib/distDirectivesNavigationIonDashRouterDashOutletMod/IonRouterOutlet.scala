package typings
package atIonicAngularLib.distDirectivesNavigationIonDashRouterDashOutletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-router-outlet", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnDestroy
     with atAngularCoreLib.atAngularCoreMod.OnInit {
  def this(parentContexts: atAngularRouterLib.atAngularRouterMod.ChildrenOutletContexts, location: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver, name: java.lang.String, tabs: java.lang.String, config: atIonicAngularLib.distProvidersConfigMod.Config, navCtrl: atIonicAngularLib.distProvidersNavDashControllerMod.NavController, commonLocation: atAngularCommonLib.atAngularCommonMod.Location, elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_], router: atAngularRouterLib.atAngularRouterMod.Router, zone: atAngularCoreLib.atAngularCoreMod.NgZone, activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute) = this()
  def this(parentContexts: atAngularRouterLib.atAngularRouterMod.ChildrenOutletContexts, location: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver, name: java.lang.String, tabs: java.lang.String, config: atIonicAngularLib.distProvidersConfigMod.Config, navCtrl: atIonicAngularLib.distProvidersNavDashControllerMod.NavController, commonLocation: atAngularCommonLib.atAngularCommonMod.Location, elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_], router: atAngularRouterLib.atAngularRouterMod.Router, zone: atAngularCoreLib.atAngularCoreMod.NgZone, activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute, parentOutlet: IonRouterOutlet) = this()
  var _activatedRoute: js.Any = js.native
  var _swipeGesture: js.UndefOr[js.Any] = js.native
  var activateEvents: atAngularCoreLib.atAngularCoreMod.EventEmitter[_] = js.native
  var activated: js.Any = js.native
  val activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute = js.native
  val activatedRouteData: js.Any = js.native
  var activatedView: js.Any = js.native
  var animated: scala.Boolean = js.native
  val component: js.Object = js.native
  var config: js.Any = js.native
  /**
    * Since the activated route can change over the life time of a component in an ion router outlet, we create
    * a proxy so that we can update the values over time as a user navigates back to components already in the stack.
    */
  var createActivatedRouteProxy: js.Any = js.native
  @JSName("currentActivatedRoute$")
  var currentActivatedRoute$: js.Any = js.native
  var deactivateEvents: atAngularCoreLib.atAngularCoreMod.EventEmitter[_] = js.native
  val isActivated: scala.Boolean = js.native
  var location: js.Any = js.native
  var name: js.Any = js.native
  var nativeEl: js.Any = js.native
  var navCtrl: js.Any = js.native
  var parentContexts: js.Any = js.native
  val parentOutlet: js.UndefOr[IonRouterOutlet] = js.native
  var proxyMap: js.Any = js.native
  /**
    * Create a wrapped observable that will switch to the latest activated route matched by the given component
    */
  var proxyObservable: js.Any = js.native
  var resolver: js.Any = js.native
  var stackCtrl: js.Any = js.native
  var stackEvents: atAngularCoreLib.atAngularCoreMod.EventEmitter[_] = js.native
  var swipeGesture: scala.Boolean = js.native
  var tabsPrefix: js.UndefOr[java.lang.String] = js.native
  /**
    * Updates the activated route proxy for the given component to the new incoming router state
    */
  var updateActivatedRouteProxy: js.Any = js.native
  def activateWith(activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute): scala.Unit = js.native
  def activateWith(
    activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute,
    resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver
  ): scala.Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
    */
  def attach(
    _ref: atAngularCoreLib.atAngularCoreMod.ComponentRef[_],
    _activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute
  ): scala.Unit = js.native
  /**
    * Returns `true` if there are pages in the stack to go back.
    */
  def canGoBack(): scala.Boolean = js.native
  def canGoBack(deep: scala.Double): scala.Boolean = js.native
  def canGoBack(deep: scala.Double, stackId: java.lang.String): scala.Boolean = js.native
  def deactivate(): scala.Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree
    */
  def detach(): atAngularCoreLib.atAngularCoreMod.ComponentRef[_] = js.native
  /**
    * Returns the active stack ID. In the context of ion-tabs, it means the active tab.
    */
  def getActiveStackId(): js.UndefOr[java.lang.String] = js.native
  def getContext(): atAngularRouterLib.atAngularRouterMod.OutletContext | scala.Null = js.native
  /**
    * Returns the URL of the active page of each stack.
    */
  def getLastUrl(): js.UndefOr[java.lang.String] = js.native
  def getLastUrl(stackId: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): scala.Unit = js.native
  /**
    * Resolves to `true` if it the outlet was able to sucessfully pop the last N pages.
    */
  def pop(): js.Promise[scala.Boolean] = js.native
  def pop(deep: scala.Double): js.Promise[scala.Boolean] = js.native
  def pop(deep: scala.Double, stackId: java.lang.String): js.Promise[scala.Boolean] = js.native
}

