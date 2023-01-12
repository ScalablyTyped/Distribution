package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSorting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Enables/disables special styling for sorted columns. If false, sorted column cells will not have any special sort-related styling.
    *
    */
  var applySortedColumnCss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables or disables the case sensitivity of the sorting. Works only for [local](ui.iggridsorting#options:type) sorting.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of custom column settings that specify custom sorting settings for a specific column (whether sorting is enabled / disabled, default sort direction, first sort direction, etc.).
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridSortingColumnSetting]] = js.undefined
  
  /**
    * Event fired after the column has already been sorted and data - re-rendered.
    */
  var columnSorted: js.UndefOr[ColumnSortedEvent] = js.undefined
  
  /**
    * Event fired before sorting is invoked for a certain column.
    * Return false in order to cancel column sorting.
    */
  var columnSorting: js.UndefOr[ColumnSortingEvent] = js.undefined
  
  /**
    * Custom sort function(or name of the function as a string) accepting three parameters - the data to be sorted, an array of data source field definitions, and the direction to sort with (optional). The function should return the sorted data array.
    *
    */
  var customSortFunction: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
    * Use option [locale.featureChooserSortAsc](ui.iggridsorting#options:locale.featureChooserSortAsc).
    */
  var featureChooserSortAsc: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
    * Use option [locale.featureChooserSortDesc](ui.iggridsorting#options:locale.featureChooserSortDesc).
    */
  var featureChooserSortDesc: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text of the feature chooser sorting button.
    * Use option [locale.featureChooserText](ui.iggridsorting#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which direction to use on the first click / keydown, if the column is sorted for the first time.
    *
    *
    * Valid values:
    * "ascending" The first sort of the column data will be in ascending order.
    * "descending" The first sort of the column data will be in descending order.
    */
  var firstSortDirection: js.UndefOr[String] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    *
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgGridSortingLocale] = js.undefined
  
  /**
    * Specifies time of milliseconds for animation duration to show/hide modal dialog.
    *
    */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Event fired when button Apply in modal dialog is clicked
    */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which apply changes in modal dialog.
    * Use option [locale.modalDialogButtonApplyText](ui.iggridsorting#options:locale.modalDialogButtonApplyText).
    */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
    * Use option [locale.modalDialogButtonCancelText](ui.iggridsorting#options:locale.modalDialogButtonCancelText).
    */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired when the button to reset sorting is clicked.
    */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.undefined
  
  /**
    * Event fired when button to unsort column is clicked in modal dialog
    */
  var modalDialogButtonUnsortClick: js.UndefOr[ModalDialogButtonUnsortClickEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each ascending sorted column in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonAsc](ui.iggridsorting#options:locale.modalDialogCaptionButtonAsc).
    */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each descending sorted column in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonDesc](ui.iggridsorting#options:locale.modalDialogCaptionButtonDesc).
    */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for unsort button in multiple sorting dialog.
    * Use option [locale.modalDialogCaptionButtonUnsort](ui.iggridsorting#options:locale.modalDialogCaptionButtonUnsort).
    */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for multiple sorting dialog.
    * Use option [locale.modalDialogCaptionText](ui.iggridsorting#options:locale.modalDialogCaptionText).
    */
  var modalDialogCaptionText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the modal dialog has been closed.
    */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  
  /**
    * Event fired before the modal dialog is closed.
    */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  
  /**
    * Event fired after the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  
  /**
    * Event fired before the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  
  /**
    * Specifies height of multiple sorting dialog.
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set in pixels as a number.
    */
  var modalDialogHeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event fired every time the modal dialog changes its position.
    */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  
  /**
    * Event fired after the modal dialog is already opened.
    */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  
  /**
    * Event fired before the modal dialog is opened.
    */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies reset button text in multiple sorting dialog.
    * Use option [locale.modalDialogResetButton](ui.iggridsorting#options:locale.modalDialogResetButton).
    */
  var modalDialogResetButtonLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies sortby button text for each unsorted column in multiple sorting dialog.
    * Use option [locale.modalDialogSortByButtonText](ui.iggridsorting#options:locale.modalDialogSortByButtonText).
    */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired when column(which is not sorted) is clicked to be sorted in modal dialog
    */
  var modalDialogSortClick: js.UndefOr[ModalDialogSortClickEvent] = js.undefined
  
  /**
    * Specifies whether sorting to be applied immediately when click sort/unsort columns when using the multiple sorting dialog. When it is false Apply button shows and sorting is applied when the button is clicked.
    *
    */
  var modalDialogSortOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired when sorting of column is changed in modal dialog. Column should be sorted
    */
  var modalDialogSortingChanged: js.UndefOr[ModalDialogSortingChangedEvent] = js.undefined
  
  /**
    * Specifies width of multiple sorting dialog.
    *
    *
    * Valid values:
    * "string" Specifies the width in pixels as a string ("300px").
    * "number" Specifies the width in pixels as a number (300)
    */
  var modalDialogWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Defines single column sorting or multiple column sorting.
    *
    *
    * Valid values:
    * "single" Only a single column can be sorted. Previously sorted columns will not preserve their sorting upon sorting a new column.
    * "multi" If enabled, previous sorted state for columns won't be cleared
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Enables/disables sorting persistence when the grid is rebound.
    *
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * URL param name which specifies how sorting expressions will be encoded in the URL. Uses OData conventions. ex: ?sort(col1)=asc
    *
    */
  var sortUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * URL param value for ascending type of sorting. Uses OData conventions. Example: ?sort(col1)=asc
    *
    */
  var sortUrlKeyAscValue: js.UndefOr[String] = js.undefined
  
  /**
    * URL param value for descending type of sorting. Uses OData conventions. Example: ?sort(col1)=desc
    *
    */
  var sortUrlKeyDescValue: js.UndefOr[String] = js.undefined
  
  /**
    * Controls containment behavior of multiple sorting dialog.
    *
    * owner  The multi sorting dialog will be draggable only in the grid area
    * window  The multi sorting dialog will be draggable in the whole window area
    */
  var sortingDialogContainment: js.UndefOr[String] = js.undefined
  
  /**
    * Defines local or remote sorting operations.
    *
    *
    * Valid values:
    * "remote" Sorting is performed remotely as a server-side operation.
    * "local" Sorting is performed locally by the [$.ig.DataSource](ig.datasource) component.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom unsorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
    * Use option [locale.unsortedColumnTooltip](ui.iggridsorting#options:locale.unsortedColumnTooltip).
    */
  var unsortedColumnTooltip: js.UndefOr[String] = js.undefined
}
object IgGridSorting {
  
  inline def apply(): IgGridSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSorting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridSorting] (val x: Self) extends AnyVal {
    
    inline def setApplySortedColumnCss(value: Boolean): Self = StObject.set(x, "applySortedColumnCss", value.asInstanceOf[js.Any])
    
    inline def setApplySortedColumnCssUndefined: Self = StObject.set(x, "applySortedColumnCss", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridSortingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridSortingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setColumnSorted(value: (/* event */ Event, /* ui */ ColumnSortedEventUIParam) => Unit): Self = StObject.set(x, "columnSorted", js.Any.fromFunction2(value))
    
    inline def setColumnSortedUndefined: Self = StObject.set(x, "columnSorted", js.undefined)
    
    inline def setColumnSorting(value: (/* event */ Event, /* ui */ ColumnSortingEventUIParam) => Unit): Self = StObject.set(x, "columnSorting", js.Any.fromFunction2(value))
    
    inline def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
    
    inline def setCustomSortFunction(value: js.Function): Self = StObject.set(x, "customSortFunction", value.asInstanceOf[js.Any])
    
    inline def setCustomSortFunctionUndefined: Self = StObject.set(x, "customSortFunction", js.undefined)
    
    inline def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    inline def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    inline def setFeatureChooserSortAsc(value: String): Self = StObject.set(x, "featureChooserSortAsc", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserSortAscUndefined: Self = StObject.set(x, "featureChooserSortAsc", js.undefined)
    
    inline def setFeatureChooserSortDesc(value: String): Self = StObject.set(x, "featureChooserSortDesc", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserSortDescUndefined: Self = StObject.set(x, "featureChooserSortDesc", js.undefined)
    
    inline def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    inline def setFirstSortDirection(value: String): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    inline def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: IgGridSortingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModalDialogAnimationDuration(value: Double): Self = StObject.set(x, "modalDialogAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setModalDialogAnimationDurationUndefined: Self = StObject.set(x, "modalDialogAnimationDuration", js.undefined)
    
    inline def setModalDialogButtonApplyClick(value: (/* event */ Event, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonApplyClick", js.Any.fromFunction2(value))
    
    inline def setModalDialogButtonApplyClickUndefined: Self = StObject.set(x, "modalDialogButtonApplyClick", js.undefined)
    
    inline def setModalDialogButtonApplyText(value: String): Self = StObject.set(x, "modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogButtonApplyTextUndefined: Self = StObject.set(x, "modalDialogButtonApplyText", js.undefined)
    
    inline def setModalDialogButtonCancelText(value: String): Self = StObject.set(x, "modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogButtonCancelTextUndefined: Self = StObject.set(x, "modalDialogButtonCancelText", js.undefined)
    
    inline def setModalDialogButtonResetClick(value: (/* event */ Event, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonResetClick", js.Any.fromFunction2(value))
    
    inline def setModalDialogButtonResetClickUndefined: Self = StObject.set(x, "modalDialogButtonResetClick", js.undefined)
    
    inline def setModalDialogButtonUnsortClick(value: (/* event */ Event, /* ui */ ModalDialogButtonUnsortClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonUnsortClick", js.Any.fromFunction2(value))
    
    inline def setModalDialogButtonUnsortClickUndefined: Self = StObject.set(x, "modalDialogButtonUnsortClick", js.undefined)
    
    inline def setModalDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonAscUndefined: Self = StObject.set(x, "modalDialogCaptionButtonAsc", js.undefined)
    
    inline def setModalDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonDescUndefined: Self = StObject.set(x, "modalDialogCaptionButtonDesc", js.undefined)
    
    inline def setModalDialogCaptionButtonUnsort(value: String): Self = StObject.set(x, "modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonUnsortUndefined: Self = StObject.set(x, "modalDialogCaptionButtonUnsort", js.undefined)
    
    inline def setModalDialogCaptionText(value: String): Self = StObject.set(x, "modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionTextUndefined: Self = StObject.set(x, "modalDialogCaptionText", js.undefined)
    
    inline def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosed", js.Any.fromFunction2(value))
    
    inline def setModalDialogClosedUndefined: Self = StObject.set(x, "modalDialogClosed", js.undefined)
    
    inline def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosing", js.Any.fromFunction2(value))
    
    inline def setModalDialogClosingUndefined: Self = StObject.set(x, "modalDialogClosing", js.undefined)
    
    inline def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendered", js.Any.fromFunction2(value))
    
    inline def setModalDialogContentsRenderedUndefined: Self = StObject.set(x, "modalDialogContentsRendered", js.undefined)
    
    inline def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendering", js.Any.fromFunction2(value))
    
    inline def setModalDialogContentsRenderingUndefined: Self = StObject.set(x, "modalDialogContentsRendering", js.undefined)
    
    inline def setModalDialogHeight(value: String | Double): Self = StObject.set(x, "modalDialogHeight", value.asInstanceOf[js.Any])
    
    inline def setModalDialogHeightUndefined: Self = StObject.set(x, "modalDialogHeight", js.undefined)
    
    inline def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogMoving", js.Any.fromFunction2(value))
    
    inline def setModalDialogMovingUndefined: Self = StObject.set(x, "modalDialogMoving", js.undefined)
    
    inline def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpened", js.Any.fromFunction2(value))
    
    inline def setModalDialogOpenedUndefined: Self = StObject.set(x, "modalDialogOpened", js.undefined)
    
    inline def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpening", js.Any.fromFunction2(value))
    
    inline def setModalDialogOpeningUndefined: Self = StObject.set(x, "modalDialogOpening", js.undefined)
    
    inline def setModalDialogResetButtonLabel(value: String): Self = StObject.set(x, "modalDialogResetButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setModalDialogResetButtonLabelUndefined: Self = StObject.set(x, "modalDialogResetButtonLabel", js.undefined)
    
    inline def setModalDialogSortByButtonText(value: String): Self = StObject.set(x, "modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogSortByButtonTextUndefined: Self = StObject.set(x, "modalDialogSortByButtonText", js.undefined)
    
    inline def setModalDialogSortClick(value: (/* event */ Event, /* ui */ ModalDialogSortClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogSortClick", js.Any.fromFunction2(value))
    
    inline def setModalDialogSortClickUndefined: Self = StObject.set(x, "modalDialogSortClick", js.undefined)
    
    inline def setModalDialogSortOnClick(value: Boolean): Self = StObject.set(x, "modalDialogSortOnClick", value.asInstanceOf[js.Any])
    
    inline def setModalDialogSortOnClickUndefined: Self = StObject.set(x, "modalDialogSortOnClick", js.undefined)
    
    inline def setModalDialogSortingChanged(value: (/* event */ Event, /* ui */ ModalDialogSortingChangedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogSortingChanged", js.Any.fromFunction2(value))
    
    inline def setModalDialogSortingChangedUndefined: Self = StObject.set(x, "modalDialogSortingChanged", js.undefined)
    
    inline def setModalDialogWidth(value: String | Double): Self = StObject.set(x, "modalDialogWidth", value.asInstanceOf[js.Any])
    
    inline def setModalDialogWidthUndefined: Self = StObject.set(x, "modalDialogWidth", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setSortUrlKey(value: String): Self = StObject.set(x, "sortUrlKey", value.asInstanceOf[js.Any])
    
    inline def setSortUrlKeyAscValue(value: String): Self = StObject.set(x, "sortUrlKeyAscValue", value.asInstanceOf[js.Any])
    
    inline def setSortUrlKeyAscValueUndefined: Self = StObject.set(x, "sortUrlKeyAscValue", js.undefined)
    
    inline def setSortUrlKeyDescValue(value: String): Self = StObject.set(x, "sortUrlKeyDescValue", value.asInstanceOf[js.Any])
    
    inline def setSortUrlKeyDescValueUndefined: Self = StObject.set(x, "sortUrlKeyDescValue", js.undefined)
    
    inline def setSortUrlKeyUndefined: Self = StObject.set(x, "sortUrlKey", js.undefined)
    
    inline def setSortingDialogContainment(value: String): Self = StObject.set(x, "sortingDialogContainment", value.asInstanceOf[js.Any])
    
    inline def setSortingDialogContainmentUndefined: Self = StObject.set(x, "sortingDialogContainment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnsortedColumnTooltip(value: String): Self = StObject.set(x, "unsortedColumnTooltip", value.asInstanceOf[js.Any])
    
    inline def setUnsortedColumnTooltipUndefined: Self = StObject.set(x, "unsortedColumnTooltip", js.undefined)
  }
}
