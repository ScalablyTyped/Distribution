package typings.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaintenance extends js.Object {
  /**
    * The normalized maintenance score.
    */
  var maintenance: Double
  /**
    * The normalized popularity score.
    */
  var popularity: Double
  /**
    * The normalized quality score.
    */
  var quality: Double
}

object AnonMaintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): AnonMaintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaintenance]
  }
}

