package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(indent: scala.Int | scala.Double = null): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

