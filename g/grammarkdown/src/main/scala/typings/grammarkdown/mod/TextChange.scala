package typings.grammarkdown.mod

import typings.grammarkdown.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  
  def applyChange(originalText: String, change: typings.grammarkdown.parserMod.TextChange): String = js.native
  
  def clone(change: typings.grammarkdown.parserMod.TextChange): Text = js.native
  
  def create(text: String, range: typings.grammarkdown.typesMod.Range): Text = js.native
  
  def isUnchanged(change: typings.grammarkdown.parserMod.TextChange): Boolean = js.native
}
