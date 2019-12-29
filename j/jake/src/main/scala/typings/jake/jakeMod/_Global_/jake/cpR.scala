package typings.jake.jakeMod._Global_.jake

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake.cpR")
@js.native
object cpR extends js.Object {
  def apply(path: String, destination: String): Unit = js.native
  def apply(path: String, destination: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(path: String, destination: String, opts: UtilOptions): Unit = js.native
  def apply(path: String, destination: String, opts: UtilOptions, callback: js.Function0[Unit]): Unit = js.native
}

