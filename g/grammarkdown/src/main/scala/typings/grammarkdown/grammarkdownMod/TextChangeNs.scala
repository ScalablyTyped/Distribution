package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.Anon_Range
import typings.grammarkdown.distCoreMod.Range
import typings.grammarkdown.distParserMod.TextChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChangeNs extends js.Object {
  def applyChange(originalText: String, change: TextChange): String = js.native
  def clone(change: TextChange): Anon_Range = js.native
  def create(text: String, range: Range): Anon_Range = js.native
  def isUnchanged(change: TextChange): Boolean = js.native
}

