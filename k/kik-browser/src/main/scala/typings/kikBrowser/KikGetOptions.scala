package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikGetOptions extends StObject {
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minResults: js.UndefOr[Double] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
}
object KikGetOptions {
  
  inline def apply(): KikGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikGetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KikGetOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinResults(value: Double): Self = StObject.set(x, "minResults", value.asInstanceOf[js.Any])
    
    inline def setMinResultsUndefined: Self = StObject.set(x, "minResults", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
