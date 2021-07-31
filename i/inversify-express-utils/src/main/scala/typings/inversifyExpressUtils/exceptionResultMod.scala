package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionResultMod {
  
  @JSImport("inversify-express-utils/dts/results/ExceptionResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ExceptionResult {
    def this(error: Error, apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    var error: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
  
  trait ExceptionResult
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
    
    var error: js.Any
  }
  object ExceptionResult {
    
    @scala.inline
    def apply(apiController: js.Any, error: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ExceptionResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[ExceptionResult]
    }
    
    @scala.inline
    implicit class ExceptionResultMutableBuilder[Self <: ExceptionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
