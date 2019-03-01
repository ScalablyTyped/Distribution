package typings
package atLoadableServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatsFile extends js.Object {
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: java.lang.String
}

object Anon_StatsFile {
  @scala.inline
  def apply(statsFile: java.lang.String): Anon_StatsFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statsFile")(statsFile)
    __obj.asInstanceOf[Anon_StatsFile]
  }
}

