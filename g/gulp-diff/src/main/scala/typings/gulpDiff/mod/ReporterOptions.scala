package typings.gulpDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  /**
    * emit an error on finding diffs, defaults to `false`
    */
  var fail: js.UndefOr[Boolean] = js.undefined
  /**
    * do not show diff information, defaults to `false`
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(fail: js.UndefOr[Boolean] = js.undefined, quiet: js.UndefOr[Boolean] = js.undefined): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOptions]
  }
}

