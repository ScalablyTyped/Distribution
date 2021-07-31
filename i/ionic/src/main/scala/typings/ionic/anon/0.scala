package typings.ionic.anon

import typings.ionic.utilsHttpMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var req: SuperAgentRequest
}
object `0` {
  
  @scala.inline
  def apply(req: SuperAgentRequest): `0` = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
