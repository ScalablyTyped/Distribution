package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event update failure resource.
  */
trait SchemaEventRecordFailure extends StObject {
  
  /**
    * The ID of the event that was not updated.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;NOT_FOUND&quot; - An attempt was made to set an event that was not
    * defined.  - &quot;INVALID_UPDATE_VALUE&quot; - An attempt was made to
    * increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventRecordFailure.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEventRecordFailure {
  
  @scala.inline
  def apply(): SchemaEventRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventRecordFailure]
  }
  
  @scala.inline
  implicit class SchemaEventRecordFailureMutableBuilder[Self <: SchemaEventRecordFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
