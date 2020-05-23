package typings.graphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxErrors extends js.Object {
  var maxErrors: js.UndefOr[Double] = js.undefined
}

object MaxErrors {
  @scala.inline
  def apply(maxErrors: js.UndefOr[Double] = js.undefined): MaxErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxErrors)) __obj.updateDynamic("maxErrors")(maxErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxErrors]
  }
}

