package typings.markdownlint.anon

import typings.markdownlint.markdownlintStrings.one
import typings.markdownlint.markdownlintStrings.one_or_ordered
import typings.markdownlint.markdownlintStrings.ordered
import typings.markdownlint.markdownlintStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var style: js.UndefOr[one | ordered | one_or_ordered | zero] = js.undefined
}

object `1` {
  @scala.inline
  def apply(style: one | ordered | one_or_ordered | zero = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

