package typings.libp2pWebrtcPeer

import typings.libp2pLogger.mod.Logger_
import typings.std.MessageEvent
import typings.std.RTCDataChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChannelMod {
  
  @JSImport("@libp2p/webrtc-peer/dist/src/channel", "WebRTCDataChannel")
  @js.native
  open class WebRTCDataChannel protected () extends StObject {
    def this(channel: RTCDataChannel, opts: WebRTCDataChannelOptions) = this()
    
    def bufferedAmount: Double = js.native
    
    /* private */ val channel: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ val closingInterval: Any = js.native
    
    var label: String = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ var open: Any = js.native
    
    def send(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  trait WebRTCDataChannelOptions extends StObject {
    
    def log(formatter: Any, args: Any*): Unit
    @JSName("log")
    var log_Original: Logger_
    
    def onClose(): Unit
    
    def onError(err: js.Error): Unit
    
    def onMessage(event: MessageEvent[js.typedarray.Uint8Array]): Unit
    
    def onOpen(): Unit
  }
  object WebRTCDataChannelOptions {
    
    inline def apply(
      log: Logger_,
      onClose: () => Unit,
      onError: js.Error => Unit,
      onMessage: MessageEvent[js.typedarray.Uint8Array] => Unit,
      onOpen: () => Unit
    ): WebRTCDataChannelOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction0(onOpen))
      __obj.asInstanceOf[WebRTCDataChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebRTCDataChannelOptions] (val x: Self) extends AnyVal {
      
      inline def setLog(value: Logger_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnMessage(value: MessageEvent[js.typedarray.Uint8Array] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    }
  }
}
