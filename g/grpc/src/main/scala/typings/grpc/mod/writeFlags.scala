package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait writeFlags extends StObject
@JSImport("grpc", "writeFlags")
@js.native
object writeFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[writeFlags & Double] = js.native
  
  /**
    * Hint that the write may be buffered and need not go out on the wire
    * immediately. GRPC is free to buffer the message until the next non-buffered
    * write, or until writes_done, but it need not buffer completely or at all.
    */
  @js.native
  sealed trait BUFFER_HINT
    extends StObject
       with writeFlags
  /* 1 */ val BUFFER_HINT: typings.grpc.mod.writeFlags.BUFFER_HINT & Double = js.native
  
  /**
    * Force compression to be disabled for a particular write
    */
  @js.native
  sealed trait NO_COMPRESS
    extends StObject
       with writeFlags
  /* 0 */ val NO_COMPRESS: typings.grpc.mod.writeFlags.NO_COMPRESS & Double = js.native
}
