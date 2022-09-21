package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastInParagraph extends StObject {
  
  var lastInParagraph: Boolean
  
  var text: String
  
  var width: Double
}
object LastInParagraph {
  
  inline def apply(lastInParagraph: Boolean, text: String, width: Double): LastInParagraph = {
    val __obj = js.Dynamic.literal(lastInParagraph = lastInParagraph.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastInParagraph]
  }
  
  extension [Self <: LastInParagraph](x: Self) {
    
    inline def setLastInParagraph(value: Boolean): Self = StObject.set(x, "lastInParagraph", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
