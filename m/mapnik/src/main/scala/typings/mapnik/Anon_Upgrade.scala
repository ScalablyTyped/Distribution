package typings.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Upgrade extends js.Object {
  var upgrade: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Anon_Upgrade {
  @scala.inline
  def apply(upgrade: js.UndefOr[Boolean] = js.undefined, validate: js.UndefOr[Boolean] = js.undefined): Anon_Upgrade = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Upgrade]
  }
}

