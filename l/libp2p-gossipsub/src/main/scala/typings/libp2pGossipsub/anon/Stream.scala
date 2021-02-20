package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.interfacesMod.DuplexIterableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  var protocol: String = js.native
  
  var stream: DuplexIterableStream[_, _, _] = js.native
}
object Stream {
  
  @scala.inline
  def apply(protocol: String, stream: DuplexIterableStream[_, _, _]): Stream = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: DuplexIterableStream[_, _, _]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
