package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPageLangItems extends StObject {
  
  var en: js.UndefOr[IPageLabels] = js.undefined
  
  var hu: js.UndefOr[IPageLabels] = js.undefined
}
object IPageLangItems {
  
  inline def apply(): IPageLangItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageLangItems]
  }
  
  extension [Self <: IPageLangItems](x: Self) {
    
    inline def setEn(value: IPageLabels): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setEnUndefined: Self = StObject.set(x, "en", js.undefined)
    
    inline def setHu(value: IPageLabels): Self = StObject.set(x, "hu", value.asInstanceOf[js.Any])
    
    inline def setHuUndefined: Self = StObject.set(x, "hu", js.undefined)
  }
}
