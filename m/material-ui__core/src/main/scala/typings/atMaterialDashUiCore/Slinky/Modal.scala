package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialBackdropProps
import typings.atMaterialDashUiCore.PartialClassNameMapModalClassKey
import typings.atMaterialDashUiCore.backdropBackdropMod.BackdropProps
import typings.atMaterialDashUiCore.modalMod.default
import typings.atMaterialDashUiCore.modalModalManagerMod.ModalManager
import typings.atMaterialDashUiCore.modalModalMod.ModalProps
import typings.react.Event
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, open, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, manifest, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, onPauseCapture, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.modalMod.default].asInstanceOf[String | js.Object]
  def apply(
    BackdropComponent: ReactComponentClass[BackdropProps] = null,
    BackdropProps: PartialBackdropProps = null,
    classes: PartialClassNameMapModalClassKey = null,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    manager: ModalManager = null,
    onBackdropClick: SyntheticEvent[js.Object, Event] => Unit = null,
    onClose: SyntheticEvent[js.Object, Event] => Unit = null,
    onEscapeKeyDown: SyntheticEvent[js.Object, Event] => Unit = null,
    onRendered: () => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (BackdropComponent != null) __obj.updateDynamic("BackdropComponent")(BackdropComponent)
    if (BackdropProps != null) __obj.updateDynamic("BackdropProps")(BackdropProps)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(closeAfterTransition)) __obj.updateDynamic("closeAfterTransition")(closeAfterTransition)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(disableBackdropClick)) __obj.updateDynamic("disableBackdropClick")(disableBackdropClick)
    if (!js.isUndefined(disableEnforceFocus)) __obj.updateDynamic("disableEnforceFocus")(disableEnforceFocus)
    if (!js.isUndefined(disableEscapeKeyDown)) __obj.updateDynamic("disableEscapeKeyDown")(disableEscapeKeyDown)
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (!js.isUndefined(disableRestoreFocus)) __obj.updateDynamic("disableRestoreFocus")(disableRestoreFocus)
    if (!js.isUndefined(hideBackdrop)) __obj.updateDynamic("hideBackdrop")(hideBackdrop)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(keepMounted)) __obj.updateDynamic("keepMounted")(keepMounted)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1(onBackdropClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(onEscapeKeyDown))
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction0(onRendered))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

