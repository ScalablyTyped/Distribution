package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportWithFunctionOperations extends PivotTransport {
  @JSName("discover")
  var discover_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]] = js.undefined
  @JSName("read")
  var read_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]] = js.undefined
}

object PivotTransportWithFunctionOperations {
  @scala.inline
  def apply(
    discover: /* options */ DataSourceTransportOptions => scala.Unit = null,
    read: /* options */ DataSourceTransportOptions => scala.Unit = null
  ): PivotTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    if (discover != null) __obj.updateDynamic("discover")(js.Any.fromFunction1(discover))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1(read))
    __obj.asInstanceOf[PivotTransportWithFunctionOperations]
  }
}

