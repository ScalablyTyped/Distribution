package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyLabel extends js.Object {
  var all: js.UndefOr[java.lang.String] = js.undefined
  var close: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var redisplay: js.UndefOr[java.lang.String] = js.undefined
  var stick: js.UndefOr[java.lang.String] = js.undefined
}

object PNotifyLabel {
  @scala.inline
  def apply(
    all: java.lang.String = null,
    close: java.lang.String = null,
    last: java.lang.String = null,
    redisplay: java.lang.String = null,
    stick: java.lang.String = null
  ): PNotifyLabel = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (close != null) __obj.updateDynamic("close")(close)
    if (last != null) __obj.updateDynamic("last")(last)
    if (redisplay != null) __obj.updateDynamic("redisplay")(redisplay)
    if (stick != null) __obj.updateDynamic("stick")(stick)
    __obj.asInstanceOf[PNotifyLabel]
  }
}

