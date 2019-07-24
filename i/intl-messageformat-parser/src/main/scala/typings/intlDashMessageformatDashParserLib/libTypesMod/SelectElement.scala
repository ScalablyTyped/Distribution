package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectElement
  extends BaseElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.select]
     with _MessageFormatElement {
  var options: stdLib.Record[java.lang.String, PluralOrSelectOption]
}

object SelectElement {
  @scala.inline
  def apply(
    options: stdLib.Record[java.lang.String, PluralOrSelectOption],
    `type`: intlDashMessageformatDashParserLib.libTypesMod.TYPE.select,
    value: java.lang.String,
    location: Location = null
  ): SelectElement = {
    val __obj = js.Dynamic.literal(options = options, value = value)
    __obj.updateDynamic("type")(`type`)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SelectElement]
  }
}

