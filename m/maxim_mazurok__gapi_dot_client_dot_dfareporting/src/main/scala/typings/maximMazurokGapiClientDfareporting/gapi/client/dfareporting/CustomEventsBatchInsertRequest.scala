package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventsBatchInsertRequest extends StObject {
  
  /** The set of custom events to insert. */
  var customEvents: js.UndefOr[js.Array[CustomEvent]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.native
}
object CustomEventsBatchInsertRequest {
  
  @scala.inline
  def apply(): CustomEventsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventsBatchInsertRequest]
  }
  
  @scala.inline
  implicit class CustomEventsBatchInsertRequestMutableBuilder[Self <: CustomEventsBatchInsertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomEvents(value: js.Array[CustomEvent]): Self = StObject.set(x, "customEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEventsUndefined: Self = StObject.set(x, "customEvents", js.undefined)
    
    @scala.inline
    def setCustomEventsVarargs(value: CustomEvent*): Self = StObject.set(x, "customEvents", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
