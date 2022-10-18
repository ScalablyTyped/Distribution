package typings.libp2pMplex

import typings.itStreamTypes.mod.Transform
import typings.libp2pMplex.distSrcMessageTypesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRestrictSizeMod {
  
  @JSImport("@libp2p/mplex/dist/src/restrict-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/mplex/dist/src/restrict-size", "MAX_MSG_SIZE")
  @js.native
  val MAX_MSG_SIZE: Double = js.native
  
  inline def restrictSize(): Transform[Message | js.Array[Message], Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictSize")().asInstanceOf[Transform[Message | js.Array[Message], Message]]
  inline def restrictSize(max: Double): Transform[Message | js.Array[Message], Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictSize")(max.asInstanceOf[js.Any]).asInstanceOf[Transform[Message | js.Array[Message], Message]]
}
