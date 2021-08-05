package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatus extends StObject {
  
  /** [Output-only] Final error result of the job. If present, indicates that the job has completed and was unsuccessful. */
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  
  /**
    * [Output-only] The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not
    * necessarily mean that the job has completed or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  
  /** [Output-only] Running state of the job. */
  var state: js.UndefOr[String] = js.undefined
}
object JobStatus {
  
  inline def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  extension [Self <: JobStatus](x: Self) {
    
    inline def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    inline def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
