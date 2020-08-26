package typings.googleapis.v21Mod.contentV21

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
  def apply(): SchemaShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedHolidaysResponse]
  }
  @scala.inline
  implicit class SchemaShippingsettingsGetSupportedHolidaysResponseOps[Self <: SchemaShippingsettingsGetSupportedHolidaysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHolidaysVarargs(value: SchemaHolidaysHoliday*): Self = this.set("holidays", js.Array(value :_*))
    @scala.inline
    def setHolidays(value: js.Array[SchemaHolidaysHoliday]): Self = this.set("holidays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolidays: Self = this.set("holidays", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

