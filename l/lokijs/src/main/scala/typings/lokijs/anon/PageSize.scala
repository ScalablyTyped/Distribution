package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSize extends StObject {
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var paging: js.UndefOr[Boolean] = js.undefined
}
object PageSize {
  
  inline def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  extension [Self <: PageSize](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
  }
}
