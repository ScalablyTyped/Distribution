package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedSectionExpression extends StObject {
  
  var content: Expression_
  
  var font: Expression_ | Null
  
  var scale: Expression_ | Null
  
  var textColor: Expression_ | Null
}
object FormattedSectionExpression {
  
  inline def apply(content: Expression_): FormattedSectionExpression = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], font = null, scale = null, textColor = null)
    __obj.asInstanceOf[FormattedSectionExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattedSectionExpression] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Expression_): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Expression_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setScale(value: Expression_): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setTextColor(value: Expression_): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
  }
}
