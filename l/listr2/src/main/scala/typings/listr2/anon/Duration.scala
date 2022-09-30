package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /** Run time of the task, if it has been successfully resolved. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** Error message of the task, if it has been failed. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Retry messages */
  var retry: js.UndefOr[Count] = js.undefined
  
  /** Rollback message of the task, if the rollback finishes */
  var rollback: js.UndefOr[String] = js.undefined
  
  /** Skip message of the task, if it has been skipped. */
  var skip: js.UndefOr[String] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRetry(value: Count): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRollback(value: String): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    
    inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
