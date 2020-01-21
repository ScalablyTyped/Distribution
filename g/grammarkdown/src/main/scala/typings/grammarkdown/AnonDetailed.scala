package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetailed extends js.Object {
  var detailed: js.UndefOr[Boolean] = js.undefined
}

object AnonDetailed {
  @scala.inline
  def apply(detailed: js.UndefOr[Boolean] = js.undefined): AnonDetailed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetailed]
  }
}

