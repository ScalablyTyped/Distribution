package typings.ionic.anon

import typings.ionic.libUtilsHttpMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var req: SuperAgentRequest
}
object `0` {
  
  inline def apply(req: SuperAgentRequest): `0` = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
