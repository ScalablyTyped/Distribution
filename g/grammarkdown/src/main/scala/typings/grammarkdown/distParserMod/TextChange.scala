package typings.grammarkdown.distParserMod

import typings.grammarkdown.distCoreMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var range: Range
  var text: String
}

object TextChange {
  @scala.inline
  def apply(range: Range, text: String): TextChange = {
    val __obj = js.Dynamic.literal(range = range, text = text)
  
    __obj.asInstanceOf[TextChange]
  }
}

