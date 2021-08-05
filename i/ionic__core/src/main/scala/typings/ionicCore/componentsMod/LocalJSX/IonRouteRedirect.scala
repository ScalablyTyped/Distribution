package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRouteRedirect extends StObject {
  
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "from" URL. It needs to be an exact match of the navigated URL in order to apply.  The path specified in this value is always an absolute path, even if the initial `/` slash is not specified.
    */
  var from: String
  
  /**
    * Internal event that fires when any value of this rule is added/removed from the DOM, or any of his public properties changes.  `ion-router` captures this event in order to update his internal registry of router rules.
    */
  var onIonRouteRedirectChanged: js.UndefOr[js.Function1[/* event */ CustomEvent[js.Any], Unit]] = js.undefined
  
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "to" URL. When the defined `ion-route-redirect` rule matches, the router will redirect to the path specified in this property.  The value of this property is always an absolute path inside the scope of routes defined in `ion-router` it can't be used with another router or to perform a redirection to a different domain.  Note that this is a virtual redirect, it will not cause a real browser refresh, again, it's a redirect inside the context of ion-router.  When this property is not specified or his value is `undefined` the whole redirect route is noop, even if the "from" value matches.
    */
  var to: js.UndefOr[String | Null] = js.undefined
}
object IonRouteRedirect {
  
  inline def apply(from: String): IonRouteRedirect = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouteRedirect]
  }
  
  extension [Self <: IonRouteRedirect](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setOnIonRouteRedirectChanged(value: /* event */ CustomEvent[js.Any] => Unit): Self = StObject.set(x, "onIonRouteRedirectChanged", js.Any.fromFunction1(value))
    
    inline def setOnIonRouteRedirectChangedUndefined: Self = StObject.set(x, "onIonRouteRedirectChanged", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
