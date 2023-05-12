package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrTaskState extends StObject
/**
  * Tasks can be in various states during the execution.
  *
  * Whenever a state change occurs, the task will emit a {@link module:listr2.ListrTaskEventType.STATE} with the appropriate state.
  */
@JSImport("listr2", "ListrTaskState")
@js.native
object ListrTaskState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrTaskState & String] = js.native
  
  /** Task has been completed. */
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ListrTaskState
  /* "COMPLETED" */ val COMPLETED: typings.listr2.mod.ListrTaskState.COMPLETED & String = js.native
  
  /** Task has failed. */
  @js.native
  sealed trait FAILED
    extends StObject
       with ListrTaskState
  /* "FAILED" */ val FAILED: typings.listr2.mod.ListrTaskState.FAILED & String = js.native
  
  /** Task is currently paused. */
  @js.native
  sealed trait PAUSED
    extends StObject
       with ListrTaskState
  /* "PAUSED" */ val PAUSED: typings.listr2.mod.ListrTaskState.PAUSED & String = js.native
  
  /** Task is currently trying to process a prompt. */
  @js.native
  sealed trait PROMPT
    extends StObject
       with ListrTaskState
  /* "PROMPT" */ val PROMPT: typings.listr2.mod.ListrTaskState.PROMPT & String = js.native
  
  /** Task has successfully processed the prompt. */
  @js.native
  sealed trait PROMPT_COMPLETED
    extends StObject
       with ListrTaskState
  /* "PROMPT_COMPLETED" */ val PROMPT_COMPLETED: typings.listr2.mod.ListrTaskState.PROMPT_COMPLETED & String = js.native
  
  /** Task is currently retrying. */
  @js.native
  sealed trait RETRY
    extends StObject
       with ListrTaskState
  /* "RETRY" */ val RETRY: typings.listr2.mod.ListrTaskState.RETRY & String = js.native
  
  /** Task has rolledback successfully after failing. */
  @js.native
  sealed trait ROLLED_BACK
    extends StObject
       with ListrTaskState
  /* "ROLLED_BACK" */ val ROLLED_BACK: typings.listr2.mod.ListrTaskState.ROLLED_BACK & String = js.native
  
  /** Task is currently trying to rollback. */
  @js.native
  sealed trait ROLLING_BACK
    extends StObject
       with ListrTaskState
  /* "ROLLING_BACK" */ val ROLLING_BACK: typings.listr2.mod.ListrTaskState.ROLLING_BACK & String = js.native
  
  /** Task has been skipped. */
  @js.native
  sealed trait SKIPPED
    extends StObject
       with ListrTaskState
  /* "SKIPPED" */ val SKIPPED: typings.listr2.mod.ListrTaskState.SKIPPED & String = js.native
  
  /** Task has started. */
  @js.native
  sealed trait STARTED
    extends StObject
       with ListrTaskState
  /* "STARTED" */ val STARTED: typings.listr2.mod.ListrTaskState.STARTED & String = js.native
  
  /** Task has not started yet, waiting for pick-up. */
  @js.native
  sealed trait WAITING
    extends StObject
       with ListrTaskState
  /* "WAITING" */ val WAITING: typings.listr2.mod.ListrTaskState.WAITING & String = js.native
}
