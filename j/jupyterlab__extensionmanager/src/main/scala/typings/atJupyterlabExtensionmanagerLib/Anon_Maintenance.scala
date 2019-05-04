package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maintenance extends js.Object {
  /**
    * The normalized maintenance score.
    */
  var maintenance: scala.Double
  /**
    * The normalized popularity score.
    */
  var popularity: scala.Double
  /**
    * The normalized quality score.
    */
  var quality: scala.Double
}

object Anon_Maintenance {
  @scala.inline
  def apply(maintenance: scala.Double, popularity: scala.Double, quality: scala.Double): Anon_Maintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance, popularity = popularity, quality = quality)
  
    __obj.asInstanceOf[Anon_Maintenance]
  }
}

