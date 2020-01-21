package typings.ionicons.stencilCoreMod.JSXBase

import org.scalablytyped.runtime.StringDictionary
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

trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var crossorigin: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var mediagroup: js.UndefOr[String] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  // https://developer.mozilla.org/en-US/docs/Web/Guide/Events/Media_events
  var onAbort: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onCanPlay: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onEmptied: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInterruptBegin: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInterruptEnd: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadedData: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadedMetaData: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onMozAudioAvailable: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onPlaying: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onRateChange: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSeeking: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onStalled: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSuspend: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onWaiting: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](
    about: String = null,
    accessKey: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    autocapitalize: String = null,
    autocorrect: String = null,
    autoplay: Boolean | String = null,
    autosave: String = null,
    `class`: String | StringDictionary[Boolean] = null,
    color: String = null,
    contentEditable: Boolean | String = null,
    contenteditable: Boolean | String = null,
    contextMenu: String = null,
    contextmenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String = null,
    crossorigin: String = null,
    datatype: String = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    innerHTML: String = null,
    inputMode: String = null,
    inputmode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    itemid: String = null,
    itemprop: String = null,
    itemref: String = null,
    itemscope: js.UndefOr[Boolean] = js.undefined,
    itemtype: String = null,
    key: String | Double = null,
    lang: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mediaGroup: String = null,
    mediagroup: String = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    onAbort: /* event */ Event_ => Unit = null,
    onAnimationEnd: /* event */ AnimationEvent => Unit = null,
    onAnimationEndCapture: /* event */ AnimationEvent => Unit = null,
    onAnimationIteration: /* event */ AnimationEvent => Unit = null,
    onAnimationIterationCapture: /* event */ AnimationEvent => Unit = null,
    onAnimationStart: /* event */ AnimationEvent => Unit = null,
    onAnimationStartCapture: /* event */ AnimationEvent => Unit = null,
    onAuxClick: /* event */ MouseEvent => Unit = null,
    onBlur: /* event */ FocusEvent => Unit = null,
    onBlurCapture: /* event */ FocusEvent => Unit = null,
    onCanPlay: /* event */ Event_ => Unit = null,
    onCanPlayThrough: /* event */ Event_ => Unit = null,
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
    onDurationChange: /* event */ Event_ => Unit = null,
    onEmptied: /* event */ Event_ => Unit = null,
    onEnded: /* event */ Event_ => Unit = null,
    onError: /* event */ Event_ => Unit = null,
    onErrorCapture: /* event */ Event_ => Unit = null,
    onFocus: /* event */ FocusEvent => Unit = null,
    onFocusCapture: /* event */ FocusEvent => Unit = null,
    onGotPointerCapture: /* event */ PointerEvent => Unit = null,
    onGotPointerCaptureCapture: /* event */ PointerEvent => Unit = null,
    onInput: /* event */ Event_ => Unit = null,
    onInputCapture: /* event */ Event_ => Unit = null,
    onInterruptBegin: /* event */ Event_ => Unit = null,
    onInterruptEnd: /* event */ Event_ => Unit = null,
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
    onLoadStart: /* event */ Event_ => Unit = null,
    onLoadedData: /* event */ Event_ => Unit = null,
    onLoadedMetaData: /* event */ Event_ => Unit = null,
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
    onMozAudioAvailable: /* event */ Event_ => Unit = null,
    onPaste: /* event */ ClipboardEvent => Unit = null,
    onPasteCapture: /* event */ ClipboardEvent => Unit = null,
    onPause: /* event */ Event_ => Unit = null,
    onPlay: /* event */ Event_ => Unit = null,
    onPlaying: /* event */ Event_ => Unit = null,
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
    onProgress: /* event */ Event_ => Unit = null,
    onRateChange: /* event */ Event_ => Unit = null,
    onReset: /* event */ Event_ => Unit = null,
    onResetCapture: /* event */ Event_ => Unit = null,
    onScroll: /* event */ UIEvent => Unit = null,
    onScrollCapture: /* event */ UIEvent => Unit = null,
    onSeeked: /* event */ Event_ => Unit = null,
    onSeeking: /* event */ Event_ => Unit = null,
    onStalled: /* event */ Event_ => Unit = null,
    onSubmit: /* event */ Event_ => Unit = null,
    onSubmitCapture: /* event */ Event_ => Unit = null,
    onSuspend: /* event */ Event_ => Unit = null,
    onTimeUpdate: /* event */ Event_ => Unit = null,
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
    onVolumeChange: /* event */ Event_ => Unit = null,
    onWaiting: /* event */ Event_ => Unit = null,
    onWheel: /* event */ WheelEvent => Unit = null,
    onWheelCapture: /* event */ WheelEvent => Unit = null,
    part: String = null,
    prefix: String = null,
    preload: String = null,
    property: String = null,
    radioGroup: String = null,
    radiogroup: String = null,
    ref: /* elm */ js.UndefOr[T] => Unit = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    spellcheck: Boolean | String = null,
    src: String = null,
    style: StringDictionary[js.UndefOr[String]] = null,
    tabIndex: Int | Double = null,
    tabindex: Double | String = null,
    title: String = null,
    typeof: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null
  ): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (autocorrect != null) __obj.updateDynamic("autocorrect")(autocorrect.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autosave != null) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contenteditable != null) __obj.updateDynamic("contenteditable")(contenteditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (itemid != null) __obj.updateDynamic("itemid")(itemid.asInstanceOf[js.Any])
    if (itemprop != null) __obj.updateDynamic("itemprop")(itemprop.asInstanceOf[js.Any])
    if (itemref != null) __obj.updateDynamic("itemref")(itemref.asInstanceOf[js.Any])
    if (!js.isUndefined(itemscope)) __obj.updateDynamic("itemscope")(itemscope.asInstanceOf[js.Any])
    if (itemtype != null) __obj.updateDynamic("itemtype")(itemtype.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (mediagroup != null) __obj.updateDynamic("mediagroup")(mediagroup.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
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
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1(onErrorCapture))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(onGotPointerCapture))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(onGotPointerCaptureCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onInterruptBegin != null) __obj.updateDynamic("onInterruptBegin")(js.Any.fromFunction1(onInterruptBegin))
    if (onInterruptEnd != null) __obj.updateDynamic("onInterruptEnd")(js.Any.fromFunction1(onInterruptEnd))
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
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetaData != null) __obj.updateDynamic("onLoadedMetaData")(js.Any.fromFunction1(onLoadedMetaData))
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
    if (onMozAudioAvailable != null) __obj.updateDynamic("onMozAudioAvailable")(js.Any.fromFunction1(onMozAudioAvailable))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1(onPasteCapture))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
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
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
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
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (radiogroup != null) __obj.updateDynamic("radiogroup")(radiogroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
}

