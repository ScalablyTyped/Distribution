package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "LogLevel")
@js.native
/* private */ open class LogLevel ()
  extends typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel
/* static members */
object LogLevel {
  
  @JSImport("matrix-bot-sdk", "LogLevel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The DEBUG channel
    */
  @JSImport("matrix-bot-sdk", "LogLevel.DEBUG")
  @js.native
  val DEBUG: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = js.native
  
  /**
    * The ERROR channel
    */
  @JSImport("matrix-bot-sdk", "LogLevel.ERROR")
  @js.native
  val ERROR: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = js.native
  
  /**
    * The INFO channel
    */
  @JSImport("matrix-bot-sdk", "LogLevel.INFO")
  @js.native
  val INFO: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = js.native
  
  /**
    * The TRACE channel
    */
  @JSImport("matrix-bot-sdk", "LogLevel.TRACE")
  @js.native
  val TRACE: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = js.native
  
  /**
    * The WARN channel
    */
  @JSImport("matrix-bot-sdk", "LogLevel.WARN")
  @js.native
  val WARN: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = js.native
  
  inline def fromString(level: String): typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(level.asInstanceOf[js.Any]).asInstanceOf[typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel]
  inline def fromString(level: String, defaultLevel: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel): typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(level.asInstanceOf[js.Any], defaultLevel.asInstanceOf[js.Any])).asInstanceOf[typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel]
}
