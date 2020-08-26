package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridSorting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables/disables special styling for sorted columns. If false, sorted column cells will not have any special sort-related styling.
    *
    */
  var applySortedColumnCss: js.UndefOr[Boolean] = js.native
  /**
    * Enables or disables the case sensitivity of the sorting. Works only for [local](ui.iggridsorting#options:type) sorting.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A list of custom column settings that specify custom sorting settings for a specific column (whether sorting is enabled / disabled, default sort direction, first sort direction, etc.).
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridSortingColumnSetting]] = js.native
  /**
    * Event fired after the column has already been sorted and data - re-rendered.
    */
  var columnSorted: js.UndefOr[ColumnSortedEvent] = js.native
  /**
    * Event fired before sorting is invoked for a certain column.
    * Return false in order to cancel column sorting.
    */
  var columnSorting: js.UndefOr[ColumnSortingEvent] = js.native
  /**
    * Custom sort function(or name of the function as a string) accepting three parameters - the data to be sorted, an array of data source field definitions, and the direction to sort with (optional). The function should return the sorted data array.
    *
    */
  var customSortFunction: js.UndefOr[js.Function] = js.native
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
    * Use option [locale.featureChooserSortAsc](ui.iggridsorting#options:locale.featureChooserSortAsc).
    */
  var featureChooserSortAsc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
    * Use option [locale.featureChooserSortDesc](ui.iggridsorting#options:locale.featureChooserSortDesc).
    */
  var featureChooserSortDesc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text of the feature chooser sorting button.
    * Use option [locale.featureChooserText](ui.iggridsorting#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
    * Specifies which direction to use on the first click / keydown, if the column is sorted for the first time.
    *
    *
    * Valid values:
    * "ascending" The first sort of the column data will be in ascending order.
    * "descending" The first sort of the column data will be in descending order.
    */
  var firstSortDirection: js.UndefOr[String] = js.native
  /**
    * Specifies from which data bound level to be applied sorting - 0 is the first level
    *
    */
  var fromLevel: js.UndefOr[Double] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[IgGridSortingLocale] = js.native
  /**
    * Specifies time of milliseconds for animation duration to show/hide modal dialog.
    *
    */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Event fired when button Apply in modal dialog is clicked
    */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which apply changes in modal dialog.
    * Use option [locale.modalDialogButtonApplyText](ui.iggridsorting#options:locale.modalDialogButtonApplyText).
    */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
    * Use option [locale.modalDialogButtonCancelText](ui.iggridsorting#options:locale.modalDialogButtonCancelText).
    */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
    * Event fired when the button to reset sorting is clicked.
    */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.native
  /**
    * Event fired when button to unsort column is clicked in modal dialog
    */
  var modalDialogButtonUnsortClick: js.UndefOr[ModalDialogButtonUnsortClickEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each ascending sorted column in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonAsc](ui.iggridsorting#options:locale.modalDialogCaptionButtonAsc).
    */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each descending sorted column in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonDesc](ui.iggridsorting#options:locale.modalDialogCaptionButtonDesc).
    */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for unsort button in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonUnsort](ui.iggridsorting#options:locale.modalDialogCaptionButtonUnsort).
    */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for multiple sorting dialog.
    * Use option [locale.modalDialogCaptionText](ui.iggridsorting#options:locale.modalDialogCaptionText).
    */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
    * Event fired after the modal dialog has been closed.
    */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  /**
    * Event fired before the modal dialog is closed.
    */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  /**
    * Event fired after the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  /**
    * Event fired before the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  /**
    * Specifies height of multiple sorting dialog.
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set in pixels as a number.
    */
  var modalDialogHeight: js.UndefOr[String | Double] = js.native
  /**
    * Event fired every time the modal dialog changes its position.
    */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  /**
    * Event fired after the modal dialog is already opened.
    */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  /**
    * Event fired before the modal dialog is opened.
    */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies reset button text in multiple sorting dialog.
    * Use option [locale.modalDialogResetButton](ui.iggridsorting#options:locale.modalDialogResetButton).
    */
  var modalDialogResetButtonLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies sortby button text for each unsorted column in multiple sorting dialog.
    * Use option [locale.modalDialogSortByButtonText](ui.iggridsorting#options:locale.modalDialogSortByButtonText).
    */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.native
  /**
    * Event fired when column(which is not sorted) is clicked to be sorted in modal dialog
    */
  var modalDialogSortClick: js.UndefOr[ModalDialogSortClickEvent] = js.native
  /**
    * Specifies whether sorting to be applied immediately when click sort/unsort columns when using the multiple sorting dialog. When it is false Apply button shows and sorting is applied when the button is clicked.
    *
    */
  var modalDialogSortOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Event fired when sorting of column is changed in modal dialog. Column should be sorted
    */
  var modalDialogSortingChanged: js.UndefOr[ModalDialogSortingChangedEvent] = js.native
  /**
    * Specifies width of multiple sorting dialog.
    *
    *
    * Valid values:
    * "string" Specifies the width in pixels as a string ("300px").
    * "number" Specifies the width in pixels as a number (300)
    */
  var modalDialogWidth: js.UndefOr[String | Double] = js.native
  /**
    * Defines single column sorting or multiple column sorting.
    *
    *
    * Valid values:
    * "single" Only a single column can be sorted. Previously sorted columns will not preserve their sorting upon sorting a new column.
    * "multi" If enabled, previous sorted state for columns won't be cleared
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Enables/disables sorting persistence when the grid is rebound.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * URL param name which specifies how sorting expressions will be encoded in the URL. Uses OData conventions. ex: ?sort(col1)=asc
    *
    */
  var sortUrlKey: js.UndefOr[String] = js.native
  /**
    * URL param value for ascending type of sorting. Uses OData conventions. Example: ?sort(col1)=asc
    *
    */
  var sortUrlKeyAscValue: js.UndefOr[String] = js.native
  /**
    * URL param value for descending type of sorting. Uses OData conventions. Example: ?sort(col1)=desc
    *
    */
  var sortUrlKeyDescValue: js.UndefOr[String] = js.native
  /**
    * Controls containment behavior of multiple sorting dialog.
    *
    * owner  The multi sorting dialog will be draggable only in the grid area
    * window  The multi sorting dialog will be draggable in the whole window area
    */
  var sortingDialogContainment: js.UndefOr[String] = js.native
  /**
    * Specifies to which data bound level to be applied sorting - if -1 sorting should be applied to the last data bound level
    *
    */
  var toLevel: js.UndefOr[Double] = js.native
  /**
    * Defines local or remote sorting operations.
    *
    *
    * Valid values:
    * "remote" Sorting is performed remotely as a server-side operation.
    * "local" Sorting is performed locally by the [$.ig.DataSource](ig.datasource) component.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom unsorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
    * Use option [locale.unsortedColumnTooltip](ui.iggridsorting#options:locale.unsortedColumnTooltip).
    */
  var unsortedColumnTooltip: js.UndefOr[String] = js.native
}

object IgTreeGridSorting {
  @scala.inline
  def apply(): IgTreeGridSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridSorting]
  }
  @scala.inline
  implicit class IgTreeGridSortingOps[Self <: IgTreeGridSorting] (val x: Self) extends AnyVal {
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
    def setApplySortedColumnCss(value: Boolean): Self = this.set("applySortedColumnCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplySortedColumnCss: Self = this.set("applySortedColumnCss", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridSortingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridSortingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setColumnSorted(value: (/* event */ Event, /* ui */ ColumnSortedEventUIParam) => Unit): Self = this.set("columnSorted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnSorted: Self = this.set("columnSorted", js.undefined)
    @scala.inline
    def setColumnSorting(value: (/* event */ Event, /* ui */ ColumnSortingEventUIParam) => Unit): Self = this.set("columnSorting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnSorting: Self = this.set("columnSorting", js.undefined)
    @scala.inline
    def setCustomSortFunction(value: js.Function): Self = this.set("customSortFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSortFunction: Self = this.set("customSortFunction", js.undefined)
    @scala.inline
    def setDialogWidget(value: String): Self = this.set("dialogWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogWidget: Self = this.set("dialogWidget", js.undefined)
    @scala.inline
    def setFeatureChooserSortAsc(value: String): Self = this.set("featureChooserSortAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserSortAsc: Self = this.set("featureChooserSortAsc", js.undefined)
    @scala.inline
    def setFeatureChooserSortDesc(value: String): Self = this.set("featureChooserSortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserSortDesc: Self = this.set("featureChooserSortDesc", js.undefined)
    @scala.inline
    def setFeatureChooserText(value: String): Self = this.set("featureChooserText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserText: Self = this.set("featureChooserText", js.undefined)
    @scala.inline
    def setFirstSortDirection(value: String): Self = this.set("firstSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSortDirection: Self = this.set("firstSortDirection", js.undefined)
    @scala.inline
    def setFromLevel(value: Double): Self = this.set("fromLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromLevel: Self = this.set("fromLevel", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLocale(value: IgGridSortingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setModalDialogAnimationDuration(value: Double): Self = this.set("modalDialogAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogAnimationDuration: Self = this.set("modalDialogAnimationDuration", js.undefined)
    @scala.inline
    def setModalDialogButtonApplyClick(value: (/* event */ Event, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = this.set("modalDialogButtonApplyClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogButtonApplyClick: Self = this.set("modalDialogButtonApplyClick", js.undefined)
    @scala.inline
    def setModalDialogButtonApplyText(value: String): Self = this.set("modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogButtonApplyText: Self = this.set("modalDialogButtonApplyText", js.undefined)
    @scala.inline
    def setModalDialogButtonCancelText(value: String): Self = this.set("modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogButtonCancelText: Self = this.set("modalDialogButtonCancelText", js.undefined)
    @scala.inline
    def setModalDialogButtonResetClick(value: (/* event */ Event, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = this.set("modalDialogButtonResetClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogButtonResetClick: Self = this.set("modalDialogButtonResetClick", js.undefined)
    @scala.inline
    def setModalDialogButtonUnsortClick(value: (/* event */ Event, /* ui */ ModalDialogButtonUnsortClickEventUIParam) => Unit): Self = this.set("modalDialogButtonUnsortClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogButtonUnsortClick: Self = this.set("modalDialogButtonUnsortClick", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonAsc(value: String): Self = this.set("modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonAsc: Self = this.set("modalDialogCaptionButtonAsc", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonDesc(value: String): Self = this.set("modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonDesc: Self = this.set("modalDialogCaptionButtonDesc", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonUnsort(value: String): Self = this.set("modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonUnsort: Self = this.set("modalDialogCaptionButtonUnsort", js.undefined)
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = this.set("modalDialogCaptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionText: Self = this.set("modalDialogCaptionText", js.undefined)
    @scala.inline
    def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = this.set("modalDialogClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogClosed: Self = this.set("modalDialogClosed", js.undefined)
    @scala.inline
    def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = this.set("modalDialogClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogClosing: Self = this.set("modalDialogClosing", js.undefined)
    @scala.inline
    def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = this.set("modalDialogContentsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogContentsRendered: Self = this.set("modalDialogContentsRendered", js.undefined)
    @scala.inline
    def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = this.set("modalDialogContentsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogContentsRendering: Self = this.set("modalDialogContentsRendering", js.undefined)
    @scala.inline
    def setModalDialogHeight(value: String | Double): Self = this.set("modalDialogHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogHeight: Self = this.set("modalDialogHeight", js.undefined)
    @scala.inline
    def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = this.set("modalDialogMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogMoving: Self = this.set("modalDialogMoving", js.undefined)
    @scala.inline
    def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = this.set("modalDialogOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogOpened: Self = this.set("modalDialogOpened", js.undefined)
    @scala.inline
    def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = this.set("modalDialogOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogOpening: Self = this.set("modalDialogOpening", js.undefined)
    @scala.inline
    def setModalDialogResetButtonLabel(value: String): Self = this.set("modalDialogResetButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogResetButtonLabel: Self = this.set("modalDialogResetButtonLabel", js.undefined)
    @scala.inline
    def setModalDialogSortByButtonText(value: String): Self = this.set("modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogSortByButtonText: Self = this.set("modalDialogSortByButtonText", js.undefined)
    @scala.inline
    def setModalDialogSortClick(value: (/* event */ Event, /* ui */ ModalDialogSortClickEventUIParam) => Unit): Self = this.set("modalDialogSortClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogSortClick: Self = this.set("modalDialogSortClick", js.undefined)
    @scala.inline
    def setModalDialogSortOnClick(value: Boolean): Self = this.set("modalDialogSortOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogSortOnClick: Self = this.set("modalDialogSortOnClick", js.undefined)
    @scala.inline
    def setModalDialogSortingChanged(value: (/* event */ Event, /* ui */ ModalDialogSortingChangedEventUIParam) => Unit): Self = this.set("modalDialogSortingChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalDialogSortingChanged: Self = this.set("modalDialogSortingChanged", js.undefined)
    @scala.inline
    def setModalDialogWidth(value: String | Double): Self = this.set("modalDialogWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogWidth: Self = this.set("modalDialogWidth", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setSortUrlKey(value: String): Self = this.set("sortUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlKey: Self = this.set("sortUrlKey", js.undefined)
    @scala.inline
    def setSortUrlKeyAscValue(value: String): Self = this.set("sortUrlKeyAscValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlKeyAscValue: Self = this.set("sortUrlKeyAscValue", js.undefined)
    @scala.inline
    def setSortUrlKeyDescValue(value: String): Self = this.set("sortUrlKeyDescValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlKeyDescValue: Self = this.set("sortUrlKeyDescValue", js.undefined)
    @scala.inline
    def setSortingDialogContainment(value: String): Self = this.set("sortingDialogContainment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingDialogContainment: Self = this.set("sortingDialogContainment", js.undefined)
    @scala.inline
    def setToLevel(value: Double): Self = this.set("toLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLevel: Self = this.set("toLevel", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnsortedColumnTooltip(value: String): Self = this.set("unsortedColumnTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsortedColumnTooltip: Self = this.set("unsortedColumnTooltip", js.undefined)
  }
  
}

