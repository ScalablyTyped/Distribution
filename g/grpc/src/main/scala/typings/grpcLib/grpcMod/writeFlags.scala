package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait writeFlags extends js.Object

@JSImport("grpc", "writeFlags")
@js.native
object writeFlags extends js.Object {
  /**
    * Hint that the write may be buffered and need not go out on the wire
    * immediately. GRPC is free to buffer the message until the next non-buffered
    * write, or until writes_done, but it need not buffer completely or at all.
    */
  @js.native
  sealed trait BUFFER_HINT
    extends grpcLib.grpcMod.writeFlags
  
  /**
    * Force compression to be disabled for a particular write
    */
  @js.native
  sealed trait NO_COMPRESS
    extends grpcLib.grpcMod.writeFlags
  
  /* 1 */ val BUFFER_HINT: BUFFER_HINT with scala.Double = js.native
  val NO_COMPRESS: NO_COMPRESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.writeFlags with scala.Double] = js.native
}

