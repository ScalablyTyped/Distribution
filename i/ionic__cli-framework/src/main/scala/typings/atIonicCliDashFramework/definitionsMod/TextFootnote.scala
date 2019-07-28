package typings.atIonicCliDashFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFootnote extends Footnote {
  var id: String | Double
  var text: String
}

object TextFootnote {
  @scala.inline
  def apply(id: String | Double, text: String): TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[TextFootnote]
  }
}

