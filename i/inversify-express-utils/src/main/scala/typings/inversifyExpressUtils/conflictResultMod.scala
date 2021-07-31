package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conflictResultMod {
  
  @JSImport("inversify-express-utils/dts/results/ConflictResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ConflictResult {
    def this(apiController: BaseHttpController) = this()
    
    /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
  
  trait ConflictResult
    extends StObject
       with IHttpActionResult {
    
    var apiController: js.Any
  }
  object ConflictResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ConflictResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[ConflictResult]
    }
    
    @scala.inline
    implicit class ConflictResultMutableBuilder[Self <: ConflictResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
    }
  }
}
