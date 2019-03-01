package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var additionalSearchFields: js.UndefOr[js.Any] = js.undefined
  var markDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Any = null,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    push: js.UndefOr[scala.Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[AddOptions]
  }
}

