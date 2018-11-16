package typings
package hjsonLib.hjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hjson", JSImport.Namespace)
@js.native
object hjsonModMembers extends js.Object {
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, options: DeserializeOptions): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, options: SerializeOptions): java.lang.String = js.native
}

