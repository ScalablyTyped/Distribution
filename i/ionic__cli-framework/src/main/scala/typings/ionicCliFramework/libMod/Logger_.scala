package typings.ionicCliFramework.libMod

import typings.ionicCliFramework.loggerMod.Logger
import typings.ionicCliFramework.loggerMod.LoggerHandler
import typings.ionicCliFramework.loggerMod.LoggerOptions
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger_ () extends Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger_ extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

