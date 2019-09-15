package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.Anon_Dense
import typings.atMaterialDashUiCore.PartialClassNameMapSelectClassKey
import typings.atMaterialDashUiCore.PartialMenuProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dense
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.atMaterialDashUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typings.atMaterialDashUiCore.selectMod.default
import typings.atMaterialDashUiCore.selectSelectMod.SelectProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, name, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, readOnly, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, open, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, autoFocus, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, autoComplete, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, disabled, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, multiple, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, type, onPauseCapture, required, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, value, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Select
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.selectMod.default].asInstanceOf[String | js.Object]
  def apply(
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    classes: PartialClassNameMapSelectClassKey = null,
    disableUnderline: js.UndefOr[Boolean] = js.undefined,
    displayEmpty: js.UndefOr[Boolean] = js.undefined,
    endAdornment: TagMod[Any] = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    input: TagMod[Any] = null,
    inputComponent: ReactComponentClass[InputBaseComponentProps] = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | RefObject[_] = null,
    margin: dense | none = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onFilled: () => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    renderPrefix: /* state */ Anon_Dense => TagMod[Any] = null,
    renderValue: /* value */ js.UndefOr[
      (js.Array[String | Double | Boolean | js.Object]) | String | Double | Boolean | js.Object
    ] => TagMod[Any] = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    startAdornment: TagMod[Any] = null,
    variant: standard | outlined | filled = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent)
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableUnderline)) __obj.updateDynamic("disableUnderline")(disableUnderline)
    if (!js.isUndefined(displayEmpty)) __obj.updateDynamic("displayEmpty")(displayEmpty)
    if (endAdornment != null) __obj.updateDynamic("endAdornment")(endAdornment)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input)
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onFilled != null) __obj.updateDynamic("onFilled")(js.Any.fromFunction0(onFilled))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (renderPrefix != null) __obj.updateDynamic("renderPrefix")(js.Any.fromFunction1(renderPrefix))
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectProps
}

