package typings
package jsonpackLib.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pack(json: java.lang.String): DebugObject = js.native
  def pack(json: java.lang.String, options: PackDebugOptions): DebugObject = js.native
  def pack(json: java.lang.String, options: PackOptions): java.lang.String = js.native
  def pack(json: js.Object): DebugObject = js.native
  def pack(json: js.Object, options: PackDebugOptions): DebugObject = js.native
  def pack(json: js.Object, options: PackOptions): java.lang.String = js.native
  @JSName("pack")
  def pack_String(json: java.lang.String): java.lang.String = js.native
  @JSName("pack")
  def pack_String(json: js.Object): java.lang.String = js.native
  def unpack[T](packed: java.lang.String): T = js.native
  def unpack[T](packed: java.lang.String, options: PackOptions): T = js.native
}

