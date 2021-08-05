package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addr extends StObject {
  
  var addr: js.Any
  
  var peer: js.Any
}
object Addr {
  
  inline def apply(addr: js.Any, peer: js.Any): Addr = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addr]
  }
  
  extension [Self <: Addr](x: Self) {
    
    inline def setAddr(value: js.Any): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: js.Any): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}
