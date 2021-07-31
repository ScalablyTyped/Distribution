package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventStatus extends StObject {
  
  /** The original custom event that was inserted. */
  var customEvent: js.UndefOr[CustomEvent] = js.undefined
  
  /** A list of errors related to this custom event. */
  var errors: js.UndefOr[js.Array[CustomEventError]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventStatus". */
  var kind: js.UndefOr[String] = js.undefined
}
object CustomEventStatus {
  
  @scala.inline
  def apply(): CustomEventStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventStatus]
  }
  
  @scala.inline
  implicit class CustomEventStatusMutableBuilder[Self <: CustomEventStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomEvent(value: CustomEvent): Self = StObject.set(x, "customEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEventUndefined: Self = StObject.set(x, "customEvent", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[CustomEventError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: CustomEventError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
