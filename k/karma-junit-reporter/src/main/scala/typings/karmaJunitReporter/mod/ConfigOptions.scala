package typings.karmaJunitReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var junitReporter: js.UndefOr[JUnitReporterConfiguration] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(junitReporter: JUnitReporterConfiguration = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (junitReporter != null) __obj.updateDynamic("junitReporter")(junitReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

