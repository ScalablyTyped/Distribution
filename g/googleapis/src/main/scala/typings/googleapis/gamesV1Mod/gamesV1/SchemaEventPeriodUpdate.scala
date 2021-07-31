package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event period update resource.
  */
trait SchemaEventPeriodUpdate extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodUpdate.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time period being covered by this update.
    */
  var timePeriod: js.UndefOr[SchemaEventPeriodRange] = js.undefined
  
  /**
    * The updates being made for this time period.
    */
  var updates: js.UndefOr[js.Array[SchemaEventUpdateRequest]] = js.undefined
}
object SchemaEventPeriodUpdate {
  
  @scala.inline
  def apply(): SchemaEventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventPeriodUpdate]
  }
  
  @scala.inline
  implicit class SchemaEventPeriodUpdateMutableBuilder[Self <: SchemaEventPeriodUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: SchemaEventPeriodRange): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaEventUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: SchemaEventUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
