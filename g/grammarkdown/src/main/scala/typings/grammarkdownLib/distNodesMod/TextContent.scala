package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  var text: js.UndefOr[java.lang.String]
}

object TextContent {
  @scala.inline
  def apply(text: java.lang.String = null): TextContent = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextContent]
  }
}

