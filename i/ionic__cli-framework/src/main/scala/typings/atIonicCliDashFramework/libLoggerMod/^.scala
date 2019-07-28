package typings.atIonicCliDashFramework.libLoggerMod

import typings.atIonicCliDashFramework.libColorsMod.ColorFunction
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[StreamHandler] = js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  def createPrefixedFormatter(prefix: String): LoggerFormatter = js.native
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = js.native
  def createTaggedFormatter(): LoggerFormatter = js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = js.native
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = js.native
}

