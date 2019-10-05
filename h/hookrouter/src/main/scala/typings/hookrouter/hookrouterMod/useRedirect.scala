package typings.hookrouter.hookrouterMod

import typings.hookrouter.hookrouterMod.HookRouter.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hookrouter", "useRedirect")
@js.native
object useRedirect extends js.Object {
  def apply(fromURL: String, toURL: String): Unit = js.native
  def apply(fromURL: String, toURL: String, queryParams: Null, replace: Boolean): Unit = js.native
  def apply(fromURL: String, toURL: String, queryParams: QueryParams): Unit = js.native
  def apply(fromURL: String, toURL: String, queryParams: QueryParams, replace: Boolean): Unit = js.native
}

