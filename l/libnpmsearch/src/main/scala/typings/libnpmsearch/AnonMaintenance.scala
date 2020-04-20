package typings.libnpmsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaintenance extends js.Object {
  var maintenance: Double
  var popularity: Double
  var quality: Double
}

object AnonMaintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): AnonMaintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaintenance]
  }
}

