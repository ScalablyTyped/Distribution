package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  var indent: js.UndefOr[Double] = js.undefined
}

object Indent {
  @scala.inline
  def apply(indent: js.UndefOr[Double] = js.undefined): Indent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

