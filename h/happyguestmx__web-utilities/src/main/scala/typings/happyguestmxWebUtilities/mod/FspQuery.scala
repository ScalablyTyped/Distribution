package typings.happyguestmxWebUtilities.mod

import typings.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.asc
import typings.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FspQuery extends StObject {
  
  var orderBy: String
  
  var page: Double
  
  var queryString: String
  
  var size: Double
  
  var sortType: asc | desc
}
object FspQuery {
  
  inline def apply(orderBy: String, page: Double, queryString: String, size: Double, sortType: asc | desc): FspQuery = {
    val __obj = js.Dynamic.literal(orderBy = orderBy.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sortType = sortType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FspQuery]
  }
  
  extension [Self <: FspQuery](x: Self) {
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSortType(value: asc | desc): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
  }
}
