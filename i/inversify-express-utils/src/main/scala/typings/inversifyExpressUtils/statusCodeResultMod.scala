package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCodeResultMod {
  
  @JSImport("inversify-express-utils/dts/results/StatusCodeResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with StatusCodeResult {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
    
    /* private */ /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ /* CompleteClass */
    var statusCode: js.Any = js.native
  }
  
  trait StatusCodeResult
    extends StObject
       with IHttpActionResult {
    
    /* private */ var apiController: js.Any
    
    /* private */ var statusCode: js.Any
  }
  object StatusCodeResult {
    
    inline def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], statusCode: js.Any): StatusCodeResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusCodeResult]
    }
    
    extension [Self <: StatusCodeResult](x: Self) {
      
      inline def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: js.Any): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
