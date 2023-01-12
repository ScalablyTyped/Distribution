package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPagedOptions extends StObject {
  
  var pageGenerator: js.UndefOr[String] = js.undefined
  
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
}
object KnockoutPagedOptions {
  
  inline def apply(): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutPagedOptions] (val x: Self) extends AnyVal {
    
    inline def setPageGenerator(value: String): Self = StObject.set(x, "pageGenerator", value.asInstanceOf[js.Any])
    
    inline def setPageGeneratorUndefined: Self = StObject.set(x, "pageGenerator", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
