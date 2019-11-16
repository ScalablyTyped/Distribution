package typings.atKeystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: js.UndefOr[Boolean] = js.undefined
  var list: js.UndefOr[Boolean] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(field: js.UndefOr[Boolean] = js.undefined, list: js.UndefOr[Boolean] = js.undefined): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[Anon_Field]
  }
}

