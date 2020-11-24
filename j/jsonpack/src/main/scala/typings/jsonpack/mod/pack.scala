package typings.jsonpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonpack", "pack")
@js.native
object pack extends js.Object {
  
  def apply(json: String): DebugObject = js.native
  def apply(json: String, options: PackDebugOptions): DebugObject = js.native
  def apply(json: String, options: PackOptions): String = js.native
  def apply(json: js.Object): DebugObject = js.native
  def apply(json: js.Object, options: PackDebugOptions): DebugObject = js.native
  def apply(json: js.Object, options: PackOptions): String = js.native
}
