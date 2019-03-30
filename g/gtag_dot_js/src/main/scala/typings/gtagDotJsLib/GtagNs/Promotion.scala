package typings
package gtagDotJsLib.GtagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var creative_name: js.UndefOr[java.lang.String] = js.undefined
  var creative_slot: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(
    creative_name: java.lang.String = null,
    creative_slot: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null
  ): Promotion = {
    val __obj = js.Dynamic.literal()
    if (creative_name != null) __obj.updateDynamic("creative_name")(creative_name)
    if (creative_slot != null) __obj.updateDynamic("creative_slot")(creative_slot)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Promotion]
  }
}

