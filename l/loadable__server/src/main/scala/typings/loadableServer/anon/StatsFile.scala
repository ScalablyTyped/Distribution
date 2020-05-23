package typings.loadableServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsFile extends js.Object {
  /**
    * Stats file path generated using `@loadable/webpack-plugin`
    */
  var statsFile: String
}

object StatsFile {
  @scala.inline
  def apply(statsFile: String): StatsFile = {
    val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsFile]
  }
}

