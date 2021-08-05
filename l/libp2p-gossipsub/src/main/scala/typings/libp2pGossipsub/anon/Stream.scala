package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.interfacesMod.DuplexIterableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var protocol: String
  
  var stream: DuplexIterableStream[js.Any, js.Any, js.Any]
}
object Stream {
  
  inline def apply(protocol: String, stream: DuplexIterableStream[js.Any, js.Any, js.Any]): Stream = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setStream(value: DuplexIterableStream[js.Any, js.Any, js.Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
