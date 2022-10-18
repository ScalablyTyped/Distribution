package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsStatusCodeResultMod {
  
  @JSImport("inversify-express-utils/lib/results/StatusCodeResult", "StatusCodeResult")
  @js.native
  open class StatusCodeResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(statusCode: Double) = this()
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ var statusCode: Any = js.native
  }
}
