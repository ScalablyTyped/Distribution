package typings.atJupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maintenance extends js.Object {
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

object Anon_Maintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): Anon_Maintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance, popularity = popularity, quality = quality)
  
    __obj.asInstanceOf[Anon_Maintenance]
  }
}

