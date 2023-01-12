package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetExcel extends StObject {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var proxyURL: js.UndefOr[String] = js.undefined
}
object SpreadsheetExcel {
  
  inline def apply(): SpreadsheetExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetExcel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetExcel] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    inline def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    inline def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    inline def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
  }
}
