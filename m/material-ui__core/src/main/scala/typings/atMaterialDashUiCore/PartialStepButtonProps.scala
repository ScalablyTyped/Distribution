package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typings.atMaterialDashUiCore.buttonBaseButtonBaseMod.ButtonBaseActions
import typings.atMaterialDashUiCore.buttonBaseButtonBaseMod.ButtonBaseProps
import typings.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps
import typings.atMaterialDashUiCore.stepButtonStepButtonMod.StepButtonIcon
import typings.atMaterialDashUiCore.stepperStepperMod.Orientation
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEventHandler
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.PointerEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.TransitionEventHandler
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEventHandler
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/StepButton.StepButtonProps> */
trait PartialStepButtonProps extends js.Object {
  var TouchRippleProps: js.UndefOr[Partial[typings.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps]] = js.undefined
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ ButtonBaseActions, Unit]] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var alternativeLabel: js.UndefOr[Boolean] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var buttonRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapStepButtonClasskey] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var completed: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[ReactType[ButtonBaseProps]] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var focusRipple: js.UndefOr[Boolean] = js.undefined
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[StepButtonIcon] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onAbortCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onBlurCapture: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onCanPlayCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onChangeCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onClickCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onCutCapture: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragEndCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragEnterCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragExitCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragOverCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDragStartCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDropCapture: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEmptiedCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEncryptedCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onEndedCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onErrorCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onFocusCapture: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onFocusVisible: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onInputCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onInvalidCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadStartCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPauseCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPlayCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPlayingCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onProgressCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onRateChangeCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onResetCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
  var onScrollCapture: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSeekedCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSeekingCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSelectCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onStalledCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onSubmitCapture: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onSuspendCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onWaitingCapture: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.undefined
  var onWheelCapture: js.UndefOr[WheelEventHandler[HTMLElement]] = js.undefined
  var optional: js.UndefOr[ReactNode] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var ping: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object PartialStepButtonProps {
  @scala.inline
  def apply(
    TouchRippleProps: Partial[TouchRippleProps] = null,
    about: String = null,
    accessKey: String = null,
    action: /* actions */ ButtonBaseActions => Unit = null,
    active: js.UndefOr[Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    buttonRef: Ref[_] | RefObject[_] = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    classes: PartialClassNameMapStepButtonClasskey = null,
    color: String = null,
    completed: js.UndefOr[Boolean] = js.undefined,
    component: ReactType[ButtonBaseProps] = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | js.Array[String] = null,
    dir: String = null,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    icon: StepButtonIcon = null,
    id: String = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | RefObject[_] = null,
    inputMode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    last: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    name: String = null,
    onAbort: ReactEventHandler[HTMLElement] = null,
    onAnimationEnd: AnimationEventHandler[HTMLElement] = null,
    onAnimationIteration: AnimationEventHandler[HTMLElement] = null,
    onAnimationStart: AnimationEventHandler[HTMLElement] = null,
    onAuxClick: MouseEventHandler[HTMLElement] = null,
    onBeforeInput: FormEventHandler[HTMLElement] = null,
    onBlur: FocusEventHandler[HTMLElement] = null,
    onCanPlay: ReactEventHandler[HTMLElement] = null,
    onCanPlayThrough: ReactEventHandler[HTMLElement] = null,
    onChange: FormEventHandler[HTMLElement] = null,
    onClick: MouseEventHandler[HTMLElement] = null,
    onCompositionEnd: CompositionEventHandler[HTMLElement] = null,
    onCompositionStart: CompositionEventHandler[HTMLElement] = null,
    onCompositionUpdate: CompositionEventHandler[HTMLElement] = null,
    onContextMenu: MouseEventHandler[HTMLElement] = null,
    onCopy: ClipboardEventHandler[HTMLElement] = null,
    onCut: ClipboardEventHandler[HTMLElement] = null,
    onDoubleClick: MouseEventHandler[HTMLElement] = null,
    onDrag: DragEventHandler[HTMLElement] = null,
    onDragEnd: DragEventHandler[HTMLElement] = null,
    onDragEnter: DragEventHandler[HTMLElement] = null,
    onDragExit: DragEventHandler[HTMLElement] = null,
    onDragLeave: DragEventHandler[HTMLElement] = null,
    onDragOver: DragEventHandler[HTMLElement] = null,
    onDragStart: DragEventHandler[HTMLElement] = null,
    onDrop: DragEventHandler[HTMLElement] = null,
    onDurationChange: ReactEventHandler[HTMLElement] = null,
    onEmptied: ReactEventHandler[HTMLElement] = null,
    onEncrypted: ReactEventHandler[HTMLElement] = null,
    onEnded: ReactEventHandler[HTMLElement] = null,
    onError: ReactEventHandler[HTMLElement] = null,
    onFocus: FocusEventHandler[HTMLElement] = null,
    onFocusVisible: FocusEventHandler[_] = null,
    onInput: FormEventHandler[HTMLElement] = null,
    onInvalid: FormEventHandler[HTMLElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLElement] = null,
    onLoad: ReactEventHandler[HTMLElement] = null,
    onLoadStart: ReactEventHandler[HTMLElement] = null,
    onLoadedData: ReactEventHandler[HTMLElement] = null,
    onLoadedMetadata: ReactEventHandler[HTMLElement] = null,
    onMouseDown: MouseEventHandler[HTMLElement] = null,
    onMouseEnter: MouseEventHandler[HTMLElement] = null,
    onMouseLeave: MouseEventHandler[HTMLElement] = null,
    onMouseMove: MouseEventHandler[HTMLElement] = null,
    onMouseOut: MouseEventHandler[HTMLElement] = null,
    onMouseOver: MouseEventHandler[HTMLElement] = null,
    onMouseUp: MouseEventHandler[HTMLElement] = null,
    onPaste: ClipboardEventHandler[HTMLElement] = null,
    onPause: ReactEventHandler[HTMLElement] = null,
    onPlay: ReactEventHandler[HTMLElement] = null,
    onPlaying: ReactEventHandler[HTMLElement] = null,
    onPointerCancel: PointerEventHandler[HTMLElement] = null,
    onPointerDown: PointerEventHandler[HTMLElement] = null,
    onPointerEnter: PointerEventHandler[HTMLElement] = null,
    onPointerLeave: PointerEventHandler[HTMLElement] = null,
    onPointerMove: PointerEventHandler[HTMLElement] = null,
    onPointerOut: PointerEventHandler[HTMLElement] = null,
    onPointerOver: PointerEventHandler[HTMLElement] = null,
    onPointerUp: PointerEventHandler[HTMLElement] = null,
    onProgress: ReactEventHandler[HTMLElement] = null,
    onRateChange: ReactEventHandler[HTMLElement] = null,
    onReset: FormEventHandler[HTMLElement] = null,
    onScroll: UIEventHandler[HTMLElement] = null,
    onSeeked: ReactEventHandler[HTMLElement] = null,
    onSeeking: ReactEventHandler[HTMLElement] = null,
    onSelect: ReactEventHandler[HTMLElement] = null,
    onStalled: ReactEventHandler[HTMLElement] = null,
    onSubmit: FormEventHandler[HTMLElement] = null,
    onSuspend: ReactEventHandler[HTMLElement] = null,
    onTimeUpdate: ReactEventHandler[HTMLElement] = null,
    onTouchCancel: TouchEventHandler[HTMLElement] = null,
    onTouchEnd: TouchEventHandler[HTMLElement] = null,
    onTouchMove: TouchEventHandler[HTMLElement] = null,
    onTouchStart: TouchEventHandler[HTMLElement] = null,
    onTransitionEnd: TransitionEventHandler[HTMLElement] = null,
    onVolumeChange: ReactEventHandler[HTMLElement] = null,
    onWaiting: ReactEventHandler[HTMLElement] = null,
    onWheel: WheelEventHandler[HTMLElement] = null,
    optional: ReactNode = null,
    orientation: Orientation = null,
    ping: String = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    referrerPolicy: String = null,
    rel: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    target: String = null,
    title: String = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null
  ): PartialStepButtonProps = {
    val __obj = js.Dynamic.literal()
    if (TouchRippleProps != null) __obj.updateDynamic("TouchRippleProps")(TouchRippleProps)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`)
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`)
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`)
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`)
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`)
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`)
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`)
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`)
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`)
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`)
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`)
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`)
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`)
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`)
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`)
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`)
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (buttonRef != null) __obj.updateDynamic("buttonRef")(buttonRef.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (download != null) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(focusRipple)) __obj.updateDynamic("focusRipple")(focusRipple)
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (media != null) __obj.updateDynamic("media")(media)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick)
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onFocusVisible != null) __obj.updateDynamic("onFocusVisible")(onFocusVisible)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel)
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown)
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter)
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave)
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove)
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut)
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver)
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (ping != null) __obj.updateDynamic("ping")(ping)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (security != null) __obj.updateDynamic("security")(security)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning)
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    __obj.asInstanceOf[PartialStepButtonProps]
  }
}

