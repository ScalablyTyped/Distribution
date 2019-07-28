package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.materialDashUi.materialDashUiStrings.after
import typings.materialDashUi.materialDashUiStrings.before
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEventHandler
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.PointerEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.TransitionEventHandler
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.materialDashUi.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, style, tabIndex, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait FlatButtonProps
  extends DOMAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[String] = js.undefined
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var labelPosition: js.UndefOr[before | after] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var linkButton: js.UndefOr[Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var touchRippleColor: js.UndefOr[String] = js.undefined
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object FlatButtonProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    containerElement: ReactNode | String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hoverColor: String = null,
    href: String = null,
    icon: ReactNode = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventHandler[js.Object] = null,
    onAbortCapture: ReactEventHandler[js.Object] = null,
    onAnimationEnd: AnimationEventHandler[js.Object] = null,
    onAnimationEndCapture: AnimationEventHandler[js.Object] = null,
    onAnimationIteration: AnimationEventHandler[js.Object] = null,
    onAnimationIterationCapture: AnimationEventHandler[js.Object] = null,
    onAnimationStart: AnimationEventHandler[js.Object] = null,
    onAnimationStartCapture: AnimationEventHandler[js.Object] = null,
    onAuxClick: MouseEventHandler[js.Object] = null,
    onAuxClickCapture: MouseEventHandler[js.Object] = null,
    onBeforeInput: FormEventHandler[js.Object] = null,
    onBeforeInputCapture: FormEventHandler[js.Object] = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onBlurCapture: FocusEventHandler[js.Object] = null,
    onCanPlay: ReactEventHandler[js.Object] = null,
    onCanPlayCapture: ReactEventHandler[js.Object] = null,
    onCanPlayThrough: ReactEventHandler[js.Object] = null,
    onCanPlayThroughCapture: ReactEventHandler[js.Object] = null,
    onChange: FormEventHandler[js.Object] = null,
    onChangeCapture: FormEventHandler[js.Object] = null,
    onClick: MouseEventHandler[js.Object] = null,
    onClickCapture: MouseEventHandler[js.Object] = null,
    onCompositionEnd: CompositionEventHandler[js.Object] = null,
    onCompositionEndCapture: CompositionEventHandler[js.Object] = null,
    onCompositionStart: CompositionEventHandler[js.Object] = null,
    onCompositionStartCapture: CompositionEventHandler[js.Object] = null,
    onCompositionUpdate: CompositionEventHandler[js.Object] = null,
    onCompositionUpdateCapture: CompositionEventHandler[js.Object] = null,
    onContextMenu: MouseEventHandler[js.Object] = null,
    onContextMenuCapture: MouseEventHandler[js.Object] = null,
    onCopy: ClipboardEventHandler[js.Object] = null,
    onCopyCapture: ClipboardEventHandler[js.Object] = null,
    onCut: ClipboardEventHandler[js.Object] = null,
    onCutCapture: ClipboardEventHandler[js.Object] = null,
    onDoubleClick: MouseEventHandler[js.Object] = null,
    onDoubleClickCapture: MouseEventHandler[js.Object] = null,
    onDrag: DragEventHandler[js.Object] = null,
    onDragCapture: DragEventHandler[js.Object] = null,
    onDragEnd: DragEventHandler[js.Object] = null,
    onDragEndCapture: DragEventHandler[js.Object] = null,
    onDragEnter: DragEventHandler[js.Object] = null,
    onDragEnterCapture: DragEventHandler[js.Object] = null,
    onDragExit: DragEventHandler[js.Object] = null,
    onDragExitCapture: DragEventHandler[js.Object] = null,
    onDragLeave: DragEventHandler[js.Object] = null,
    onDragLeaveCapture: DragEventHandler[js.Object] = null,
    onDragOver: DragEventHandler[js.Object] = null,
    onDragOverCapture: DragEventHandler[js.Object] = null,
    onDragStart: DragEventHandler[js.Object] = null,
    onDragStartCapture: DragEventHandler[js.Object] = null,
    onDrop: DragEventHandler[js.Object] = null,
    onDropCapture: DragEventHandler[js.Object] = null,
    onDurationChange: ReactEventHandler[js.Object] = null,
    onDurationChangeCapture: ReactEventHandler[js.Object] = null,
    onEmptied: ReactEventHandler[js.Object] = null,
    onEmptiedCapture: ReactEventHandler[js.Object] = null,
    onEncrypted: ReactEventHandler[js.Object] = null,
    onEncryptedCapture: ReactEventHandler[js.Object] = null,
    onEnded: ReactEventHandler[js.Object] = null,
    onEndedCapture: ReactEventHandler[js.Object] = null,
    onError: ReactEventHandler[js.Object] = null,
    onErrorCapture: ReactEventHandler[js.Object] = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onFocusCapture: FocusEventHandler[js.Object] = null,
    onGotPointerCapture: PointerEventHandler[js.Object] = null,
    onGotPointerCaptureCapture: PointerEventHandler[js.Object] = null,
    onInput: FormEventHandler[js.Object] = null,
    onInputCapture: FormEventHandler[js.Object] = null,
    onInvalid: FormEventHandler[js.Object] = null,
    onInvalidCapture: FormEventHandler[js.Object] = null,
    onKeyDown: KeyboardEventHandler[js.Object] = null,
    onKeyDownCapture: KeyboardEventHandler[js.Object] = null,
    onKeyPress: KeyboardEventHandler[js.Object] = null,
    onKeyPressCapture: KeyboardEventHandler[js.Object] = null,
    onKeyUp: KeyboardEventHandler[js.Object] = null,
    onKeyUpCapture: KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onLoad: ReactEventHandler[js.Object] = null,
    onLoadCapture: ReactEventHandler[js.Object] = null,
    onLoadStart: ReactEventHandler[js.Object] = null,
    onLoadStartCapture: ReactEventHandler[js.Object] = null,
    onLoadedData: ReactEventHandler[js.Object] = null,
    onLoadedDataCapture: ReactEventHandler[js.Object] = null,
    onLoadedMetadata: ReactEventHandler[js.Object] = null,
    onLoadedMetadataCapture: ReactEventHandler[js.Object] = null,
    onLostPointerCapture: PointerEventHandler[js.Object] = null,
    onLostPointerCaptureCapture: PointerEventHandler[js.Object] = null,
    onMouseDown: MouseEventHandler[js.Object] = null,
    onMouseDownCapture: MouseEventHandler[js.Object] = null,
    onMouseEnter: MouseEventHandler[js.Object] = null,
    onMouseLeave: MouseEventHandler[js.Object] = null,
    onMouseMove: MouseEventHandler[js.Object] = null,
    onMouseMoveCapture: MouseEventHandler[js.Object] = null,
    onMouseOut: MouseEventHandler[js.Object] = null,
    onMouseOutCapture: MouseEventHandler[js.Object] = null,
    onMouseOver: MouseEventHandler[js.Object] = null,
    onMouseOverCapture: MouseEventHandler[js.Object] = null,
    onMouseUp: MouseEventHandler[js.Object] = null,
    onMouseUpCapture: MouseEventHandler[js.Object] = null,
    onPaste: ClipboardEventHandler[js.Object] = null,
    onPasteCapture: ClipboardEventHandler[js.Object] = null,
    onPause: ReactEventHandler[js.Object] = null,
    onPauseCapture: ReactEventHandler[js.Object] = null,
    onPlay: ReactEventHandler[js.Object] = null,
    onPlayCapture: ReactEventHandler[js.Object] = null,
    onPlaying: ReactEventHandler[js.Object] = null,
    onPlayingCapture: ReactEventHandler[js.Object] = null,
    onPointerCancel: PointerEventHandler[js.Object] = null,
    onPointerCancelCapture: PointerEventHandler[js.Object] = null,
    onPointerDown: PointerEventHandler[js.Object] = null,
    onPointerDownCapture: PointerEventHandler[js.Object] = null,
    onPointerEnter: PointerEventHandler[js.Object] = null,
    onPointerEnterCapture: PointerEventHandler[js.Object] = null,
    onPointerLeave: PointerEventHandler[js.Object] = null,
    onPointerLeaveCapture: PointerEventHandler[js.Object] = null,
    onPointerMove: PointerEventHandler[js.Object] = null,
    onPointerMoveCapture: PointerEventHandler[js.Object] = null,
    onPointerOut: PointerEventHandler[js.Object] = null,
    onPointerOutCapture: PointerEventHandler[js.Object] = null,
    onPointerOver: PointerEventHandler[js.Object] = null,
    onPointerOverCapture: PointerEventHandler[js.Object] = null,
    onPointerUp: PointerEventHandler[js.Object] = null,
    onPointerUpCapture: PointerEventHandler[js.Object] = null,
    onProgress: ReactEventHandler[js.Object] = null,
    onProgressCapture: ReactEventHandler[js.Object] = null,
    onRateChange: ReactEventHandler[js.Object] = null,
    onRateChangeCapture: ReactEventHandler[js.Object] = null,
    onReset: FormEventHandler[js.Object] = null,
    onResetCapture: FormEventHandler[js.Object] = null,
    onScroll: UIEventHandler[js.Object] = null,
    onScrollCapture: UIEventHandler[js.Object] = null,
    onSeeked: ReactEventHandler[js.Object] = null,
    onSeekedCapture: ReactEventHandler[js.Object] = null,
    onSeeking: ReactEventHandler[js.Object] = null,
    onSeekingCapture: ReactEventHandler[js.Object] = null,
    onSelect: ReactEventHandler[js.Object] = null,
    onSelectCapture: ReactEventHandler[js.Object] = null,
    onStalled: ReactEventHandler[js.Object] = null,
    onStalledCapture: ReactEventHandler[js.Object] = null,
    onSubmit: FormEventHandler[js.Object] = null,
    onSubmitCapture: FormEventHandler[js.Object] = null,
    onSuspend: ReactEventHandler[js.Object] = null,
    onSuspendCapture: ReactEventHandler[js.Object] = null,
    onTimeUpdate: ReactEventHandler[js.Object] = null,
    onTimeUpdateCapture: ReactEventHandler[js.Object] = null,
    onTouchCancel: TouchEventHandler[js.Object] = null,
    onTouchCancelCapture: TouchEventHandler[js.Object] = null,
    onTouchEnd: TouchEventHandler[js.Object] = null,
    onTouchEndCapture: TouchEventHandler[js.Object] = null,
    onTouchMove: TouchEventHandler[js.Object] = null,
    onTouchMoveCapture: TouchEventHandler[js.Object] = null,
    onTouchStart: TouchEventHandler[js.Object] = null,
    onTouchStartCapture: TouchEventHandler[js.Object] = null,
    onTransitionEnd: TransitionEventHandler[js.Object] = null,
    onTransitionEndCapture: TransitionEventHandler[js.Object] = null,
    onVolumeChange: ReactEventHandler[js.Object] = null,
    onVolumeChangeCapture: ReactEventHandler[js.Object] = null,
    onWaiting: ReactEventHandler[js.Object] = null,
    onWaitingCapture: ReactEventHandler[js.Object] = null,
    onWheel: WheelEventHandler[js.Object] = null,
    onWheelCapture: WheelEventHandler[js.Object] = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null
  ): FlatButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton)
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
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
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
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FlatButtonProps]
  }
}

