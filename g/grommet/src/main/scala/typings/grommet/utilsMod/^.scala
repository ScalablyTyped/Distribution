package typings.grommet.utilsMod

import typings.grommet.Anon_Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val deepFreeze: DeepFreeze = js.native
  val deepMerge: DeepMerge = js.native
  def isObject(item: js.Any): Boolean = js.native
  def normalizeColor(color: String, theme: js.Object): String = js.native
  def normalizeColor(color: String, theme: js.Object, required: Boolean): String = js.native
  def normalizeColor(color: Anon_Dark, theme: js.Object): String = js.native
  def normalizeColor(color: Anon_Dark, theme: js.Object, required: Boolean): String = js.native
  def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = js.native
}

