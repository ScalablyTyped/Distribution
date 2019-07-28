package typings.markdownlint

import typings.markdownlint.markdownlintStrings.asterisk
import typings.markdownlint.markdownlintStrings.consistent
import typings.markdownlint.markdownlintStrings.dash
import typings.markdownlint.markdownlintStrings.plus
import typings.markdownlint.markdownlintStrings.sublist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asterisk extends js.Object {
  var style: js.UndefOr[consistent | asterisk | plus | dash | sublist] = js.undefined
}

object Anon_Asterisk {
  @scala.inline
  def apply(style: consistent | asterisk | plus | dash | sublist = null): Anon_Asterisk = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asterisk]
  }
}

