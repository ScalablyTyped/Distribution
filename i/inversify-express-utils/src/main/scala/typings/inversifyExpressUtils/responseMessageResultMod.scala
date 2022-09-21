package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMessageResultMod {
  
  @JSImport("inversify-express-utils/lib/results/ResponseMessageResult", "ResponseMessageResult")
  @js.native
  open class ResponseMessageResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(message: HttpResponseMessage) = this()
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ var message: Any = js.native
  }
}
