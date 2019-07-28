package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var paging: js.UndefOr[Boolean] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: String = null,
    pageSize: Int | Double = null,
    paging: js.UndefOr[Boolean] = js.undefined
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging)
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

