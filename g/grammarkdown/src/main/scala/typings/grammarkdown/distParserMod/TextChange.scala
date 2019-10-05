package typings.grammarkdown.distParserMod

import typings.grammarkdown.Anon_Range
import typings.grammarkdown.distCoreMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var range: Range
  var text: String
}

@JSImport("grammarkdown/dist/parser", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: TextChange): String = js.native
  def clone(change: TextChange): Anon_Range = js.native
  def create(text: String, range: Range): Anon_Range = js.native
  def isUnchanged(change: TextChange): Boolean = js.native
}

