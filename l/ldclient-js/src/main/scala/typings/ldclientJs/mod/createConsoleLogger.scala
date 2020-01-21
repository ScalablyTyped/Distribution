package typings.ldclientJs.mod

import typings.ldclientJsCommon.mod.LDLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldclient-js", "createConsoleLogger")
@js.native
object createConsoleLogger extends js.Object {
  def apply(minimumLevel: String): LDLogger = js.native
}

