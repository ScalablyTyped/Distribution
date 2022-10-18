package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsBadRequestErrorMessageResultMod {
  
  @JSImport("inversify-express-utils/lib/results/BadRequestErrorMessageResult", "BadRequestErrorMessageResult")
  @js.native
  open class BadRequestErrorMessageResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(message: String) = this()
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ var message: Any = js.native
  }
}
