package typings
package grammarkdownLib.distParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var range: grammarkdownLib.distCoreMod.Range
  var text: java.lang.String
}

object TextChange {
  @scala.inline
  def apply(range: grammarkdownLib.distCoreMod.Range, text: java.lang.String): TextChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextChange]
  }
}

