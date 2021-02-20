package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTreeStringsOptions extends StObject {
  
  var loadError: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[String] = js.native
}
object DynaTreeStringsOptions {
  
  @scala.inline
  def apply(): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
  
  @scala.inline
  implicit class DynaTreeStringsOptionsMutableBuilder[Self <: DynaTreeStringsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadError(value: String): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
