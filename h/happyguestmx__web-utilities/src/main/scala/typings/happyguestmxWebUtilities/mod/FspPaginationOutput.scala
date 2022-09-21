package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FspPaginationOutput extends StObject {
  
  var indexBegin: Double
  
  var indexEnd: Double
  
  var items: js.Array[Any]
  
  var page: Double
  
  var pageTop: Double
  
  var total: Double
}
object FspPaginationOutput {
  
  inline def apply(
    indexBegin: Double,
    indexEnd: Double,
    items: js.Array[Any],
    page: Double,
    pageTop: Double,
    total: Double
  ): FspPaginationOutput = {
    val __obj = js.Dynamic.literal(indexBegin = indexBegin.asInstanceOf[js.Any], indexEnd = indexEnd.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageTop = pageTop.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FspPaginationOutput]
  }
  
  extension [Self <: FspPaginationOutput](x: Self) {
    
    inline def setIndexBegin(value: Double): Self = StObject.set(x, "indexBegin", value.asInstanceOf[js.Any])
    
    inline def setIndexEnd(value: Double): Self = StObject.set(x, "indexEnd", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageTop(value: Double): Self = StObject.set(x, "pageTop", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
