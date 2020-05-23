package typings.materialUi.MaterialUI

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DOMAttributes
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ trait DialogProps
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
    dangerouslySetInnerHTML: Html = null,
    key: Key = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[js.Object, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[js.Object] => Unit = null,
    onAnimationIteration: AnimationEvent[js.Object] => Unit = null,
    onAnimationStart: AnimationEvent[js.Object] => Unit = null,
    onAuxClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[js.Object] => Unit = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onCanPlay: SyntheticEvent[js.Object, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[js.Object, Event] => Unit = null,
    onChange: FormEvent[js.Object] => Unit = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[js.Object] => Unit = null,
    onCompositionStart: CompositionEvent[js.Object] => Unit = null,
    onCompositionUpdate: CompositionEvent[js.Object] => Unit = null,
    onContextMenu: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[js.Object] => Unit = null,
    onCut: ClipboardEvent[js.Object] => Unit = null,
    onDoubleClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[js.Object] => Unit = null,
    onDragEnd: DragEvent[js.Object] => Unit = null,
    onDragEnter: DragEvent[js.Object] => Unit = null,
    onDragExit: DragEvent[js.Object] => Unit = null,
    onDragLeave: DragEvent[js.Object] => Unit = null,
    onDragOver: DragEvent[js.Object] => Unit = null,
    onDragStart: DragEvent[js.Object] => Unit = null,
    onDrop: DragEvent[js.Object] => Unit = null,
    onDurationChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onEmptied: SyntheticEvent[js.Object, Event] => Unit = null,
    onEncrypted: SyntheticEvent[js.Object, Event] => Unit = null,
    onEnded: SyntheticEvent[js.Object, Event] => Unit = null,
    onError: SyntheticEvent[js.Object, Event] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onInput: FormEvent[js.Object] => Unit = null,
    onInvalid: FormEvent[js.Object] => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onKeyPress: KeyboardEvent[js.Object] => Unit = null,
    onKeyUp: KeyboardEvent[js.Object] => Unit = null,
    onLoad: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadStart: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedData: SyntheticEvent[js.Object, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[js.Object, Event] => Unit = null,
    onMouseDown: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[js.Object] => Unit = null,
    onPause: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlay: SyntheticEvent[js.Object, Event] => Unit = null,
    onPlaying: SyntheticEvent[js.Object, Event] => Unit = null,
    onPointerCancel: PointerEvent[js.Object] => Unit = null,
    onPointerDown: PointerEvent[js.Object] => Unit = null,
    onPointerEnter: PointerEvent[js.Object] => Unit = null,
    onPointerLeave: PointerEvent[js.Object] => Unit = null,
    onPointerMove: PointerEvent[js.Object] => Unit = null,
    onPointerOut: PointerEvent[js.Object] => Unit = null,
    onPointerOver: PointerEvent[js.Object] => Unit = null,
    onPointerUp: PointerEvent[js.Object] => Unit = null,
    onProgress: SyntheticEvent[js.Object, Event] => Unit = null,
    onRateChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onRequestClose: /* buttonClicked */ Boolean => Unit = null,
    onReset: FormEvent[js.Object] => Unit = null,
    onScroll: UIEvent[js.Object, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[js.Object, Event] => Unit = null,
    onSeeking: SyntheticEvent[js.Object, Event] => Unit = null,
    onSelect: SyntheticEvent[js.Object, Event] => Unit = null,
    onStalled: SyntheticEvent[js.Object, Event] => Unit = null,
    onSubmit: FormEvent[js.Object] => Unit = null,
    onSuspend: SyntheticEvent[js.Object, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[js.Object, Event] => Unit = null,
    onTouchCancel: TouchEvent[js.Object] => Unit = null,
    onTouchEnd: TouchEvent[js.Object] => Unit = null,
    onTouchMove: TouchEvent[js.Object] => Unit = null,
    onTouchStart: TouchEvent[js.Object] => Unit = null,
    onTransitionEnd: TransitionEvent[js.Object] => Unit = null,
    onVolumeChange: SyntheticEvent[js.Object, Event] => Unit = null,
    onWaiting: SyntheticEvent[js.Object, Event] => Unit = null,
    onWheel: WheelEvent[js.Object] => Unit = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    paperClassName: String = null,
    paperProps: js.Any = null,
    ref: js.UndefOr[Null | LegacyRef[Dialog]] = js.undefined,
    repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: ReactNode = null,
    titleClassName: String = null,
    titleStyle: CSSProperties = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName.asInstanceOf[js.Any])
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent.get.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName.asInstanceOf[js.Any])
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

