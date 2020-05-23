package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upgrade extends js.Object {
  var upgrade: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Upgrade {
  @scala.inline
  def apply(upgrade: js.UndefOr[Boolean] = js.undefined, validate: js.UndefOr[Boolean] = js.undefined): Upgrade = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upgrade]
  }
}

