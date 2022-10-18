package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsExceptionResultMod {
  
  @JSImport("inversify-express-utils/lib/results/ExceptionResult", "ExceptionResult")
  @js.native
  open class ExceptionResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(error: js.Error) = this()
    
    /* private */ var error: Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
}
