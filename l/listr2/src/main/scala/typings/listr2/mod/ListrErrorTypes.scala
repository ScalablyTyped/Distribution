package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrErrorTypes extends StObject
/**
  * The actual error type that is collected and to help identify where the error is triggered from.
  */
@JSImport("listr2", "ListrErrorTypes")
@js.native
object ListrErrorTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrErrorTypes & String] = js.native
  
  /** Task has failed. */
  @js.native
  sealed trait HAS_FAILED
    extends StObject
       with ListrErrorTypes
  /* "HAS_FAILED" */ val HAS_FAILED: typings.listr2.mod.ListrErrorTypes.HAS_FAILED & String = js.native
  
  /** Task has failed, ran the rollback action but the rollback action itself has failed. */
  @js.native
  sealed trait HAS_FAILED_TO_ROLLBACK
    extends StObject
       with ListrErrorTypes
  /* "HAS_FAILED_TO_ROLLBACK" */ val HAS_FAILED_TO_ROLLBACK: typings.listr2.mod.ListrErrorTypes.HAS_FAILED_TO_ROLLBACK & String = js.native
  
  /** Task has failed, but exitOnError is set to false, so will ignore this error. */
  @js.native
  sealed trait HAS_FAILED_WITHOUT_ERROR
    extends StObject
       with ListrErrorTypes
  /* "HAS_FAILED_WITHOUT_ERROR" */ val HAS_FAILED_WITHOUT_ERROR: typings.listr2.mod.ListrErrorTypes.HAS_FAILED_WITHOUT_ERROR & String = js.native
  
  /** Task has failed and will try to retry. */
  @js.native
  sealed trait WILL_RETRY
    extends StObject
       with ListrErrorTypes
  /* "WILL_RETRY" */ val WILL_RETRY: typings.listr2.mod.ListrErrorTypes.WILL_RETRY & String = js.native
  
  /** Task has failed and will try to rollback. */
  @js.native
  sealed trait WILL_ROLLBACK
    extends StObject
       with ListrErrorTypes
  /* "WILL_ROLLBACK" */ val WILL_ROLLBACK: typings.listr2.mod.ListrErrorTypes.WILL_ROLLBACK & String = js.native
}
