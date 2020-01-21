package typings.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatsFile extends js.Object {
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: String
}

object AnonStatsFile {
  @scala.inline
  def apply(statsFile: String): AnonStatsFile = {
    val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStatsFile]
  }
}

