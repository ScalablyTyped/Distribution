package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.gorillaEngineStrings.`bottom center`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right`
import typings.gorillaEngine.gorillaEngineStrings.`centered left`
import typings.gorillaEngine.gorillaEngineStrings.`centered right`
import typings.gorillaEngine.gorillaEngineStrings.`top center`
import typings.gorillaEngine.gorillaEngineStrings.`top left`
import typings.gorillaEngine.gorillaEngineStrings.`top right`
import typings.gorillaEngine.gorillaEngineStrings.center
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var font: String
  
  var fontKerning: Double
  
  var fontSize: Double
  
  var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
  
  var textColor: String
}
object Font {
  
  inline def apply(
    font: String,
    fontKerning: Double,
    fontSize: Double,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String
  ): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: Double): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(
      value: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
