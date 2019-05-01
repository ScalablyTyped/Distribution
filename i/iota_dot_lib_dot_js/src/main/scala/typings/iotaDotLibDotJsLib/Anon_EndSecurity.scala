package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSecurity extends js.Object {
  var end: scala.Double
  var security: js.UndefOr[iotaDotLibDotJsLib.iotaDotLibDotJsMod.Security] = js.undefined
  var start: scala.Double
}

object Anon_EndSecurity {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    security: iotaDotLibDotJsLib.iotaDotLibDotJsMod.Security = null
  ): Anon_EndSecurity = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[Anon_EndSecurity]
  }
}

