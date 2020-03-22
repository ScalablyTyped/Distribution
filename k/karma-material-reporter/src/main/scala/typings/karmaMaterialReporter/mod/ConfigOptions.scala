package typings.karmaMaterialReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Visualize karma test results in real time with material designed reporter
    * See {@link https://github.com/ameerthehacker/karma-material-reporter#availble-configurations}
    */
  var materialReporter: js.UndefOr[MaterialReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(materialReporter: MaterialReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (materialReporter != null) __obj.updateDynamic("materialReporter")(materialReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

