package typings.inversifyLoggerMiddleware

import typings.inversifyLoggerMiddleware.interfacesMod.interfaces.LogEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleRendererMod {
  
  @JSImport("inversify-logger-middleware/dts/renderers/console_renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(entry: LogEntry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
