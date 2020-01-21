package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[SchemaHolidaysHoliday]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedHolidaysResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(holidays: js.Array[SchemaHolidaysHoliday] = null, kind: String = null): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
}

