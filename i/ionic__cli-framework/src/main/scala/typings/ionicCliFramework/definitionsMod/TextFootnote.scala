package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFootnote
  extends StObject
     with Footnote {
  
  var id: String | Double
  
  var text: String
}
object TextFootnote {
  
  inline def apply(id: String | Double, text: String): TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFootnote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextFootnote] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
