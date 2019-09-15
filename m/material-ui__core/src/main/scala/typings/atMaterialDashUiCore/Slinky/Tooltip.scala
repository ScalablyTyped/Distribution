package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapTooltipClassKey
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`bottom-end`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`bottom-start`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`left-end`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`left-start`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`right-end`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`right-start`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`top-end`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`top-start`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typings.atMaterialDashUiCore.tooltipMod.default
import typings.atMaterialDashUiCore.tooltipTooltipMod.TooltipProps
import typings.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, open, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, defaultChecked, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, onPauseCapture, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.tooltipMod.default].asInstanceOf[String | js.Object]
  def apply(
    title: TagMod[Any],
    PopperProps: js.Object = null,
    TransitionComponent: ReactComponentClass[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    classes: PartialClassNameMapTooltipClassKey = null,
    disableFocusListener: js.UndefOr[Boolean] = js.undefined,
    disableHoverListener: js.UndefOr[Boolean] = js.undefined,
    disableTouchListener: js.UndefOr[Boolean] = js.undefined,
    enterDelay: Int | Double = null,
    enterTouchDelay: Int | Double = null,
    innerRef: Ref[_] | RefObject[_] = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaveDelay: Int | Double = null,
    leaveTouchDelay: Int | Double = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    placement: `bottom-end` | `bottom-start` | bottom | `left-end` | `left-start` | left | `right-end` | `right-start` | right | `top-end` | `top-start` | top = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title)
    if (PopperProps != null) __obj.updateDynamic("PopperProps")(PopperProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent)
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableFocusListener)) __obj.updateDynamic("disableFocusListener")(disableFocusListener)
    if (!js.isUndefined(disableHoverListener)) __obj.updateDynamic("disableHoverListener")(disableHoverListener)
    if (!js.isUndefined(disableTouchListener)) __obj.updateDynamic("disableTouchListener")(disableTouchListener)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (enterTouchDelay != null) __obj.updateDynamic("enterTouchDelay")(enterTouchDelay.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaveDelay != null) __obj.updateDynamic("leaveDelay")(leaveDelay.asInstanceOf[js.Any])
    if (leaveTouchDelay != null) __obj.updateDynamic("leaveTouchDelay")(leaveTouchDelay.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

