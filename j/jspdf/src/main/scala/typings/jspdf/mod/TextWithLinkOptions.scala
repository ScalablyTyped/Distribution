package typings.jspdf.mod

import typings.jspdf.jspdfStrings.Fit
import typings.jspdf.jspdfStrings.FitH
import typings.jspdf.jspdfStrings.FitV
import typings.jspdf.jspdfStrings.XYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWithLinkOptions extends StObject {
  
  var magFactor: js.UndefOr[Fit | FitH | FitV | XYZ] = js.undefined
  
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object TextWithLinkOptions {
  
  inline def apply(): TextWithLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWithLinkOptions]
  }
  
  extension [Self <: TextWithLinkOptions](x: Self) {
    
    inline def setMagFactor(value: Fit | FitH | FitV | XYZ): Self = StObject.set(x, "magFactor", value.asInstanceOf[js.Any])
    
    inline def setMagFactorUndefined: Self = StObject.set(x, "magFactor", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
