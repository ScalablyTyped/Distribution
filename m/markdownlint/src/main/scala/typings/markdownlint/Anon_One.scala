package typings.markdownlint

import typings.markdownlint.markdownlintStrings.one
import typings.markdownlint.markdownlintStrings.one_or_ordered
import typings.markdownlint.markdownlintStrings.ordered
import typings.markdownlint.markdownlintStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_One extends js.Object {
  var style: js.UndefOr[one | ordered | one_or_ordered | zero] = js.undefined
}

object Anon_One {
  @scala.inline
  def apply(style: one | ordered | one_or_ordered | zero = null): Anon_One = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_One]
  }
}

