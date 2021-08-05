package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapHighlightColor extends StObject {
  
  var tapHighlightColor: js.UndefOr[String] = js.undefined
}
object TapHighlightColor {
  
  inline def apply(): TapHighlightColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapHighlightColor]
  }
  
  extension [Self <: TapHighlightColor](x: Self) {
    
    inline def setTapHighlightColor(value: String): Self = StObject.set(x, "tapHighlightColor", value.asInstanceOf[js.Any])
    
    inline def setTapHighlightColorUndefined: Self = StObject.set(x, "tapHighlightColor", js.undefined)
  }
}
