package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.Anon_Placement
import typings.atMaterialDashUiCore.popperMod.default
import typings.atMaterialDashUiCore.popperPopperMod.PopperPlacementType
import typings.atMaterialDashUiCore.popperPopperMod.PopperProps
import typings.popperDotJs.popperDotJsMod.ReferenceObject
import typings.react.reactMod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, open */
object Popper
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.popperMod.default].asInstanceOf[String | js.Object]
  def apply(
    children_PopperProps: TagMod[Any] | (js.Function1[/* props */ Anon_Placement, TagMod[Any]]),
    anchorEl: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement]) = null,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Object = null,
    placement: PopperPlacementType = null,
    popperOptions: js.Object = null,
    transition: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children_PopperProps.asInstanceOf[js.Any])
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (!js.isUndefined(keepMounted)) __obj.updateDynamic("keepMounted")(keepMounted)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopperProps
}

