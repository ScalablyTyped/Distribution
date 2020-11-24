package typings.lessMiddleware

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.lessMiddleware.anon.CacheFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("less-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Middleware created to allow processing of Less files for Connect JS framework
    * and by extension the Express JS framework
    */
  def apply(source: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(source: String, options: CacheFile): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
