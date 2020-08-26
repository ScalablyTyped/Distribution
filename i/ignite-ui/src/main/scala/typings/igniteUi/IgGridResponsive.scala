package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResponsive
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * When windowWidthToRenderVertically is null, determine minimal widths columns can take before
    * forcing vertical rendering for the grid
    *
    */
  var allowedColumnWidthPerType: js.UndefOr[IgGridResponsiveAllowedColumnWidthPerType] = js.native
  /**
    * A list of column settings that specifies how columns will react based on the environment the grid is run on.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResponsiveColumnSetting]] = js.native
  /**
    * Enable or disable the responsive vertical rendering for the grid.
    *
    */
  var enableVerticalRendering: js.UndefOr[Boolean] = js.native
  /**
    * If this option is set to true the widget will ensure the grid's width is always set to 100%.
    *
    */
  var forceResponsiveGridWidth: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * The width of the properties column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var propertiesColumnWidth: js.UndefOr[String | Double] = js.native
  /**
    * If this option is set to true an igResponsiveContainer widget will be attached to the igGrid control which will notify the feature when changes in the width of the container occur.
    *
    */
  var reactOnContainerWidthChanges: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after a hiding operation is executed on the collection of columns.
    */
  var responsiveColumnHidden: js.UndefOr[ResponsiveColumnHiddenEvent] = js.native
  /**
    * Event fired before a hiding operation is executed on a collection of columns.
    */
  var responsiveColumnHiding: js.UndefOr[ResponsiveColumnHidingEvent] = js.native
  /**
    * Event fired before a showing operation is executed on a collection of columns.
    */
  var responsiveColumnShowing: js.UndefOr[ResponsiveColumnShowingEvent] = js.native
  /**
    * Event fired after a showing operation is executed on the collection of columns.
    */
  var responsiveColumnShown: js.UndefOr[ResponsiveColumnShownEvent] = js.native
  /**
    * Event which is fired when the widget detects an environment change.
    */
  var responsiveModeChanged: js.UndefOr[ResponsiveModeChangedEvent] = js.native
  /**
    * The recognized types of environments and their configuration.
    *
    */
  var responsiveModes: js.UndefOr[js.Any] = js.native
  /**
    * The amount of pixels the window needs to resize with for the grid to respond.
    *
    */
  var responsiveSensitivity: js.UndefOr[Double] = js.native
  /**
    * Specifies a template to render a record with in a list-view style layout per mode.
    *
    */
  var singleColumnTemplate: js.UndefOr[js.Any] = js.native
  /**
    * The width of the values column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var valuesColumnWidth: js.UndefOr[String | Double] = js.native
  /**
    * The window's width under which the grid will render its contents vertically.
    *
    *
    * Valid values:
    * "string" The width in a (px) string
    * "number" The width as a number
    * "null" The grid will determine when to render this mode automatically.
    */
  var windowWidthToRenderVertically: js.UndefOr[String | Double] = js.native
}

object IgGridResponsive {
  @scala.inline
  def apply(): IgGridResponsive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsive]
  }
  @scala.inline
  implicit class IgGridResponsiveOps[Self <: IgGridResponsive] (val x: Self) extends AnyVal {
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
    def setAllowedColumnWidthPerType(value: IgGridResponsiveAllowedColumnWidthPerType): Self = this.set("allowedColumnWidthPerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedColumnWidthPerType: Self = this.set("allowedColumnWidthPerType", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridResponsiveColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridResponsiveColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setEnableVerticalRendering(value: Boolean): Self = this.set("enableVerticalRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVerticalRendering: Self = this.set("enableVerticalRendering", js.undefined)
    @scala.inline
    def setForceResponsiveGridWidth(value: Boolean): Self = this.set("forceResponsiveGridWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceResponsiveGridWidth: Self = this.set("forceResponsiveGridWidth", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setPropertiesColumnWidth(value: String | Double): Self = this.set("propertiesColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertiesColumnWidth: Self = this.set("propertiesColumnWidth", js.undefined)
    @scala.inline
    def setReactOnContainerWidthChanges(value: Boolean): Self = this.set("reactOnContainerWidthChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactOnContainerWidthChanges: Self = this.set("reactOnContainerWidthChanges", js.undefined)
    @scala.inline
    def setResponsiveColumnHidden(value: (/* event */ Event, /* ui */ ResponsiveColumnHiddenEventUIParam) => Unit): Self = this.set("responsiveColumnHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponsiveColumnHidden: Self = this.set("responsiveColumnHidden", js.undefined)
    @scala.inline
    def setResponsiveColumnHiding(value: (/* event */ Event, /* ui */ ResponsiveColumnHidingEventUIParam) => Unit): Self = this.set("responsiveColumnHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponsiveColumnHiding: Self = this.set("responsiveColumnHiding", js.undefined)
    @scala.inline
    def setResponsiveColumnShowing(value: (/* event */ Event, /* ui */ ResponsiveColumnShowingEventUIParam) => Unit): Self = this.set("responsiveColumnShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponsiveColumnShowing: Self = this.set("responsiveColumnShowing", js.undefined)
    @scala.inline
    def setResponsiveColumnShown(value: (/* event */ Event, /* ui */ ResponsiveColumnShownEventUIParam) => Unit): Self = this.set("responsiveColumnShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponsiveColumnShown: Self = this.set("responsiveColumnShown", js.undefined)
    @scala.inline
    def setResponsiveModeChanged(value: (/* event */ Event, /* ui */ ResponsiveModeChangedEventUIParam) => Unit): Self = this.set("responsiveModeChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponsiveModeChanged: Self = this.set("responsiveModeChanged", js.undefined)
    @scala.inline
    def setResponsiveModes(value: js.Any): Self = this.set("responsiveModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveModes: Self = this.set("responsiveModes", js.undefined)
    @scala.inline
    def setResponsiveSensitivity(value: Double): Self = this.set("responsiveSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveSensitivity: Self = this.set("responsiveSensitivity", js.undefined)
    @scala.inline
    def setSingleColumnTemplate(value: js.Any): Self = this.set("singleColumnTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleColumnTemplate: Self = this.set("singleColumnTemplate", js.undefined)
    @scala.inline
    def setValuesColumnWidth(value: String | Double): Self = this.set("valuesColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuesColumnWidth: Self = this.set("valuesColumnWidth", js.undefined)
    @scala.inline
    def setWindowWidthToRenderVertically(value: String | Double): Self = this.set("windowWidthToRenderVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowWidthToRenderVertically: Self = this.set("windowWidthToRenderVertically", js.undefined)
  }
  
}

