package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialBackdropProps
import typings.atMaterialDashUiCore.PartialClassNameMapModalClassKey
import typings.atMaterialDashUiCore.PartialClassNameMapPopoverClassKey
import typings.atMaterialDashUiCore.PartialPaperProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typings.atMaterialDashUiCore.backdropBackdropMod.BackdropProps
import typings.atMaterialDashUiCore.modalModalManagerMod.ModalManager
import typings.atMaterialDashUiCore.popoverMod.default
import typings.atMaterialDashUiCore.popoverPopoverMod.PopoverActions
import typings.atMaterialDashUiCore.popoverPopoverMod.PopoverOrigin
import typings.atMaterialDashUiCore.popoverPopoverMod.PopoverPosition
import typings.atMaterialDashUiCore.popoverPopoverMod.PopoverProps
import typings.atMaterialDashUiCore.popoverPopoverMod.PopoverReference
import typings.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps
import typings.react.Event
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.react.reactMod.SyntheticEvent
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, open, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, manifest, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, onPauseCapture, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.popoverMod.default].asInstanceOf[String | js.Object]
  def apply(
    BackdropComponent: ReactComponentClass[BackdropProps] = null,
    BackdropProps: PartialBackdropProps = null,
    ModalClasses: PartialClassNameMapModalClassKey = null,
    PaperProps: PartialPaperProps = null,
    TransitionComponent: ReactComponentClass[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    action: /* actions */ PopoverActions => Unit = null,
    anchorEl: HTMLElement | (js.Function1[/* element */ HTMLElement, HTMLElement]) = null,
    anchorOrigin: PopoverOrigin = null,
    anchorPosition: PopoverPosition = null,
    anchorReference: PopoverReference = null,
    classes: PartialClassNameMapPopoverClassKey = null,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    elevation: Int | Double = null,
    getContentAnchorEl: /* element */ HTMLElement => HTMLElement = null,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    manager: ModalManager = null,
    marginThreshold: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: SyntheticEvent[js.Object, Event] => Unit = null,
    onClose: SyntheticEvent[js.Object, Event] => Unit = null,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEscapeKeyDown: SyntheticEvent[js.Object, Event] => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    onRendered: () => Unit = null,
    transformOrigin: PopoverOrigin = null,
    transitionDuration: Double | Anon_Appear | auto = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (BackdropComponent != null) __obj.updateDynamic("BackdropComponent")(BackdropComponent)
    if (BackdropProps != null) __obj.updateDynamic("BackdropProps")(BackdropProps)
    if (ModalClasses != null) __obj.updateDynamic("ModalClasses")(ModalClasses)
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent)
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (anchorPosition != null) __obj.updateDynamic("anchorPosition")(anchorPosition)
    if (anchorReference != null) __obj.updateDynamic("anchorReference")(anchorReference)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(closeAfterTransition)) __obj.updateDynamic("closeAfterTransition")(closeAfterTransition)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(disableBackdropClick)) __obj.updateDynamic("disableBackdropClick")(disableBackdropClick)
    if (!js.isUndefined(disableEnforceFocus)) __obj.updateDynamic("disableEnforceFocus")(disableEnforceFocus)
    if (!js.isUndefined(disableEscapeKeyDown)) __obj.updateDynamic("disableEscapeKeyDown")(disableEscapeKeyDown)
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (!js.isUndefined(disableRestoreFocus)) __obj.updateDynamic("disableRestoreFocus")(disableRestoreFocus)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (getContentAnchorEl != null) __obj.updateDynamic("getContentAnchorEl")(js.Any.fromFunction1(getContentAnchorEl))
    if (!js.isUndefined(hideBackdrop)) __obj.updateDynamic("hideBackdrop")(hideBackdrop)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(keepMounted)) __obj.updateDynamic("keepMounted")(keepMounted)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (marginThreshold != null) __obj.updateDynamic("marginThreshold")(marginThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1(onBackdropClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(onEscapeKeyDown))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction0(onRendered))
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

