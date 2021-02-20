package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapProgressDefaults extends StObject {
  
  var animated: Boolean = js.native
  
  var css: String = js.native
  
  var striped: Boolean = js.native
  
  var text: String = js.native
  
  var textHidden: Boolean = js.native
  
  var `type`: String = js.native
}
object KnockstrapProgressDefaults {
  
  @scala.inline
  def apply(
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
  implicit class KnockstrapProgressDefaultsMutableBuilder[Self <: KnockstrapProgressDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHidden(value: Boolean): Self = StObject.set(x, "textHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
