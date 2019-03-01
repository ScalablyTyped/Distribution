package typings
package gulpDashDiffLib.gulpDashDiffMod.gulpUnderscoreDiffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  /**
    * emit an error on finding diffs, defaults to `false`
    */
  var fail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * do not show diff information, defaults to `false`
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(fail: js.UndefOr[scala.Boolean] = js.undefined, quiet: js.UndefOr[scala.Boolean] = js.undefined): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    __obj.asInstanceOf[ReporterOptions]
  }
}

