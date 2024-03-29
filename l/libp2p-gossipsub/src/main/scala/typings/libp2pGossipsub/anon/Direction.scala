package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.libp2pGossipsubStrings.inbound
import typings.libp2pGossipsub.libp2pGossipsubStrings.outbound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: inbound | outbound
}
object Direction {
  
  inline def apply(direction: inbound | outbound): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: inbound | outbound): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
