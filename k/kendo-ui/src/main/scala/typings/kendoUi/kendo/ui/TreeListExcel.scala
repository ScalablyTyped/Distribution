package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListExcel extends StObject {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var proxyURL: js.UndefOr[String] = js.undefined
}
object TreeListExcel {
  
  @scala.inline
  def apply(): TreeListExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListExcel]
  }
  
  @scala.inline
  implicit class TreeListExcelMutableBuilder[Self <: TreeListExcel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
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
