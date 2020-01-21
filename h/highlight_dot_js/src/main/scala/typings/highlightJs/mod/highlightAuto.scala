package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highlight.js", "highlightAuto")
@js.native
object highlightAuto extends js.Object {
  def apply(value: String): IAutoHighlightResult = js.native
  def apply(value: String, languageSubset: js.Array[String]): IAutoHighlightResult = js.native
}

