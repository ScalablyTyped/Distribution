package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentVersion extends StObject {
  
  var agentVersion: String
  
  var protocolVersion: String
}
object AgentVersion {
  
  inline def apply(agentVersion: String, protocolVersion: String): AgentVersion = {
    val __obj = js.Dynamic.literal(agentVersion = agentVersion.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentVersion] (val x: Self) extends AnyVal {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
  }
}
