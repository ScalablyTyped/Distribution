package typings.grpc.grpcMod

import org.scalablytyped.runtime.TopLevel
import typings.grpc.grpcMod.callError.ALREADY_FINISHED
import typings.grpc.grpcMod.callError.ALREADY_INVOKED
import typings.grpc.grpcMod.callError.BATCH_TOO_BIG
import typings.grpc.grpcMod.callError.ERROR
import typings.grpc.grpcMod.callError.INVALID_FLAGS
import typings.grpc.grpcMod.callError.INVALID_MESSAGE
import typings.grpc.grpcMod.callError.INVALID_METADATA
import typings.grpc.grpcMod.callError.NOT_INVOKED
import typings.grpc.grpcMod.callError.NOT_ON_CLIENT
import typings.grpc.grpcMod.callError.NOT_ON_SERVER
import typings.grpc.grpcMod.callError.NOT_SERVER_COMPLETION_QUEUE
import typings.grpc.grpcMod.callError.OK
import typings.grpc.grpcMod.callError.PAYLOAD_TYPE_MISMATCH
import typings.grpc.grpcMod.callError.TOO_MANY_OPERATIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait callError extends js.Object

@JSImport("grpc", "callError")
@js.native
object callError extends js.Object {
  @js.native
  sealed trait ALREADY_FINISHED extends callError
  
  @js.native
  sealed trait ALREADY_INVOKED extends callError
  
  @js.native
  sealed trait BATCH_TOO_BIG extends callError
  
  @js.native
  sealed trait ERROR extends callError
  
  @js.native
  sealed trait INVALID_FLAGS extends callError
  
  @js.native
  sealed trait INVALID_MESSAGE extends callError
  
  @js.native
  sealed trait INVALID_METADATA extends callError
  
  @js.native
  sealed trait NOT_INVOKED extends callError
  
  @js.native
  sealed trait NOT_ON_CLIENT extends callError
  
  @js.native
  sealed trait NOT_ON_SERVER extends callError
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE extends callError
  
  @js.native
  sealed trait OK extends callError
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH extends callError
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS extends callError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[callError with Double] = js.native
  /* 6 */ @js.native
  object ALREADY_FINISHED extends TopLevel[ALREADY_FINISHED with Double]
  
  /* 4 */ @js.native
  object ALREADY_INVOKED extends TopLevel[ALREADY_INVOKED with Double]
  
  /* 12 */ @js.native
  object BATCH_TOO_BIG extends TopLevel[BATCH_TOO_BIG with Double]
  
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 8 */ @js.native
  object INVALID_FLAGS extends TopLevel[INVALID_FLAGS with Double]
  
  /* 10 */ @js.native
  object INVALID_MESSAGE extends TopLevel[INVALID_MESSAGE with Double]
  
  /* 9 */ @js.native
  object INVALID_METADATA extends TopLevel[INVALID_METADATA with Double]
  
  /* 5 */ @js.native
  object NOT_INVOKED extends TopLevel[NOT_INVOKED with Double]
  
  /* 3 */ @js.native
  object NOT_ON_CLIENT extends TopLevel[NOT_ON_CLIENT with Double]
  
  /* 2 */ @js.native
  object NOT_ON_SERVER extends TopLevel[NOT_ON_SERVER with Double]
  
  /* 11 */ @js.native
  object NOT_SERVER_COMPLETION_QUEUE extends TopLevel[NOT_SERVER_COMPLETION_QUEUE with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 13 */ @js.native
  object PAYLOAD_TYPE_MISMATCH extends TopLevel[PAYLOAD_TYPE_MISMATCH with Double]
  
  /* 7 */ @js.native
  object TOO_MANY_OPERATIONS extends TopLevel[TOO_MANY_OPERATIONS with Double]
  
}

