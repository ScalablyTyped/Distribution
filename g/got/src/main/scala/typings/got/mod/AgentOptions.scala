package typings.got.mod

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentOptions extends StObject {
  
  var http: Agent
  
  var https: typings.node.httpsMod.Agent
}
object AgentOptions {
  
  inline def apply(http: Agent, https: typings.node.httpsMod.Agent): AgentOptions = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
  
  extension [Self <: AgentOptions](x: Self) {
    
    inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
