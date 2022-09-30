package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddlePageProperties extends StObject {
  
  var currentPage: js.UndefOr[Double] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var recordCount: js.UndefOr[Double] = js.undefined
}
object GriddlePageProperties {
  
  inline def apply(): GriddlePageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddlePageProperties]
  }
  
  extension [Self <: GriddlePageProperties](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
    
    inline def setRecordCountUndefined: Self = StObject.set(x, "recordCount", js.undefined)
  }
}
