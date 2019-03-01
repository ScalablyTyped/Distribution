package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Performance extends js.Object {
  /**
    * Mimics performance.now().
    */
  var performance: Anon_Now
}

object Anon_Performance {
  @scala.inline
  def apply(performance: Anon_Now): Anon_Performance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("performance")(performance)
    __obj.asInstanceOf[Anon_Performance]
  }
}

