package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.dialogMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DialogAction
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DialogProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, style, open, className */
object Dialog
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.dialogMod.default].asInstanceOf[String | js.Object]
  def apply(
    actionFocus: String = null,
    actions: js.Array[DialogAction | ReactElement] = null,
    actionsContainerClassName: String = null,
    actionsContainerStyle: CSSProperties = null,
    autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined,
    autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined,
    bodyClassName: String = null,
    bodyStyle: CSSProperties = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onRequestClose: /* buttonClicked */ Boolean => Unit = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    paperClassName: String = null,
    paperProps: js.Any = null,
    repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    titleClassName: String = null,
    titleStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName)
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle)
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight)
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent)
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName)
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps)
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DialogProps
}

