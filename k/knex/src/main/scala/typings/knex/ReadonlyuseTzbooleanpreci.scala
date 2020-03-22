package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  useTz ? :boolean,   precision ? :number}> */
trait ReadonlyuseTzbooleanpreci extends js.Object {
  val precision: js.UndefOr[Double] = js.undefined
  val useTz: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyuseTzbooleanpreci {
  @scala.inline
  def apply(precision: Int | Double = null, useTz: js.UndefOr[Boolean] = js.undefined): ReadonlyuseTzbooleanpreci = {
    val __obj = js.Dynamic.literal()
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(useTz)) __obj.updateDynamic("useTz")(useTz.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyuseTzbooleanpreci]
  }
}

