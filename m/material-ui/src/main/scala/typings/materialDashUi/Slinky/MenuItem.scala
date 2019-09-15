package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.menuItemMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.MenuItemProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, disabled, target, type, href, open, checked */
object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.menuItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    containerElement_MenuItemProps: TagMod[Any] | String = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    focusState: String = null,
    hoverColor: String = null,
    initiallyOpen: js.UndefOr[Boolean] = js.undefined,
    innerDivStyle: CSSProperties = null,
    insetChildren: js.UndefOr[Boolean] = js.undefined,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: String | TagMod[Any] = null,
    leftAvatar: ReactElement = null,
    leftCheckbox: ReactElement = null,
    leftIcon: ReactElement = null,
    menuItems: TagMod[Any] = null,
    nestedItems: js.Array[ReactElement] = null,
    nestedLevel: Int | Double = null,
    nestedListStyle: CSSProperties = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onNestedListToggle: /* item */ typings.materialDashUi.underscoreUnderscoreMaterialUINs.ListNs.ListItem => Unit = null,
    primaryText: ReactNode = null,
    primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined,
    rightAvatar: ReactElement = null,
    rightIcon: ReactElement = null,
    rightIconButton: ReactElement = null,
    rightToggle: ReactElement = null,
    secondaryText: ReactNode = null,
    secondaryTextLines: Int | Double = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    value: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoGenerateNestedIndicator)) __obj.updateDynamic("autoGenerateNestedIndicator")(autoGenerateNestedIndicator)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (containerElement_MenuItemProps != null) __obj.updateDynamic("containerElement")(containerElement_MenuItemProps.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (focusState != null) __obj.updateDynamic("focusState")(focusState)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (!js.isUndefined(initiallyOpen)) __obj.updateDynamic("initiallyOpen")(initiallyOpen)
    if (innerDivStyle != null) __obj.updateDynamic("innerDivStyle")(innerDivStyle)
    if (!js.isUndefined(insetChildren)) __obj.updateDynamic("insetChildren")(insetChildren)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar)
    if (leftCheckbox != null) __obj.updateDynamic("leftCheckbox")(leftCheckbox)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    if (nestedItems != null) __obj.updateDynamic("nestedItems")(nestedItems)
    if (nestedLevel != null) __obj.updateDynamic("nestedLevel")(nestedLevel.asInstanceOf[js.Any])
    if (nestedListStyle != null) __obj.updateDynamic("nestedListStyle")(nestedListStyle)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onNestedListToggle != null) __obj.updateDynamic("onNestedListToggle")(js.Any.fromFunction1(onNestedListToggle))
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryTogglesNestedList)) __obj.updateDynamic("primaryTogglesNestedList")(primaryTogglesNestedList)
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (rightIconButton != null) __obj.updateDynamic("rightIconButton")(rightIconButton)
    if (rightToggle != null) __obj.updateDynamic("rightToggle")(rightToggle)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (secondaryTextLines != null) __obj.updateDynamic("secondaryTextLines")(secondaryTextLines.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuItemProps
}

