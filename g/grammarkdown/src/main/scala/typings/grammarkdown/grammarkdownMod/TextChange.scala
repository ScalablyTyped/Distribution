package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChange extends StObject {
  
  var range: Range2
  
  var text: String
}
object TextChange {
  
  @scala.inline
  def apply(range: Range2, text: String): TextChange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  
  @JSImport("grammarkdown/dist/grammarkdown", "TextChange")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyChange(originalText: String, change: TextChange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(originalText.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def clone_(change: TextChange): typings.grammarkdown.anon.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(change.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.anon.Range]
  
  @scala.inline
  def create(text: String, range: Range2): typings.grammarkdown.anon.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.anon.Range]
  
  @scala.inline
  def isUnchanged(change: TextChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnchanged")(change.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: Range2): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
