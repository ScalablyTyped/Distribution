package typings.marked

import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: center | left | right | Null
  var header: Boolean
}

object Anon_Align {
  @scala.inline
  def apply(header: Boolean, align: center | left | right = null): Anon_Align = {
    val __obj = js.Dynamic.literal(header = header)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

