package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.Anon_Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typings.grammarkdown.distParserMod.TextChange): String = js.native
  def clone(change: typings.grammarkdown.distParserMod.TextChange): Anon_Range = js.native
  def create(text: String, range: typings.grammarkdown.distCoreMod.Range): Anon_Range = js.native
  def isUnchanged(change: typings.grammarkdown.distParserMod.TextChange): Boolean = js.native
}

