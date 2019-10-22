package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending extends js.Object {
  var ascending: js.UndefOr[js.Any] = js.undefined
  var contract: js.UndefOr[js.Any] = js.undefined
  var descending: js.UndefOr[js.Any] = js.undefined
  var expand: js.UndefOr[js.Any] = js.undefined
}

object Anon_Ascending {
  @scala.inline
  def apply(
    ascending: js.Any = null,
    contract: js.Any = null,
    descending: js.Any = null,
    expand: js.Any = null
  ): Anon_Ascending = {
    val __obj = js.Dynamic.literal()
    if (ascending != null) __obj.updateDynamic("ascending")(ascending)
    if (contract != null) __obj.updateDynamic("contract")(contract)
    if (descending != null) __obj.updateDynamic("descending")(descending)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[Anon_Ascending]
  }
}

