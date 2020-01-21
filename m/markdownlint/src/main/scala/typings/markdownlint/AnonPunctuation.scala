package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPunctuation extends js.Object {
  var punctuation: js.UndefOr[String] = js.undefined
}

object AnonPunctuation {
  @scala.inline
  def apply(punctuation: String = null): AnonPunctuation = {
    val __obj = js.Dynamic.literal()
    if (punctuation != null) __obj.updateDynamic("punctuation")(punctuation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPunctuation]
  }
}

