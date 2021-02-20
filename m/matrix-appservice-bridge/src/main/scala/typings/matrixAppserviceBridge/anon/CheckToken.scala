package typings.matrixAppserviceBridge.anon

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.DELETE
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.GET
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.POST
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckToken extends StObject {
  
  var checkToken: js.UndefOr[Boolean] = js.native
  
  def handler(req: Request_[ParamsDictionary, _, _, Query], respose: Response_[_], next: NextFunction): Unit = js.native
  
  var method: GET | PUT | POST | DELETE = js.native
  
  var path: String = js.native
}
object CheckToken {
  
  @scala.inline
  def apply(
    handler: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => Unit,
    method: GET | PUT | POST | DELETE,
    path: String
  ): CheckToken = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction3(handler), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckToken]
  }
  
  @scala.inline
  implicit class CheckTokenMutableBuilder[Self <: CheckToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckToken(value: Boolean): Self = StObject.set(x, "checkToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckTokenUndefined: Self = StObject.set(x, "checkToken", js.undefined)
    
    @scala.inline
    def setHandler(value: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMethod(value: GET | PUT | POST | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
