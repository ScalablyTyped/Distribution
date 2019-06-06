package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFormatPattern extends js.Object {
  var elements: js.Array[Element]
  var location: Location
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.messageFormatPattern
}

object MessageFormatPattern {
  @scala.inline
  def apply(
    elements: js.Array[Element],
    location: Location,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.messageFormatPattern
  ): MessageFormatPattern = {
    val __obj = js.Dynamic.literal(elements = elements, location = location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageFormatPattern]
  }
}

