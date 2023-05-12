package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Task can provide additional information depending on the current state of the Task.
  *
  * TaskMessage is used to propagate these messages to the renderers for displaying them to the end-user.
  */
trait ListrTaskMessage extends StObject {
  
  /** Elapsed time of the current task, whenever the Task completes. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** Error message from the current task, whenever the Task fails. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Holds the time as epoch time of when will this task continue to execute. */
  var paused: js.UndefOr[Double] = js.undefined
  
  /** Retry message from the current task, whenever the Task tries to retry. */
  var retry: js.UndefOr[ListrTaskRetry] = js.undefined
  
  /** Rollback message from the current task, whenever the Task finishes rollback. */
  var rollback: js.UndefOr[String] = js.undefined
  
  /** Skip message from the current task, whenever the Task skips. */
  var skip: js.UndefOr[String] = js.undefined
}
object ListrTaskMessage {
  
  inline def apply(): ListrTaskMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrTaskMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrTaskMessage] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPaused(value: Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setRetry(value: ListrTaskRetry): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRollback(value: String): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    
    inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
