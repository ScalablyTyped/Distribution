package typings.inversifyDashRestifyDashUtils.dtsInterfacesMod

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import typings.inversifyDashRestifyDashUtils.Anon_Options
import typings.inversifyDashRestifyDashUtils.Anon_Path
import typings.restify.restifyMod.RequestHandler
import typings.restify.restifyMod.Server
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesNs {
  type ConfigFunction = js.Function1[/* app */ Server, Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
  type Middleware = ServiceIdentifier[js.Any] | RequestHandler
  type RouteOptions = StrOrRegex | Anon_Path | (Anon_Options with js.Object)
  type StrOrRegex = String | RegExp
}
