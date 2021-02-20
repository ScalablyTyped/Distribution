package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait methodTypes extends StObject
@JSImport("grpc", "methodTypes")
@js.native
object methodTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[methodTypes with Double] = js.native
  
  @js.native
  sealed trait BIDI_STREAMING extends methodTypes
  /* 3 */ val BIDI_STREAMING: typings.grpc.mod.methodTypes.BIDI_STREAMING with Double = js.native
  
  @js.native
  sealed trait CLIENT_STREAMING extends methodTypes
  /* 1 */ val CLIENT_STREAMING: typings.grpc.mod.methodTypes.CLIENT_STREAMING with Double = js.native
  
  @js.native
  sealed trait SERVER_STREAMING extends methodTypes
  /* 2 */ val SERVER_STREAMING: typings.grpc.mod.methodTypes.SERVER_STREAMING with Double = js.native
  
  @js.native
  sealed trait UNARY extends methodTypes
  /* 0 */ val UNARY: typings.grpc.mod.methodTypes.UNARY with Double = js.native
}
