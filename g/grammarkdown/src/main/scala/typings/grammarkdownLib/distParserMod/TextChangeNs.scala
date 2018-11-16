package typings
package grammarkdownLib.distParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/parser", "TextChange")
@js.native
object TextChangeNs extends js.Object {
  def applyChange(originalText: java.lang.String, change: grammarkdownLib.distParserMod.TextChange): java.lang.String = js.native
  def clone(change: grammarkdownLib.distParserMod.TextChange): grammarkdownLib.Anon_Text = js.native
  def create(text: java.lang.String, range: grammarkdownLib.distCoreMod.Range): grammarkdownLib.Anon_Text = js.native
  def isUnchanged(change: grammarkdownLib.distParserMod.TextChange): scala.Boolean = js.native
}

