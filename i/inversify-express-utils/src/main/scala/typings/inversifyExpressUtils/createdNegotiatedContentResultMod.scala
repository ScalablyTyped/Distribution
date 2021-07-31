package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createdNegotiatedContentResultMod {
  
  @JSImport("inversify-express-utils/dts/results/CreatedNegotiatedContentResult", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with CreatedNegotiatedContentResult[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL_, content: T, apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    var content: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* CompleteClass */
    var location: js.Any = js.native
  }
  
  trait CreatedNegotiatedContentResult[T]
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
    
    var content: js.Any
    
    var location: js.Any
  }
  object CreatedNegotiatedContentResult {
    
    @scala.inline
    def apply[T](
      apiController: js.Any,
      content: js.Any,
      executeAsync: () => js.Promise[HttpResponseMessage],
      location: js.Any
    ): CreatedNegotiatedContentResult[T] = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatedNegotiatedContentResult[T]]
    }
    
    @scala.inline
    implicit class CreatedNegotiatedContentResultMutableBuilder[Self <: CreatedNegotiatedContentResult[?], T] (val x: Self & CreatedNegotiatedContentResult[T]) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
