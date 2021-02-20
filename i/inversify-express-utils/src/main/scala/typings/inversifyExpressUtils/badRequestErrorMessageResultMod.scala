package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badRequestErrorMessageResultMod {
  
  @JSImport("inversify-express-utils/dts/results/BadRequestErrorMessageResult", JSImport.Default)
  @js.native
  class default protected () extends BadRequestErrorMessageResult {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait BadRequestErrorMessageResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
    
    var message: js.Any = js.native
  }
  object BadRequestErrorMessageResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], message: js.Any): BadRequestErrorMessageResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadRequestErrorMessageResult]
    }
    
    @scala.inline
    implicit class BadRequestErrorMessageResultMutableBuilder[Self <: BadRequestErrorMessageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
