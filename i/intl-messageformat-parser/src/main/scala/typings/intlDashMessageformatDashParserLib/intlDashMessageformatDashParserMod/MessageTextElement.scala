package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTextElement extends Element {
  var location: Location
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.messageTextElement
  var value: java.lang.String
}

object MessageTextElement {
  @scala.inline
  def apply(
    location: Location,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.messageTextElement,
    value: java.lang.String
  ): MessageTextElement = {
    val __obj = js.Dynamic.literal(location = location, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageTextElement]
  }
}

