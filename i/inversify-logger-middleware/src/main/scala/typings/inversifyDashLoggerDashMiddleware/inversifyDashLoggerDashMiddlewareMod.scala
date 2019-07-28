package typings.inversifyDashLoggerDashMiddleware

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Middleware
import typings.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfacesNs.LogEntry
import typings.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfacesNs.LoggerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-logger-middleware", JSImport.Namespace)
@js.native
object inversifyDashLoggerDashMiddlewareMod extends js.Object {
  def makeLoggerMiddleware(): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = js.native
  def textSerializer(entry: LogEntry): String = js.native
}

