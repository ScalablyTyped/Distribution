package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remove extends js.Object {
  var remove: js.UndefOr[Boolean] = js.undefined
}

object Anon_Remove {
  @scala.inline
  def apply(remove: js.UndefOr[Boolean] = js.undefined): Anon_Remove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Remove]
  }
}

