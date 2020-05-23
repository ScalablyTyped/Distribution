package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Punctuation extends js.Object {
  var punctuation: js.UndefOr[String] = js.undefined
}

object Punctuation {
  @scala.inline
  def apply(punctuation: String = null): Punctuation = {
    val __obj = js.Dynamic.literal()
    if (punctuation != null) __obj.updateDynamic("punctuation")(punctuation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Punctuation]
  }
}

