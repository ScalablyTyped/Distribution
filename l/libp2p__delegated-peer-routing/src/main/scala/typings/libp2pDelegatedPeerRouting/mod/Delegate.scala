package typings.libp2pDelegatedPeerRouting.mod

import typings.libp2pDelegatedPeerRouting.anon.FindPeer
import typings.libp2pDelegatedPeerRouting.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegate extends StObject {
  
  var dht: FindPeer
  
  def getEndpointConfig(): Host
}
object Delegate {
  
  inline def apply(dht: FindPeer, getEndpointConfig: () => Host): Delegate = {
    val __obj = js.Dynamic.literal(dht = dht.asInstanceOf[js.Any], getEndpointConfig = js.Any.fromFunction0(getEndpointConfig))
    __obj.asInstanceOf[Delegate]
  }
  
  extension [Self <: Delegate](x: Self) {
    
    inline def setDht(value: FindPeer): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
    
    inline def setGetEndpointConfig(value: () => Host): Self = StObject.set(x, "getEndpointConfig", js.Any.fromFunction0(value))
  }
}
