package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToISODateOptions extends js.Object {
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.undefined
}

object ToISODateOptions {
  @scala.inline
  def apply(format: ToISOFormat = null): ToISODateOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToISODateOptions]
  }
}

