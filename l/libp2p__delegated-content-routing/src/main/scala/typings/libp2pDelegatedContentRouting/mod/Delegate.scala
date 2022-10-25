package typings.libp2pDelegatedContentRouting.mod

import typings.libp2pDelegatedContentRouting.anon.FindProvs
import typings.libp2pDelegatedContentRouting.anon.Host
import typings.libp2pDelegatedContentRouting.anon.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegate extends StObject {
  
  var block: Stat
  
  var dht: FindProvs
  
  def getEndpointConfig(): Host
}
object Delegate {
  
  inline def apply(block: Stat, dht: FindProvs, getEndpointConfig: () => Host): Delegate = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], dht = dht.asInstanceOf[js.Any], getEndpointConfig = js.Any.fromFunction0(getEndpointConfig))
    __obj.asInstanceOf[Delegate]
  }
  
  extension [Self <: Delegate](x: Self) {
    
    inline def setBlock(value: Stat): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setDht(value: FindProvs): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
    
    inline def setGetEndpointConfig(value: () => Host): Self = StObject.set(x, "getEndpointConfig", js.Any.fromFunction0(value))
  }
}
