package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object igniteDashUiLib {
  type ActionExecutedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActionExecutedEventUIParam, scala.Unit]
  type ActionExecutingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActionExecutingEventUIParam, scala.Unit]
  type ActivatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActivatedEventUIParam, scala.Unit]
  type ActivatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActivatingEventUIParam, scala.Unit]
  type ActiveCellChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveCellChangedEventUIParam, scala.Unit]
  type ActiveCellChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveCellChangingEventUIParam, scala.Unit]
  type ActivePaneChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActivePaneChangedEventUIParam, scala.Unit]
  type ActiveRowChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveRowChangedEventUIParam, scala.Unit]
  type ActiveRowChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveRowChangingEventUIParam, scala.Unit]
  type ActiveTableChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveTableChangedEventUIParam, scala.Unit]
  type ActiveWorksheetChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ActiveWorksheetChangedEventUIParam, scala.Unit]
  type AgendaRangeChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AgendaRangeChangedEventUIParam, scala.Unit]
  type AgendaRangeChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AgendaRangeChangingEventUIParam, scala.Unit]
  type AlignLabelEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AlignLabelEventUIParam, scala.Unit]
  type AnimationEndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AnimationEndedEventUIParam, scala.Unit]
  type ApplyCustomIndicatorsEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ApplyCustomIndicatorsEventUIParam, scala.Unit]
  type ApplyEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ApplyEventUIParam, scala.Unit]
  type AppointmentCreatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentCreatedEventUIParam, scala.Unit]
  type AppointmentCreatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentCreatingEventUIParam, scala.Unit]
  type AppointmentDeletedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDeletedEventUIParam, scala.Unit]
  type AppointmentDeletingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDeletingEventUIParam, scala.Unit]
  type AppointmentDialogClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDialogClosedEventUIParam, scala.Unit]
  type AppointmentDialogClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDialogClosingEventUIParam, scala.Unit]
  type AppointmentDialogOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDialogOpenedEventUIParam, scala.Unit]
  type AppointmentDialogOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentDialogOpeningEventUIParam, scala.Unit]
  type AppointmentEditedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentEditedEventUIParam, scala.Unit]
  type AppointmentEditingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AppointmentEditingEventUIParam, scala.Unit]
  type AssigningCategoryMarkerStyleEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ AssigningCategoryMarkerStyleEventUIParam, 
    scala.Unit
  ]
  type AssigningCategoryStyleEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AssigningCategoryStyleEventUIParam, scala.Unit]
  type AxisRangeChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AxisRangeChangedEventUIParam, scala.Unit]
  type BannerClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BannerClickEventUIParam, scala.Unit]
  type BannerHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BannerHiddenEventUIParam, scala.Unit]
  type BannerVisibleEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BannerVisibleEventUIParam, scala.Unit]
  type BlurEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BlurEventUIParam, scala.Unit]
  type BookmarkClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BookmarkClickEventUIParam, scala.Unit]
  type BookmarkHitEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BookmarkHitEventUIParam, scala.Unit]
  type BrowserNotSupportedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BrowserNotSupportedEventUIParam, scala.Unit]
  type BufferingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ BufferingEventUIParam, scala.Unit]
  type ButtonCancelClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ButtonCancelClickEventUIParam, scala.Unit]
  type ButtonOKClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ButtonOKClickEventUIParam, scala.Unit]
  type CalloutStyleUpdatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CalloutStyleUpdatingEventUIParam, scala.Unit]
  type CancelAllClickedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CancelAllClickedEventUIParam, scala.Unit]
  type CancelEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CancelEventUIParam, scala.Unit]
  type CaptionRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CaptionRenderedEventUIParam, scala.Unit]
  type CaptionRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CaptionRenderingEventUIParam, scala.Unit]
  type CaptureEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CaptureEventUIParam, scala.Unit]
  type CellClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellClickEventUIParam, scala.Unit]
  type CellRightClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellRightClickEventUIParam, scala.Unit]
  type CellSelectionChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellSelectionChangedEventUIParam, scala.Unit]
  type CellSelectionChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellSelectionChangingEventUIParam, scala.Unit]
  type CellsMergedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellsMergedEventUIParam, scala.Unit]
  type CellsMergingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CellsMergingEventUIParam, scala.Unit]
  type ChangeEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChangeEventUIParam, scala.Unit]
  type CheckBoxStateChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CheckBoxStateChangedEventUIParam, scala.Unit]
  type CheckBoxStateChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CheckBoxStateChangingEventUIParam, scala.Unit]
  type ChildGridCreatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChildGridCreatedEventUIParam, scala.Unit]
  type ChildGridCreatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChildGridCreatingEventUIParam, scala.Unit]
  type ChildGridRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChildGridRenderedEventUIParam, scala.Unit]
  type ChildrenPopulatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChildrenPopulatedEventUIParam, scala.Unit]
  type ChildrenPopulatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ChildrenPopulatingEventUIParam, scala.Unit]
  type ClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ClickEventUIParam, scala.Unit]
  type ClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ClosedEventUIParam, scala.Unit]
  type CollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CollapsedEventUIParam, scala.Unit]
  type CollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CollapsingEventUIParam, scala.Unit]
  type ColorSelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColorSelectedEventUIParam, scala.Unit]
  type ColumnChooserButtonApplyClickEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ColumnChooserButtonApplyClickEventUIParam, 
    scala.Unit
  ]
  type ColumnChooserButtonResetClickEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ColumnChooserButtonResetClickEventUIParam, 
    scala.Unit
  ]
  type ColumnChooserClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnChooserClosedEventUIParam, scala.Unit]
  type ColumnChooserClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnChooserClosingEventUIParam, scala.Unit]
  type ColumnChooserContentsRenderedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ColumnChooserContentsRenderedEventUIParam, 
    scala.Unit
  ]
  type ColumnChooserContentsRenderingEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ColumnChooserContentsRenderingEventUIParam, 
    scala.Unit
  ]
  type ColumnChooserMovingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnChooserMovingEventUIParam, scala.Unit]
  type ColumnChooserOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnChooserOpenedEventUIParam, scala.Unit]
  type ColumnChooserOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnChooserOpeningEventUIParam, scala.Unit]
  type ColumnDragCanceledEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnDragCanceledEventUIParam, scala.Unit]
  type ColumnDragEndEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnDragEndEventUIParam, scala.Unit]
  type ColumnDragStartEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnDragStartEventUIParam, scala.Unit]
  type ColumnFixedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnFixedEventUIParam, scala.Unit]
  type ColumnFixingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnFixingEventUIParam, scala.Unit]
  type ColumnFixingRefusedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnFixingRefusedEventUIParam, scala.Unit]
  type ColumnHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnHiddenEventUIParam, scala.Unit]
  type ColumnHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnHidingEventUIParam, scala.Unit]
  type ColumnHidingRefusedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnHidingRefusedEventUIParam, scala.Unit]
  type ColumnMovedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnMovedEventUIParam, scala.Unit]
  type ColumnMovingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnMovingEventUIParam, scala.Unit]
  type ColumnResizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnResizedEventUIParam, scala.Unit]
  type ColumnResizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnResizingEventUIParam, scala.Unit]
  type ColumnResizingRefusedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnResizingRefusedEventUIParam, scala.Unit]
  type ColumnShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnShowingEventUIParam, scala.Unit]
  type ColumnShowingRefusedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnShowingRefusedEventUIParam, scala.Unit]
  type ColumnShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnShownEventUIParam, scala.Unit]
  type ColumnSortedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnSortedEventUIParam, scala.Unit]
  type ColumnSortingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnSortingEventUIParam, scala.Unit]
  type ColumnUnfixedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnUnfixedEventUIParam, scala.Unit]
  type ColumnUnfixingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnUnfixingEventUIParam, scala.Unit]
  type ColumnUnfixingRefusedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnUnfixingRefusedEventUIParam, scala.Unit]
  type ColumnsCollectionModifiedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ColumnsCollectionModifiedEventUIParam, scala.Unit]
  type ContextRowRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ContextRowRenderedEventUIParam, scala.Unit]
  type ContextRowRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ContextRowRenderingEventUIParam, scala.Unit]
  type CopyEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CopyEventUIParam, scala.Unit]
  type CreatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CreatedEventUIParam, scala.Unit]
  type CutEvent = js.Function2[/* event */ stdLib.Event, /* ui */ CutEventUIParam, scala.Unit]
  type DataBindingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataBindingEventUIParam, scala.Unit]
  type DataBoundEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataBoundEventUIParam, scala.Unit]
  type DataChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataChangedEventUIParam, scala.Unit]
  type DataDirtyEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataDirtyEventUIParam, scala.Unit]
  type DataFilteredEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataFilteredEventUIParam, scala.Unit]
  type DataFilteringEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataFilteringEventUIParam, scala.Unit]
  type DataRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataRenderedEventUIParam, scala.Unit]
  type DataRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataRenderingEventUIParam, scala.Unit]
  type DataSelectorRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataSelectorRenderedEventUIParam, scala.Unit]
  type DataSourceInitializedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataSourceInitializedEventUIParam, scala.Unit]
  type DataSourceUpdatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DataSourceUpdatedEventUIParam, scala.Unit]
  type DayChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DayChangedEventUIParam, scala.Unit]
  type DayChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DayChangingEventUIParam, scala.Unit]
  type DaySelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DaySelectedEventUIParam, scala.Unit]
  type DeactivatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DeactivatedEventUIParam, scala.Unit]
  type DeactivatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DeactivatingEventUIParam, scala.Unit]
  type DeferUpdateChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DeferUpdateChangedEventUIParam, scala.Unit]
  type DestroyedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DestroyedEventUIParam, scala.Unit]
  type DragEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DragEventUIParam, scala.Unit]
  type DragStartEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DragStartEventUIParam, scala.Unit]
  type DragStopEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DragStopEventUIParam, scala.Unit]
  type DropDownCancelClickedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownCancelClickedEventUIParam, scala.Unit]
  type DropDownClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownClosedEventUIParam, scala.Unit]
  type DropDownClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownClosingEventUIParam, scala.Unit]
  type DropDownItemSelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownItemSelectedEventUIParam, scala.Unit]
  type DropDownItemSelectingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownItemSelectingEventUIParam, scala.Unit]
  type DropDownListClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownListClosedEventUIParam, scala.Unit]
  type DropDownListClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownListClosingEventUIParam, scala.Unit]
  type DropDownListOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownListOpenedEventUIParam, scala.Unit]
  type DropDownListOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownListOpeningEventUIParam, scala.Unit]
  type DropDownOKClickedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownOKClickedEventUIParam, scala.Unit]
  type DropDownOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownOpenedEventUIParam, scala.Unit]
  type DropDownOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DropDownOpeningEventUIParam, scala.Unit]
  type EditCellEndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditCellEndedEventUIParam, scala.Unit]
  type EditCellEndingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditCellEndingEventUIParam, scala.Unit]
  type EditCellStartedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditCellStartedEventUIParam, scala.Unit]
  type EditCellStartingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditCellStartingEventUIParam, scala.Unit]
  type EditModeEnteredEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditModeEnteredEventUIParam, scala.Unit]
  type EditModeEnteringEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditModeEnteringEventUIParam, scala.Unit]
  type EditModeExitedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditModeExitedEventUIParam, scala.Unit]
  type EditModeExitingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditModeExitingEventUIParam, scala.Unit]
  type EditModeValidationErrorEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditModeValidationErrorEventUIParam, scala.Unit]
  type EditRangePasswordNeededEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditRangePasswordNeededEventUIParam, scala.Unit]
  type EditRowEndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditRowEndedEventUIParam, scala.Unit]
  type EditRowEndingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditRowEndingEventUIParam, scala.Unit]
  type EditRowStartedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditRowStartedEventUIParam, scala.Unit]
  type EditRowStartingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EditRowStartingEventUIParam, scala.Unit]
  type EndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EndedEventUIParam, scala.Unit]
  type EnterFullScreenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ EnterFullScreenEventUIParam, scala.Unit]
  type ErrorEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorEventUIParam, scala.Unit]
  type ErrorHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorHiddenEventUIParam, scala.Unit]
  type ErrorHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorHidingEventUIParam, scala.Unit]
  type ErrorMessageDisplayingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorMessageDisplayingEventUIParam, scala.Unit]
  type ErrorShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorShowingEventUIParam, scala.Unit]
  type ErrorShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ErrorShownEventUIParam, scala.Unit]
  type ExitFullScreenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ExitFullScreenEventUIParam, scala.Unit]
  type ExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ExpandedEventUIParam, scala.Unit]
  type ExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ExpandingEventUIParam, scala.Unit]
  type FeatureChooserDropDownOpenedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ FeatureChooserDropDownOpenedEventUIParam, 
    scala.Unit
  ]
  type FeatureChooserDropDownOpeningEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ FeatureChooserDropDownOpeningEventUIParam, 
    scala.Unit
  ]
  type FeatureChooserRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FeatureChooserRenderedEventUIParam, scala.Unit]
  type FeatureChooserRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FeatureChooserRenderingEventUIParam, scala.Unit]
  type FeatureToggledEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FeatureToggledEventUIParam, scala.Unit]
  type FeatureTogglingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FeatureTogglingEventUIParam, scala.Unit]
  type FileExtensionsValidatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileExtensionsValidatingEventUIParam, scala.Unit]
  type FileSelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileSelectedEventUIParam, scala.Unit]
  type FileSelectingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileSelectingEventUIParam, scala.Unit]
  type FileUploadAbortedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileUploadAbortedEventUIParam, scala.Unit]
  type FileUploadedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileUploadedEventUIParam, scala.Unit]
  type FileUploadingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FileUploadingEventUIParam, scala.Unit]
  type FilterDialogClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogClosedEventUIParam, scala.Unit]
  type FilterDialogClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogClosingEventUIParam, scala.Unit]
  type FilterDialogContentsRenderedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ FilterDialogContentsRenderedEventUIParam, 
    scala.Unit
  ]
  type FilterDialogContentsRenderingEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ FilterDialogContentsRenderingEventUIParam, 
    scala.Unit
  ]
  type FilterDialogFilterAddedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogFilterAddedEventUIParam, scala.Unit]
  type FilterDialogFilterAddingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogFilterAddingEventUIParam, scala.Unit]
  type FilterDialogFilteringEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogFilteringEventUIParam, scala.Unit]
  type FilterDialogMovingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogMovingEventUIParam, scala.Unit]
  type FilterDialogOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogOpenedEventUIParam, scala.Unit]
  type FilterDialogOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDialogOpeningEventUIParam, scala.Unit]
  type FilterDropDownClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDropDownClosedEventUIParam, scala.Unit]
  type FilterDropDownClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDropDownClosingEventUIParam, scala.Unit]
  type FilterDropDownOkEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDropDownOkEventUIParam, scala.Unit]
  type FilterDropDownOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDropDownOpenedEventUIParam, scala.Unit]
  type FilterDropDownOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterDropDownOpeningEventUIParam, scala.Unit]
  type FilterMembersLoadedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilterMembersLoadedEventUIParam, scala.Unit]
  type FilteredEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilteredEventUIParam, scala.Unit]
  type FilteringEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FilteringEventUIParam, scala.Unit]
  type FooterRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FooterRenderedEventUIParam, scala.Unit]
  type FooterRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FooterRenderingEventUIParam, scala.Unit]
  type FormErrorEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FormErrorEventUIParam, scala.Unit]
  type FormSuccessEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FormSuccessEventUIParam, scala.Unit]
  type FormValidatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FormValidatedEventUIParam, scala.Unit]
  type FormValidatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FormValidatingEventUIParam, scala.Unit]
  type FormatLabelEvent = js.Function2[/* event */ stdLib.Event, /* ui */ FormatLabelEventUIParam, scala.Unit]
  type GeneratePrimaryKeyValueEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GeneratePrimaryKeyValueEventUIParam, scala.Unit]
  type GridAreaRectChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GridAreaRectChangedEventUIParam, scala.Unit]
  type GroupCollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupCollapsedEventUIParam, scala.Unit]
  type GroupCollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupCollapsingEventUIParam, scala.Unit]
  type GroupExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupExpandedEventUIParam, scala.Unit]
  type GroupExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupExpandingEventUIParam, scala.Unit]
  type GroupedColumnsChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupedColumnsChangedEventUIParam, scala.Unit]
  type GroupedColumnsChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ GroupedColumnsChangingEventUIParam, scala.Unit]
  type HeaderCellRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HeaderCellRenderedEventUIParam, scala.Unit]
  type HeaderRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HeaderRenderedEventUIParam, scala.Unit]
  type HeaderRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HeaderRenderingEventUIParam, scala.Unit]
  type HeadersSortedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HeadersSortedEventUIParam, scala.Unit]
  type HeadersSortingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HeadersSortingEventUIParam, scala.Unit]
  type HiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HiddenEventUIParam, scala.Unit]
  type HideEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HideEventUIParam, scala.Unit]
  type HideTooltipEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HideTooltipEventUIParam, scala.Unit]
  type HidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HidingEventUIParam, scala.Unit]
  type HoleDimensionsChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HoleDimensionsChangedEventUIParam, scala.Unit]
  type HoverChangeEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HoverChangeEventUIParam, scala.Unit]
  type HyperlinkExecutingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ HyperlinkExecutingEventUIParam, scala.Unit]
  type IgComboSelectionChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ IgComboSelectionChangedEventUIParam, scala.Unit]
  type IgFocusEvent = js.Function2[/* event */ stdLib.Event, /* ui */ IgFocusEventUIParam, scala.Unit]
  type IgSpreadsheetSelectionChangedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ IgSpreadsheetSelectionChangedEventUIParam, 
    scala.Unit
  ]
  type IgTreeSelectionChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ IgTreeSelectionChangedEventUIParam, scala.Unit]
  type InternalResizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ InternalResizedEventUIParam, scala.Unit]
  type InternalResizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ InternalResizingEventUIParam, scala.Unit]
  type ItemAddedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemAddedEventUIParam, scala.Unit]
  type ItemDisableEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemDisableEventUIParam, scala.Unit]
  type ItemEnabledEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemEnabledEventUIParam, scala.Unit]
  type ItemRemovedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemRemovedEventUIParam, scala.Unit]
  type ItemRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemRenderedEventUIParam, scala.Unit]
  type ItemRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemRenderingEventUIParam, scala.Unit]
  type ItemSelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemSelectedEventUIParam, scala.Unit]
  type ItemsRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemsRenderedEventUIParam, scala.Unit]
  type ItemsRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ItemsRenderingEventUIParam, scala.Unit]
  type KeydownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ KeydownEventUIParam, scala.Unit]
  type KeypressEvent = js.Function2[/* event */ stdLib.Event, /* ui */ KeypressEventUIParam, scala.Unit]
  type KeyupEvent = js.Function2[/* event */ stdLib.Event, /* ui */ KeyupEventUIParam, scala.Unit]
  type LabelClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ LabelClickEventUIParam, scala.Unit]
  type LayoutRefreshedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ LayoutRefreshedEventUIParam, scala.Unit]
  type LayoutRefreshingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ LayoutRefreshingEventUIParam, scala.Unit]
  type LegendItemMouseEnterEvent = js.Function2[/* event */ stdLib.Event, /* ui */ LegendItemMouseEnterEventUIParam, scala.Unit]
  type LegendItemMouseLeaveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ LegendItemMouseLeaveEventUIParam, scala.Unit]
  type LegendItemMouseLeftButtonDownEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ LegendItemMouseLeftButtonDownEventUIParam, 
    scala.Unit
  ]
  type LegendItemMouseLeftButtonUpEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ LegendItemMouseLeftButtonUpEventUIParam, 
    scala.Unit
  ]
  type MenuTogglingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MenuTogglingEventUIParam, scala.Unit]
  type MetadataDroppedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MetadataDroppedEventUIParam, scala.Unit]
  type MetadataDroppingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MetadataDroppingEventUIParam, scala.Unit]
  type MetadataRemovedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MetadataRemovedEventUIParam, scala.Unit]
  type MetadataRemovingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MetadataRemovingEventUIParam, scala.Unit]
  type ModalDialogButtonApplyClickEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogButtonApplyClickEventUIParam, 
    scala.Unit
  ]
  type ModalDialogButtonResetClickEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogButtonResetClickEventUIParam, 
    scala.Unit
  ]
  type ModalDialogButtonUnsortClickEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogButtonUnsortClickEventUIParam, 
    scala.Unit
  ]
  type ModalDialogClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogClosedEventUIParam, scala.Unit]
  type ModalDialogClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogClosingEventUIParam, scala.Unit]
  type ModalDialogContentsRenderedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogContentsRenderedEventUIParam, 
    scala.Unit
  ]
  type ModalDialogContentsRenderingEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogContentsRenderingEventUIParam, 
    scala.Unit
  ]
  type ModalDialogGroupColumnEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogGroupColumnEventUIParam, scala.Unit]
  type ModalDialogGroupingColumnEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogGroupingColumnEventUIParam, scala.Unit]
  type ModalDialogMovingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogMovingEventUIParam, scala.Unit]
  type ModalDialogOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogOpenedEventUIParam, scala.Unit]
  type ModalDialogOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogOpeningEventUIParam, scala.Unit]
  type ModalDialogSortClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogSortClickEventUIParam, scala.Unit]
  type ModalDialogSortGroupedColumnEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogSortGroupedColumnEventUIParam, 
    scala.Unit
  ]
  type ModalDialogSortingChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogSortingChangedEventUIParam, scala.Unit]
  type ModalDialogUngroupColumnEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ModalDialogUngroupColumnEventUIParam, scala.Unit]
  type ModalDialogUngroupingColumnEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ModalDialogUngroupingColumnEventUIParam, 
    scala.Unit
  ]
  type MonthChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MonthChangedEventUIParam, scala.Unit]
  type MonthChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MonthChangingEventUIParam, scala.Unit]
  type MousedownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MousedownEventUIParam, scala.Unit]
  type MousemoveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MousemoveEventUIParam, scala.Unit]
  type MouseoutEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MouseoutEventUIParam, scala.Unit]
  type MouseoverEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MouseoverEventUIParam, scala.Unit]
  type MouseupEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MouseupEventUIParam, scala.Unit]
  type MovingDialogClosedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MovingDialogClosedEventUIParam, scala.Unit]
  type MovingDialogClosingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MovingDialogClosingEventUIParam, scala.Unit]
  type MovingDialogContentsRenderedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogContentsRenderedEventUIParam, 
    scala.Unit
  ]
  type MovingDialogContentsRenderingEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogContentsRenderingEventUIParam, 
    scala.Unit
  ]
  type MovingDialogDragColumnMovedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogDragColumnMovedEventUIParam, 
    scala.Unit
  ]
  type MovingDialogDragColumnMovingEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogDragColumnMovingEventUIParam, 
    scala.Unit
  ]
  type MovingDialogDraggedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MovingDialogDraggedEventUIParam, scala.Unit]
  type MovingDialogMoveDownButtonPressedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogMoveDownButtonPressedEventUIParam, 
    scala.Unit
  ]
  type MovingDialogMoveUpButtonPressedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ MovingDialogMoveUpButtonPressedEventUIParam, 
    scala.Unit
  ]
  type MovingDialogOpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MovingDialogOpenedEventUIParam, scala.Unit]
  type MovingDialogOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MovingDialogOpeningEventUIParam, scala.Unit]
  type MultiColumnHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MultiColumnHidingEventUIParam, scala.Unit]
  type NodeCheckstateChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeCheckstateChangedEventUIParam, scala.Unit]
  type NodeCheckstateChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeCheckstateChangingEventUIParam, scala.Unit]
  type NodeClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeClickEventUIParam, scala.Unit]
  type NodeCollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeCollapsedEventUIParam, scala.Unit]
  type NodeCollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeCollapsingEventUIParam, scala.Unit]
  type NodeDoubleClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeDoubleClickEventUIParam, scala.Unit]
  type NodeDroppedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeDroppedEventUIParam, scala.Unit]
  type NodeDroppingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeDroppingEventUIParam, scala.Unit]
  type NodeExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeExpandedEventUIParam, scala.Unit]
  type NodeExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodeExpandingEventUIParam, scala.Unit]
  type NodePopulatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodePopulatedEventUIParam, scala.Unit]
  type NodePopulatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ NodePopulatingEventUIParam, scala.Unit]
  type OnErrorEvent = js.Function2[/* event */ stdLib.Event, /* ui */ OnErrorEventUIParam, scala.Unit]
  type OnFormDataSubmitEvent = js.Function2[/* event */ stdLib.Event, /* ui */ OnFormDataSubmitEventUIParam, scala.Unit]
  type OnXHRLoadEvent = js.Function2[/* event */ stdLib.Event, /* ui */ OnXHRLoadEventUIParam, scala.Unit]
  type OpenedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ OpenedEventUIParam, scala.Unit]
  type PageIndexChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PageIndexChangedEventUIParam, scala.Unit]
  type PageIndexChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PageIndexChangingEventUIParam, scala.Unit]
  type PageSizeChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PageSizeChangedEventUIParam, scala.Unit]
  type PageSizeChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PageSizeChangingEventUIParam, scala.Unit]
  type PagerRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PagerRenderedEventUIParam, scala.Unit]
  type PagerRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PagerRenderingEventUIParam, scala.Unit]
  type PasteEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PasteEventUIParam, scala.Unit]
  type PausedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PausedEventUIParam, scala.Unit]
  type PivotGridHeadersRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PivotGridHeadersRenderedEventUIParam, scala.Unit]
  type PivotGridRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PivotGridRenderedEventUIParam, scala.Unit]
  type PlayingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PlayingEventUIParam, scala.Unit]
  type ProgressEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ProgressEventUIParam, scala.Unit]
  type ProgressiveLoadStatusChangedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ ProgressiveLoadStatusChangedEventUIParam, 
    scala.Unit
  ]
  type PropertyChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ PropertyChangedEventUIParam, scala.Unit]
  type ProviderCreatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ProviderCreatedEventUIParam, scala.Unit]
  type RedoEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RedoEventUIParam, scala.Unit]
  type RefreshCompletedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RefreshCompletedEventUIParam, scala.Unit]
  type RelatedVideoClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RelatedVideoClickEventUIParam, scala.Unit]
  type RenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RenderedEventUIParam, scala.Unit]
  type RenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RenderingEventUIParam, scala.Unit]
  type RequestErrorEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RequestErrorEventUIParam, scala.Unit]
  type ResizeEndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResizeEndedEventUIParam, scala.Unit]
  type ResizeStartedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResizeStartedEventUIParam, scala.Unit]
  type ResizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResizedEventUIParam, scala.Unit]
  type ResizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResizingEventUIParam, scala.Unit]
  type ResolvingAxisValueEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResolvingAxisValueEventUIParam, scala.Unit]
  type ResponsiveColumnHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResponsiveColumnHiddenEventUIParam, scala.Unit]
  type ResponsiveColumnHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResponsiveColumnHidingEventUIParam, scala.Unit]
  type ResponsiveColumnShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResponsiveColumnShowingEventUIParam, scala.Unit]
  type ResponsiveColumnShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResponsiveColumnShownEventUIParam, scala.Unit]
  type ResponsiveModeChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResponsiveModeChangedEventUIParam, scala.Unit]
  type RowAddedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowAddedEventUIParam, scala.Unit]
  type RowAddingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowAddingEventUIParam, scala.Unit]
  type RowCollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowCollapsedEventUIParam, scala.Unit]
  type RowCollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowCollapsingEventUIParam, scala.Unit]
  type RowDeletedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowDeletedEventUIParam, scala.Unit]
  type RowDeletingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowDeletingEventUIParam, scala.Unit]
  type RowEditDialogAfterCloseEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowEditDialogAfterCloseEventUIParam, scala.Unit]
  type RowEditDialogAfterOpenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowEditDialogAfterOpenEventUIParam, scala.Unit]
  type RowEditDialogBeforeCloseEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowEditDialogBeforeCloseEventUIParam, scala.Unit]
  type RowEditDialogBeforeOpenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowEditDialogBeforeOpenEventUIParam, scala.Unit]
  type RowEditDialogContentsRenderedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ RowEditDialogContentsRenderedEventUIParam, 
    scala.Unit
  ]
  type RowExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowExpandedEventUIParam, scala.Unit]
  type RowExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowExpandingEventUIParam, scala.Unit]
  type RowSelectionChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowSelectionChangedEventUIParam, scala.Unit]
  type RowSelectionChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowSelectionChangingEventUIParam, scala.Unit]
  type RowSelectorClickedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowSelectorClickedEventUIParam, scala.Unit]
  type RowsRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowsRenderedEventUIParam, scala.Unit]
  type RowsRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowsRenderingEventUIParam, scala.Unit]
  type RowsRequestedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowsRequestedEventUIParam, scala.Unit]
  type RowsRequestingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ RowsRequestingEventUIParam, scala.Unit]
  type SchemaGeneratedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SchemaGeneratedEventUIParam, scala.Unit]
  type ScrolledEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ScrolledEventUIParam, scala.Unit]
  type ScrollingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ScrollingEventUIParam, scala.Unit]
  type SelectedItemChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectedItemChangedEventUIParam, scala.Unit]
  type SelectedItemChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectedItemChangingEventUIParam, scala.Unit]
  type SelectedItemsChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectedItemsChangedEventUIParam, scala.Unit]
  type SelectedItemsChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectedItemsChangingEventUIParam, scala.Unit]
  type SelectionChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectionChangingEventUIParam, scala.Unit]
  type SeriesAddedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesAddedEventUIParam, scala.Unit]
  type SeriesCursorMouseMoveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesCursorMouseMoveEventUIParam, scala.Unit]
  type SeriesMouseEnterEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesMouseEnterEventUIParam, scala.Unit]
  type SeriesMouseLeaveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesMouseLeaveEventUIParam, scala.Unit]
  type SeriesMouseLeftButtonDownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam, scala.Unit]
  type SeriesMouseLeftButtonUpEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam, scala.Unit]
  type SeriesMouseMoveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesMouseMoveEventUIParam, scala.Unit]
  type SeriesPointerDownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesPointerDownEventUIParam, scala.Unit]
  type SeriesPointerEnterEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesPointerEnterEventUIParam, scala.Unit]
  type SeriesPointerLeaveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesPointerLeaveEventUIParam, scala.Unit]
  type SeriesPointerMoveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesPointerMoveEventUIParam, scala.Unit]
  type SeriesPointerUpEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesPointerUpEventUIParam, scala.Unit]
  type SeriesRemovedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SeriesRemovedEventUIParam, scala.Unit]
  type ShowEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ShowEventUIParam, scala.Unit]
  type ShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ShowingEventUIParam, scala.Unit]
  type ShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ShownEventUIParam, scala.Unit]
  type SliceClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SliceClickEventUIParam, scala.Unit]
  type SliceClickedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SliceClickedEventUIParam, scala.Unit]
  type SlideEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SlideEventUIParam, scala.Unit]
  type SortedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SortedEventUIParam, scala.Unit]
  type SortingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SortingEventUIParam, scala.Unit]
  type StartEvent = js.Function2[/* event */ stdLib.Event, /* ui */ StartEventUIParam, scala.Unit]
  type StateChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ StateChangedEventUIParam, scala.Unit]
  type StateChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ StateChangingEventUIParam, scala.Unit]
  type StopEvent = js.Function2[/* event */ stdLib.Event, /* ui */ StopEventUIParam, scala.Unit]
  type SuccessEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SuccessEventUIParam, scala.Unit]
  type SuccessHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SuccessHiddenEventUIParam, scala.Unit]
  type SuccessHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SuccessHidingEventUIParam, scala.Unit]
  type SuccessShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SuccessShowingEventUIParam, scala.Unit]
  type SuccessShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SuccessShownEventUIParam, scala.Unit]
  type SummariesCalculatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SummariesCalculatedEventUIParam, scala.Unit]
  type SummariesCalculatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SummariesCalculatingEventUIParam, scala.Unit]
  type SummariesMethodSelectionChangedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ SummariesMethodSelectionChangedEventUIParam, 
    scala.Unit
  ]
  type SummariesToggledEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SummariesToggledEventUIParam, scala.Unit]
  type SummariesTogglingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SummariesTogglingEventUIParam, scala.Unit]
  type TextChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TextChangedEventUIParam, scala.Unit]
  type ThumbDragEndEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ThumbDragEndEventUIParam, scala.Unit]
  type ThumbDragMoveEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ThumbDragMoveEventUIParam, scala.Unit]
  type ThumbDragStartEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ThumbDragStartEventUIParam, scala.Unit]
  type TileMaximizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileMaximizedEventUIParam, scala.Unit]
  type TileMaximizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileMaximizingEventUIParam, scala.Unit]
  type TileMinimizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileMinimizedEventUIParam, scala.Unit]
  type TileMinimizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileMinimizingEventUIParam, scala.Unit]
  type TileRenderedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileRenderedEventUIParam, scala.Unit]
  type TileRenderingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TileRenderingEventUIParam, scala.Unit]
  type ToolbarButtonClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarButtonClickEventUIParam, scala.Unit]
  type ToolbarCollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarCollapsedEventUIParam, scala.Unit]
  type ToolbarCollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarCollapsingEventUIParam, scala.Unit]
  type ToolbarComboOpeningEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarComboOpeningEventUIParam, scala.Unit]
  type ToolbarComboSelectedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarComboSelectedEventUIParam, scala.Unit]
  type ToolbarCustomItemClickEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarCustomItemClickEventUIParam, scala.Unit]
  type ToolbarExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarExpandedEventUIParam, scala.Unit]
  type ToolbarExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ToolbarExpandingEventUIParam, scala.Unit]
  type TooltipHiddenEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TooltipHiddenEventUIParam, scala.Unit]
  type TooltipHidingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TooltipHidingEventUIParam, scala.Unit]
  type TooltipShowingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TooltipShowingEventUIParam, scala.Unit]
  type TooltipShownEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TooltipShownEventUIParam, scala.Unit]
  type TriangulationStatusChangedEvent = js.Function2[
    /* event */ stdLib.Event, 
    /* ui */ TriangulationStatusChangedEventUIParam, 
    scala.Unit
  ]
  type TupleMemberCollapsedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TupleMemberCollapsedEventUIParam, scala.Unit]
  type TupleMemberCollapsingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TupleMemberCollapsingEventUIParam, scala.Unit]
  type TupleMemberExpandedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TupleMemberExpandedEventUIParam, scala.Unit]
  type TupleMemberExpandingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TupleMemberExpandingEventUIParam, scala.Unit]
  type TypicalBasedOnEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TypicalBasedOnEventUIParam, scala.Unit]
  type UndoEvent = js.Function2[/* event */ stdLib.Event, /* ui */ UndoEventUIParam, scala.Unit]
  type UpdateTooltipEvent = js.Function2[/* event */ stdLib.Event, /* ui */ UpdateTooltipEventUIParam, scala.Unit]
  type UserPromptDisplayingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ UserPromptDisplayingEventUIParam, scala.Unit]
  type ValidatedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ValidatedEventUIParam, scala.Unit]
  type ValidatingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ValidatingEventUIParam, scala.Unit]
  type ValueChangeEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ValueChangeEventUIParam, scala.Unit]
  type ValueChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ValueChangedEventUIParam, scala.Unit]
  type ValueChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ValueChangingEventUIParam, scala.Unit]
  type ViewChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ViewChangedEventUIParam, scala.Unit]
  type ViewChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ViewChangingEventUIParam, scala.Unit]
  type WaitingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WaitingEventUIParam, scala.Unit]
  type WeekChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WeekChangedEventUIParam, scala.Unit]
  type WeekChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WeekChangingEventUIParam, scala.Unit]
  type WindowDragEndedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowDragEndedEventUIParam, scala.Unit]
  type WindowDragEndingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowDragEndingEventUIParam, scala.Unit]
  type WindowDragStartedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowDragStartedEventUIParam, scala.Unit]
  type WindowDragStartingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowDragStartingEventUIParam, scala.Unit]
  type WindowDraggingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowDraggingEventUIParam, scala.Unit]
  type WindowRectChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowRectChangedEventUIParam, scala.Unit]
  type WindowResizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowResizedEventUIParam, scala.Unit]
  type WindowResizingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WindowResizingEventUIParam, scala.Unit]
  type WorkbookDirtiedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WorkbookDirtiedEventUIParam, scala.Unit]
  type WorkspaceResizedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ WorkspaceResizedEventUIParam, scala.Unit]
  type ZoomChangedEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ZoomChangedEventUIParam, scala.Unit]
  type ZoomChangingEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ZoomChangingEventUIParam, scala.Unit]
}
