package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeSeparated extends js.Object {
  var includeSeparated: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeSeparated {
  @scala.inline
  def apply(includeSeparated: js.UndefOr[Boolean] = js.undefined): AnonIncludeSeparated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSeparated)) __obj.updateDynamic("includeSeparated")(includeSeparated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSeparated]
  }
}

