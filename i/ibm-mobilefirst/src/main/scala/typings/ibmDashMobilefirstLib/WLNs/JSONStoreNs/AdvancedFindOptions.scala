package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedFindOptions extends BasicFindOptions {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object AdvancedFindOptions {
  @scala.inline
  def apply(
    filter: js.Array[java.lang.String] = null,
    invocationContext: js.Any = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    sort: js.Array[java.lang.String] = null
  ): AdvancedFindOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[AdvancedFindOptions]
  }
}

