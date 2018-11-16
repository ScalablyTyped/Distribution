package typings
package inversifyDashLoggerDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-logger-middleware", JSImport.Namespace)
@js.native
object inversifyDashLoggerDashMiddlewareMod extends js.Object {
  def makeLoggerMiddleware(): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Middleware = js.native
  def makeLoggerMiddleware(
    settings: inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs.LoggerSettings
  ): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Middleware = js.native
  def makeLoggerMiddleware(
    settings: inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs.LoggerSettings,
    renderer: js.Function1[
      /* out */ inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs.LogEntry, 
      scala.Unit
    ]
  ): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Middleware = js.native
  def textSerializer(entry: inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs.LogEntry): java.lang.String = js.native
}

