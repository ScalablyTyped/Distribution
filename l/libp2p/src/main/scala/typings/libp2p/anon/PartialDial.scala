package typings.libp2p.anon

import typings.libp2p.distSrcAutonatPbMod.Message.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/autonat/pb.Message.Dial> */
trait PartialDial extends StObject {
  
  var peer: js.UndefOr[PeerInfo] = js.undefined
}
object PartialDial {
  
  inline def apply(): PartialDial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDial] (val x: Self) extends AnyVal {
    
    inline def setPeer(value: PeerInfo): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
  }
}
