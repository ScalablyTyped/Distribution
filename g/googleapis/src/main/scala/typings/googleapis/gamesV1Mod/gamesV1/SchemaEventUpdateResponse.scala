package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event period update resource.
  */
trait SchemaEventUpdateResponse extends StObject {
  
  /**
    * Any batch-wide failures which occurred applying updates.
    */
  var batchFailures: js.UndefOr[js.Array[SchemaEventBatchRecordFailure]] = js.undefined
  
  /**
    * Any failures updating a particular event.
    */
  var eventFailures: js.UndefOr[js.Array[SchemaEventRecordFailure]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of any updated events
    */
  var playerEvents: js.UndefOr[js.Array[SchemaPlayerEvent]] = js.undefined
}
object SchemaEventUpdateResponse {
  
  @scala.inline
  def apply(): SchemaEventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventUpdateResponse]
  }
  
  @scala.inline
  implicit class SchemaEventUpdateResponseMutableBuilder[Self <: SchemaEventUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchFailures(value: js.Array[SchemaEventBatchRecordFailure]): Self = StObject.set(x, "batchFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchFailuresUndefined: Self = StObject.set(x, "batchFailures", js.undefined)
    
    @scala.inline
    def setBatchFailuresVarargs(value: SchemaEventBatchRecordFailure*): Self = StObject.set(x, "batchFailures", js.Array(value :_*))
    
    @scala.inline
    def setEventFailures(value: js.Array[SchemaEventRecordFailure]): Self = StObject.set(x, "eventFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFailuresUndefined: Self = StObject.set(x, "eventFailures", js.undefined)
    
    @scala.inline
    def setEventFailuresVarargs(value: SchemaEventRecordFailure*): Self = StObject.set(x, "eventFailures", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayerEvents(value: js.Array[SchemaPlayerEvent]): Self = StObject.set(x, "playerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerEventsUndefined: Self = StObject.set(x, "playerEvents", js.undefined)
    
    @scala.inline
    def setPlayerEventsVarargs(value: SchemaPlayerEvent*): Self = StObject.set(x, "playerEvents", js.Array(value :_*))
  }
}
