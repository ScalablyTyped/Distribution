package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var addNew: js.UndefOr[scala.Boolean] = js.undefined
  var markDirty: js.UndefOr[scala.Boolean] = js.undefined
  var replaceCriteria: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChangeOptions {
  @scala.inline
  def apply(
    addNew: js.UndefOr[scala.Boolean] = js.undefined,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onSuccess: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    replaceCriteria: js.Array[java.lang.String] = null
  ): ChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addNew)) __obj.updateDynamic("addNew")(addNew)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (replaceCriteria != null) __obj.updateDynamic("replaceCriteria")(replaceCriteria)
    __obj.asInstanceOf[ChangeOptions]
  }
}

