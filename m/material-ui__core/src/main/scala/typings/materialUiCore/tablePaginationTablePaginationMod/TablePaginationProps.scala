package typings.materialUiCore.tablePaginationTablePaginationMod

import typings.materialUiCore.PartialClassNameMapTablePaginationClassKey
import typings.materialUiCore.PartialIconButtonProps
import typings.materialUiCore.PartialSelectProps
import typings.materialUiCore.materialUiCoreStrings.`additions text`
import typings.materialUiCore.materialUiCoreStrings.`inline`
import typings.materialUiCore.materialUiCoreStrings.additions
import typings.materialUiCore.materialUiCoreStrings.all
import typings.materialUiCore.materialUiCoreStrings.ascending
import typings.materialUiCore.materialUiCoreStrings.assertive
import typings.materialUiCore.materialUiCoreStrings.baseline
import typings.materialUiCore.materialUiCoreStrings.body
import typings.materialUiCore.materialUiCoreStrings.both
import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.center
import typings.materialUiCore.materialUiCoreStrings.copy
import typings.materialUiCore.materialUiCoreStrings.date
import typings.materialUiCore.materialUiCoreStrings.decimal
import typings.materialUiCore.materialUiCoreStrings.descending
import typings.materialUiCore.materialUiCoreStrings.dialog
import typings.materialUiCore.materialUiCoreStrings.email
import typings.materialUiCore.materialUiCoreStrings.execute
import typings.materialUiCore.materialUiCoreStrings.footer
import typings.materialUiCore.materialUiCoreStrings.grammar
import typings.materialUiCore.materialUiCoreStrings.grid
import typings.materialUiCore.materialUiCoreStrings.head
import typings.materialUiCore.materialUiCoreStrings.horizontal
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.justify
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.link
import typings.materialUiCore.materialUiCoreStrings.list
import typings.materialUiCore.materialUiCoreStrings.listbox
import typings.materialUiCore.materialUiCoreStrings.location
import typings.materialUiCore.materialUiCoreStrings.menu
import typings.materialUiCore.materialUiCoreStrings.middle
import typings.materialUiCore.materialUiCoreStrings.mixed
import typings.materialUiCore.materialUiCoreStrings.move
import typings.materialUiCore.materialUiCoreStrings.no
import typings.materialUiCore.materialUiCoreStrings.none
import typings.materialUiCore.materialUiCoreStrings.numeric
import typings.materialUiCore.materialUiCoreStrings.off
import typings.materialUiCore.materialUiCoreStrings.on
import typings.materialUiCore.materialUiCoreStrings.other
import typings.materialUiCore.materialUiCoreStrings.page
import typings.materialUiCore.materialUiCoreStrings.polite
import typings.materialUiCore.materialUiCoreStrings.popup
import typings.materialUiCore.materialUiCoreStrings.removals
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.search
import typings.materialUiCore.materialUiCoreStrings.spelling
import typings.materialUiCore.materialUiCoreStrings.step
import typings.materialUiCore.materialUiCoreStrings.tel
import typings.materialUiCore.materialUiCoreStrings.text
import typings.materialUiCore.materialUiCoreStrings.time
import typings.materialUiCore.materialUiCoreStrings.top
import typings.materialUiCore.materialUiCoreStrings.tree
import typings.materialUiCore.materialUiCoreStrings.url
import typings.materialUiCore.materialUiCoreStrings.vertical
import typings.materialUiCore.materialUiCoreStrings.yes
import typings.materialUiCore.tableCellTableCellMod.Padding
import typings.materialUiCore.tableCellTableCellMod.SortDirection
import typings.materialUiCore.tablePaginationActionsMod.TablePaginationActionsProps
import typings.react.AnonHtml
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps, @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationClassKey, 'component'> */
@js.native
trait TablePaginationProps extends js.Object {
  var ActionsComponent: js.UndefOr[ReactType[TablePaginationActionsProps]] = js.native
  var SelectProps: js.UndefOr[PartialSelectProps] = js.native
  var abbr: js.UndefOr[String] = js.native
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var align: js.UndefOr[inherit | left | center | right | justify] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapTablePaginationClassKey] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var component: js.UndefOr[ReactType[TablePaginationBaseProps]] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var count: Double = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var headers: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, ReactNode]] = js.native
  var labelRowsPerPage: js.UndefOr[ReactNode] = js.native
  var lang: js.UndefOr[String] = js.native
  var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onChangeRowsPerPage: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTableHeaderCellElement]] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var page: Double = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rowsPerPage: Double = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var scope: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var sortDirection: js.UndefOr[SortDirection] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.native
  var variant: js.UndefOr[head | body | footer] = js.native
  var vocab: js.UndefOr[String] = js.native
  def onChangePage(event: Null, page: Double): Unit = js.native
  def onChangePage(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
}

