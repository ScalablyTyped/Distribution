package typings.ionicCore.stencilCoreMod.JSXBase

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.Event_
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCut: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onDblClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
   // also a Media Event
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInputCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInvalid: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onResetCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.undefined
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.undefined
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.undefined
  var ref: js.UndefOr[js.Function1[/* elm */ js.UndefOr[T], Unit]] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    onAnimationEnd: /* event */ AnimationEvent => Unit = null,
    onAnimationEndCapture: /* event */ AnimationEvent => Unit = null,
    onAnimationIteration: /* event */ AnimationEvent => Unit = null,
    onAnimationIterationCapture: /* event */ AnimationEvent => Unit = null,
    onAnimationStart: /* event */ AnimationEvent => Unit = null,
    onAnimationStartCapture: /* event */ AnimationEvent => Unit = null,
    onAuxClick: /* event */ MouseEvent => Unit = null,
    onBlur: /* event */ FocusEvent => Unit = null,
    onBlurCapture: /* event */ FocusEvent => Unit = null,
    onChange: /* event */ Event_ => Unit = null,
    onChangeCapture: /* event */ Event_ => Unit = null,
    onClick: /* event */ MouseEvent => Unit = null,
    onClickCapture: /* event */ MouseEvent => Unit = null,
    onCompositionEnd: /* event */ CompositionEvent => Unit = null,
    onCompositionEndCapture: /* event */ CompositionEvent => Unit = null,
    onCompositionStart: /* event */ CompositionEvent => Unit = null,
    onCompositionStartCapture: /* event */ CompositionEvent => Unit = null,
    onCompositionUpdate: /* event */ CompositionEvent => Unit = null,
    onCompositionUpdateCapture: /* event */ CompositionEvent => Unit = null,
    onContextMenu: /* event */ MouseEvent => Unit = null,
    onContextMenuCapture: /* event */ MouseEvent => Unit = null,
    onCopy: /* event */ ClipboardEvent => Unit = null,
    onCopyCapture: /* event */ ClipboardEvent => Unit = null,
    onCut: /* event */ ClipboardEvent => Unit = null,
    onCutCapture: /* event */ ClipboardEvent => Unit = null,
    onDblClick: /* event */ MouseEvent => Unit = null,
    onDblClickCapture: /* event */ MouseEvent => Unit = null,
    onDrag: /* event */ DragEvent => Unit = null,
    onDragCapture: /* event */ DragEvent => Unit = null,
    onDragEnd: /* event */ DragEvent => Unit = null,
    onDragEndCapture: /* event */ DragEvent => Unit = null,
    onDragEnter: /* event */ DragEvent => Unit = null,
    onDragEnterCapture: /* event */ DragEvent => Unit = null,
    onDragExit: /* event */ DragEvent => Unit = null,
    onDragExitCapture: /* event */ DragEvent => Unit = null,
    onDragLeave: /* event */ DragEvent => Unit = null,
    onDragLeaveCapture: /* event */ DragEvent => Unit = null,
    onDragOver: /* event */ DragEvent => Unit = null,
    onDragOverCapture: /* event */ DragEvent => Unit = null,
    onDragStart: /* event */ DragEvent => Unit = null,
    onDragStartCapture: /* event */ DragEvent => Unit = null,
    onDrop: /* event */ DragEvent => Unit = null,
    onDropCapture: /* event */ DragEvent => Unit = null,
    onError: /* event */ Event_ => Unit = null,
    onErrorCapture: /* event */ Event_ => Unit = null,
    onFocus: /* event */ FocusEvent => Unit = null,
    onFocusCapture: /* event */ FocusEvent => Unit = null,
    onGotPointerCapture: /* event */ PointerEvent => Unit = null,
    onGotPointerCaptureCapture: /* event */ PointerEvent => Unit = null,
    onInput: /* event */ Event_ => Unit = null,
    onInputCapture: /* event */ Event_ => Unit = null,
    onInvalid: /* event */ Event_ => Unit = null,
    onInvalidCapture: /* event */ Event_ => Unit = null,
    onKeyDown: /* event */ KeyboardEvent => Unit = null,
    onKeyDownCapture: /* event */ KeyboardEvent => Unit = null,
    onKeyPress: /* event */ KeyboardEvent => Unit = null,
    onKeyPressCapture: /* event */ KeyboardEvent => Unit = null,
    onKeyUp: /* event */ KeyboardEvent => Unit = null,
    onKeyUpCapture: /* event */ KeyboardEvent => Unit = null,
    onLoad: /* event */ Event_ => Unit = null,
    onLoadCapture: /* event */ Event_ => Unit = null,
    onLostPointerCapture: /* event */ PointerEvent => Unit = null,
    onLostPointerCaptureCapture: /* event */ PointerEvent => Unit = null,
    onMouseDown: /* event */ MouseEvent => Unit = null,
    onMouseDownCapture: /* event */ MouseEvent => Unit = null,
    onMouseEnter: /* event */ MouseEvent => Unit = null,
    onMouseLeave: /* event */ MouseEvent => Unit = null,
    onMouseMove: /* event */ MouseEvent => Unit = null,
    onMouseMoveCapture: /* event */ MouseEvent => Unit = null,
    onMouseOut: /* event */ MouseEvent => Unit = null,
    onMouseOutCapture: /* event */ MouseEvent => Unit = null,
    onMouseOver: /* event */ MouseEvent => Unit = null,
    onMouseOverCapture: /* event */ MouseEvent => Unit = null,
    onMouseUp: /* event */ MouseEvent => Unit = null,
    onMouseUpCapture: /* event */ MouseEvent => Unit = null,
    onPaste: /* event */ ClipboardEvent => Unit = null,
    onPasteCapture: /* event */ ClipboardEvent => Unit = null,
    onPointerCancel: /* event */ PointerEvent => Unit = null,
    onPointerCancelCapture: /* event */ PointerEvent => Unit = null,
    onPointerDown: /* event */ PointerEvent => Unit = null,
    onPointerDownCapture: /* event */ PointerEvent => Unit = null,
    onPointerEnter: /* event */ PointerEvent => Unit = null,
    onPointerEnterCapture: /* event */ PointerEvent => Unit = null,
    onPointerLeave: /* event */ PointerEvent => Unit = null,
    onPointerLeaveCapture: /* event */ PointerEvent => Unit = null,
    onPointerMove: /* event */ PointerEvent => Unit = null,
    onPointerMoveCapture: /* event */ PointerEvent => Unit = null,
    onPointerOut: /* event */ PointerEvent => Unit = null,
    onPointerOutCapture: /* event */ PointerEvent => Unit = null,
    onPointerOver: /* event */ PointerEvent => Unit = null,
    onPointerOverCapture: /* event */ PointerEvent => Unit = null,
    onPointerUp: /* event */ PointerEvent => Unit = null,
    onPointerUpCapture: /* event */ PointerEvent => Unit = null,
    onReset: /* event */ Event_ => Unit = null,
    onResetCapture: /* event */ Event_ => Unit = null,
    onScroll: /* event */ UIEvent => Unit = null,
    onScrollCapture: /* event */ UIEvent => Unit = null,
    onSubmit: /* event */ Event_ => Unit = null,
    onSubmitCapture: /* event */ Event_ => Unit = null,
    onTouchCancel: /* event */ TouchEvent => Unit = null,
    onTouchCancelCapture: /* event */ TouchEvent => Unit = null,
    onTouchEnd: /* event */ TouchEvent => Unit = null,
    onTouchEndCapture: /* event */ TouchEvent => Unit = null,
    onTouchMove: /* event */ TouchEvent => Unit = null,
    onTouchMoveCapture: /* event */ TouchEvent => Unit = null,
    onTouchStart: /* event */ TouchEvent => Unit = null,
    onTouchStartCapture: /* event */ TouchEvent => Unit = null,
    onTransitionEnd: /* event */ TransitionEvent => Unit = null,
    onTransitionEndCapture: /* event */ TransitionEvent => Unit = null,
    onWheel: /* event */ WheelEvent => Unit = null,
    onWheelCapture: /* event */ WheelEvent => Unit = null,
    ref: /* elm */ js.UndefOr[T] => Unit = null,
    slot: String = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
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
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
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
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
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
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

