package typings.lasso

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.lasso.anon.Lasso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("lasso/middleware", "serveStatic")
  @js.native
  def serveStatic(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lasso/middleware", "serveStatic")
  @js.native
  def serveStatic(options: Lasso): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
