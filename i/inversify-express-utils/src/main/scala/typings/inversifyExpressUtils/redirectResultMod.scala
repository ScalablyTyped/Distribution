package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectResultMod {
  
  @JSImport("inversify-express-utils/dts/results/RedirectResult", JSImport.Default)
  @js.native
  class default protected () extends RedirectResult {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait RedirectResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
    
    var location: js.Any = js.native
  }
  object RedirectResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], location: js.Any): RedirectResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectResult]
    }
    
    @scala.inline
    implicit class RedirectResultMutableBuilder[Self <: RedirectResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
