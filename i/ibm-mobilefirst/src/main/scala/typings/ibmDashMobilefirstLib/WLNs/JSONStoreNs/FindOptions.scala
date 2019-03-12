package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends BasicFindOptions {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Array[java.lang.String] = null,
    invocationContext: js.Any = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onSuccess: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    sort: js.Array[java.lang.String] = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[FindOptions]
  }
}

