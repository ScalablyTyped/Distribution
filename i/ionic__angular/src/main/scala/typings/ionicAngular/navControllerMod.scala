package typings.ionicAngular

import typings.angularCommon.mod.Location
import typings.angularRouter.mod.NavigationExtras
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.UrlSerializer
import typings.angularRouter.mod.UrlTree
import typings.ionicAngular.anon.Animation
import typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typings.ionicAngular.ionicAngularStrings.back
import typings.ionicAngular.ionicAngularStrings.forward
import typings.ionicAngular.platformMod.Platform
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navControllerMod {
  
  @JSImport("@ionic/angular/providers/nav-controller", "NavController")
  @js.native
  class NavController protected () extends StObject {
    def this(platform: Platform, location: Location, serializer: UrlSerializer) = this()
    def this(platform: Platform, location: Location, serializer: UrlSerializer, router: Router) = this()
    
    /* private */ var animated: js.Any = js.native
    
    /* private */ var animationBuilder: js.Any = js.native
    
    /**
      * Same as [Location](https://angular.io/api/common/Location)'s back() method.
      * It will use the standard `window.history.back()` under the hood, but featuring a `back` animation
      * by default.
      */
    def back(): Unit = js.native
    def back(options: AnimationOptions): Unit = js.native
    
    /**
      * @internal
      */
    def consumeTransition(): Animation = js.native
    
    /* private */ var direction: js.Any = js.native
    
    /* private */ var guessAnimation: js.Any = js.native
    
    /* private */ var guessDirection: js.Any = js.native
    
    /* private */ var lastNavId: js.Any = js.native
    
    /* private */ var location: js.Any = js.native
    
    /* private */ var navigate: js.Any = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('back');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **back** means that all the pages in the stack until the navigated page is found will be popped,
      * and that it will show a "back" animation by default.
      *
      * Navigating back can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="back">Link</a>
      * ```
      */
    def navigateBack(url: String): js.Promise[Boolean] = js.native
    def navigateBack(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[js.Any]): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[js.Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling `this.router.navigateByUrl()`, but it's explicit about the **direction** of the transition.
      *
      * Going **forward** means that a new page is going to be pushed to the stack of the outlet (ion-router-outlet),
      * and that it will show a "forward" animation by default.
      *
      * Navigating forward can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="forward">Link</a>
      * ```
      */
    def navigateForward(url: String): js.Promise[Boolean] = js.native
    def navigateForward(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[js.Any]): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[js.Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('root');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **root** means that all existing pages in the stack will be removed,
      * and the navigated page will become the single page in the stack.
      *
      * Navigating root can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="root">Link</a>
      * ```
      */
    def navigateRoot(url: String): js.Promise[Boolean] = js.native
    def navigateRoot(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[js.Any]): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[js.Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This methods goes back in the context of Ionic's stack navigation.
      *
      * It recursively finds the top active `ion-router-outlet` and calls `pop()`.
      * This is the recommended way to go back when you are using `ion-router-outlet`.
      */
    def pop(): js.Promise[Unit] = js.native
    
    /* private */ var router: js.Any = js.native
    
    /* private */ var serializer: js.Any = js.native
    
    /**
      * This methods specifies the direction of the next navigation performed by the Angular router.
      *
      * `setDirection()` does not trigger any transition, it just sets some flags to be consumed by `ion-router-outlet`.
      *
      * It's recommended to use `navigateForward()`, `navigateBack()` and `navigateRoot()` instead of `setDirection()`.
      */
    def setDirection(direction: RouterDirection): Unit = js.native
    def setDirection(direction: RouterDirection, animated: Boolean): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: Unit,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Unit,
      animationDirection: Unit,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(direction: RouterDirection, animated: Boolean, animationDirection: back): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: back,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(direction: RouterDirection, animated: Unit, animationDirection: back): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(
      direction: RouterDirection,
      animated: Unit,
      animationDirection: back,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(direction: RouterDirection, animated: Boolean, animationDirection: forward): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: forward,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(direction: RouterDirection, animated: Unit, animationDirection: forward): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(
      direction: RouterDirection,
      animated: Unit,
      animationDirection: forward,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    
    /**
      * @internal
      */
    def setTopOutlet(outlet: IonRouterOutlet): Unit = js.native
    
    /* private */ var topOutlet: js.Any = js.native
  }
  
  trait AnimationOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var animationDirection: js.UndefOr[forward | back] = js.undefined
  }
  object AnimationOptions {
    
    inline def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    extension [Self <: AnimationOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(
        value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typings.ionicCore.animationInterfaceMod.Animation
      ): Self = StObject.set(x, "animation", js.Any.fromFunction2(value))
      
      inline def setAnimationDirection(value: forward | back): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    }
  }
  
  trait NavigationOptions
    extends StObject
       with NavigationExtras
       with AnimationOptions
  object NavigationOptions {
    
    inline def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
  }
}
