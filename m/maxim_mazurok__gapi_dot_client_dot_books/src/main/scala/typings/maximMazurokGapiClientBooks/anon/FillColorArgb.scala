package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillColorArgb extends StObject {
  
  var fillColorArgb: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var maskColorArgb: js.UndefOr[String] = js.undefined
  
  var moreButtonText: js.UndefOr[String] = js.undefined
  
  var moreButtonUrl: js.UndefOr[String] = js.undefined
  
  var textColorArgb: js.UndefOr[String] = js.undefined
}
object FillColorArgb {
  
  inline def apply(): FillColorArgb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillColorArgb]
  }
  
  extension [Self <: FillColorArgb](x: Self) {
    
    inline def setFillColorArgb(value: String): Self = StObject.set(x, "fillColorArgb", value.asInstanceOf[js.Any])
    
    inline def setFillColorArgbUndefined: Self = StObject.set(x, "fillColorArgb", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setMaskColorArgb(value: String): Self = StObject.set(x, "maskColorArgb", value.asInstanceOf[js.Any])
    
    inline def setMaskColorArgbUndefined: Self = StObject.set(x, "maskColorArgb", js.undefined)
    
    inline def setMoreButtonText(value: String): Self = StObject.set(x, "moreButtonText", value.asInstanceOf[js.Any])
    
    inline def setMoreButtonTextUndefined: Self = StObject.set(x, "moreButtonText", js.undefined)
    
    inline def setMoreButtonUrl(value: String): Self = StObject.set(x, "moreButtonUrl", value.asInstanceOf[js.Any])
    
    inline def setMoreButtonUrlUndefined: Self = StObject.set(x, "moreButtonUrl", js.undefined)
    
    inline def setTextColorArgb(value: String): Self = StObject.set(x, "textColorArgb", value.asInstanceOf[js.Any])
    
    inline def setTextColorArgbUndefined: Self = StObject.set(x, "textColorArgb", js.undefined)
  }
}
