package typings.jsonDashServer.jsonDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.connect.connectMod.NextHandleFunction
import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Router
import typings.jsonDashServer.Anon_ForeignKeySuffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val bodyParser: js.Tuple2[NextHandleFunction, NextHandleFunction] = js.native
  def create(): Application = js.native
  def defaults(): js.Array[RequestHandler] = js.native
  def defaults(options: MiddlewaresOptions): js.Array[RequestHandler] = js.native
  def rewriter(rules: StringDictionary[String]): Router = js.native
  def router(source: String): Router = js.native
  def router(source: String, options: Anon_ForeignKeySuffix): Router = js.native
  def router(source: js.Object): Router = js.native
  def router(source: js.Object, options: Anon_ForeignKeySuffix): Router = js.native
}

