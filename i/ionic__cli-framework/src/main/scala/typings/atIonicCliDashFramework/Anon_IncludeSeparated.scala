package typings.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSeparated extends js.Object {
  var includeSeparated: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeSeparated {
  @scala.inline
  def apply(includeSeparated: js.UndefOr[Boolean] = js.undefined): Anon_IncludeSeparated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSeparated)) __obj.updateDynamic("includeSeparated")(includeSeparated)
    __obj.asInstanceOf[Anon_IncludeSeparated]
  }
}

