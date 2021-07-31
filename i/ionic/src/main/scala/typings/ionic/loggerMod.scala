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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("ionic/lib/utils/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/utils/logger", "Logger")
  @js.native
  class Logger () extends ILogger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  
  @scala.inline
  def createDefaultLoggerHandlers(): Set[StreamHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLoggerHandlers")().asInstanceOf[Set[StreamHandler]]
  @scala.inline
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLoggerHandlers")(formatter.asInstanceOf[js.Any]).asInstanceOf[Set[StreamHandler]]
  
  @scala.inline
  def createFormatter(): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")().asInstanceOf[LoggerFormatter]
  @scala.inline
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  @scala.inline
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedWriteStream")(log.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedWriteStream")(log.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
}
