package typings.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detailed extends js.Object {
  var detailed: js.UndefOr[Boolean] = js.undefined
}

object Detailed {
  @scala.inline
  def apply(detailed: js.UndefOr[Boolean] = js.undefined): Detailed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detailed]
  }
}

