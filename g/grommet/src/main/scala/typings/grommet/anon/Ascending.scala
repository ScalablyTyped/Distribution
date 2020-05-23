package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ascending extends js.Object {
  var ascending: js.UndefOr[js.Any] = js.undefined
  var contract: js.UndefOr[js.Any] = js.undefined
  var descending: js.UndefOr[js.Any] = js.undefined
  var expand: js.UndefOr[js.Any] = js.undefined
}

object Ascending {
  @scala.inline
  def apply(
    ascending: js.Any = null,
    contract: js.Any = null,
    descending: js.Any = null,
    expand: js.Any = null
  ): Ascending = {
    val __obj = js.Dynamic.literal()
    if (ascending != null) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (contract != null) __obj.updateDynamic("contract")(contract.asInstanceOf[js.Any])
    if (descending != null) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
}

