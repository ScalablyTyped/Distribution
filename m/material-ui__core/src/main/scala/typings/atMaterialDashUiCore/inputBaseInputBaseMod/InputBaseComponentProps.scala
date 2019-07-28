package typings.atMaterialDashUiCore.inputBaseInputBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEventHandler
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.PointerEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.TransitionEventHandler
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEventHandler
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
    defaultValue: String | js.Array[String] = null,
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
    onAbort: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAbortCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationEnd: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationEndCapture: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationIteration: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationIterationCapture: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationStart: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAnimationStartCapture: AnimationEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAuxClick: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onAuxClickCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onBeforeInput: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onBeforeInputCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onBlur: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onBlurCapture: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCanPlay: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCanPlayCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCanPlayThrough: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCanPlayThroughCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onChange: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onChangeCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onClick: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onClickCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionEndCapture: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionStartCapture: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionUpdate: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCompositionUpdateCapture: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onContextMenu: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onContextMenuCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCopy: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCopyCapture: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCut: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onCutCapture: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDoubleClick: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDoubleClickCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDrag: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragEnd: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragEndCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragEnter: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragEnterCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragExit: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragExitCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragLeave: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragLeaveCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragOver: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragOverCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragStart: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDragStartCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDrop: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDropCapture: DragEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDurationChange: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onDurationChangeCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEmptied: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEmptiedCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEncrypted: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEncryptedCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEnded: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onEndedCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onError: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onErrorCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onFocus: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onFocusCapture: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onGotPointerCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onGotPointerCaptureCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onInput: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onInputCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onInvalid: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onInvalidCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyDownCapture: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyPressCapture: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onKeyUpCapture: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoad: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadStart: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadStartCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadedData: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadedDataCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadedMetadata: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLoadedMetadataCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLostPointerCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onLostPointerCaptureCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseDownCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseEnter: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseLeave: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseMove: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseMoveCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseOut: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseOutCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseOver: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseOverCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseUp: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onMouseUpCapture: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPasteCapture: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPause: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPauseCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPlay: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPlayCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPlaying: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPlayingCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerCancel: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerCancelCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerDown: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerDownCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerEnter: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerEnterCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerLeave: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerLeaveCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerMove: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerMoveCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerOut: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerOutCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerOver: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerOverCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerUp: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onPointerUpCapture: PointerEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onProgress: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onProgressCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onRateChange: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onRateChangeCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onReset: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onResetCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onScroll: UIEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onScrollCapture: UIEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSeeked: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSeekedCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSeeking: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSeekingCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSelect: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSelectCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onStalled: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onStalledCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSubmit: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSubmitCapture: FormEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSuspend: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onSuspendCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTimeUpdate: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTimeUpdateCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchCancel: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchCancelCapture: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchEnd: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchEndCapture: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchMove: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchMoveCapture: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchStart: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTouchStartCapture: TouchEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTransitionEnd: TransitionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onTransitionEndCapture: TransitionEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onVolumeChange: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onVolumeChangeCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onWaiting: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onWaitingCapture: ReactEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onWheel: WheelEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
    onWheelCapture: WheelEventHandler[HTMLInputElement | HTMLTextAreaElement] = null,
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
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(onAbortCapture)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(onAnimationEndCapture)
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration)
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(onAnimationIterationCapture)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(onAnimationStartCapture)
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick)
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(onAuxClickCapture)
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(onBeforeInputCapture)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(onBlurCapture)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(onCanPlayCapture)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(onCanPlayThroughCapture)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(onChangeCapture)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(onClickCapture)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(onCompositionEndCapture)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(onCompositionStartCapture)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(onCompositionUpdateCapture)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(onContextMenuCapture)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(onCopyCapture)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(onCutCapture)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(onDoubleClickCapture)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(onDragCapture)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(onDragEndCapture)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(onDragEnterCapture)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(onDragExitCapture)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(onDragLeaveCapture)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(onDragOverCapture)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(onDragStartCapture)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(onDropCapture)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(onDurationChangeCapture)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(onEmptiedCapture)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(onEncryptedCapture)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(onEndedCapture)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(onFocusCapture)
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(onGotPointerCapture)
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(onGotPointerCaptureCapture)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(onInputCapture)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid)
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(onInvalidCapture)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(onKeyDownCapture)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(onKeyPressCapture)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(onKeyUpCapture)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(onLoadCapture)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(onLoadStartCapture)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(onLoadedDataCapture)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(onLoadedMetadataCapture)
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(onLostPointerCapture)
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(onLostPointerCaptureCapture)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(onMouseDownCapture)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(onMouseMoveCapture)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(onMouseOutCapture)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(onMouseOverCapture)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(onMouseUpCapture)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(onPasteCapture)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(onPauseCapture)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(onPlayCapture)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(onPlayingCapture)
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel)
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(onPointerCancelCapture)
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown)
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(onPointerDownCapture)
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter)
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(onPointerEnterCapture)
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave)
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(onPointerLeaveCapture)
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove)
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(onPointerMoveCapture)
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut)
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(onPointerOutCapture)
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver)
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(onPointerOverCapture)
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp)
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(onPointerUpCapture)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(onProgressCapture)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(onRateChangeCapture)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(onResetCapture)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(onScrollCapture)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(onSeekedCapture)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(onSeekingCapture)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(onSelectCapture)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(onStalledCapture)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(onSubmitCapture)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(onSuspendCapture)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(onTimeUpdateCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(onTransitionEndCapture)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(onVolumeChangeCapture)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(onWaitingCapture)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(onWheelCapture)
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

