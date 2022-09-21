package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}
object Listener {
  
  inline def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  
  extension [Self <: Listener](x: Self) {
    
    inline def setOnReceiveMessage(value: (/* message */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2(value))
    
    inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
    
    inline def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2(value))
    
    inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
    
    inline def setOnReceiveStatus(value: (/* status */ StatusObject, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2(value))
    
    inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
  }
}
