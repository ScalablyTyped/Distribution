package typings.grpc.grpcMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait connectivityState extends js.Object

@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends js.Object {
  @js.native
  sealed trait CONNECTING extends connectivityState
  
  @js.native
  sealed trait IDLE extends connectivityState
  
  @js.native
  sealed trait READY extends connectivityState
  
  @js.native
  sealed trait SHUTDOWN extends connectivityState
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends connectivityState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState with Double] = js.native
  /* 1 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  /* 0 */ @js.native
  object IDLE extends TopLevel[IDLE with Double]
  
  /* 2 */ @js.native
  object READY extends TopLevel[READY with Double]
  
  /* 4 */ @js.native
  object SHUTDOWN extends TopLevel[SHUTDOWN with Double]
  
  /* 3 */ @js.native
  object TRANSIENT_FAILURE extends TopLevel[TRANSIENT_FAILURE with Double]
  
}

