package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalServerErrorMod {
  
  @JSImport("inversify-express-utils/dts/results/InternalServerError", JSImport.Default)
  @js.native
  class default protected () extends InternalServerErrorResult {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait InternalServerErrorResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
  }
  object InternalServerErrorResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): InternalServerErrorResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[InternalServerErrorResult]
    }
    
    @scala.inline
    implicit class InternalServerErrorResultMutableBuilder[Self <: InternalServerErrorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
    }
  }
}
