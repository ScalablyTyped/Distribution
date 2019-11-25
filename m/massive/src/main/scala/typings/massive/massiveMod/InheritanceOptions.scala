package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritanceOptions extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
}

object InheritanceOptions {
  @scala.inline
  def apply(only: js.UndefOr[Boolean] = js.undefined): InheritanceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritanceOptions]
  }
}

