package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fast extends js.Object {
  var fast: scala.Double
  var slow: scala.Double
}

object Anon_Fast {
  @scala.inline
  def apply(fast: scala.Double, slow: scala.Double): Anon_Fast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fast")(fast)
    __obj.updateDynamic("slow")(slow)
    __obj.asInstanceOf[Anon_Fast]
  }
}

