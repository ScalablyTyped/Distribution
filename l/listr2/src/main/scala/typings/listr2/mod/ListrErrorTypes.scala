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
  
  /** Task has failed. */
  @js.native
  sealed trait HAS_FAILED
    extends StObject
       with ListrErrorTypes
  
  /** Task has failed, ran the rollback action but the rollback action itself has failed. */
  @js.native
  sealed trait HAS_FAILED_TO_ROLLBACK
    extends StObject
       with ListrErrorTypes
  
  /** Task has failed, but exitOnError is set to false, so will ignore this error. */
  @js.native
  sealed trait HAS_FAILED_WITHOUT_ERROR
    extends StObject
       with ListrErrorTypes
  
  /** Task has failed and will try to retry. */
  @js.native
  sealed trait WILL_RETRY
    extends StObject
       with ListrErrorTypes
  
  /** Task has failed and will try to rollback. */
  @js.native
  sealed trait WILL_ROLLBACK
    extends StObject
       with ListrErrorTypes
}
