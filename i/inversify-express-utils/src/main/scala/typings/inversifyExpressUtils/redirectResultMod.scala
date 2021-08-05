package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectResultMod {
  
  @JSImport("inversify-express-utils/dts/results/RedirectResult", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with RedirectResult {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
    
    /* private */ /* CompleteClass */
    var apiController: js.Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ /* CompleteClass */
    var location: js.Any = js.native
  }
  
  trait RedirectResult
    extends StObject
       with IHttpActionResult {
    
    /* private */ var apiController: js.Any
    
    /* private */ var location: js.Any
  }
  object RedirectResult {
    
    inline def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], location: js.Any): RedirectResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectResult]
    }
    
    extension [Self <: RedirectResult](x: Self) {
      
      inline def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
