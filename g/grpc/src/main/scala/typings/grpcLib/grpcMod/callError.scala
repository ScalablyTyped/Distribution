package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait callError extends js.Object

@JSImport("grpc", "callError")
@js.native
object callError extends js.Object {
  @js.native
  sealed trait ALREADY_FINISHED
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait ALREADY_INVOKED
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait BATCH_TOO_BIG
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait ERROR
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait INVALID_FLAGS
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait INVALID_MESSAGE
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait INVALID_METADATA
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait NOT_INVOKED
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait NOT_ON_CLIENT
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait NOT_ON_SERVER
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait OK
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH
    extends grpcLib.grpcMod.callError
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS
    extends grpcLib.grpcMod.callError
  
  /* 6 */ val ALREADY_FINISHED: ALREADY_FINISHED with scala.Double = js.native
  /* 4 */ val ALREADY_INVOKED: ALREADY_INVOKED with scala.Double = js.native
  /* 12 */ val BATCH_TOO_BIG: BATCH_TOO_BIG with scala.Double = js.native
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 8 */ val INVALID_FLAGS: INVALID_FLAGS with scala.Double = js.native
  /* 10 */ val INVALID_MESSAGE: INVALID_MESSAGE with scala.Double = js.native
  /* 9 */ val INVALID_METADATA: INVALID_METADATA with scala.Double = js.native
  /* 5 */ val NOT_INVOKED: NOT_INVOKED with scala.Double = js.native
  /* 3 */ val NOT_ON_CLIENT: NOT_ON_CLIENT with scala.Double = js.native
  /* 2 */ val NOT_ON_SERVER: NOT_ON_SERVER with scala.Double = js.native
  /* 11 */ val NOT_SERVER_COMPLETION_QUEUE: NOT_SERVER_COMPLETION_QUEUE with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 13 */ val PAYLOAD_TYPE_MISMATCH: PAYLOAD_TYPE_MISMATCH with scala.Double = js.native
  /* 7 */ val TOO_MANY_OPERATIONS: TOO_MANY_OPERATIONS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.callError with scala.Double] = js.native
}

