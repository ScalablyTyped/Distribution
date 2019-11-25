package typings.atGrpcGrpcDashJs.buildSrcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("@grpc/grpc-js/build/src/constants", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ABORTED extends Status
  
  @js.native
  sealed trait ALREADY_EXISTS extends Status
  
  @js.native
  sealed trait CANCELLED extends Status
  
  @js.native
  sealed trait DATA_LOSS extends Status
  
  @js.native
  sealed trait DEADLINE_EXCEEDED extends Status
  
  @js.native
  sealed trait FAILED_PRECONDITION extends Status
  
  @js.native
  sealed trait INTERNAL extends Status
  
  @js.native
  sealed trait INVALID_ARGUMENT extends Status
  
  @js.native
  sealed trait NOT_FOUND extends Status
  
  @js.native
  sealed trait OK extends Status
  
  @js.native
  sealed trait OUT_OF_RANGE extends Status
  
  @js.native
  sealed trait PERMISSION_DENIED extends Status
  
  @js.native
  sealed trait RESOURCE_EXHAUSTED extends Status
  
  @js.native
  sealed trait UNAUTHENTICATED extends Status
  
  @js.native
  sealed trait UNAVAILABLE extends Status
  
  @js.native
  sealed trait UNIMPLEMENTED extends Status
  
  @js.native
  sealed trait UNKNOWN extends Status
  
  /* 10 */ val ABORTED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.ABORTED with Double = js.native
  /* 6 */ val ALREADY_EXISTS: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.ALREADY_EXISTS with Double = js.native
  /* 1 */ val CANCELLED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.CANCELLED with Double = js.native
  /* 15 */ val DATA_LOSS: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.DATA_LOSS with Double = js.native
  /* 4 */ val DEADLINE_EXCEEDED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.DEADLINE_EXCEEDED with Double = js.native
  /* 9 */ val FAILED_PRECONDITION: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.FAILED_PRECONDITION with Double = js.native
  /* 13 */ val INTERNAL: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.INTERNAL with Double = js.native
  /* 3 */ val INVALID_ARGUMENT: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.INVALID_ARGUMENT with Double = js.native
  /* 5 */ val NOT_FOUND: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.NOT_FOUND with Double = js.native
  /* 0 */ val OK: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.OK with Double = js.native
  /* 11 */ val OUT_OF_RANGE: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.OUT_OF_RANGE with Double = js.native
  /* 7 */ val PERMISSION_DENIED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.PERMISSION_DENIED with Double = js.native
  /* 8 */ val RESOURCE_EXHAUSTED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.RESOURCE_EXHAUSTED with Double = js.native
  /* 16 */ val UNAUTHENTICATED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.UNAUTHENTICATED with Double = js.native
  /* 14 */ val UNAVAILABLE: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.UNAVAILABLE with Double = js.native
  /* 12 */ val UNIMPLEMENTED: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.UNIMPLEMENTED with Double = js.native
  /* 2 */ val UNKNOWN: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

