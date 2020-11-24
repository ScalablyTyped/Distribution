package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChange extends js.Object {
  
  var range: Range2 = js.native
  
  var text: String = js.native
}
@JSImport("grammarkdown/dist/grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  
  def applyChange(originalText: String, change: TextChange): String = js.native
  
  def clone(change: TextChange): typings.grammarkdown.anon.Range = js.native
  
  def create(text: String, range: Range2): typings.grammarkdown.anon.Range = js.native
  
  def isUnchanged(change: TextChange): Boolean = js.native
}
