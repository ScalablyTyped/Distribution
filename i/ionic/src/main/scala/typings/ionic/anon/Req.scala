package typings.ionic.anon

import typings.ionic.definitionsMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: SuperAgentRequest
}
object Req {
  
  inline def apply(req: SuperAgentRequest): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  extension [Self <: Req](x: Self) {
    
    inline def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
