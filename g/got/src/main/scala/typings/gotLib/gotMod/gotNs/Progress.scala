package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var percent: scala.Double
  var total: scala.Double | scala.Null
  var transferred: scala.Double
}

object Progress {
  @scala.inline
  def apply(percent: scala.Double, transferred: scala.Double, total: scala.Int | scala.Double = null): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("transferred")(transferred)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

