package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChange extends StObject {
  
  var range: Range2 = js.native
  
  var text: String = js.native
}
object TextChange {
  
  @scala.inline
  def apply(range: Range2, text: String): TextChange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  
  @JSImport("grammarkdown/dist/grammarkdown", "TextChange.applyChange")
  @js.native
  def applyChange(originalText: String, change: TextChange): String = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "TextChange.clone")
  @js.native
  def clone_(change: TextChange): typings.grammarkdown.anon.Range = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "TextChange.create")
  @js.native
  def create(text: String, range: Range2): typings.grammarkdown.anon.Range = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "TextChange.isUnchanged")
  @js.native
  def isUnchanged(change: TextChange): Boolean = js.native
  
  @scala.inline
  implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: Range2): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
