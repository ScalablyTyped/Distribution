package typings.libp2pMplex.distSrcMessageTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@libp2p/mplex.@libp2p/mplex/dist/src/message-types.RECEIVER_NAME, @libp2p/mplex.@libp2p/mplex/dist/src/message-types.CODE> */
object ReceiverMessageTypes {
  
  @JSImport("@libp2p/mplex/dist/src/message-types", "ReceiverMessageTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/mplex/dist/src/message-types", "ReceiverMessageTypes.CLOSE")
  @js.native
  def CLOSE: CODE = js.native
  inline def CLOSE_=(x: CODE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(x.asInstanceOf[js.Any])
  
  @JSImport("@libp2p/mplex/dist/src/message-types", "ReceiverMessageTypes.MESSAGE")
  @js.native
  def MESSAGE: CODE = js.native
  inline def MESSAGE_=(x: CODE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("@libp2p/mplex/dist/src/message-types", "ReceiverMessageTypes.RESET")
  @js.native
  def RESET: CODE = js.native
  inline def RESET_=(x: CODE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESET")(x.asInstanceOf[js.Any])
}
