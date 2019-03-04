package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFootnote extends Footnote {
  var id: java.lang.String | scala.Double
  var text: java.lang.String
}

object TextFootnote {
  @scala.inline
  def apply(id: java.lang.String | scala.Double, text: java.lang.String): TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[TextFootnote]
  }
}

