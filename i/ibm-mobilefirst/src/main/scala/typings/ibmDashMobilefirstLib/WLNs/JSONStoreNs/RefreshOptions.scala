package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var push: scala.Boolean
}

object RefreshOptions {
  @scala.inline
  def apply(
    push: scala.Boolean,
    invocationContext: js.Any = null,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null
  ): RefreshOptions = {
    val __obj = js.Dynamic.literal(push = push)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[RefreshOptions]
  }
}

