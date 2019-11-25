package typings.lolex

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
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Performance]
  }
}

