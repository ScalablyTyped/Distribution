package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRouter extends js.Object {
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
  def apply(
    onIonRouteDidChange: /* event */ CustomEvent[RouterEventDetail] => Unit = null,
    onIonRouteWillChange: /* event */ CustomEvent[RouterEventDetail] => Unit = null,
    root: String = null,
    useHash: js.UndefOr[Boolean] = js.undefined
  ): IonRouter = {
    val __obj = js.Dynamic.literal()
    if (onIonRouteDidChange != null) __obj.updateDynamic("onIonRouteDidChange")(js.Any.fromFunction1(onIonRouteDidChange))
    if (onIonRouteWillChange != null) __obj.updateDynamic("onIonRouteWillChange")(js.Any.fromFunction1(onIonRouteWillChange))
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouter]
  }
}

