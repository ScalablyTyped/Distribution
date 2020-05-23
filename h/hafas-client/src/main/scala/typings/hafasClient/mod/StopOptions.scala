package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopOptions extends js.Object {
   // parse & expose lines at the stop/station?
  var language: js.UndefOr[String] = js.undefined
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
}

object StopOptions {
  @scala.inline
  def apply(language: String = null, linesOfStops: js.UndefOr[Boolean] = js.undefined): StopOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(linesOfStops)) __obj.updateDynamic("linesOfStops")(linesOfStops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOptions]
  }
}

