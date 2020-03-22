package typings.karmaParallel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Options for this plugin
    * see {@link https://github.com/joeljeske/karma-parallel#options}
    */
  var parallelOptions: js.UndefOr[ParallelOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(parallelOptions: ParallelOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (parallelOptions != null) __obj.updateDynamic("parallelOptions")(parallelOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

