package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Precision extends js.Object {
  var precision: js.UndefOr[Double] = js.undefined
  var useTz: js.UndefOr[Boolean] = js.undefined
}

object Anon_Precision {
  @scala.inline
  def apply(precision: Int | Double = null, useTz: js.UndefOr[Boolean] = js.undefined): Anon_Precision = {
    val __obj = js.Dynamic.literal()
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(useTz)) __obj.updateDynamic("useTz")(useTz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Precision]
  }
}

