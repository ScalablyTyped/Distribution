package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickResultType extends js.Object

@JSImport("@grpc/grpc-js/build/src/picker", "PickResultType")
@js.native
object PickResultType extends js.Object {
  @js.native
  sealed trait COMPLETE extends PickResultType
  
  @js.native
  sealed trait QUEUE extends PickResultType
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends PickResultType
  
  /* 0 */ val COMPLETE: typings.atGrpcGrpcDashJs.buildSrcPickerMod.PickResultType.COMPLETE with Double = js.native
  /* 1 */ val QUEUE: typings.atGrpcGrpcDashJs.buildSrcPickerMod.PickResultType.QUEUE with Double = js.native
  /* 2 */ val TRANSIENT_FAILURE: typings.atGrpcGrpcDashJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickResultType with Double] = js.native
}

