package typings.itWs

import typings.itStreamTypes.mod.Sink
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSinkMod {
  
  @JSImport("it-ws/dist/src/sink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket, options: SinkOptions): Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink[js.typedarray.Uint8Array, js.Promise[Unit]]]
  
  trait SinkOptions extends StObject {
    
    var closeOnEnd: js.UndefOr[Boolean] = js.undefined
  }
  object SinkOptions {
    
    inline def apply(): SinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinkOptions] (val x: Self) extends AnyVal {
      
      inline def setCloseOnEnd(value: Boolean): Self = StObject.set(x, "closeOnEnd", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEndUndefined: Self = StObject.set(x, "closeOnEnd", js.undefined)
    }
  }
}
