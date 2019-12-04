package typings.atIonicCore

import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/route-redirect/route-redirect", JSImport.Namespace)
@js.native
object distTypesComponentsRouteDashRedirectRouteDashRedirectMod extends js.Object {
  @js.native
  class RouteRedirect () extends ComponentInterface {
    /**
      * A redirect route, redirects "from" a URL "to" another URL. This property is that "from" URL.
      * It needs to be an exact match of the navigated URL in order to apply.
      *
      * The path specified in this value is always an absolute path, even if the initial `/` slash
      * is not specified.
      *
      */
    var from: String = js.native
    /**
      * Internal event that fires when any value of this rule is added/removed from the DOM,
      * or any of his public properties changes.
      *
      * `ion-router` captures this event in order to update his internal registry of router rules.
      */
    var ionRouteRedirectChanged: EventEmitter[_] = js.native
    /**
      * A redirect route, redirects "from" a URL "to" another URL. This property is that "to" URL.
      * When the defined `ion-route-redirect` rule matches, the router will redirect to the path
      * specified in this property.
      *
      * The value of this property is always an absolute path inside the scope of routes defined in
      * `ion-router` it can't be used with another router or to perform a redirection to a different domain.
      *
      * Note that this is a virtual redirect, it will not cause a real browser refresh, again, it's
      * a redirect inside the context of ion-router.
      *
      * When this property is not specified or his value is `undefined` the whole redirect route is noop,
      * even if the "from" value matches.
      */
    var to: js.UndefOr[String | Null] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MRouteRedirect(): Unit = js.native
    def propDidChange(): Unit = js.native
  }
  
}

