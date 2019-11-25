package typings.logform.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  /**
    * A label to be added before the message.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * If set to `true` the `label` will be added to `info.message`. If set to `false` the `label`
    * will be added as `info.label`.
    */
  var message: js.UndefOr[Boolean] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(label: String = null, message: js.UndefOr[Boolean] = js.undefined): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

