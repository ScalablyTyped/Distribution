package typings.homeworks.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
trait ToggleOptions extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
}

object ToggleOptions {
  @scala.inline
  def apply(placeholder: String = null): ToggleOptions = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[ToggleOptions]
  }
}

