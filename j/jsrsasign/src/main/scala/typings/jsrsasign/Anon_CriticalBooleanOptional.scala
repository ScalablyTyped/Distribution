package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CriticalBooleanOptional extends js.Object {
  var critical: js.UndefOr[Boolean] = js.undefined
}

object Anon_CriticalBooleanOptional {
  @scala.inline
  def apply(critical: js.UndefOr[Boolean] = js.undefined): Anon_CriticalBooleanOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CriticalBooleanOptional]
  }
}

