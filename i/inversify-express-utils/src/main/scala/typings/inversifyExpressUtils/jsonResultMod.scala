package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonResultMod {
  
  @JSImport("inversify-express-utils/dts/results/JsonResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with JsonResult {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* CompleteClass */
    override val json: js.Any = js.native
    
    /* CompleteClass */
    override val statusCode: Double = js.native
  }
  
  trait JsonResult
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
    
    val json: js.Any
    
    val statusCode: Double
  }
  object JsonResult {
    
    @scala.inline
    def apply(
      apiController: js.Any,
      executeAsync: () => js.Promise[HttpResponseMessage],
      json: js.Any,
      statusCode: Double
    ): JsonResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), json = json.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonResult]
    }
    
    @scala.inline
    implicit class JsonResultMutableBuilder[Self <: JsonResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
