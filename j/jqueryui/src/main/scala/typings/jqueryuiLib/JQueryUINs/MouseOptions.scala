package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// UI //////////////////////////////////////////////////
trait MouseOptions extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
}

object MouseOptions {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null
  ): MouseOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseOptions]
  }
}

