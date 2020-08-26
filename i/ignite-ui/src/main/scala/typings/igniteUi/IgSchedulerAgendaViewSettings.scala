package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerAgendaViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the number of days shown in AgendaView mode.
    *
    */
  var dateRangeInterval: js.UndefOr[Double] = js.native
}

object IgSchedulerAgendaViewSettings {
  @scala.inline
  def apply(): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerAgendaViewSettingsOps[Self <: IgSchedulerAgendaViewSettings] (val x: Self) extends AnyVal {
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
    def setDateRangeInterval(value: Double): Self = this.set("dateRangeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRangeInterval: Self = this.set("dateRangeInterval", js.undefined)
  }
  
}

