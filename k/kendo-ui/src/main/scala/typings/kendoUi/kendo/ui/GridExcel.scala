package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridExcel extends StObject {
  
  var allPages: js.UndefOr[Boolean] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var proxyURL: js.UndefOr[String] = js.undefined
}
object GridExcel {
  
  inline def apply(): GridExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcel]
  }
  
  extension [Self <: GridExcel](x: Self) {
    
    inline def setAllPages(value: Boolean): Self = StObject.set(x, "allPages", value.asInstanceOf[js.Any])
    
    inline def setAllPagesUndefined: Self = StObject.set(x, "allPages", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    inline def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    inline def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    inline def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
  }
}
