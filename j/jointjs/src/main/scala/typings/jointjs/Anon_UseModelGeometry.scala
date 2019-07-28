package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseModelGeometry extends js.Object {
  var useModelGeometry: js.UndefOr[Boolean] = js.undefined
}

object Anon_UseModelGeometry {
  @scala.inline
  def apply(useModelGeometry: js.UndefOr[Boolean] = js.undefined): Anon_UseModelGeometry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useModelGeometry)) __obj.updateDynamic("useModelGeometry")(useModelGeometry)
    __obj.asInstanceOf[Anon_UseModelGeometry]
  }
}

