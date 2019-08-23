package typings.jsonpointer.jsonpointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpointer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(pointer: String): JSONPointer = js.native
  def get(`object`: js.Object, pointer: String): js.Any = js.native
  def set(`object`: js.Object, pointer: String, value: js.Any): Unit = js.native
}

