package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unit extends js.Object {
  var unit: js.UndefOr[String] = js.undefined
  var value: Double
}

object Anon_Unit {
  @scala.inline
  def apply(value: Double, unit: String = null): Anon_Unit = {
    val __obj = js.Dynamic.literal(value = value)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_Unit]
  }
}

