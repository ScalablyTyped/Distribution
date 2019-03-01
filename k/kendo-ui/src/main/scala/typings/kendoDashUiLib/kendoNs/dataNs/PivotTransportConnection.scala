package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportConnection extends js.Object {
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  var cube: js.UndefOr[java.lang.String] = js.undefined
}

object PivotTransportConnection {
  @scala.inline
  def apply(catalog: java.lang.String = null, cube: java.lang.String = null): PivotTransportConnection = {
    val __obj = js.Dynamic.literal()
    if (catalog != null) __obj.updateDynamic("catalog")(catalog)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    __obj.asInstanceOf[PivotTransportConnection]
  }
}

