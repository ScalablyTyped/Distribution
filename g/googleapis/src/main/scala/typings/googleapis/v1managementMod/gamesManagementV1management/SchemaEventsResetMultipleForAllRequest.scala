package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for multiple events reset all request.
  */
@js.native
trait SchemaEventsResetMultipleForAllRequest extends StObject {
  
  /**
    * The IDs of events to reset.
    */
  var event_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#eventsResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaEventsResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): SchemaEventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventsResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class SchemaEventsResetMultipleForAllRequestMutableBuilder[Self <: SchemaEventsResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_ids(value: js.Array[String]): Self = StObject.set(x, "event_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_idsUndefined: Self = StObject.set(x, "event_ids", js.undefined)
    
    @scala.inline
    def setEvent_idsVarargs(value: String*): Self = StObject.set(x, "event_ids", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
