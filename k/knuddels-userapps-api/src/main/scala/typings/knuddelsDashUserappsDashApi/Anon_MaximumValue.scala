package typings.knuddelsDashUserappsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
}

object Anon_MaximumValue {
  @scala.inline
  def apply(maximumValue: Int | Double = null, minimumValue: Int | Double = null): Anon_MaximumValue = {
    val __obj = js.Dynamic.literal()
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumValue]
  }
}

