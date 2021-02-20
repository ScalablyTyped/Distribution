package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetExcel extends StObject {
  
  var fileName: js.UndefOr[String] = js.native
  
  var forceProxy: js.UndefOr[Boolean] = js.native
  
  var proxyURL: js.UndefOr[String] = js.native
}
object SpreadsheetExcel {
  
  @scala.inline
  def apply(): SpreadsheetExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetExcel]
  }
  
  @scala.inline
  implicit class SpreadsheetExcelMutableBuilder[Self <: SpreadsheetExcel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    @scala.inline
    def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
  }
}
