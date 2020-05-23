package typings.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeSeparated extends js.Object {
  var includeSeparated: js.UndefOr[Boolean] = js.undefined
}

object IncludeSeparated {
  @scala.inline
  def apply(includeSeparated: js.UndefOr[Boolean] = js.undefined): IncludeSeparated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSeparated)) __obj.updateDynamic("includeSeparated")(includeSeparated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSeparated]
  }
}

