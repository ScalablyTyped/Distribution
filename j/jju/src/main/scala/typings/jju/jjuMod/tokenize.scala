package typings.jju.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jju", "tokenize")
@js.native
object tokenize extends js.Object {
  def apply(text: String): js.Array[Token] = js.native
  def apply(text: String, options: ParseOptions): js.Array[Token] = js.native
}

