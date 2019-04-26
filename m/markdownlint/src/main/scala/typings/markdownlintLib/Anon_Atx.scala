package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atx extends js.Object {
  var style: js.UndefOr[
    markdownlintLib.markdownlintLibStrings.consistent | markdownlintLib.markdownlintLibStrings.atx | markdownlintLib.markdownlintLibStrings.atx_closed | markdownlintLib.markdownlintLibStrings.setext | markdownlintLib.markdownlintLibStrings.setext_with_atx | markdownlintLib.markdownlintLibStrings.setext_with_atx_closed
  ] = js.undefined
}

object Anon_Atx {
  @scala.inline
  def apply(
    style: markdownlintLib.markdownlintLibStrings.consistent | markdownlintLib.markdownlintLibStrings.atx | markdownlintLib.markdownlintLibStrings.atx_closed | markdownlintLib.markdownlintLibStrings.setext | markdownlintLib.markdownlintLibStrings.setext_with_atx | markdownlintLib.markdownlintLibStrings.setext_with_atx_closed = null
  ): Anon_Atx = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Atx]
  }
}

