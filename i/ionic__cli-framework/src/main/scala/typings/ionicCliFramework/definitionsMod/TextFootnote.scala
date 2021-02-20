package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFootnote extends Footnote {
  
  var id: String | Double = js.native
  
  var text: String = js.native
}
object TextFootnote {
  
  @scala.inline
  def apply(id: String | Double, text: String): TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFootnote]
  }
  
  @scala.inline
  implicit class TextFootnoteMutableBuilder[Self <: TextFootnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
