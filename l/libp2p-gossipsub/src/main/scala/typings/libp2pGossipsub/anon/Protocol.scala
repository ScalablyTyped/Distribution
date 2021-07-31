package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protocol extends StObject {
  
  var protocol: String
}
object Protocol {
  
  @scala.inline
  def apply(protocol: String): Protocol = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  
  @scala.inline
  implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
