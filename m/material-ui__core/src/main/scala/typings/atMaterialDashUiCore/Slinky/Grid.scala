package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.OmitGridPropsStrippedProps
import typings.atMaterialDashUiCore.PartialClassNameMapGridClassKey
import typings.atMaterialDashUiCore.gridGridMod.GridContentAlignment
import typings.atMaterialDashUiCore.gridGridMod.GridDirection
import typings.atMaterialDashUiCore.gridGridMod.GridItemsAlignment
import typings.atMaterialDashUiCore.gridGridMod.GridJustification
import typings.atMaterialDashUiCore.gridGridMod.GridProps
import typings.atMaterialDashUiCore.gridGridMod.GridSize
import typings.atMaterialDashUiCore.gridGridMod.GridSpacing
import typings.atMaterialDashUiCore.gridGridMod.GridWrap
import typings.atMaterialDashUiCore.gridMod.default
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, onPauseCapture, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.gridMod.default].asInstanceOf[String | js.Object]
  def apply(
    alignContent: GridContentAlignment = null,
    alignItems: GridItemsAlignment = null,
    classes: PartialClassNameMapGridClassKey = null,
    component: String | ReactComponentClass[OmitGridPropsStrippedProps] = null,
    container: js.UndefOr[Boolean] = js.undefined,
    direction: GridDirection = null,
    innerRef: Ref[_] | RefObject[_] = null,
    item: js.UndefOr[Boolean] = js.undefined,
    justify: GridJustification = null,
    lg: Boolean | GridSize = null,
    md: Boolean | GridSize = null,
    sm: Boolean | GridSize = null,
    spacing: GridSpacing = null,
    wrap: GridWrap = null,
    xl: Boolean | GridSize = null,
    xs: Boolean | GridSize = null,
    zeroMinWidth: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item)
    if (justify != null) __obj.updateDynamic("justify")(justify)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroMinWidth)) __obj.updateDynamic("zeroMinWidth")(zeroMinWidth)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridProps
}

