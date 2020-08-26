package typings.hookrouter.mod

import typings.hookrouter.mod.HookRouter.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hookrouter", "navigate")
@js.native
object navigate extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(
    url: String,
    replace: js.UndefOr[scala.Nothing],
    queryParams: js.UndefOr[scala.Nothing],
    replaceQueryParams: Boolean
  ): Unit = js.native
  def apply(url: String, replace: js.UndefOr[scala.Nothing], queryParams: Null, replaceQueryParams: Boolean): Unit = js.native
  def apply(url: String, replace: js.UndefOr[scala.Nothing], queryParams: QueryParams): Unit = js.native
  def apply(
    url: String,
    replace: js.UndefOr[scala.Nothing],
    queryParams: QueryParams,
    replaceQueryParams: Boolean
  ): Unit = js.native
  def apply(url: String, replace: Boolean): Unit = js.native
  def apply(url: String, replace: Boolean, queryParams: js.UndefOr[scala.Nothing], replaceQueryParams: Boolean): Unit = js.native
  def apply(url: String, replace: Boolean, queryParams: Null, replaceQueryParams: Boolean): Unit = js.native
  def apply(url: String, replace: Boolean, queryParams: QueryParams): Unit = js.native
  def apply(url: String, replace: Boolean, queryParams: QueryParams, replaceQueryParams: Boolean): Unit = js.native
}

