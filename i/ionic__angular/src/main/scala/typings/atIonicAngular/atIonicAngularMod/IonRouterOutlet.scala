package typings.atIonicAngular.atIonicAngularMod

import typings.atAngularCommon.atAngularCommonMod.Location
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import typings.atAngularRouter.atAngularRouterMod.ActivatedRoute
import typings.atAngularRouter.atAngularRouterMod.ChildrenOutletContexts
import typings.atAngularRouter.atAngularRouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends typings.atIonicAngular.distMod.IonRouterOutlet {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    tabs: String,
    config: typings.atIonicAngular.distProvidersConfigMod.Config,
    navCtrl: typings.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
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
    config: typings.atIonicAngular.distProvidersConfigMod.Config,
    navCtrl: typings.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute,
    parentOutlet: typings.atIonicAngular.distDirectivesNavigationIonDashRouterDashOutletMod.IonRouterOutlet
  ) = this()
}

