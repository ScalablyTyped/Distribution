package typings.grpcGrpcJs.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
@JSImport("@grpc/grpc-js/build/src/constants", "Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait ABORTED extends Status
  /* 10 */ @js.native
  object ABORTED extends TopLevel[ABORTED with Double]
  
  @js.native
  sealed trait ALREADY_EXISTS extends Status
  /* 6 */ @js.native
  object ALREADY_EXISTS extends TopLevel[ALREADY_EXISTS with Double]
  
  @js.native
  sealed trait CANCELLED extends Status
  /* 1 */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with Double]
  
  @js.native
  sealed trait DATA_LOSS extends Status
  /* 15 */ @js.native
  object DATA_LOSS extends TopLevel[DATA_LOSS with Double]
  
  @js.native
  sealed trait DEADLINE_EXCEEDED extends Status
  /* 4 */ @js.native
  object DEADLINE_EXCEEDED extends TopLevel[DEADLINE_EXCEEDED with Double]
  
  @js.native
  sealed trait FAILED_PRECONDITION extends Status
  /* 9 */ @js.native
  object FAILED_PRECONDITION extends TopLevel[FAILED_PRECONDITION with Double]
  
  @js.native
  sealed trait INTERNAL extends Status
  /* 13 */ @js.native
  object INTERNAL extends TopLevel[INTERNAL with Double]
  
  @js.native
  sealed trait INVALID_ARGUMENT extends Status
  /* 3 */ @js.native
  object INVALID_ARGUMENT extends TopLevel[INVALID_ARGUMENT with Double]
  
  @js.native
  sealed trait NOT_FOUND extends Status
  /* 5 */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with Double]
  
  @js.native
  sealed trait OK extends Status
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait OUT_OF_RANGE extends Status
  /* 11 */ @js.native
  object OUT_OF_RANGE extends TopLevel[OUT_OF_RANGE with Double]
  
  @js.native
  sealed trait PERMISSION_DENIED extends Status
  /* 7 */ @js.native
  object PERMISSION_DENIED extends TopLevel[PERMISSION_DENIED with Double]
  
  @js.native
  sealed trait RESOURCE_EXHAUSTED extends Status
  /* 8 */ @js.native
  object RESOURCE_EXHAUSTED extends TopLevel[RESOURCE_EXHAUSTED with Double]
  
  @js.native
  sealed trait UNAUTHENTICATED extends Status
  /* 16 */ @js.native
  object UNAUTHENTICATED extends TopLevel[UNAUTHENTICATED with Double]
  
  @js.native
  sealed trait UNAVAILABLE extends Status
  /* 14 */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with Double]
  
  @js.native
  sealed trait UNIMPLEMENTED extends Status
  /* 12 */ @js.native
  object UNIMPLEMENTED extends TopLevel[UNIMPLEMENTED with Double]
  
  @js.native
  sealed trait UNKNOWN extends Status
  /* 2 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
