package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgTreeGridSortingMutableBuilder[Self <: IgTreeGridSorting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplySortedColumnCss(value: Boolean): Self = StObject.set(x, "applySortedColumnCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplySortedColumnCssUndefined: Self = StObject.set(x, "applySortedColumnCss", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridSortingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridSortingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setColumnSorted(value: (/* event */ Event, /* ui */ ColumnSortedEventUIParam) => Unit): Self = StObject.set(x, "columnSorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnSortedUndefined: Self = StObject.set(x, "columnSorted", js.undefined)
    
    @scala.inline
    def setColumnSorting(value: (/* event */ Event, /* ui */ ColumnSortingEventUIParam) => Unit): Self = StObject.set(x, "columnSorting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
    
    @scala.inline
    def setCustomSortFunction(value: js.Function): Self = StObject.set(x, "customSortFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSortFunctionUndefined: Self = StObject.set(x, "customSortFunction", js.undefined)
    
    @scala.inline
    def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortAsc(value: String): Self = StObject.set(x, "featureChooserSortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserSortAscUndefined: Self = StObject.set(x, "featureChooserSortAsc", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortDesc(value: String): Self = StObject.set(x, "featureChooserSortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserSortDescUndefined: Self = StObject.set(x, "featureChooserSortDesc", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    @scala.inline
    def setFirstSortDirection(value: String): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
    
    @scala.inline
    def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridSortingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModalDialogAnimationDuration(value: Double): Self = StObject.set(x, "modalDialogAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogAnimationDurationUndefined: Self = StObject.set(x, "modalDialogAnimationDuration", js.undefined)
    
    @scala.inline
    def setModalDialogButtonApplyClick(value: (/* event */ Event, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonApplyClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogButtonApplyClickUndefined: Self = StObject.set(x, "modalDialogButtonApplyClick", js.undefined)
    
    @scala.inline
    def setModalDialogButtonApplyText(value: String): Self = StObject.set(x, "modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonApplyTextUndefined: Self = StObject.set(x, "modalDialogButtonApplyText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonCancelText(value: String): Self = StObject.set(x, "modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonCancelTextUndefined: Self = StObject.set(x, "modalDialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonResetClick(value: (/* event */ Event, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonResetClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogButtonResetClickUndefined: Self = StObject.set(x, "modalDialogButtonResetClick", js.undefined)
    
    @scala.inline
    def setModalDialogButtonUnsortClick(value: (/* event */ Event, /* ui */ ModalDialogButtonUnsortClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonUnsortClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogButtonUnsortClickUndefined: Self = StObject.set(x, "modalDialogButtonUnsortClick", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonAscUndefined: Self = StObject.set(x, "modalDialogCaptionButtonAsc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonDescUndefined: Self = StObject.set(x, "modalDialogCaptionButtonDesc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonUnsort(value: String): Self = StObject.set(x, "modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonUnsortUndefined: Self = StObject.set(x, "modalDialogCaptionButtonUnsort", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = StObject.set(x, "modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionTextUndefined: Self = StObject.set(x, "modalDialogCaptionText", js.undefined)
    
    @scala.inline
    def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogClosedUndefined: Self = StObject.set(x, "modalDialogClosed", js.undefined)
    
    @scala.inline
    def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogClosingUndefined: Self = StObject.set(x, "modalDialogClosing", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogContentsRenderedUndefined: Self = StObject.set(x, "modalDialogContentsRendered", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogContentsRenderingUndefined: Self = StObject.set(x, "modalDialogContentsRendering", js.undefined)
    
    @scala.inline
    def setModalDialogHeight(value: String | Double): Self = StObject.set(x, "modalDialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogHeightUndefined: Self = StObject.set(x, "modalDialogHeight", js.undefined)
    
    @scala.inline
    def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogMovingUndefined: Self = StObject.set(x, "modalDialogMoving", js.undefined)
    
    @scala.inline
    def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogOpenedUndefined: Self = StObject.set(x, "modalDialogOpened", js.undefined)
    
    @scala.inline
    def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogOpeningUndefined: Self = StObject.set(x, "modalDialogOpening", js.undefined)
    
    @scala.inline
    def setModalDialogResetButtonLabel(value: String): Self = StObject.set(x, "modalDialogResetButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogResetButtonLabelUndefined: Self = StObject.set(x, "modalDialogResetButtonLabel", js.undefined)
    
    @scala.inline
    def setModalDialogSortByButtonText(value: String): Self = StObject.set(x, "modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogSortByButtonTextUndefined: Self = StObject.set(x, "modalDialogSortByButtonText", js.undefined)
    
    @scala.inline
    def setModalDialogSortClick(value: (/* event */ Event, /* ui */ ModalDialogSortClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogSortClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogSortClickUndefined: Self = StObject.set(x, "modalDialogSortClick", js.undefined)
    
    @scala.inline
    def setModalDialogSortOnClick(value: Boolean): Self = StObject.set(x, "modalDialogSortOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogSortOnClickUndefined: Self = StObject.set(x, "modalDialogSortOnClick", js.undefined)
    
    @scala.inline
    def setModalDialogSortingChanged(value: (/* event */ Event, /* ui */ ModalDialogSortingChangedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogSortingChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogSortingChangedUndefined: Self = StObject.set(x, "modalDialogSortingChanged", js.undefined)
    
    @scala.inline
    def setModalDialogWidth(value: String | Double): Self = StObject.set(x, "modalDialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogWidthUndefined: Self = StObject.set(x, "modalDialogWidth", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setSortUrlKey(value: String): Self = StObject.set(x, "sortUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUrlKeyAscValue(value: String): Self = StObject.set(x, "sortUrlKeyAscValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUrlKeyAscValueUndefined: Self = StObject.set(x, "sortUrlKeyAscValue", js.undefined)
    
    @scala.inline
    def setSortUrlKeyDescValue(value: String): Self = StObject.set(x, "sortUrlKeyDescValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUrlKeyDescValueUndefined: Self = StObject.set(x, "sortUrlKeyDescValue", js.undefined)
    
    @scala.inline
    def setSortUrlKeyUndefined: Self = StObject.set(x, "sortUrlKey", js.undefined)
    
    @scala.inline
    def setSortingDialogContainment(value: String): Self = StObject.set(x, "sortingDialogContainment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingDialogContainmentUndefined: Self = StObject.set(x, "sortingDialogContainment", js.undefined)
    
    @scala.inline
    def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnsortedColumnTooltip(value: String): Self = StObject.set(x, "unsortedColumnTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsortedColumnTooltipUndefined: Self = StObject.set(x, "unsortedColumnTooltip", js.undefined)
  }
}
