package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okResultMod {
  
  @JSImport("inversify-express-utils/dts/results/OkResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with OkResult {
    def this(apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
  
  trait OkResult
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
  }
  object OkResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): OkResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[OkResult]
    }
    
    @scala.inline
    implicit class OkResultMutableBuilder[Self <: OkResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
    }
  }
}
