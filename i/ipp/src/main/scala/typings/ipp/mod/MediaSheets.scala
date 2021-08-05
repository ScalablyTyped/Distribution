package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSheets extends StObject {
  
  var blank: js.UndefOr[Double] = js.undefined
  
  var `full-color`: js.UndefOr[Double] = js.undefined
  
  var `highlight-color`: js.UndefOr[Double] = js.undefined
  
  var monochrome: js.UndefOr[Double] = js.undefined
}
object MediaSheets {
  
  inline def apply(): MediaSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSheets]
  }
  
  extension [Self <: MediaSheets](x: Self) {
    
    inline def setBlank(value: Double): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
    
    inline def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
    
    inline def `setFull-color`(value: Double): Self = StObject.set(x, "full-color", value.asInstanceOf[js.Any])
    
    inline def `setFull-colorUndefined`: Self = StObject.set(x, "full-color", js.undefined)
    
    inline def `setHighlight-color`(value: Double): Self = StObject.set(x, "highlight-color", value.asInstanceOf[js.Any])
    
    inline def `setHighlight-colorUndefined`: Self = StObject.set(x, "highlight-color", js.undefined)
    
    inline def setMonochrome(value: Double): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    inline def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
  }
}
