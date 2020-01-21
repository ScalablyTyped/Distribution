package typings.grpcGrpcJs.pickerMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickResultType with Double] = js.native
  /* 0 */ @js.native
  object COMPLETE extends TopLevel[COMPLETE with Double]
  
  /* 1 */ @js.native
  object QUEUE extends TopLevel[QUEUE with Double]
  
  /* 2 */ @js.native
  object TRANSIENT_FAILURE extends TopLevel[TRANSIENT_FAILURE with Double]
  
}

