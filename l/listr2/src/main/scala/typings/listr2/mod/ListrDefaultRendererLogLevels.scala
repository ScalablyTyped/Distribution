package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrDefaultRendererLogLevels extends StObject
@JSImport("listr2", "ListrDefaultRendererLogLevels")
@js.native
object ListrDefaultRendererLogLevels extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrDefaultRendererLogLevels & String] = js.native
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "COMPLETED" */ val COMPLETED: typings.listr2.mod.ListrDefaultRendererLogLevels.COMPLETED & String = js.native
  
  @js.native
  sealed trait COMPLETED_WITH_FAILED_SISTER_TASKS
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "COMPLETED_WITH_SISTER_TASKS_FAILED" */ val COMPLETED_WITH_FAILED_SISTER_TASKS: typings.listr2.mod.ListrDefaultRendererLogLevels.COMPLETED_WITH_FAILED_SISTER_TASKS & String = js.native
  
  @js.native
  sealed trait COMPLETED_WITH_FAILED_SUBTASKS
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "COMPLETED_WITH_FAILED_SUBTASKS" */ val COMPLETED_WITH_FAILED_SUBTASKS: typings.listr2.mod.ListrDefaultRendererLogLevels.COMPLETED_WITH_FAILED_SUBTASKS & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "FAILED" */ val FAILED: typings.listr2.mod.ListrDefaultRendererLogLevels.FAILED & String = js.native
  
  @js.native
  sealed trait FAILED_WITH_FAILED_SUBTASKS
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "FAILED_WITH_SUBTASKS" */ val FAILED_WITH_FAILED_SUBTASKS: typings.listr2.mod.ListrDefaultRendererLogLevels.FAILED_WITH_FAILED_SUBTASKS & String = js.native
  
  @js.native
  sealed trait OUTPUT
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "OUTPUT" */ val OUTPUT: typings.listr2.mod.ListrDefaultRendererLogLevels.OUTPUT & String = js.native
  
  @js.native
  sealed trait OUTPUT_WITH_BOTTOMBAR
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "OUTPUT_WITH_BOTTOMBAR" */ val OUTPUT_WITH_BOTTOMBAR: typings.listr2.mod.ListrDefaultRendererLogLevels.OUTPUT_WITH_BOTTOMBAR & String = js.native
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "PAUSED" */ val PAUSED: typings.listr2.mod.ListrDefaultRendererLogLevels.PAUSED & String = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "PENDING" */ val PENDING: typings.listr2.mod.ListrDefaultRendererLogLevels.PENDING & String = js.native
  
  @js.native
  sealed trait RETRY
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "RETRY" */ val RETRY: typings.listr2.mod.ListrDefaultRendererLogLevels.RETRY & String = js.native
  
  @js.native
  sealed trait ROLLED_BACK
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "ROLLED_BACK" */ val ROLLED_BACK: typings.listr2.mod.ListrDefaultRendererLogLevels.ROLLED_BACK & String = js.native
  
  @js.native
  sealed trait ROLLING_BACK
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "ROLLING_BACK" */ val ROLLING_BACK: typings.listr2.mod.ListrDefaultRendererLogLevels.ROLLING_BACK & String = js.native
  
  @js.native
  sealed trait SKIPPED_WITHOUT_COLLAPSE
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "SKIPPED_WITHOUT_COLLAPSE" */ val SKIPPED_WITHOUT_COLLAPSE: typings.listr2.mod.ListrDefaultRendererLogLevels.SKIPPED_WITHOUT_COLLAPSE & String = js.native
  
  @js.native
  sealed trait SKIPPED_WITH_COLLAPSE
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "SKIPPED_WITH_COLLAPSE" */ val SKIPPED_WITH_COLLAPSE: typings.listr2.mod.ListrDefaultRendererLogLevels.SKIPPED_WITH_COLLAPSE & String = js.native
  
  @js.native
  sealed trait WAITING
    extends StObject
       with ListrDefaultRendererLogLevels
  /* "WAITING" */ val WAITING: typings.listr2.mod.ListrDefaultRendererLogLevels.WAITING & String = js.native
}
