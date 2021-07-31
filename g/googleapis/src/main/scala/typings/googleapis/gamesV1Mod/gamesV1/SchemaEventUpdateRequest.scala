package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event period update resource.
  */
trait SchemaEventUpdateRequest extends StObject {
  
  /**
    * The ID of the event being modified in this update.
    */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateRequest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The number of times this event occurred in this time period.
    */
  var updateCount: js.UndefOr[String] = js.undefined
}
object SchemaEventUpdateRequest {
  
  @scala.inline
  def apply(): SchemaEventUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventUpdateRequest]
  }
  
  @scala.inline
  implicit class SchemaEventUpdateRequestMutableBuilder[Self <: SchemaEventUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdateCount(value: String): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
