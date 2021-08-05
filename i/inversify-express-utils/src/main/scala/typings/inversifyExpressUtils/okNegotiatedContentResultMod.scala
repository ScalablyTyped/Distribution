package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okNegotiatedContentResultMod {
  
  @JSImport("inversify-express-utils/dts/results/OkNegotiatedContentResult", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with OkNegotiatedContentResult[T] {
    def this(content: T, apiController: BaseHttpController) = this()
    
    /* private */ /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var content: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
  
  trait OkNegotiatedContentResult[T]
    extends StObject
       with IHttpActionResult {
    
    /* private */ var apiController: js.Any
    
    /* private */ var content: js.Any
  }
  object OkNegotiatedContentResult {
    
    inline def apply[T](apiController: js.Any, content: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): OkNegotiatedContentResult[T] = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[OkNegotiatedContentResult[T]]
    }
    
    extension [Self <: OkNegotiatedContentResult[?], T](x: Self & OkNegotiatedContentResult[T]) {
      
      inline def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      inline def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
