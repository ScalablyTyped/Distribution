package typings.ionicCliFramework.mod

import typings.ionicCliFramework.loggerMod.LoggerHandler
import typings.ionicCliFramework.loggerMod.LoggerOptions
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "Logger")
@js.native
class Logger_ ()
  extends typings.ionicCliFramework.libMod.Logger_ {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework", "Logger")
@js.native
object Logger_ extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

