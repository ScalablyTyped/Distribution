package typings
package jqueryDotContextmenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    hide: java.lang.String = null,
    show: java.lang.String = null
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Duration]
  }
}

