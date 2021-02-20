package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterInstance extends StObject {
  
  var NativeListRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeListRouteIDs */ js.Any = js.native
  
  var NativeRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeRouteIDs */ js.Any = js.native
  
  def createLink(routeID: String, params: RouteParams): String = js.native
  def createLink(routeID: NativeRouteIDs, params: RouteParams): String = js.native
  
  def getCurrentRouteView(): RouteView = js.native
  
  def goto(routeID: String, params: RouteParams): Unit = js.native
  def goto(routeID: NativeRouteIDs, params: RouteParams): Unit = js.native
  
  def handleAllRoutes(handler: js.Function1[/* routeView */ RouteView, Unit]): js.Function0[Unit] = js.native
  
  def handleCustomListRoute(
    routeID: String,
    handler: js.Function2[
      /* offset */ Double, 
      /* max */ Double, 
      CustomListDescriptor | js.Promise[CustomListDescriptor]
    ]
  ): js.Function0[Unit] = js.native
  
  def handleCustomRoute(routeID: String, handler: js.Function1[/* customRouteView */ CustomRouteView, Unit]): js.Function0[Unit] = js.native
  
  def handleListRoute(routeID: NativeListRouteIDs, handler: js.Function1[/* listRouteView */ ListRouteView, Unit]): js.Function0[Unit] = js.native
}
