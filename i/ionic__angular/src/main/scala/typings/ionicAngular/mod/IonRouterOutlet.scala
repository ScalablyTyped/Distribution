package typings.ionicAngular.mod

import typings.angularCommon.mod.Location
import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.ViewContainerRef
import typings.angularRouter.mod.ActivatedRoute
import typings.angularRouter.mod.ChildrenOutletContexts
import typings.angularRouter.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    tabs: String,
    config: typings.ionicAngular.configMod.Config,
    navCtrl: typings.ionicAngular.navControllerMod.NavController,
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
    config: typings.ionicAngular.configMod.Config,
    navCtrl: typings.ionicAngular.navControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute,
    parentOutlet: typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet
  ) = this()
}
