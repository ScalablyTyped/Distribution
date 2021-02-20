package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@grpc/grpc-js/build/src/constants", "DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH")
  @js.native
  val DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH: Double = js.native
  
  @JSImport("@grpc/grpc-js/build/src/constants", "DEFAULT_MAX_SEND_MESSAGE_LENGTH")
  @js.native
  val DEFAULT_MAX_SEND_MESSAGE_LENGTH: /* -1 */ Double = js.native
  
  @js.native
  sealed trait LogVerbosity extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "LogVerbosity")
  @js.native
  object LogVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
    
    @js.native
    sealed trait DEBUG extends LogVerbosity
    /* 0 */ val DEBUG: typings.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG with Double = js.native
    
    @js.native
    sealed trait ERROR extends LogVerbosity
    /* 2 */ val ERROR: typings.grpcGrpcJs.constantsMod.LogVerbosity.ERROR with Double = js.native
    
    @js.native
    sealed trait INFO extends LogVerbosity
    /* 1 */ val INFO: typings.grpcGrpcJs.constantsMod.LogVerbosity.INFO with Double = js.native
  }
  
  @js.native
  sealed trait Propagate extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Propagate")
  @js.native
  object Propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate with Double] = js.native
    
    @js.native
    sealed trait CANCELLATION extends Propagate
    /* 8 */ val CANCELLATION: typings.grpcGrpcJs.constantsMod.Propagate.CANCELLATION with Double = js.native
    
    @js.native
    sealed trait CENSUS_STATS_CONTEXT extends Propagate
    /* 2 */ val CENSUS_STATS_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_STATS_CONTEXT with Double = js.native
    
    @js.native
    sealed trait CENSUS_TRACING_CONTEXT extends Propagate
    /* 4 */ val CENSUS_TRACING_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_TRACING_CONTEXT with Double = js.native
    
    @js.native
    sealed trait DEADLINE extends Propagate
    /* 1 */ val DEADLINE: typings.grpcGrpcJs.constantsMod.Propagate.DEADLINE with Double = js.native
    
    @js.native
    sealed trait DEFAULTS extends Propagate
    /* 65536 */ val DEFAULTS: typings.grpcGrpcJs.constantsMod.Propagate.DEFAULTS with Double = js.native
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ABORTED extends Status
    /* 10 */ val ABORTED: typings.grpcGrpcJs.constantsMod.Status.ABORTED with Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS extends Status
    /* 6 */ val ALREADY_EXISTS: typings.grpcGrpcJs.constantsMod.Status.ALREADY_EXISTS with Double = js.native
    
    @js.native
    sealed trait CANCELLED extends Status
    /* 1 */ val CANCELLED: typings.grpcGrpcJs.constantsMod.Status.CANCELLED with Double = js.native
    
    @js.native
    sealed trait DATA_LOSS extends Status
    /* 15 */ val DATA_LOSS: typings.grpcGrpcJs.constantsMod.Status.DATA_LOSS with Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED extends Status
    /* 4 */ val DEADLINE_EXCEEDED: typings.grpcGrpcJs.constantsMod.Status.DEADLINE_EXCEEDED with Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION extends Status
    /* 9 */ val FAILED_PRECONDITION: typings.grpcGrpcJs.constantsMod.Status.FAILED_PRECONDITION with Double = js.native
    
    @js.native
    sealed trait INTERNAL extends Status
    /* 13 */ val INTERNAL: typings.grpcGrpcJs.constantsMod.Status.INTERNAL with Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT extends Status
    /* 3 */ val INVALID_ARGUMENT: typings.grpcGrpcJs.constantsMod.Status.INVALID_ARGUMENT with Double = js.native
    
    @js.native
    sealed trait NOT_FOUND extends Status
    /* 5 */ val NOT_FOUND: typings.grpcGrpcJs.constantsMod.Status.NOT_FOUND with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 0 */ val OK: typings.grpcGrpcJs.constantsMod.Status.OK with Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE extends Status
    /* 11 */ val OUT_OF_RANGE: typings.grpcGrpcJs.constantsMod.Status.OUT_OF_RANGE with Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED extends Status
    /* 7 */ val PERMISSION_DENIED: typings.grpcGrpcJs.constantsMod.Status.PERMISSION_DENIED with Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED extends Status
    /* 8 */ val RESOURCE_EXHAUSTED: typings.grpcGrpcJs.constantsMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED extends Status
    /* 16 */ val UNAUTHENTICATED: typings.grpcGrpcJs.constantsMod.Status.UNAUTHENTICATED with Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE extends Status
    /* 14 */ val UNAVAILABLE: typings.grpcGrpcJs.constantsMod.Status.UNAVAILABLE with Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED extends Status
    /* 12 */ val UNIMPLEMENTED: typings.grpcGrpcJs.constantsMod.Status.UNIMPLEMENTED with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends Status
    /* 2 */ val UNKNOWN: typings.grpcGrpcJs.constantsMod.Status.UNKNOWN with Double = js.native
  }
}
