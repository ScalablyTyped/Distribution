package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// UI //////////////////////////////////////////////////
trait MouseOptions extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
}

object MouseOptions {
  @scala.inline
  def apply(cancel: String = null, delay: Int | Double = null, distance: Int | Double = null): MouseOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseOptions]
  }
}

