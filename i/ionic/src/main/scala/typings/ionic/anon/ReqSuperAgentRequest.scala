package typings.ionic.anon

import typings.ionic.libHttpMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReqSuperAgentRequest extends StObject {
  
  var req: SuperAgentRequest
}
object ReqSuperAgentRequest {
  
  inline def apply(req: SuperAgentRequest): ReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqSuperAgentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReqSuperAgentRequest] (val x: Self) extends AnyVal {
    
    inline def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
