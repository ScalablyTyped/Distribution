package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicFindOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var filter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BasicFindOptions {
  @scala.inline
  def apply(
    filter: js.Array[java.lang.String] = null,
    invocationContext: js.Any = null,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onSuccess: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    sort: js.Array[java.lang.String] = null
  ): BasicFindOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[BasicFindOptions]
  }
}

