package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  var paths: js.UndefOr[js.Array[_] | java.lang.String | stdLib.RegExp] = js.undefined
  var phase: java.lang.String
}

object Anon_Enabled {
  @scala.inline
  def apply(
    phase: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    params: js.Array[_] | js.Any = null,
    paths: js.Array[_] | java.lang.String | stdLib.RegExp = null
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(phase = phase)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

