package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchWebFonts extends StObject {
  
  /*Initial delay before the first check for web fonts (in milliseconds).*/
  var fontCheckDelay: js.UndefOr[Double] = js.undefined
  
  /*How long to keep looking for fonts (in milliseconds).*/
  var fontCheckTimeout: js.UndefOr[Double] = js.undefined
  
  /*This block controls whether to apply font size matching for each output mode.*/
  var matchFor: js.UndefOr[MatchFor] = js.undefined
}
object MatchWebFonts {
  
  inline def apply(): MatchWebFonts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchWebFonts]
  }
  
  extension [Self <: MatchWebFonts](x: Self) {
    
    inline def setFontCheckDelay(value: Double): Self = StObject.set(x, "fontCheckDelay", value.asInstanceOf[js.Any])
    
    inline def setFontCheckDelayUndefined: Self = StObject.set(x, "fontCheckDelay", js.undefined)
    
    inline def setFontCheckTimeout(value: Double): Self = StObject.set(x, "fontCheckTimeout", value.asInstanceOf[js.Any])
    
    inline def setFontCheckTimeoutUndefined: Self = StObject.set(x, "fontCheckTimeout", js.undefined)
    
    inline def setMatchFor(value: MatchFor): Self = StObject.set(x, "matchFor", value.asInstanceOf[js.Any])
    
    inline def setMatchForUndefined: Self = StObject.set(x, "matchFor", js.undefined)
  }
}
