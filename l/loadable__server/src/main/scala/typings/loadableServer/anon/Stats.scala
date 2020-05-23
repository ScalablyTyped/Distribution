package typings.loadableServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * Stats generated using `@loadable/webpack-plugin`.
    */
  var stats: js.Object
}

object Stats {
  @scala.inline
  def apply(stats: js.Object): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

