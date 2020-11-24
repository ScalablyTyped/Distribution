package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait connectivityState extends js.Object
@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState with Double] = js.native
  
  @js.native
  sealed trait CONNECTING extends connectivityState
  /* 1 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  @js.native
  sealed trait IDLE extends connectivityState
  /* 0 */ @js.native
  object IDLE extends TopLevel[IDLE with Double]
  
  @js.native
  sealed trait READY extends connectivityState
  /* 2 */ @js.native
  object READY extends TopLevel[READY with Double]
  
  @js.native
  sealed trait SHUTDOWN extends connectivityState
  /* 4 */ @js.native
  object SHUTDOWN extends TopLevel[SHUTDOWN with Double]
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends connectivityState
  /* 3 */ @js.native
  object TRANSIENT_FAILURE extends TopLevel[TRANSIENT_FAILURE with Double]
}
