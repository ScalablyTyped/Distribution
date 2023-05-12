package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/circuit-relay/pb.Peer> */
trait PartialPeer extends StObject {
  
  var addrs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  
  var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object PartialPeer {
  
  inline def apply(): PartialPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPeer] (val x: Self) extends AnyVal {
    
    inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsUndefined: Self = StObject.set(x, "addrs", js.undefined)
    
    inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
    
    inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
