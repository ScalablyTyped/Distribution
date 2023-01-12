package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynaTreeStringsOptions extends StObject {
  
  var loadError: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
}
object DynaTreeStringsOptions {
  
  inline def apply(): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynaTreeStringsOptions] (val x: Self) extends AnyVal {
    
    inline def setLoadError(value: String): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
