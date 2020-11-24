package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineOptions extends js.Object {
  
  var actionClick: js.UndefOr[js.Function1[/* e */ TimelineActionClickEvent, Unit]] = js.native
  
  var alternatingMode: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ TimelineChangeEvent, Unit]] = js.native
  
  var collapse: js.UndefOr[js.Function1[/* e */ TimelineCollapseEvent, Unit]] = js.native
  
  var collapsibleEvents: js.UndefOr[Boolean] = js.native
  
  var dataActionsField: js.UndefOr[String] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TimelineDataBoundEvent, Unit]] = js.native
  
  var dataDateField: js.UndefOr[String] = js.native
  
  var dataDescriptionField: js.UndefOr[String] = js.native
  
  var dataImagesField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  
  var dataSubTitleField: js.UndefOr[String] = js.native
  
  var dataTitleField: js.UndefOr[String] = js.native
  
  var dateformat: js.UndefOr[String] = js.native
  
  var eventHeight: js.UndefOr[Double] = js.native
  
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  
  var eventWidth: js.UndefOr[Double] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ TimelineExpandEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ TimelineNavigateEvent, Unit]] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var showDateLabels: js.UndefOr[Boolean] = js.native
}
object TimelineOptions {
  
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    
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
    def setActionClick(value: /* e */ TimelineActionClickEvent => Unit): Self = this.set("actionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionClick: Self = this.set("actionClick", js.undefined)
    
    @scala.inline
    def setAlternatingMode(value: Boolean): Self = this.set("alternatingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatingMode: Self = this.set("alternatingMode", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ TimelineChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ TimelineCollapseEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCollapsibleEvents(value: Boolean): Self = this.set("collapsibleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsibleEvents: Self = this.set("collapsibleEvents", js.undefined)
    
    @scala.inline
    def setDataActionsField(value: String): Self = this.set("dataActionsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataActionsField: Self = this.set("dataActionsField", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TimelineDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataDateField(value: String): Self = this.set("dataDateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDateField: Self = this.set("dataDateField", js.undefined)
    
    @scala.inline
    def setDataDescriptionField(value: String): Self = this.set("dataDescriptionField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDescriptionField: Self = this.set("dataDescriptionField", js.undefined)
    
    @scala.inline
    def setDataImagesField(value: String): Self = this.set("dataImagesField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataImagesField: Self = this.set("dataImagesField", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSubTitleField(value: String): Self = this.set("dataSubTitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSubTitleField: Self = this.set("dataSubTitleField", js.undefined)
    
    @scala.inline
    def setDataTitleField(value: String): Self = this.set("dataTitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTitleField: Self = this.set("dataTitleField", js.undefined)
    
    @scala.inline
    def setDateformat(value: String): Self = this.set("dateformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateformat: Self = this.set("dateformat", js.undefined)
    
    @scala.inline
    def setEventHeight(value: Double): Self = this.set("eventHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventHeight: Self = this.set("eventHeight", js.undefined)
    
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = this.set("eventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTemplate: Self = this.set("eventTemplate", js.undefined)
    
    @scala.inline
    def setEventWidth(value: Double): Self = this.set("eventWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventWidth: Self = this.set("eventWidth", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ TimelineExpandEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ TimelineNavigateEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setShowDateLabels(value: Boolean): Self = this.set("showDateLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDateLabels: Self = this.set("showDateLabels", js.undefined)
  }
}
