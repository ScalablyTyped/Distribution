package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsJsonResultMod {
  
  @JSImport("inversify-express-utils/lib/results/JsonResult", "JsonResult")
  @js.native
  open class JsonResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(json: Any, statusCode: Double) = this()
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    val json: Any = js.native
    
    val statusCode: Double = js.native
  }
}
