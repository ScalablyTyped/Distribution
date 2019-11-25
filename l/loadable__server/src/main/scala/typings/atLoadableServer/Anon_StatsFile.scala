package typings.atLoadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatsFile extends js.Object {
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: String
}

object Anon_StatsFile {
  @scala.inline
  def apply(statsFile: String): Anon_StatsFile = {
    val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_StatsFile]
  }
}

