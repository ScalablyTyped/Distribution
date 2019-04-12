package typings
package atHapiJoiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrays extends js.Object {
  var arrays: js.UndefOr[scala.Boolean] = js.undefined
  var objects: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Arrays {
  @scala.inline
  def apply(
    arrays: js.UndefOr[scala.Boolean] = js.undefined,
    objects: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Arrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrays)) __obj.updateDynamic("arrays")(arrays)
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[Anon_Arrays]
  }
}

