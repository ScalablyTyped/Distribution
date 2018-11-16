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
  
  val ALREADY_FINISHED: ALREADY_FINISHED with java.lang.String = js.native
  val ALREADY_INVOKED: ALREADY_INVOKED with java.lang.String = js.native
  val BATCH_TOO_BIG: BATCH_TOO_BIG with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val INVALID_FLAGS: INVALID_FLAGS with java.lang.String = js.native
  val INVALID_MESSAGE: INVALID_MESSAGE with java.lang.String = js.native
  val INVALID_METADATA: INVALID_METADATA with java.lang.String = js.native
  val NOT_INVOKED: NOT_INVOKED with java.lang.String = js.native
  val NOT_ON_CLIENT: NOT_ON_CLIENT with java.lang.String = js.native
  val NOT_ON_SERVER: NOT_ON_SERVER with java.lang.String = js.native
  val NOT_SERVER_COMPLETION_QUEUE: NOT_SERVER_COMPLETION_QUEUE with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val PAYLOAD_TYPE_MISMATCH: PAYLOAD_TYPE_MISMATCH with java.lang.String = js.native
  val TOO_MANY_OPERATIONS: TOO_MANY_OPERATIONS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[grpcLib.grpcMod.callError with java.lang.String] = js.native
}

