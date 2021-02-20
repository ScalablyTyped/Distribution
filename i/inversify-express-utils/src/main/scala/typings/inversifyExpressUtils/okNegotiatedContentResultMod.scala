package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okNegotiatedContentResultMod {
  
  @JSImport("inversify-express-utils/dts/results/OkNegotiatedContentResult", JSImport.Default)
  @js.native
  class default[T] protected () extends OkNegotiatedContentResult[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait OkNegotiatedContentResult[T] extends IHttpActionResult {
    
    var apiController: js.Any = js.native
    
    var content: js.Any = js.native
  }
  object OkNegotiatedContentResult {
    
    @scala.inline
    def apply[T](apiController: js.Any, content: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): OkNegotiatedContentResult[T] = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[OkNegotiatedContentResult[T]]
    }
    
    @scala.inline
    implicit class OkNegotiatedContentResultMutableBuilder[Self <: OkNegotiatedContentResult[_], T] (val x: Self with OkNegotiatedContentResult[T]) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
