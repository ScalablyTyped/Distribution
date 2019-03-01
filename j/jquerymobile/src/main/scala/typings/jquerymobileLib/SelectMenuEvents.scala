package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object SelectMenuEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[SelectMenuEvents]
  }
}

