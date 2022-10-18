package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsInternalServerErrorMod {
  
  @JSImport("inversify-express-utils/lib/results/InternalServerError", "InternalServerErrorResult")
  @js.native
  open class InternalServerErrorResult ()
    extends StObject
       with IHttpActionResult {
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
}
