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
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait PENDING
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait RETRY
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait ROLLED_BACK
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait ROLLING_BACK
    extends StObject
       with ListrTaskState
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with ListrTaskState
}
