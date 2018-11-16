package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterInstance extends js.Object {
  def createLink(routeID: NativeRouteIDs, params: RouteParams): java.lang.String = js.native
  def createLink(routeID: java.lang.String, params: RouteParams): java.lang.String = js.native
  def getCurrentRouteView(): RouteView = js.native
  def goto(routeID: NativeRouteIDs, params: RouteParams): scala.Unit = js.native
  def goto(routeID: java.lang.String, params: RouteParams): scala.Unit = js.native
  def handleAllRoutes(handler: js.Function1[/* routeView */ RouteView, scala.Unit]): js.Function0[scala.Unit] = js.native
  def handleCustomListRoute(
    routeID: java.lang.String,
    handler: js.Function2[
      /* offset */ scala.Double, 
      /* max */ scala.Double, 
      CustomListDescriptor | stdLib.Promise[CustomListDescriptor]
    ]
  ): js.Function0[scala.Unit] = js.native
  def handleCustomRoute(
    routeID: java.lang.String,
    handler: js.Function1[/* customRouteView */ CustomRouteView, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def handleListRoute(routeID: NativeListRouteIDs, handler: js.Function1[/* listRouteView */ ListRouteView, scala.Unit]): js.Function0[scala.Unit] = js.native
}

