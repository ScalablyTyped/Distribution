package typings
package inversifyDashRestifyDashUtilsLib.dtsServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-restify-utils/dts/server", "InversifyRestifyServer")
@js.native
class InversifyRestifyServer protected () extends js.Object {
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, opts: restifyLib.restifyMod.ServerOptions with inversifyDashRestifyDashUtilsLib.dtsInterfacesMod.interfacesNs.ServerOptions) = this()
  var app: js.Any = js.native
  var configFn: js.Any = js.native
  var container: js.Any = js.native
  var defaultRoot: js.Any = js.native
  def build(): restifyLib.restifyMod.Server = js.native
  /* private */ def handlerFactory(controllerName: js.Any, key: js.Any): js.Any = js.native
  /* private */ def registerControllers(): js.Any = js.native
  /* private */ def resolveMiddleware(
    /* import warning: Dropping repeated marker of param TsIdentSimple(middleware) because its type None is not an array type */middleware: js.Any
  ): js.Any = js.native
  def setConfig(fn: inversifyDashRestifyDashUtilsLib.dtsInterfacesMod.interfacesNs.ConfigFunction): InversifyRestifyServer = js.native
}

