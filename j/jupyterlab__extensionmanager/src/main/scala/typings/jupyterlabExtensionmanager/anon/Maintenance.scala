package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maintenance extends js.Object {
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

object Maintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): Maintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintenance]
  }
}

