package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCodeResultMod {
  
  @JSImport("inversify-express-utils/dts/results/StatusCodeResult", JSImport.Default)
  @js.native
  class default protected () extends StatusCodeResult {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait StatusCodeResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
    
    var statusCode: js.Any = js.native
  }
  object StatusCodeResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], statusCode: js.Any): StatusCodeResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusCodeResult]
    }
    
    @scala.inline
    implicit class StatusCodeResultMutableBuilder[Self <: StatusCodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: js.Any): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
