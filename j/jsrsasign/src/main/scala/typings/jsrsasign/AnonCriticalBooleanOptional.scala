package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCriticalBooleanOptional extends js.Object {
  var critical: js.UndefOr[Boolean] = js.undefined
}

object AnonCriticalBooleanOptional {
  @scala.inline
  def apply(critical: js.UndefOr[Boolean] = js.undefined): AnonCriticalBooleanOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCriticalBooleanOptional]
  }
}

