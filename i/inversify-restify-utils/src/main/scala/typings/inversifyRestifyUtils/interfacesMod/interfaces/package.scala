package typings.inversifyRestifyUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typings.restify.mod.Server, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | typings.restify.mod.RequestHandler
  /* Rewritten from type alias, can be one of: 
    - typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
    - typings.inversifyRestifyUtils.anon.Path
    - typings.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
  */
  type RouteOptions = typings.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions | typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
  type StrOrRegex = java.lang.String | typings.std.RegExp
}
