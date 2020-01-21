package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrecision extends js.Object {
  var precision: js.UndefOr[Double] = js.undefined
  var useTz: js.UndefOr[Boolean] = js.undefined
}

object AnonPrecision {
  @scala.inline
  def apply(precision: Int | Double = null, useTz: js.UndefOr[Boolean] = js.undefined): AnonPrecision = {
    val __obj = js.Dynamic.literal()
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(useTz)) __obj.updateDynamic("useTz")(useTz.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrecision]
  }
}

