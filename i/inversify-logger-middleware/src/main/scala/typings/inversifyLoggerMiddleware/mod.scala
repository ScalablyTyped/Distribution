package typings.inversifyLoggerMiddleware

import typings.inversify.libInterfacesInterfacesMod.interfaces.Middleware
import typings.inversifyLoggerMiddleware.dtsInterfacesInterfacesMod.interfaces.LogEntry
import typings.inversifyLoggerMiddleware.dtsInterfacesInterfacesMod.interfaces.LoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-logger-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLoggerMiddleware(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLoggerMiddleware")().asInstanceOf[Middleware]
  inline def makeLoggerMiddleware(settings: Unit, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLoggerMiddleware")(settings.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  inline def makeLoggerMiddleware(settings: LoggerSettings): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLoggerMiddleware")(settings.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def makeLoggerMiddleware(settings: LoggerSettings, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLoggerMiddleware")(settings.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  
  inline def textSerializer(entry: LogEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textSerializer")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
}
