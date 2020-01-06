package typings.jsonpack.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpack", "pack")
@js.native
object pack extends js.Object {
  def apply(json: String): String = js.native
  def apply(json: String, options: PackDebugOptions): DebugObject = js.native
  def apply(json: String, options: PackOptions): String = js.native
  def apply(json: js.Object): String = js.native
  def apply(json: js.Object, options: PackDebugOptions): DebugObject = js.native
  def apply(json: js.Object, options: PackOptions): String = js.native
}

