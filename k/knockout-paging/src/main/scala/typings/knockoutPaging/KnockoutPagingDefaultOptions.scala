package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPagingDefaultOptions extends StObject {
  
  var pageNumber: Double
  
  var pageSize: Double
}
object KnockoutPagingDefaultOptions {
  
  inline def apply(pageNumber: Double, pageSize: Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
  
  extension [Self <: KnockoutPagingDefaultOptions](x: Self) {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
