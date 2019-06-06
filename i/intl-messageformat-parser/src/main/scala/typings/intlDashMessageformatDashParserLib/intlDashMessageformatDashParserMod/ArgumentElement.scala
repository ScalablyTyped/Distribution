package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentElement extends Element {
  var format: ElementFormat
  var id: java.lang.String
  var location: Location
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.argumentElement
}

object ArgumentElement {
  @scala.inline
  def apply(
    format: ElementFormat,
    id: java.lang.String,
    location: Location,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.argumentElement
  ): ArgumentElement = {
    val __obj = js.Dynamic.literal(format = format, id = id, location = location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArgumentElement]
  }
}

