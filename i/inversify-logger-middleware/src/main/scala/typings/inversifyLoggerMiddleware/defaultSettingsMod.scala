package typings.inversifyLoggerMiddleware

import typings.inversifyLoggerMiddleware.interfacesMod.interfaces.LoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSettingsMod {
  
  @JSImport("inversify-logger-middleware/dts/config/default_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify-logger-middleware/dts/config/default_settings", JSImport.Default)
  @js.native
  def default: LoggerSettings = js.native
  inline def default_=(x: LoggerSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
