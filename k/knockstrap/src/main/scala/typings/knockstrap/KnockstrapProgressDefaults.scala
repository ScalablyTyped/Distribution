package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapProgressDefaults extends StObject {
  
  var animated: Boolean
  
  var css: String
  
  var striped: Boolean
  
  var text: String
  
  var textHidden: Boolean
  
  var `type`: String
}
object KnockstrapProgressDefaults {
  
  inline def apply(
    animated: Boolean,
    css: String,
    striped: Boolean,
    text: String,
    textHidden: Boolean,
    `type`: String
  ): KnockstrapProgressDefaults = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], striped = striped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textHidden = textHidden.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapProgressDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockstrapProgressDefaults] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextHidden(value: Boolean): Self = StObject.set(x, "textHidden", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
