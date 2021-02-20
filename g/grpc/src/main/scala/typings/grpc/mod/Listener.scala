package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends StObject {
  
  var onReceiveMessage: js.UndefOr[MessageListener] = js.native
  
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.native
  
  var onReceiveStatus: js.UndefOr[StatusListener] = js.native
}
object Listener {
  
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnReceiveMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
    
    @scala.inline
    def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
    
    @scala.inline
    def setOnReceiveStatus(value: (/* status */ StatusObject, /* next */ js.Function) => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
  }
}
