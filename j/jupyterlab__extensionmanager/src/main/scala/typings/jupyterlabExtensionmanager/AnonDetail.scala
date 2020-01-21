package typings.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetail extends js.Object {
  /**
    * Break down of the search score.
    */
  var detail: AnonMaintenance
  /**
    * The final normalized search score.
    */
  var `final`: Double
}

object AnonDetail {
  @scala.inline
  def apply(detail: AnonMaintenance, `final`: Double): AnonDetail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetail]
  }
}

