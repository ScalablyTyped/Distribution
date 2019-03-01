package typings
package lestateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double
  def selector(state: js.Any): js.Object
}

object Anon_Force {
  @scala.inline
  def apply(
    id: scala.Double,
    selector: js.Function1[js.Any, js.Object],
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Force = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[Anon_Force]
  }
}

