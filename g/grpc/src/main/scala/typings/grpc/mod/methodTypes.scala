package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait methodTypes extends js.Object
@JSImport("grpc", "methodTypes")
@js.native
object methodTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[methodTypes with Double] = js.native
  
  @js.native
  sealed trait BIDI_STREAMING extends methodTypes
  /* 3 */ @js.native
  object BIDI_STREAMING extends TopLevel[BIDI_STREAMING with Double]
  
  @js.native
  sealed trait CLIENT_STREAMING extends methodTypes
  /* 1 */ @js.native
  object CLIENT_STREAMING extends TopLevel[CLIENT_STREAMING with Double]
  
  @js.native
  sealed trait SERVER_STREAMING extends methodTypes
  /* 2 */ @js.native
  object SERVER_STREAMING extends TopLevel[SERVER_STREAMING with Double]
  
  @js.native
  sealed trait UNARY extends methodTypes
  /* 0 */ @js.native
  object UNARY extends TopLevel[UNARY with Double]
}
