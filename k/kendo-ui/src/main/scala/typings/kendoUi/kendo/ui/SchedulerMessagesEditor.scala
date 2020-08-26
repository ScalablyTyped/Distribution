package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesEditor extends js.Object {
  var allDayEvent: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var editorTitle: js.UndefOr[String] = js.native
  var end: js.UndefOr[String] = js.native
  var endTimezone: js.UndefOr[String] = js.native
  var repeat: js.UndefOr[String] = js.native
  var separateTimezones: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
  var startTimezone: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var timezoneEditorButton: js.UndefOr[String] = js.native
  var timezoneEditorTitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchedulerMessagesEditor {
  @scala.inline
  def apply(): SchedulerMessagesEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesEditor]
  }
  @scala.inline
  implicit class SchedulerMessagesEditorOps[Self <: SchedulerMessagesEditor] (val x: Self) extends AnyVal {
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
    def setAllDayEvent(value: String): Self = this.set("allDayEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDayEvent: Self = this.set("allDayEvent", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEditorTitle(value: String): Self = this.set("editorTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorTitle: Self = this.set("editorTitle", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndTimezone(value: String): Self = this.set("endTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimezone: Self = this.set("endTimezone", js.undefined)
    @scala.inline
    def setRepeat(value: String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setSeparateTimezones(value: String): Self = this.set("separateTimezones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparateTimezones: Self = this.set("separateTimezones", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartTimezone(value: String): Self = this.set("startTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimezone: Self = this.set("startTimezone", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setTimezoneEditorButton(value: String): Self = this.set("timezoneEditorButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneEditorButton: Self = this.set("timezoneEditorButton", js.undefined)
    @scala.inline
    def setTimezoneEditorTitle(value: String): Self = this.set("timezoneEditorTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneEditorTitle: Self = this.set("timezoneEditorTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

