package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var paging: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    paging: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging)
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

