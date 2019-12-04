package typings.ionic

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.StreamHandler
import typings.atIonicCliDashFramework.libLoggerMod.CreateTaggedFormatterOptions
import typings.atIonicCliDashFramework.libLoggerMod.LoggerFormatter
import typings.atIonicCliDashFramework.libLoggerMod.LoggerLevelWeight
import typings.ionic.definitionsMod.ILogger
import typings.node.NodeJS.WritableStream
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/logger", JSImport.Namespace)
@js.native
object libUtilsLoggerMod extends js.Object {
  @js.native
  class Logger () extends ILogger
  
  def createDefaultLoggerHandlers(): Set[StreamHandler] = js.native
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = js.native
  def createFormatter(): LoggerFormatter = js.native
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = js.native
}

