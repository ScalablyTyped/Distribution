package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_One extends js.Object {
  var style: js.UndefOr[
    markdownlintLib.markdownlintLibStrings.one | markdownlintLib.markdownlintLibStrings.ordered | markdownlintLib.markdownlintLibStrings.one_or_ordered | markdownlintLib.markdownlintLibStrings.zero
  ] = js.undefined
}

object Anon_One {
  @scala.inline
  def apply(
    style: markdownlintLib.markdownlintLibStrings.one | markdownlintLib.markdownlintLibStrings.ordered | markdownlintLib.markdownlintLibStrings.one_or_ordered | markdownlintLib.markdownlintLibStrings.zero = null
  ): Anon_One = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_One]
  }
}

