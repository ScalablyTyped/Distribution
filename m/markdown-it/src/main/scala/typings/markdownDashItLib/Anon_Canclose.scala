package typings
package markdownDashItLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canclose extends js.Object {
  var can_close: scala.Boolean
  var can_open: scala.Boolean
  var length: scala.Double
}

object Anon_Canclose {
  @scala.inline
  def apply(can_close: scala.Boolean, can_open: scala.Boolean, length: scala.Double): Anon_Canclose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("can_close")(can_close)
    __obj.updateDynamic("can_open")(can_open)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[Anon_Canclose]
  }
}

