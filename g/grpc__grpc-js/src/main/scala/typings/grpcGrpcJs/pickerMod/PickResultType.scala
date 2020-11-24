package typings.grpcGrpcJs.pickerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PickResultType extends js.Object
@JSImport("@grpc/grpc-js/build/src/picker", "PickResultType")
@js.native
object PickResultType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickResultType with Double] = js.native
  
  @js.native
  sealed trait COMPLETE extends PickResultType
  /* 0 */ @js.native
  object COMPLETE extends TopLevel[COMPLETE with Double]
  
  @js.native
  sealed trait DROP extends PickResultType
  /* 3 */ @js.native
  object DROP extends TopLevel[DROP with Double]
  
  @js.native
  sealed trait QUEUE extends PickResultType
  /* 1 */ @js.native
  object QUEUE extends TopLevel[QUEUE with Double]
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends PickResultType
  /* 2 */ @js.native
  object TRANSIENT_FAILURE extends TopLevel[TRANSIENT_FAILURE with Double]
}
