package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneRegion extends ZoneId

object ZoneRegion {
  @scala.inline
  def apply(
    equals: js.Function1[js.Any, scala.Boolean],
    hashCode: js.Function0[scala.Double],
    id: js.Function0[java.lang.String],
    normalized: js.Function0[ZoneId],
    rules: js.Function0[ZoneRules],
    toString: js.Function0[java.lang.String]
  ): ZoneRegion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("hashCode")(hashCode)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("normalized")(normalized)
    __obj.updateDynamic("rules")(rules)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[ZoneRegion]
  }
}

