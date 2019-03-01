package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationData extends js.Object {
  var adapter: java.lang.String
  var compressResponse: js.UndefOr[scala.Boolean] = js.undefined
  var parameters: js.UndefOr[js.Array[_]] = js.undefined
  var procedure: java.lang.String
}

object ProcedureInvocationData {
  @scala.inline
  def apply(
    adapter: java.lang.String,
    procedure: java.lang.String,
    compressResponse: js.UndefOr[scala.Boolean] = js.undefined,
    parameters: js.Array[_] = null
  ): ProcedureInvocationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    __obj.updateDynamic("procedure")(procedure)
    if (!js.isUndefined(compressResponse)) __obj.updateDynamic("compressResponse")(compressResponse)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[ProcedureInvocationData]
  }
}

