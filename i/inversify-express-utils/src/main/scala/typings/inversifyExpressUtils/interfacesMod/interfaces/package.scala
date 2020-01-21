package typings.inversifyExpressUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typings.express.mod.Application_, scala.Unit]
  type ControllerParameterMetadata = org.scalablytyped.runtime.StringDictionary[
    js.Array[typings.inversifyExpressUtils.interfacesMod.interfaces.ParameterMetadata]
  ]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | typings.express.mod.RequestHandler[typings.expressServeStaticCore.mod.ParamsDictionary]
}
