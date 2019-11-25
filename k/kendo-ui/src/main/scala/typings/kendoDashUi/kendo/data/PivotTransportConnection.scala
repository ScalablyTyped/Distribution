package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportConnection extends js.Object {
  var catalog: js.UndefOr[String] = js.undefined
  var cube: js.UndefOr[String] = js.undefined
}

object PivotTransportConnection {
  @scala.inline
  def apply(catalog: String = null, cube: String = null): PivotTransportConnection = {
    val __obj = js.Dynamic.literal()
    if (catalog != null) __obj.updateDynamic("catalog")(catalog.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransportConnection]
  }
}

