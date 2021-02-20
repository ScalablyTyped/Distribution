package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionicCliFramework.loggerMod.CreateTaggedFormatterOptions
import typings.ionicCliFramework.loggerMod.LoggerFormatter
import typings.ionicCliFramework.loggerMod.LoggerLevelWeight
import typings.ionicCliFramework.loggerMod.LoggerOptions
import typings.ionicCliFramework.mod.StreamHandler
import typings.node.NodeJS.WritableStream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("ionic/lib/utils/logger", "Logger")
  @js.native
  class Logger () extends ILogger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  
  @JSImport("ionic/lib/utils/logger", "createDefaultLoggerHandlers")
  @js.native
  def createDefaultLoggerHandlers(): Set[StreamHandler] = js.native
  @JSImport("ionic/lib/utils/logger", "createDefaultLoggerHandlers")
  @js.native
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = js.native
  
  @JSImport("ionic/lib/utils/logger", "createFormatter")
  @js.native
  def createFormatter(): LoggerFormatter = js.native
  @JSImport("ionic/lib/utils/logger", "createFormatter")
  @js.native
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  
  @JSImport("ionic/lib/utils/logger", "createPrefixedWriteStream")
  @js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = js.native
  @JSImport("ionic/lib/utils/logger", "createPrefixedWriteStream")
  @js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = js.native
}
