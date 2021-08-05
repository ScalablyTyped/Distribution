package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightEffect extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object HighlightEffect {
  
  inline def apply(): HighlightEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightEffect]
  }
  
  extension [Self <: HighlightEffect](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
