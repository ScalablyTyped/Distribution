package typings
package inversifyDashRestifyDashUtilsLib.dtsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesNs {
  type ConfigFunction = js.Function1[/* app */ restifyLib.restifyMod.Server, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = js.Any | restifyLib.restifyMod.RequestHandler
  type RouteOptions = (StrOrRegex | inversifyDashRestifyDashUtilsLib.Anon_Path | inversifyDashRestifyDashUtilsLib.Anon_Options) with js.Object
  type StrOrRegex = java.lang.String | stdLib.RegExp
}
