package typings
package jqueryDotJnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JNotifyInitOptions extends js.Object {
  var appendType: js.UndefOr[java.lang.String] = js.undefined
  var oneAtTime: js.UndefOr[scala.Boolean] = js.undefined
}

object JNotifyInitOptions {
  @scala.inline
  def apply(appendType: java.lang.String = null, oneAtTime: js.UndefOr[scala.Boolean] = js.undefined): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    if (appendType != null) __obj.updateDynamic("appendType")(appendType)
    if (!js.isUndefined(oneAtTime)) __obj.updateDynamic("oneAtTime")(oneAtTime)
    __obj.asInstanceOf[JNotifyInitOptions]
  }
}

