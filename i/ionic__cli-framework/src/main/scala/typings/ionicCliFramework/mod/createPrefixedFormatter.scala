package typings.ionicCliFramework.mod

import typings.ionicCliFramework.loggerMod.LoggerFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "createPrefixedFormatter")
@js.native
object createPrefixedFormatter extends js.Object {
  def apply(prefix: String): LoggerFormatter = js.native
  def apply(prefix: js.Function0[String]): LoggerFormatter = js.native
}

