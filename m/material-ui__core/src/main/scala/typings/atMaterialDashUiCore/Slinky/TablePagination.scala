package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapTablePaginationClassKey
import typings.atMaterialDashUiCore.PartialIconButtonProps
import typings.atMaterialDashUiCore.PartialSelectProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.baseline
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.body
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.footer
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.head
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.justify
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.middle
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typings.atMaterialDashUiCore.tableCellTableCellMod.Padding
import typings.atMaterialDashUiCore.tableCellTableCellMod.SortDirection
import typings.atMaterialDashUiCore.tablePaginationMod.default
import typings.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
import typings.atMaterialDashUiCore.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import typings.atMaterialDashUiCore.tablePaginationTablePaginationMod.TablePaginationBaseProps
import typings.atMaterialDashUiCore.tablePaginationTablePaginationMod.TablePaginationProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, scope, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, colSpan, onTransitionEnd, rowSpan, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, defaultChecked, title, onTouchCancelCapture, lang, headers, onErrorCapture, onAnimationIteration, onPauseCapture, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object TablePagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.tablePaginationMod.default].asInstanceOf[String | js.Object]
  def apply(
    count: Double,
    onChangePage: (Null, Double) => Unit,
    page: Double,
    rowsPerPage: Double,
    ActionsComponent: ReactComponentClass[TablePaginationActionsProps] = null,
    SelectProps: PartialSelectProps = null,
    align: inherit | left | center | right | justify = null,
    backIconButtonProps: PartialIconButtonProps = null,
    classes: PartialClassNameMapTablePaginationClassKey = null,
    component: ReactComponentClass[TablePaginationBaseProps] = null,
    innerRef: Ref[_] | RefObject[_] = null,
    labelDisplayedRows: /* paginationInfo */ LabelDisplayedRowsArgs => TagMod[Any] = null,
    labelRowsPerPage: TagMod[Any] = null,
    nextIconButtonProps: PartialIconButtonProps = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    onChangeRowsPerPage: ChangeEvent[HTMLTextAreaElement | HTMLInputElement] => Unit = null,
    padding: Padding = null,
    rowsPerPageOptions: js.Array[Double] = null,
    sortDirection: SortDirection = null,
    valign: top | middle | bottom | baseline = null,
    variant: head | body | footer = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(count = count, onChangePage = js.Any.fromFunction2(onChangePage), page = page, rowsPerPage = rowsPerPage)
    if (ActionsComponent != null) __obj.updateDynamic("ActionsComponent")(ActionsComponent)
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backIconButtonProps != null) __obj.updateDynamic("backIconButtonProps")(backIconButtonProps)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (labelDisplayedRows != null) __obj.updateDynamic("labelDisplayedRows")(js.Any.fromFunction1(labelDisplayedRows))
    if (labelRowsPerPage != null) __obj.updateDynamic("labelRowsPerPage")(labelRowsPerPage)
    if (nextIconButtonProps != null) __obj.updateDynamic("nextIconButtonProps")(nextIconButtonProps)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onChangeRowsPerPage != null) __obj.updateDynamic("onChangeRowsPerPage")(js.Any.fromFunction1(onChangeRowsPerPage))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TablePaginationProps
}

