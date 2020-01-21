package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.typesMod.TYPE.pound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoundElement extends _MessageFormatElement {
  var location: js.UndefOr[Location] = js.undefined
  var `type`: pound
}

object PoundElement {
  @scala.inline
  def apply(`type`: pound, location: Location = null): PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoundElement]
  }
}

