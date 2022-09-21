package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackfillJob extends StObject {
  
  /**
    * Output only. Errors which caused the backfill job to fail.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
  
  /**
    * Output only. Backfill job's end time.
    */
  var lastEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Backfill job's start time.
    */
  var lastStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Backfill job state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Backfill job's triggering reason.
    */
  var trigger: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackfillJob {
  
  inline def apply(): SchemaBackfillJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackfillJob]
  }
  
  extension [Self <: SchemaBackfillJob](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setLastEndTime(value: String): Self = StObject.set(x, "lastEndTime", value.asInstanceOf[js.Any])
    
    inline def setLastEndTimeNull: Self = StObject.set(x, "lastEndTime", null)
    
    inline def setLastEndTimeUndefined: Self = StObject.set(x, "lastEndTime", js.undefined)
    
    inline def setLastStartTime(value: String): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeNull: Self = StObject.set(x, "lastStartTime", null)
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
