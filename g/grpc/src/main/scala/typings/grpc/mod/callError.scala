package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait callError extends js.Object
@JSImport("grpc", "callError")
@js.native
object callError extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[callError with Double] = js.native
  
  @js.native
  sealed trait ALREADY_FINISHED extends callError
  /* 6 */ @js.native
  object ALREADY_FINISHED extends TopLevel[ALREADY_FINISHED with Double]
  
  @js.native
  sealed trait ALREADY_INVOKED extends callError
  /* 4 */ @js.native
  object ALREADY_INVOKED extends TopLevel[ALREADY_INVOKED with Double]
  
  @js.native
  sealed trait BATCH_TOO_BIG extends callError
  /* 12 */ @js.native
  object BATCH_TOO_BIG extends TopLevel[BATCH_TOO_BIG with Double]
  
  @js.native
  sealed trait ERROR extends callError
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait INVALID_FLAGS extends callError
  /* 8 */ @js.native
  object INVALID_FLAGS extends TopLevel[INVALID_FLAGS with Double]
  
  @js.native
  sealed trait INVALID_MESSAGE extends callError
  /* 10 */ @js.native
  object INVALID_MESSAGE extends TopLevel[INVALID_MESSAGE with Double]
  
  @js.native
  sealed trait INVALID_METADATA extends callError
  /* 9 */ @js.native
  object INVALID_METADATA extends TopLevel[INVALID_METADATA with Double]
  
  @js.native
  sealed trait NOT_INVOKED extends callError
  /* 5 */ @js.native
  object NOT_INVOKED extends TopLevel[NOT_INVOKED with Double]
  
  @js.native
  sealed trait NOT_ON_CLIENT extends callError
  /* 3 */ @js.native
  object NOT_ON_CLIENT extends TopLevel[NOT_ON_CLIENT with Double]
  
  @js.native
  sealed trait NOT_ON_SERVER extends callError
  /* 2 */ @js.native
  object NOT_ON_SERVER extends TopLevel[NOT_ON_SERVER with Double]
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE extends callError
  /* 11 */ @js.native
  object NOT_SERVER_COMPLETION_QUEUE extends TopLevel[NOT_SERVER_COMPLETION_QUEUE with Double]
  
  @js.native
  sealed trait OK extends callError
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH extends callError
  /* 13 */ @js.native
  object PAYLOAD_TYPE_MISMATCH extends TopLevel[PAYLOAD_TYPE_MISMATCH with Double]
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS extends callError
  /* 7 */ @js.native
  object TOO_MANY_OPERATIONS extends TopLevel[TOO_MANY_OPERATIONS with Double]
}
