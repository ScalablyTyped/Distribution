package typings.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsenMain extends js.Object {
  @JSName("unique")
  var unique_Original: JsenUnique = js.native
  def apply(): JsenValidator = js.native
  def apply(schema: js.UndefOr[scala.Nothing], options: JsenSettings): JsenValidator = js.native
  def apply(schema: js.Any): JsenValidator = js.native
  def apply(schema: js.Any, options: JsenSettings): JsenValidator = js.native
  def clone(data: js.Any): js.Any = js.native
  def equal(a: js.Any, b: js.Any): Boolean = js.native
  def unique(array: js.Array[_]): Boolean = js.native
}

