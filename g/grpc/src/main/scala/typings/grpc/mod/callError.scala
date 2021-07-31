package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait callError extends StObject
@JSImport("grpc", "callError")
@js.native
object callError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[callError & Double] = js.native
  
  @js.native
  sealed trait ALREADY_FINISHED
    extends StObject
       with callError
  /* 6 */ val ALREADY_FINISHED: typings.grpc.mod.callError.ALREADY_FINISHED & Double = js.native
  
  @js.native
  sealed trait ALREADY_INVOKED
    extends StObject
       with callError
  /* 4 */ val ALREADY_INVOKED: typings.grpc.mod.callError.ALREADY_INVOKED & Double = js.native
  
  @js.native
  sealed trait BATCH_TOO_BIG
    extends StObject
       with callError
  /* 12 */ val BATCH_TOO_BIG: typings.grpc.mod.callError.BATCH_TOO_BIG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with callError
  /* 1 */ val ERROR: typings.grpc.mod.callError.ERROR & Double = js.native
  
  @js.native
  sealed trait INVALID_FLAGS
    extends StObject
       with callError
  /* 8 */ val INVALID_FLAGS: typings.grpc.mod.callError.INVALID_FLAGS & Double = js.native
  
  @js.native
  sealed trait INVALID_MESSAGE
    extends StObject
       with callError
  /* 10 */ val INVALID_MESSAGE: typings.grpc.mod.callError.INVALID_MESSAGE & Double = js.native
  
  @js.native
  sealed trait INVALID_METADATA
    extends StObject
       with callError
  /* 9 */ val INVALID_METADATA: typings.grpc.mod.callError.INVALID_METADATA & Double = js.native
  
  @js.native
  sealed trait NOT_INVOKED
    extends StObject
       with callError
  /* 5 */ val NOT_INVOKED: typings.grpc.mod.callError.NOT_INVOKED & Double = js.native
  
  @js.native
  sealed trait NOT_ON_CLIENT
    extends StObject
       with callError
  /* 3 */ val NOT_ON_CLIENT: typings.grpc.mod.callError.NOT_ON_CLIENT & Double = js.native
  
  @js.native
  sealed trait NOT_ON_SERVER
    extends StObject
       with callError
  /* 2 */ val NOT_ON_SERVER: typings.grpc.mod.callError.NOT_ON_SERVER & Double = js.native
  
  @js.native
  sealed trait NOT_SERVER_COMPLETION_QUEUE
    extends StObject
       with callError
  /* 11 */ val NOT_SERVER_COMPLETION_QUEUE: typings.grpc.mod.callError.NOT_SERVER_COMPLETION_QUEUE & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with callError
  /* 0 */ val OK: typings.grpc.mod.callError.OK & Double = js.native
  
  @js.native
  sealed trait PAYLOAD_TYPE_MISMATCH
    extends StObject
       with callError
  /* 13 */ val PAYLOAD_TYPE_MISMATCH: typings.grpc.mod.callError.PAYLOAD_TYPE_MISMATCH & Double = js.native
  
  @js.native
  sealed trait TOO_MANY_OPERATIONS
    extends StObject
       with callError
  /* 7 */ val TOO_MANY_OPERATIONS: typings.grpc.mod.callError.TOO_MANY_OPERATIONS & Double = js.native
}
