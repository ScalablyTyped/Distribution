package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.interfaceMod.RouterEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRouter extends StObject {
  
  /**
    * Emitted when the route had changed
    */
  var onIonRouteDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RouterEventDetail], Unit]] = js.undefined
  
  /**
    * Event emitted when the route is about to change
    */
  var onIonRouteWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RouterEventDetail], Unit]] = js.undefined
  
  /**
    * By default `ion-router` will match the routes at the root path ("/"). That can be changed when
    */
  var root: js.UndefOr[String] = js.undefined
  
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the otherside hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: js.UndefOr[Boolean] = js.undefined
}
object IonRouter {
  
  @scala.inline
  def apply(): IonRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRouter]
  }
  
  @scala.inline
  implicit class IonRouterMutableBuilder[Self <: IonRouter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnIonRouteDidChange(value: /* event */ CustomEvent[RouterEventDetail] => Unit): Self = StObject.set(x, "onIonRouteDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonRouteDidChangeUndefined: Self = StObject.set(x, "onIonRouteDidChange", js.undefined)
    
    @scala.inline
    def setOnIonRouteWillChange(value: /* event */ CustomEvent[RouterEventDetail] => Unit): Self = StObject.set(x, "onIonRouteWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonRouteWillChangeUndefined: Self = StObject.set(x, "onIonRouteWillChange", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
  }
}
