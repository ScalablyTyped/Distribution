package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unit extends js.Object {
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var value: scala.Double
}

object Anon_Unit {
  @scala.inline
  def apply(value: scala.Double, unit: java.lang.String = null): Anon_Unit = {
    val __obj = js.Dynamic.literal(value = value)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_Unit]
  }
}

