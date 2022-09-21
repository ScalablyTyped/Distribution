package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okNegotiatedContentResultMod {
  
  @JSImport("inversify-express-utils/lib/results/OkNegotiatedContentResult", "OkNegotiatedContentResult")
  @js.native
  open class OkNegotiatedContentResult[T] protected ()
    extends StObject
       with IHttpActionResult {
    def this(content: T) = this()
    
    /* private */ var content: Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
}
