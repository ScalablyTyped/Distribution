package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.iconButtonMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.IconButtonProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.cornersAndCenter
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, disabled, target, type, href */
object IconButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.iconButtonMod.default].asInstanceOf[String | js.Object]
  def apply(
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: TagMod[Any] | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    hoveredStyle: CSSProperties = null,
    iconClassName: String = null,
    iconStyle: CSSProperties = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    tooltip: TagMod[Any] | String = null,
    tooltipPosition: cornersAndCenter = null,
    tooltipStyles: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (hoveredStyle != null) __obj.updateDynamic("hoveredStyle")(hoveredStyle)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyles != null) __obj.updateDynamic("tooltipStyles")(tooltipStyles)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconButtonProps
}

