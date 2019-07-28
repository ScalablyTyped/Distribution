package typings.hjson.hjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hjson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(text: String): js.Any = js.native
  def parse(text: String, options: DeserializeOptions): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, options: SerializeOptions): String = js.native
}

