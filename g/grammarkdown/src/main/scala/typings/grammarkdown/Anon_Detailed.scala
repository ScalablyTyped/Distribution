package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detailed extends js.Object {
  var detailed: js.UndefOr[Boolean] = js.undefined
}

object Anon_Detailed {
  @scala.inline
  def apply(detailed: js.UndefOr[Boolean] = js.undefined): Anon_Detailed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Detailed]
  }
}

