package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsResponseMessageResultMod {
  
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
