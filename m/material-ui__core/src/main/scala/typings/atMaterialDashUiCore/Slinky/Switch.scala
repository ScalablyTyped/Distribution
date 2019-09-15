package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapSwitchClassKey
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.primary
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.secondary
import typings.atMaterialDashUiCore.buttonBaseButtonBaseMod.ButtonBaseActions
import typings.atMaterialDashUiCore.buttonBaseButtonBaseMod.ButtonBaseProps
import typings.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps
import typings.atMaterialDashUiCore.switchMod.default
import typings.atMaterialDashUiCore.switchSwitchMod.SwitchProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.HTMLInputElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, name, aria-errormessage, onDragStart, formNoValidate, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, readOnly, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, hrefLang, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, rel, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, autoFocus, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, formTarget, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, formMethod, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, media, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, disabled, target, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, formEncType, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, type, form, onPauseCapture, required, aria-label, href, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, download, value, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, formAction, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.switchMod.default].asInstanceOf[String | js.Object]
  def apply(
    TouchRippleProps: Partial[TouchRippleProps] = null,
    action: /* actions */ ButtonBaseActions => Unit = null,
    buttonRef: Ref[_] | RefObject[_] = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    checked: Boolean | String = null,
    checkedIcon: TagMod[Any] = null,
    classes: PartialClassNameMapSwitchClassKey = null,
    color: primary | secondary | typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.default = null,
    component: ReactComponentClass[ButtonBaseProps] = null,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: String = null,
    icon: TagMod[Any] = null,
    innerRef: Ref[_] | RefObject[_] = null,
    inputProps: InputHTMLAttributes[HTMLInputElement] = null,
    inputRef: Ref[_] = null,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* checked */ Boolean) => Unit = null,
    onFocusVisible: FocusEvent[_] => Unit = null,
    ping: String = null,
    referrerPolicy: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (TouchRippleProps != null) __obj.updateDynamic("TouchRippleProps")(TouchRippleProps)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (buttonRef != null) __obj.updateDynamic("buttonRef")(buttonRef.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(focusRipple)) __obj.updateDynamic("focusRipple")(focusRipple)
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocusVisible != null) __obj.updateDynamic("onFocusVisible")(js.Any.fromFunction1(onFocusVisible))
    if (ping != null) __obj.updateDynamic("ping")(ping)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchProps
}

