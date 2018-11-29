package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", JSImport.Namespace)
@js.native
object libLoggerModMembers extends js.Object {
  val DEFAULT_LOGGER_HANDLERS: nodeLib.ReadonlySet[StreamHandler] = js.native
  val LOGGER_LEVEL_NAMES: stdLib.ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  def createPrefixedFormatter(prefix: java.lang.String): LoggerFormatter = js.native
  def createPrefixedFormatter(prefix: js.Function0[java.lang.String]): LoggerFormatter = js.native
  def createTaggedFormatter(): LoggerFormatter = js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def getLoggerLevelColor(colors: atIonicCliDashFrameworkLib.libColorsMod.Colors): js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.ColorFunction] = js.native
  def getLoggerLevelColor(colors: atIonicCliDashFrameworkLib.libColorsMod.Colors, level: LoggerLevelWeight): js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.ColorFunction] = js.native
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = js.native
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = js.native
}

