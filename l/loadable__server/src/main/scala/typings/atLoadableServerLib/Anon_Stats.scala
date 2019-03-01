package typings
package atLoadableServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stats extends js.Object {
  /**
  	  * Stats generated using `@loadable/webpack-plugin`.
  	  */
  var stats: js.Object
}

object Anon_Stats {
  @scala.inline
  def apply(stats: js.Object): Anon_Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[Anon_Stats]
  }
}

