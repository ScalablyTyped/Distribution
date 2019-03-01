package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleEvents extends js.Object {
  var collapse: js.UndefOr[JQueryMobileEvent] = js.undefined
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  var expand: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object CollapsibleEvents {
  @scala.inline
  def apply(
    collapse: JQueryMobileEvent = null,
    create: JQueryMobileEvent = null,
    expand: JQueryMobileEvent = null
  ): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (create != null) __obj.updateDynamic("create")(create)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[CollapsibleEvents]
  }
}

