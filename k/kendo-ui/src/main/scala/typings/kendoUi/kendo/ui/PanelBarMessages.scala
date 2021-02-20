package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarMessages extends StObject {
  
  var loading: js.UndefOr[String] = js.native
  
  var requestFailed: js.UndefOr[String] = js.native
  
  var retry: js.UndefOr[String] = js.native
}
object PanelBarMessages {
  
  @scala.inline
  def apply(): PanelBarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarMessages]
  }
  
  @scala.inline
  implicit class PanelBarMessagesMutableBuilder[Self <: PanelBarMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setRequestFailed(value: String): Self = StObject.set(x, "requestFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFailedUndefined: Self = StObject.set(x, "requestFailed", js.undefined)
    
    @scala.inline
    def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
