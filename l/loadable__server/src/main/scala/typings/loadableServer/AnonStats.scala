package typings.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStats extends js.Object {
  /**
  	 * Stats generated using `@loadable/webpack-plugin`.
  	 */
  var stats: js.Object
}

object AnonStats {
  @scala.inline
  def apply(stats: js.Object): AnonStats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStats]
  }
}

