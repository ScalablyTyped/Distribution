package typings.hapi.anon

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: IncomingMessage
  
  var res: ServerResponse
}
object Req {
  
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
