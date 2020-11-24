package typings.imperium.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imperium", "is")
@js.native
object is extends js.Object {
  
  def apply(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}
