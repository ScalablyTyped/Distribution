package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkerEvents extends StObject
@JSImport("jest-worker", "WorkerEvents")
@js.native
object WorkerEvents extends StObject {
  
  @js.native
  sealed trait STATE_CHANGE
    extends StObject
       with WorkerEvents
}
