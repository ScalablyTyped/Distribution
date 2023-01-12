package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelBarMessages extends StObject {
  
  var loading: js.UndefOr[String] = js.undefined
  
  var requestFailed: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[String] = js.undefined
}
object PanelBarMessages {
  
  inline def apply(): PanelBarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanelBarMessages] (val x: Self) extends AnyVal {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setRequestFailed(value: String): Self = StObject.set(x, "requestFailed", value.asInstanceOf[js.Any])
    
    inline def setRequestFailedUndefined: Self = StObject.set(x, "requestFailed", js.undefined)
    
    inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
