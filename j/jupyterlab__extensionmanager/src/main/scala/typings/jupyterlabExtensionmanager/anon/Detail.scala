package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detail extends js.Object {
  /**
    * Break down of the search score.
    */
  var detail: Maintenance
  /**
    * The final normalized search score.
    */
  var `final`: Double
}

object Detail {
  @scala.inline
  def apply(detail: Maintenance, `final`: Double): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
}

