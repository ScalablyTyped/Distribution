package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidth extends StObject {
  
  var height: js.UndefOr[String] = js.undefined
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object MaxWidth {
  
  inline def apply(): MaxWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth]
  }
  
  extension [Self <: MaxWidth](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
