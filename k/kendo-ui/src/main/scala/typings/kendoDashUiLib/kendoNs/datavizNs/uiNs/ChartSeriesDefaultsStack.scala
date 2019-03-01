package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsStack extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChartSeriesDefaultsStack {
  @scala.inline
  def apply(`type`: java.lang.String = null): ChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartSeriesDefaultsStack]
  }
}

