package typings.karmaCoverage

import typings.karmaCoverage.mod.KarmaCoverageReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReporters extends js.Object {
  var reporters: js.UndefOr[js.Array[KarmaCoverageReporter]] = js.undefined
}

object AnonReporters {
  @scala.inline
  def apply(reporters: js.Array[KarmaCoverageReporter] = null): AnonReporters = {
    val __obj = js.Dynamic.literal()
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReporters]
  }
}

