package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.interfaceMod.RouterEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouter extends js.Object {
  /**
    * Emitted when the route had changed
    */
  var onIonRouteDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RouterEventDetail], Unit]] = js.native
  /**
    * Event emitted when the route is about to change
    */
  var onIonRouteWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RouterEventDetail], Unit]] = js.native
  /**
    * By default `ion-router` will match the routes at the root path ("/"). That can be changed when
    */
  var root: js.UndefOr[String] = js.native
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the otherside hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: js.UndefOr[Boolean] = js.native
}

object IonRouter {
  @scala.inline
  def apply(): IonRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRouter]
  }
  @scala.inline
  implicit class IonRouterOps[Self <: IonRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnIonRouteDidChange(value: /* event */ CustomEvent[RouterEventDetail] => Unit): Self = this.set("onIonRouteDidChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonRouteDidChange: Self = this.set("onIonRouteDidChange", js.undefined)
    @scala.inline
    def setOnIonRouteWillChange(value: /* event */ CustomEvent[RouterEventDetail] => Unit): Self = this.set("onIonRouteWillChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonRouteWillChange: Self = this.set("onIonRouteWillChange", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
  }
  
}

