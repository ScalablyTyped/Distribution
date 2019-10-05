package typings.ibmDashMobilefirst.WL.JSONStore

import typings.ibmDashMobilefirst.WL.IResponse
import typings.ibmDashMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicFindOptions extends Options {
  var filter: js.UndefOr[js.Array[String]] = js.undefined
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}

object BasicFindOptions {
  @scala.inline
  def apply(
    filter: js.Array[String] = null,
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    sort: js.Array[String] = null
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

