package typings.jsonServer.mod

import typings.express.mod.Router
import typings.jsonServer.anon.ForeignKeySuffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-server", "router")
@js.native
object router extends js.Object {
  def apply(source: String): Router = js.native
  def apply(source: String, options: ForeignKeySuffix): Router = js.native
  def apply(source: js.Object): Router = js.native
  def apply(source: js.Object, options: ForeignKeySuffix): Router = js.native
}

