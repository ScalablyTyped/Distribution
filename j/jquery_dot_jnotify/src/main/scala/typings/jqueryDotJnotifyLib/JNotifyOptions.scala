package typings
package jqueryDotJnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JNotifyOptions extends js.Object {
  var disappearTime: js.UndefOr[scala.Double] = js.undefined
  var permanent: js.UndefOr[scala.Boolean] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object JNotifyOptions {
  @scala.inline
  def apply(
    disappearTime: scala.Int | scala.Double = null,
    permanent: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): JNotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (disappearTime != null) __obj.updateDynamic("disappearTime")(disappearTime.asInstanceOf[js.Any])
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JNotifyOptions]
  }
}

