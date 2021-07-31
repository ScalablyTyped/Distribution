package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait connectivityState extends StObject
@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState & Double] = js.native
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with connectivityState
  /* 1 */ val CONNECTING: typings.grpc.mod.connectivityState.CONNECTING & Double = js.native
  
  @js.native
  sealed trait IDLE
    extends StObject
       with connectivityState
  /* 0 */ val IDLE: typings.grpc.mod.connectivityState.IDLE & Double = js.native
  
  @js.native
  sealed trait READY
    extends StObject
       with connectivityState
  /* 2 */ val READY: typings.grpc.mod.connectivityState.READY & Double = js.native
  
  @js.native
  sealed trait SHUTDOWN
    extends StObject
       with connectivityState
  /* 4 */ val SHUTDOWN: typings.grpc.mod.connectivityState.SHUTDOWN & Double = js.native
  
  @js.native
  sealed trait TRANSIENT_FAILURE
    extends StObject
       with connectivityState
  /* 3 */ val TRANSIENT_FAILURE: typings.grpc.mod.connectivityState.TRANSIENT_FAILURE & Double = js.native
}
