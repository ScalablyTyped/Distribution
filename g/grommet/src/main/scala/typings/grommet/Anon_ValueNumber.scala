package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueNumber extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_ValueNumber {
  @scala.inline
  def apply(value: Int | Double = null): Anon_ValueNumber = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ValueNumber]
  }
}

