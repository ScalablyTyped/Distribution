package typings.haversine.anon

import typings.haversine.haversineStrings.`[latCommalon]`
import typings.haversine.haversineStrings.`[lonCommalat]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: `[latCommalon]` | `[lonCommalat]`
}

object Format {
  @scala.inline
  def apply(format: `[latCommalon]` | `[lonCommalat]`): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

