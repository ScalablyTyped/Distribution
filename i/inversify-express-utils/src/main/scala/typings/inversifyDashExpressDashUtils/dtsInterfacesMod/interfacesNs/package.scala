package typings.inversifyDashExpressDashUtils.dtsInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesNs {
  type ConfigFunction = js.Function1[/* app */ Application, Unit]
  type ControllerParameterMetadata = StringDictionary[js.Array[ParameterMetadata]]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
  type Middleware = ServiceIdentifier[js.Any] | RequestHandler
}
