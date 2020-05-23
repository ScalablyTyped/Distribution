package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowdifferentnesting extends js.Object {
  var allow_different_nesting: js.UndefOr[Boolean] = js.undefined
  var siblings_only: js.UndefOr[Boolean] = js.undefined
}

object Allowdifferentnesting {
  @scala.inline
  def apply(
    allow_different_nesting: js.UndefOr[Boolean] = js.undefined,
    siblings_only: js.UndefOr[Boolean] = js.undefined
  ): Allowdifferentnesting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_different_nesting)) __obj.updateDynamic("allow_different_nesting")(allow_different_nesting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siblings_only)) __obj.updateDynamic("siblings_only")(siblings_only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowdifferentnesting]
  }
}

