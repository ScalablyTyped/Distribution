package typings.knex.anon

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
  def apply(precision: js.UndefOr[Double] = js.undefined, useTz: js.UndefOr[Boolean] = js.undefined): ReadonlyuseTzbooleanpreci = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTz)) __obj.updateDynamic("useTz")(useTz.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyuseTzbooleanpreci]
  }
}

