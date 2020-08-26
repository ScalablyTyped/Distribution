package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTimePickerItemsDelta
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var hours: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
}

object IgTimePickerItemsDelta {
  @scala.inline
  def apply(): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
  @scala.inline
  implicit class IgTimePickerItemsDeltaOps[Self <: IgTimePickerItemsDelta] (val x: Self) extends AnyVal {
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
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
  }
  
}

