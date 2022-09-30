package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrTaskState extends StObject
/** Available task states. */
@JSImport("listr2", "ListrTaskState")
@js.native
object ListrTaskState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrTaskState & String] = js.native
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ListrTaskState
  /* "COMPLETED" */ val COMPLETED: typings.listr2.mod.ListrTaskState.COMPLETED & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ListrTaskState
  /* "FAILED" */ val FAILED: typings.listr2.mod.ListrTaskState.FAILED & String = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with ListrTaskState
  /* "PENDING" */ val PENDING: typings.listr2.mod.ListrTaskState.PENDING & String = js.native
  
  @js.native
  sealed trait RETRY
    extends StObject
       with ListrTaskState
  /* "RETRY" */ val RETRY: typings.listr2.mod.ListrTaskState.RETRY & String = js.native
  
  @js.native
  sealed trait ROLLED_BACK
    extends StObject
       with ListrTaskState
  /* "ROLLED_BACK" */ val ROLLED_BACK: typings.listr2.mod.ListrTaskState.ROLLED_BACK & String = js.native
  
  @js.native
  sealed trait ROLLING_BACK
    extends StObject
       with ListrTaskState
  /* "ROLLING_BACK" */ val ROLLING_BACK: typings.listr2.mod.ListrTaskState.ROLLING_BACK & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with ListrTaskState
  /* "SKIPPED" */ val SKIPPED: typings.listr2.mod.ListrTaskState.SKIPPED & String = js.native
}
