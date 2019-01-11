package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LOGGER_HANDLERS: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.StreamHandler] = js.native
  val LOGGER_LEVEL_NAMES: stdLib.ReadonlyMap[
    atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight, 
    atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel
  ] = js.native
  def createPrefixedFormatter(prefix: java.lang.String): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createPrefixedFormatter(prefix: js.Function0[java.lang.String]): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createTaggedFormatter(): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: atIonicCliDashFrameworkLib.libLoggerMod.CreateTaggedFormatterOptions): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def getLoggerLevelColor(colors: atIonicCliDashFrameworkLib.libColorsMod.Colors): js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.ColorFunction] = js.native
  def getLoggerLevelColor(
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors,
    level: atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight
  ): js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.ColorFunction] = js.native
  def getLoggerLevelName(): js.UndefOr[atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel] = js.native
  def getLoggerLevelName(level: atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight): js.UndefOr[atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel] = js.native
}

