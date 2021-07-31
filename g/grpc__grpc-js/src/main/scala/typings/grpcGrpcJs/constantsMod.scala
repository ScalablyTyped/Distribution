package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: Double): js.UndefOr[LogVerbosity & Double] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogVerbosity
    /* 0 */ val DEBUG: typings.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogVerbosity
    /* 2 */ val ERROR: typings.grpcGrpcJs.constantsMod.LogVerbosity.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogVerbosity
    /* 1 */ val INFO: typings.grpcGrpcJs.constantsMod.LogVerbosity.INFO & Double = js.native
  }
  
  @js.native
  sealed trait Propagate extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Propagate")
  @js.native
  object Propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate & Double] = js.native
    
    @js.native
    sealed trait CANCELLATION
      extends StObject
         with Propagate
    /* 8 */ val CANCELLATION: typings.grpcGrpcJs.constantsMod.Propagate.CANCELLATION & Double = js.native
    
    @js.native
    sealed trait CENSUS_STATS_CONTEXT
      extends StObject
         with Propagate
    /* 2 */ val CENSUS_STATS_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_STATS_CONTEXT & Double = js.native
    
    @js.native
    sealed trait CENSUS_TRACING_CONTEXT
      extends StObject
         with Propagate
    /* 4 */ val CENSUS_TRACING_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_TRACING_CONTEXT & Double = js.native
    
    @js.native
    sealed trait DEADLINE
      extends StObject
         with Propagate
    /* 1 */ val DEADLINE: typings.grpcGrpcJs.constantsMod.Propagate.DEADLINE & Double = js.native
    
    @js.native
    sealed trait DEFAULTS
      extends StObject
         with Propagate
    /* 65536 */ val DEFAULTS: typings.grpcGrpcJs.constantsMod.Propagate.DEFAULTS & Double = js.native
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ABORTED
      extends StObject
         with Status
    /* 10 */ val ABORTED: typings.grpcGrpcJs.constantsMod.Status.ABORTED & Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS
      extends StObject
         with Status
    /* 6 */ val ALREADY_EXISTS: typings.grpcGrpcJs.constantsMod.Status.ALREADY_EXISTS & Double = js.native
    
    @js.native
    sealed trait CANCELLED
      extends StObject
         with Status
    /* 1 */ val CANCELLED: typings.grpcGrpcJs.constantsMod.Status.CANCELLED & Double = js.native
    
    @js.native
    sealed trait DATA_LOSS
      extends StObject
         with Status
    /* 15 */ val DATA_LOSS: typings.grpcGrpcJs.constantsMod.Status.DATA_LOSS & Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED
      extends StObject
         with Status
    /* 4 */ val DEADLINE_EXCEEDED: typings.grpcGrpcJs.constantsMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION
      extends StObject
         with Status
    /* 9 */ val FAILED_PRECONDITION: typings.grpcGrpcJs.constantsMod.Status.FAILED_PRECONDITION & Double = js.native
    
    @js.native
    sealed trait INTERNAL
      extends StObject
         with Status
    /* 13 */ val INTERNAL: typings.grpcGrpcJs.constantsMod.Status.INTERNAL & Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with Status
    /* 3 */ val INVALID_ARGUMENT: typings.grpcGrpcJs.constantsMod.Status.INVALID_ARGUMENT & Double = js.native
    
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with Status
    /* 5 */ val NOT_FOUND: typings.grpcGrpcJs.constantsMod.Status.NOT_FOUND & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 0 */ val OK: typings.grpcGrpcJs.constantsMod.Status.OK & Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with Status
    /* 11 */ val OUT_OF_RANGE: typings.grpcGrpcJs.constantsMod.Status.OUT_OF_RANGE & Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with Status
    /* 7 */ val PERMISSION_DENIED: typings.grpcGrpcJs.constantsMod.Status.PERMISSION_DENIED & Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED
      extends StObject
         with Status
    /* 8 */ val RESOURCE_EXHAUSTED: typings.grpcGrpcJs.constantsMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED
      extends StObject
         with Status
    /* 16 */ val UNAUTHENTICATED: typings.grpcGrpcJs.constantsMod.Status.UNAUTHENTICATED & Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with Status
    /* 14 */ val UNAVAILABLE: typings.grpcGrpcJs.constantsMod.Status.UNAVAILABLE & Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED
      extends StObject
         with Status
    /* 12 */ val UNIMPLEMENTED: typings.grpcGrpcJs.constantsMod.Status.UNIMPLEMENTED & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Status
    /* 2 */ val UNKNOWN: typings.grpcGrpcJs.constantsMod.Status.UNKNOWN & Double = js.native
  }
}
