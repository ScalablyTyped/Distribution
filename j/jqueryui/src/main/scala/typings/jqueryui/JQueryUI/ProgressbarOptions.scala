package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Progressbar //////////////////////////////////////////////////
trait ProgressbarOptions extends ProgressbarEvents {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | Boolean] = js.undefined
}

object ProgressbarOptions {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit = null,
    complete: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit = null,
    create: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    value: Double | Boolean = null
  ): ProgressbarOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressbarOptions]
  }
}

