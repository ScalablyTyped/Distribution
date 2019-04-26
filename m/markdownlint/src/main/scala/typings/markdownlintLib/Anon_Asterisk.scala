package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asterisk extends js.Object {
  var style: js.UndefOr[
    markdownlintLib.markdownlintLibStrings.consistent | markdownlintLib.markdownlintLibStrings.asterisk | markdownlintLib.markdownlintLibStrings.plus | markdownlintLib.markdownlintLibStrings.dash | markdownlintLib.markdownlintLibStrings.sublist
  ] = js.undefined
}

object Anon_Asterisk {
  @scala.inline
  def apply(
    style: markdownlintLib.markdownlintLibStrings.consistent | markdownlintLib.markdownlintLibStrings.asterisk | markdownlintLib.markdownlintLibStrings.plus | markdownlintLib.markdownlintLibStrings.dash | markdownlintLib.markdownlintLibStrings.sublist = null
  ): Anon_Asterisk = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asterisk]
  }
}

