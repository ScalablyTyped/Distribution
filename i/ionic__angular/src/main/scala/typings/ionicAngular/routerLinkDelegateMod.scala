package typings.ionicAngular

import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.ElementRef
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.RouterLink
import typings.ionicAngular.navControllerMod.NavController
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerLinkDelegateMod {
  
  @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegate")
  @js.native
  class RouterLinkDelegate protected () extends StObject {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[js.Any],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[js.Any],
      router: Router,
      routerLink: RouterLink
    ) = this()
    
    /* private */ var elementRef: js.Any = js.native
    
    /* private */ var locationStrategy: js.Any = js.native
    
    /* private */ var navCtrl: js.Any = js.native
    
    def ngOnChanges(): js.Any = js.native
    
    def ngOnDestroy(): js.Any = js.native
    
    def ngOnInit(): Unit = js.native
    
    /**
      * @internal
      */
    def onClick(ev: UIEvent): Unit = js.native
    
    /* private */ var router: js.Any = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerDirection: RouterDirection = js.native
    
    /* private */ var routerLink: js.Any = js.native
    
    /* private */ var subscription: js.Any = js.native
    
    /* private */ var updateTargetUrlAndHref: js.Any = js.native
  }
}
