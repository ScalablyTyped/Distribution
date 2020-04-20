package typings.grammarkdown

import typings.grammarkdown.coreMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends js.Object {
  var range: Range
  var text: String
}

object AnonRange {
  @scala.inline
  def apply(range: Range, text: String): AnonRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRange]
  }
}

