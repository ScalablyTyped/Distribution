package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkerStates extends StObject
@JSImport("jest-worker", "WorkerStates")
@js.native
object WorkerStates extends StObject {
  
  @js.native
  sealed trait OK
    extends StObject
       with WorkerStates
  
  @js.native
  sealed trait OUT_OF_MEMORY
    extends StObject
       with WorkerStates
  
  @js.native
  sealed trait RESTARTING
    extends StObject
       with WorkerStates
  
  @js.native
  sealed trait SHUTTING_DOWN
    extends StObject
       with WorkerStates
  
  @js.native
  sealed trait SHUT_DOWN
    extends StObject
       with WorkerStates
  
  @js.native
  sealed trait STARTING
    extends StObject
       with WorkerStates
}
