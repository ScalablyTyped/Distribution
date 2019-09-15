package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapTextFieldClassKey
import typings.atMaterialDashUiCore.PartialFilledInputProps
import typings.atMaterialDashUiCore.PartialFormHelperTextProps
import typings.atMaterialDashUiCore.PartialInputLabelProps
import typings.atMaterialDashUiCore.PartialInputProps
import typings.atMaterialDashUiCore.PartialOutlinedInputProps
import typings.atMaterialDashUiCore.PartialSelectProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypesNs.Margin
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.atMaterialDashUiCore.formControlFormControlMod.FormControlProps
import typings.atMaterialDashUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typings.atMaterialDashUiCore.textFieldMod.default
import typings.atMaterialDashUiCore.textFieldTextFieldMod.TextFieldProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, name, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, autoFocus, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, autoComplete, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, disabled, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, manifest, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, type, onPauseCapture, required, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, value, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object TextField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.textFieldMod.default].asInstanceOf[String | js.Object]
  def apply(
    FormHelperTextProps: PartialFormHelperTextProps = null,
    InputLabelProps: PartialInputLabelProps = null,
    InputProps: PartialFilledInputProps | PartialInputProps | PartialOutlinedInputProps = null,
    SelectProps: PartialSelectProps = null,
    classes: PartialClassNameMapTextFieldClassKey = null,
    component: ReactComponentClass[FormControlProps] = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: TagMod[Any] = null,
    innerRef: Ref[_] | RefObject[_] = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | RefObject[_] = null,
    label: TagMod[Any] = null,
    margin: Margin = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onBlur: _ => Unit = null,
    onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement] => Unit = null,
    onFocus: _ => Unit = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    select: js.UndefOr[Boolean] = js.undefined,
    variant: filled | outlined | standard = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps)
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps)
    if (InputProps != null) __obj.updateDynamic("InputProps")(InputProps.asInstanceOf[js.Any])
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (helperText != null) __obj.updateDynamic("helperText")(helperText)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextFieldProps
}

