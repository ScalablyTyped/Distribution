package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMessageResultMod {
  
  @JSImport("inversify-express-utils/dts/results/ResponseMessageResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ResponseMessageResult {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* CompleteClass */
    var message: js.Any = js.native
  }
  
  trait ResponseMessageResult
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
    
    var message: js.Any
  }
  object ResponseMessageResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], message: js.Any): ResponseMessageResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseMessageResult]
    }
    
    @scala.inline
    implicit class ResponseMessageResultMutableBuilder[Self <: ResponseMessageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
