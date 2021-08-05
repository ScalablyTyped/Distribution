package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the batch operations such as the current state.  This is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
trait SchemaBatchOperationMetadata extends StObject {
  
  /**
    * The time when the batch request is finished and
    * google.longrunning.Operation.done is set to true.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the batch request was submitted to the server.
    */
  var submitTime: js.UndefOr[String] = js.undefined
}
object SchemaBatchOperationMetadata {
  
  inline def apply(): SchemaBatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchOperationMetadata]
  }
  
  extension [Self <: SchemaBatchOperationMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
