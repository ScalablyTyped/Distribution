package typings.intlDashMessageformatDashParser.libTypesMod

import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.select
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectElement
  extends BaseElement[select]
     with _MessageFormatElement {
  var options: Record[String, PluralOrSelectOption]
}

object SelectElement {
  @scala.inline
  def apply(
    options: Record[String, PluralOrSelectOption],
    `type`: select,
    value: String,
    location: Location = null
  ): SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectElement]
  }
}

