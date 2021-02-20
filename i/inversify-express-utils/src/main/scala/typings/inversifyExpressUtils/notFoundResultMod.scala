package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notFoundResultMod {
  
  @JSImport("inversify-express-utils/dts/results/NotFoundResult", JSImport.Default)
  @js.native
  class default protected () extends NotFoundResult {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait NotFoundResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
  }
  object NotFoundResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): NotFoundResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[NotFoundResult]
    }
    
    @scala.inline
    implicit class NotFoundResultMutableBuilder[Self <: NotFoundResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
    }
  }
}
