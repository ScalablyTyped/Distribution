package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynaTreeAjaxOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  // >0: Make sure we get an ajax error for invalid URLs
  var dataType: js.UndefOr[String] = js.undefined
  
  // false: Append random '_' argument to the request url to prevent caching.
  var timeout: js.UndefOr[Double] = js.undefined
}
object DynaTreeAjaxOptions {
  
  inline def apply(): DynaTreeAjaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeAjaxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynaTreeAjaxOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
