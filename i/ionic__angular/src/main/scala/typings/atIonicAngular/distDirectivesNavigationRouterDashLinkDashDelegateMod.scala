package typings.atIonicAngular

import typings.atAngularCommon.atAngularCommonMod.LocationStrategy
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularRouter.atAngularRouterMod.Router
import typings.atAngularRouter.atAngularRouterMod.RouterLink
import typings.atIonicAngular.distProvidersNavDashControllerMod.NavController
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/router-link-delegate", JSImport.Namespace)
@js.native
object distDirectivesNavigationRouterDashLinkDashDelegateMod extends js.Object {
  @js.native
  class RouterLinkDelegate protected () extends js.Object {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router,
      routerLink: RouterLink
    ) = this()
    var elementRef: js.Any = js.native
    var locationStrategy: js.Any = js.native
    var navCtrl: js.Any = js.native
    var router: js.Any = js.native
    var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any = js.native
    var routerLink: js.UndefOr[js.Any] = js.native
    var subscription: js.UndefOr[js.Any] = js.native
    var updateTargetUrlAndHref: js.Any = js.native
    def ngOnChanges(): js.Any = js.native
    def ngOnDestroy(): js.Any = js.native
    def ngOnInit(): Unit = js.native
    /**
      * @internal
      */
    def onClick(ev: UIEvent): Unit = js.native
  }
  
}

