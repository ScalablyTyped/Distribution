package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapLinkClassKey
import typings.atMaterialDashUiCore.PartialClassNameMapTypographyClassKey
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypesNs.Alignment
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypesNs.Color
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.always
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.hover
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typings.atMaterialDashUiCore.linkLinkMod.LinkProps
import typings.atMaterialDashUiCore.linkMod.default
import typings.atMaterialDashUiCore.typeinStylestring
import typings.atMaterialDashUiCore.typographyTypographyMod.Style
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, aria-errormessage, onDragStart, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, aria-labelledby, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, onChange, aria-disabled, aria-multiselectable, prefix, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, hrefLang, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, rel, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, onMouseUp, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, onError, onPointerLeaveCapture, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, media, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, target, property, onBeforeInput, onTouchMove, onSelect, spellCheck, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, type, onPauseCapture, aria-label, href, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, slot, aria-current, onPointerMove, onLoadedDataCapture, download, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.linkMod.default].asInstanceOf[String | js.Object]
  def apply(
    TypographyClasses: PartialClassNameMapTypographyClassKey = null,
    align: Alignment = null,
    block: js.UndefOr[Boolean] = js.undefined,
    classes: PartialClassNameMapLinkClassKey = null,
    color: Color = null,
    component: ReactComponentClass[LinkProps] = null,
    gutterBottom: js.UndefOr[Boolean] = js.undefined,
    headlineMapping: typeinStylestring = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    paragraph: js.UndefOr[Boolean] = js.undefined,
    ping: String = null,
    referrerPolicy: String = null,
    underline: none | hover | always = null,
    variant: Style | inherit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (TypographyClasses != null) __obj.updateDynamic("TypographyClasses")(TypographyClasses)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(gutterBottom)) __obj.updateDynamic("gutterBottom")(gutterBottom)
    if (headlineMapping != null) __obj.updateDynamic("headlineMapping")(headlineMapping)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (!js.isUndefined(paragraph)) __obj.updateDynamic("paragraph")(paragraph)
    if (ping != null) __obj.updateDynamic("ping")(ping)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LinkProps
}

