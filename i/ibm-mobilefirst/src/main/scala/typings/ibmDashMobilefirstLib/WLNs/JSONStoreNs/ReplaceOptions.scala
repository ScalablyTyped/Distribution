package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var markDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    push: js.UndefOr[scala.Boolean] = js.undefined
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[ReplaceOptions]
  }
}

