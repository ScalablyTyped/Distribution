package typings.atHapiHoek.atHapiHoekMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "abort")
@js.native
object abort extends js.Object {
  def apply(message: String): Unit = js.native
  def apply(message: Error): Unit = js.native
}

