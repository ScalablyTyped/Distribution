package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object DialogEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): DialogEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[DialogEvents]
  }
}

