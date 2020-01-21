package typings.hapiHoek.mod.contain

import typings.hapiHoek.hapiHoekStrings.once
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "contain")
@js.native
object ^ extends js.Object {
  def apply(ref: String, values: String): Boolean = js.native
  def apply(ref: String, values: String, options: Options): Boolean = js.native
  def apply(ref: String, values: js.Array[String]): Boolean = js.native
  def apply(ref: String, values: js.Array[String], options: Options): Boolean = js.native
  def apply(ref: js.Array[_], values: js.Any): Boolean = js.native
  def apply(ref: js.Array[_], values: js.Any, options: Options): Boolean = js.native
  def apply(ref: js.Object, values: String): Boolean = js.native
  def apply(ref: js.Object, values: String, options: Omit[Options, once]): Boolean = js.native
  def apply(ref: js.Object, values: js.Array[String]): Boolean = js.native
  def apply(ref: js.Object, values: js.Array[String], options: Omit[Options, once]): Boolean = js.native
  def apply(ref: js.Object, values: js.Object): Boolean = js.native
  def apply(ref: js.Object, values: js.Object, options: Omit[Options, once]): Boolean = js.native
}

