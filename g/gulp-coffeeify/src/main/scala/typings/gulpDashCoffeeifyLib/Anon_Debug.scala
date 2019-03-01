package typings
package gulpDashCoffeeifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(debug: js.UndefOr[scala.Boolean] = js.undefined, paths: js.Array[java.lang.String] = null): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[Anon_Debug]
  }
}

