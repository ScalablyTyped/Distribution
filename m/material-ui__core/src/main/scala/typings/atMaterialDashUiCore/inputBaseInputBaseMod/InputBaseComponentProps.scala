package typings.atMaterialDashUiCore.inputBaseInputBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.Anon_Html
import typings.react.Event
import typings.react.NativeMouseEvent
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.none
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.vertical
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBaseComponentProps
  extends HTMLAttributes[HTMLInputElement | HTMLTextAreaElement]
     with // Accommodate arbitrary additional props coming from the `inputProps` prop
/* arbitrary */ StringDictionary[js.Any]

object InputBaseComponentProps {
  @scala.inline
  def apply(
    StringDictionary: // Accommodate arbitrary additional props coming from the `inputProps` prop
  /* arbitrary */ StringDictionary[js.Any] = null,
    about: String = null,
    accessKey: String = null,
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
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onAbortCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAnimationEndCapture: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAnimationIterationCapture: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAnimationStartCapture: AnimationEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onAuxClickCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onBeforeInputCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onBlur: FocusEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onBlurCapture: FocusEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onCanPlayCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onCanPlayThroughCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onChange: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onChangeCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onClick: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onClickCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCompositionEndCapture: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCompositionStartCapture: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCompositionUpdateCapture: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onContextMenuCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCopyCapture: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCut: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onCutCapture: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onDoubleClickCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragEnd: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragEndCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragEnter: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragEnterCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragExit: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragExitCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragLeave: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragLeaveCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragOver: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragOverCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragStart: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDragStartCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDrop: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDropCapture: DragEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onDurationChangeCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEmptiedCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEncryptedCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onEndedCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onErrorCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onFocusCapture: FocusEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onGotPointerCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onGotPointerCaptureCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onInput: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onInputCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onInvalid: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onInvalidCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyDownCapture: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyPressCapture: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onKeyUpCapture: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadStartCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadedDataCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLoadedMetadataCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onLostPointerCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onLostPointerCaptureCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onMouseDown: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseDownCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseMoveCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseOutCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseOverCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onMouseUpCapture: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPasteCapture: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPause: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPauseCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPlayCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPlayingCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerCancelCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerDownCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerEnterCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerLeaveCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerMoveCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerOutCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerOverCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onPointerUpCapture: PointerEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onProgressCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onRateChangeCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onReset: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onResetCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onScroll: UIEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onScrollCapture: UIEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSeekedCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSeekingCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSelectCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onStalledCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onSubmitCapture: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onSuspendCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onTimeUpdateCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchCancelCapture: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchEndCapture: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchMoveCapture: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTouchStartCapture: TouchEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onTransitionEndCapture: TransitionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onVolumeChangeCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onWaitingCapture: SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    onWheelCapture: WheelEvent[HTMLInputElement | HTMLTextAreaElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
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
    title: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): InputBaseComponentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
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
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(js.Any.fromFunction1(onAuxClickCapture))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(js.Any.fromFunction1(onBeforeInputCapture))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(onCompositionEndCapture))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(onCompositionStartCapture))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(onCompositionUpdateCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1(onCopyCapture))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1(onCutCapture))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(js.Any.fromFunction1(onDoubleClickCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1(onDragExitCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(js.Any.fromFunction1(onEncryptedCapture))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1(onErrorCapture))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(onGotPointerCapture))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(onGotPointerCaptureCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1(onInvalidCapture))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1(onLostPointerCapture))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1(onLostPointerCaptureCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1(onPasteCapture))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(onTimeUpdateCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(onTouchCancelCapture))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(onTouchMoveCapture))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(onTouchStartCapture))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(onTransitionEndCapture))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
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
    if (title != null) __obj.updateDynamic("title")(title)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    __obj.asInstanceOf[InputBaseComponentProps]
  }
}

