package typings.materialDashUi.__MaterialUI

import typings.react.Anon_Html
import typings.react.Event
import typings.react.NativeMouseEvent
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.Key
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait DialogProps
  extends DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.undefined
  var actions: js.UndefOr[js.Array[DialogAction | ReactElement]] = js.undefined
  var actionsContainerClassName: js.UndefOr[String] = js.undefined
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined
  var bodyClassName: js.UndefOr[String] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.undefined
  var open: Boolean
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var paperClassName: js.UndefOr[String] = js.undefined
  var paperProps: js.UndefOr[js.Any] = js.undefined
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.undefined
  var repositionOnUpdate: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var titleClassName: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    open: Boolean,
    actionFocus: String = null,
    actions: js.Array[DialogAction | ReactElement] = null,
    actionsContainerClassName: String = null,
    actionsContainerStyle: CSSProperties = null,
    autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined,
    autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined,
    bodyClassName: String = null,
    bodyStyle: CSSProperties = null,
    children: ReactNode = null,
    className: String = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    key: Key = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[js.Object, Event] => Unit = null,
    onAbortCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[js.Object] => Unit = null,
    onAnimationEndCapture: AnimationEvent[js.Object] => Unit = null,
    onAnimationIteration: AnimationEvent[js.Object] => Unit = null,
    onAnimationIterationCapture: AnimationEvent[js.Object] => Unit = null,
    onAnimationStart: AnimationEvent[js.Object] => Unit = null,
    onAnimationStartCapture: AnimationEvent[js.Object] => Unit = null,
    onAuxClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onAuxClickCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[js.Object] => Unit = null,
    onBeforeInputCapture: FormEvent[js.Object] => Unit = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onBlurCapture: FocusEvent[js.Object] => Unit = null,
    onCanPlay: SyntheticEvent[js.Object, Event] => Unit = null,
    onCanPlayCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[js.Object, Event] => Unit = null,
    onCanPlayThroughCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onChange: FormEvent[js.Object] => Unit = null,
    onChangeCapture: FormEvent[js.Object] => Unit = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onClickCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[js.Object] => Unit = null,
    onCompositionEndCapture: CompositionEvent[js.Object] => Unit = null,
    onCompositionStart: CompositionEvent[js.Object] => Unit = null,
    onCompositionStartCapture: CompositionEvent[js.Object] => Unit = null,
    onCompositionUpdate: CompositionEvent[js.Object] => Unit = null,
    onCompositionUpdateCapture: CompositionEvent[js.Object] => Unit = null,
    onContextMenu: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onContextMenuCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[js.Object] => Unit = null,
    onCopyCapture: ClipboardEvent[js.Object] => Unit = null,
    onCut: ClipboardEvent[js.Object] => Unit = null,
    onCutCapture: ClipboardEvent[js.Object] => Unit = null,
    onDoubleClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDoubleClickCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[js.Object] => Unit = null,
    onDragCapture: DragEvent[js.Object] => Unit = null,
    onDragEnd: DragEvent[js.Object] => Unit = null,
    onDragEndCapture: DragEvent[js.Object] => Unit = null,
    onDragEnter: DragEvent[js.Object] => Unit = null,
    onDragEnterCapture: DragEvent[js.Object] => Unit = null,
    onDragExit: DragEvent[js.Object] => Unit = null,
    onDragExitCapture: DragEvent[js.Object] => Unit = null,
    onDragLeave: DragEvent[js.Object] => Unit = null,
    onDragLeaveCapture: DragEvent[js.Object] => Unit = null,
    onDragOver: DragEvent[js.Object] => Unit = null,
    onDragOverCapture: DragEvent[js.Object] => Unit = null,
    onDragStart: DragEvent[js.Object] => Unit = null,
    onDragStartCapture: DragEvent[js.Object] => Unit = null,
    onDrop: DragEvent[js.Object] => Unit = null,
    onDropCapture: DragEvent[js.Object] => Unit = null,
    onDurationChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onDurationChangeCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onEmptied: SyntheticEvent[js.Object, Event] => Unit = null,
    onEmptiedCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onEncrypted: SyntheticEvent[js.Object, Event] => Unit = null,
    onEncryptedCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onEnded: SyntheticEvent[js.Object, Event] => Unit = null,
    onEndedCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onError: SyntheticEvent[js.Object, Event] => Unit = null,
    onErrorCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onFocusCapture: FocusEvent[js.Object] => Unit = null,
    onGotPointerCapture: PointerEvent[js.Object] => Unit = null,
    onGotPointerCaptureCapture: PointerEvent[js.Object] => Unit = null,
    onInput: FormEvent[js.Object] => Unit = null,
    onInputCapture: FormEvent[js.Object] => Unit = null,
    onInvalid: FormEvent[js.Object] => Unit = null,
    onInvalidCapture: FormEvent[js.Object] => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onKeyDownCapture: KeyboardEvent[js.Object] => Unit = null,
    onKeyPress: KeyboardEvent[js.Object] => Unit = null,
    onKeyPressCapture: KeyboardEvent[js.Object] => Unit = null,
    onKeyUp: KeyboardEvent[js.Object] => Unit = null,
    onKeyUpCapture: KeyboardEvent[js.Object] => Unit = null,
    onLoad: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadStart: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadStartCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedData: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedDataCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedMetadataCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onLostPointerCapture: PointerEvent[js.Object] => Unit = null,
    onLostPointerCaptureCapture: PointerEvent[js.Object] => Unit = null,
    onMouseDown: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseDownCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseMoveCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOutCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOverCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseUpCapture: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[js.Object] => Unit = null,
    onPasteCapture: ClipboardEvent[js.Object] => Unit = null,
    onPause: SyntheticEvent[js.Object, Event] => Unit = null,
    onPauseCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlay: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlayCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlaying: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlayingCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onPointerCancel: PointerEvent[js.Object] => Unit = null,
    onPointerCancelCapture: PointerEvent[js.Object] => Unit = null,
    onPointerDown: PointerEvent[js.Object] => Unit = null,
    onPointerDownCapture: PointerEvent[js.Object] => Unit = null,
    onPointerEnter: PointerEvent[js.Object] => Unit = null,
    onPointerEnterCapture: PointerEvent[js.Object] => Unit = null,
    onPointerLeave: PointerEvent[js.Object] => Unit = null,
    onPointerLeaveCapture: PointerEvent[js.Object] => Unit = null,
    onPointerMove: PointerEvent[js.Object] => Unit = null,
    onPointerMoveCapture: PointerEvent[js.Object] => Unit = null,
    onPointerOut: PointerEvent[js.Object] => Unit = null,
    onPointerOutCapture: PointerEvent[js.Object] => Unit = null,
    onPointerOver: PointerEvent[js.Object] => Unit = null,
    onPointerOverCapture: PointerEvent[js.Object] => Unit = null,
    onPointerUp: PointerEvent[js.Object] => Unit = null,
    onPointerUpCapture: PointerEvent[js.Object] => Unit = null,
    onProgress: SyntheticEvent[js.Object, Event] => Unit = null,
    onProgressCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onRateChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onRateChangeCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onRequestClose: /* buttonClicked */ Boolean => Unit = null,
    onReset: FormEvent[js.Object] => Unit = null,
    onResetCapture: FormEvent[js.Object] => Unit = null,
    onScroll: UIEvent[js.Object] => Unit = null,
    onScrollCapture: UIEvent[js.Object] => Unit = null,
    onSeeked: SyntheticEvent[js.Object, Event] => Unit = null,
    onSeekedCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onSeeking: SyntheticEvent[js.Object, Event] => Unit = null,
    onSeekingCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onSelect: SyntheticEvent[js.Object, Event] => Unit = null,
    onSelectCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onStalled: SyntheticEvent[js.Object, Event] => Unit = null,
    onStalledCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onSubmit: FormEvent[js.Object] => Unit = null,
    onSubmitCapture: FormEvent[js.Object] => Unit = null,
    onSuspend: SyntheticEvent[js.Object, Event] => Unit = null,
    onSuspendCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[js.Object, Event] => Unit = null,
    onTimeUpdateCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onTouchCancel: TouchEvent[js.Object] => Unit = null,
    onTouchCancelCapture: TouchEvent[js.Object] => Unit = null,
    onTouchEnd: TouchEvent[js.Object] => Unit = null,
    onTouchEndCapture: TouchEvent[js.Object] => Unit = null,
    onTouchMove: TouchEvent[js.Object] => Unit = null,
    onTouchMoveCapture: TouchEvent[js.Object] => Unit = null,
    onTouchStart: TouchEvent[js.Object] => Unit = null,
    onTouchStartCapture: TouchEvent[js.Object] => Unit = null,
    onTransitionEnd: TransitionEvent[js.Object] => Unit = null,
    onTransitionEndCapture: TransitionEvent[js.Object] => Unit = null,
    onVolumeChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onVolumeChangeCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onWaiting: SyntheticEvent[js.Object, Event] => Unit = null,
    onWaitingCapture: SyntheticEvent[js.Object, Event] => Unit = null,
    onWheel: WheelEvent[js.Object] => Unit = null,
    onWheelCapture: WheelEvent[js.Object] => Unit = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    paperClassName: String = null,
    paperProps: js.Any = null,
    ref: LegacyRef[Dialog] = null,
    repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: ReactNode = null,
    titleClassName: String = null,
    titleStyle: CSSProperties = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName)
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle)
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight)
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent)
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
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
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
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
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName)
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[DialogProps]
  }
}

