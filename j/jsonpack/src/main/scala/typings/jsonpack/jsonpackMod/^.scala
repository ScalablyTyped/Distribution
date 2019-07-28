package typings.jsonpack.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pack(json: String): String = js.native
  def pack(json: String, options: PackDebugOptions): DebugObject = js.native
  def pack(json: String, options: PackOptions): String = js.native
  def pack(json: js.Object): String = js.native
  def pack(json: js.Object, options: PackDebugOptions): DebugObject = js.native
  def pack(json: js.Object, options: PackOptions): String = js.native
  @JSName("pack")
  def pack_DebugObject(json: String): DebugObject = js.native
  @JSName("pack")
  def pack_DebugObject(json: js.Object): DebugObject = js.native
  def unpack[T](packed: String): T = js.native
  def unpack[T](packed: String, options: PackOptions): T = js.native
}

