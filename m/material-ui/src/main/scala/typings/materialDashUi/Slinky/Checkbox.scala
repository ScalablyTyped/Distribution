package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.checkboxMod.default
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ReactLink
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SwitchesNs.CheckboxProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, name, formNoValidate, accept, step, size, readOnly, pattern, checked, height, min, crossOrigin, autoFocus, formTarget, autoComplete, max, alt, formMethod, src, disabled, minLength, formEncType, multiple, type, form, required, capture, width, value, maxLength, formAction, list */
object Checkbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.checkboxMod.default].asInstanceOf[String | js.Object]
  def apply(
    checkedIcon: ReactElement = null,
    iconStyle: CSSProperties = null,
    inputStyle: CSSProperties = null,
    label: ReactNode = null,
    labelPosition: left | right = null,
    labelStyle: CSSProperties = null,
    onChange_InputHTMLAttributes: ChangeEvent[js.Object] => Unit = null,
    onCheck: (/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean) => Unit = null,
    uncheckedIcon: ReactElement = null,
    valueLink: ReactLink[Boolean] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onChange_InputHTMLAttributes != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange_InputHTMLAttributes))
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckboxProps
}

