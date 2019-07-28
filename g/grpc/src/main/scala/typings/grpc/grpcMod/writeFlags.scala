package typings.grpc.grpcMod

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
  sealed trait BUFFER_HINT extends writeFlags
  
  /**
    * Force compression to be disabled for a particular write
    */
  @js.native
  sealed trait NO_COMPRESS extends writeFlags
  
  /* 1 */ val BUFFER_HINT: typings.grpc.grpcMod.writeFlags.BUFFER_HINT with Double = js.native
  /* 0 */ val NO_COMPRESS: typings.grpc.grpcMod.writeFlags.NO_COMPRESS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[writeFlags with Double] = js.native
}

