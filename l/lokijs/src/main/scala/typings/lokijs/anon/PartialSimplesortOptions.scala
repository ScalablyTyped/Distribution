package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.SimplesortOptions> */
trait PartialSimplesortOptions extends js.Object {
  var desc: js.UndefOr[Boolean] = js.undefined
  var disableIndexIntersect: js.UndefOr[Boolean] = js.undefined
  var forceIndexIntersect: js.UndefOr[Boolean] = js.undefined
  var useJavascriptSorting: js.UndefOr[Boolean] = js.undefined
}

object PartialSimplesortOptions {
  @scala.inline
  def apply(
    desc: js.UndefOr[Boolean] = js.undefined,
    disableIndexIntersect: js.UndefOr[Boolean] = js.undefined,
    forceIndexIntersect: js.UndefOr[Boolean] = js.undefined,
    useJavascriptSorting: js.UndefOr[Boolean] = js.undefined
  ): PartialSimplesortOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIndexIntersect)) __obj.updateDynamic("disableIndexIntersect")(disableIndexIntersect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIndexIntersect)) __obj.updateDynamic("forceIndexIntersect")(forceIndexIntersect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useJavascriptSorting)) __obj.updateDynamic("useJavascriptSorting")(useJavascriptSorting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSimplesortOptions]
  }
}

