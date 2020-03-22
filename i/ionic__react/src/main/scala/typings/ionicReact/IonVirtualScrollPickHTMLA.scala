package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.componentsMod._Global_.HTMLIonVirtualScrollElement
import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.ionicReact.ionicReactStrings.`additions text`
import typings.ionicReact.ionicReactStrings.`inline`
import typings.ionicReact.ionicReactStrings.additions
import typings.ionicReact.ionicReactStrings.all
import typings.ionicReact.ionicReactStrings.ascending
import typings.ionicReact.ionicReactStrings.assertive
import typings.ionicReact.ionicReactStrings.both
import typings.ionicReact.ionicReactStrings.copy
import typings.ionicReact.ionicReactStrings.date
import typings.ionicReact.ionicReactStrings.decimal
import typings.ionicReact.ionicReactStrings.descending
import typings.ionicReact.ionicReactStrings.dialog
import typings.ionicReact.ionicReactStrings.email
import typings.ionicReact.ionicReactStrings.execute
import typings.ionicReact.ionicReactStrings.grammar
import typings.ionicReact.ionicReactStrings.grid
import typings.ionicReact.ionicReactStrings.horizontal
import typings.ionicReact.ionicReactStrings.inherit
import typings.ionicReact.ionicReactStrings.link
import typings.ionicReact.ionicReactStrings.list
import typings.ionicReact.ionicReactStrings.listbox
import typings.ionicReact.ionicReactStrings.location
import typings.ionicReact.ionicReactStrings.menu
import typings.ionicReact.ionicReactStrings.mixed
import typings.ionicReact.ionicReactStrings.move
import typings.ionicReact.ionicReactStrings.no
import typings.ionicReact.ionicReactStrings.none
import typings.ionicReact.ionicReactStrings.numeric
import typings.ionicReact.ionicReactStrings.off
import typings.ionicReact.ionicReactStrings.on
import typings.ionicReact.ionicReactStrings.other
import typings.ionicReact.ionicReactStrings.page
import typings.ionicReact.ionicReactStrings.polite
import typings.ionicReact.ionicReactStrings.popup
import typings.ionicReact.ionicReactStrings.removals
import typings.ionicReact.ionicReactStrings.search
import typings.ionicReact.ionicReactStrings.spelling
import typings.ionicReact.ionicReactStrings.step
import typings.ionicReact.ionicReactStrings.tel
import typings.ionicReact.ionicReactStrings.text
import typings.ionicReact.ionicReactStrings.time
import typings.ionicReact.ionicReactStrings.tree
import typings.ionicReact.ionicReactStrings.url
import typings.ionicReact.ionicReactStrings.vertical
import typings.ionicReact.ionicReactStrings.yes
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.JSX.IonVirtualScroll & std.Pick<react.react.HTMLAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonVirtualScrollElement>, 'hidden' | 'dir' | 'slot' | 'title' | 'color' | 'children' | 'className' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'contentEditable' | 'contextMenu' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'translate' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture'> & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonVirtualScrollElement> */
trait IonVirtualScrollPickHTMLA extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: js.UndefOr[Double] = js.undefined
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: js.UndefOr[Double] = js.undefined
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: js.UndefOr[Double] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: js.UndefOr[HeaderFn] = js.undefined
  /**
    * An optional function that maps each item footer within their height.
    */
  var footerHeight: js.UndefOr[FooterHeightFn] = js.undefined
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: js.UndefOr[HeaderFn] = js.undefined
  /**
    * An optional function that maps each item header within their height.
    */
  var headerHeight: js.UndefOr[HeaderHeightFn] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: js.UndefOr[ItemHeightFn] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: js.UndefOr[ItemRenderFn] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onAbortCapture: js.Any
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onAnimationEndCapture: js.Any
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onAnimationIterationCapture: js.Any
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onAnimationStartCapture: js.Any
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onAuxClickCapture: js.Any
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onBeforeInputCapture: js.Any
  var onBlur: js.UndefOr[FocusEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onBlurCapture: js.Any
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCanPlayCapture: js.Any
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCanPlayThroughCapture: js.Any
  var onChange: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onChangeCapture: js.Any
  var onClick: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onClickCapture: js.Any
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCompositionEndCapture: js.Any
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCompositionStartCapture: js.Any
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCompositionUpdateCapture: js.Any
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onContextMenuCapture: js.Any
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCopyCapture: js.Any
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onCutCapture: js.Any
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDoubleClickCapture: js.Any
  var onDrag: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragCapture: js.Any
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragEndCapture: js.Any
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragEnterCapture: js.Any
  var onDragExit: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragExitCapture: js.Any
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragLeaveCapture: js.Any
  var onDragOver: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragOverCapture: js.Any
  var onDragStart: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDragStartCapture: js.Any
  var onDrop: js.UndefOr[DragEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDropCapture: js.Any
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onDurationChangeCapture: js.Any
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onEmptiedCapture: js.Any
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onEncryptedCapture: js.Any
  var onEnded: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onEndedCapture: js.Any
  var onError: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onErrorCapture: js.Any
  var onFocus: js.UndefOr[FocusEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onFocusCapture: js.Any
  var onGotPointerCapture: js.Any
  var onGotPointerCaptureCapture: js.Any
  var onInput: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onInputCapture: js.Any
  var onInvalid: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onInvalidCapture: js.Any
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onKeyDownCapture: js.Any
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onKeyPressCapture: js.Any
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onKeyUpCapture: js.Any
  var onLoad: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onLoadCapture: js.Any
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onLoadStartCapture: js.Any
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onLoadedDataCapture: js.Any
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onLoadedMetadataCapture: js.Any
  var onLostPointerCapture: js.Any
  var onLostPointerCaptureCapture: js.Any
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseDownCapture: js.Any
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseMoveCapture: js.Any
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseOutCapture: js.Any
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseOverCapture: js.Any
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onMouseUpCapture: js.Any
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPasteCapture: js.Any
  var onPause: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPauseCapture: js.Any
  var onPlay: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPlayCapture: js.Any
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPlayingCapture: js.Any
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerCancelCapture: js.Any
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerDownCapture: js.Any
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerEnterCapture: js.Any
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerLeaveCapture: js.Any
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerMoveCapture: js.Any
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerOutCapture: js.Any
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerOverCapture: js.Any
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onPointerUpCapture: js.Any
  var onProgress: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onProgressCapture: js.Any
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onRateChangeCapture: js.Any
  var onReset: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onResetCapture: js.Any
  var onScroll: js.UndefOr[UIEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onScrollCapture: js.Any
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onSeekedCapture: js.Any
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onSeekingCapture: js.Any
  var onSelect: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onSelectCapture: js.Any
  var onStalled: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onStalledCapture: js.Any
  var onSubmit: js.UndefOr[FormEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onSubmitCapture: js.Any
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onSuspendCapture: js.Any
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTimeUpdateCapture: js.Any
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTouchCancelCapture: js.Any
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTouchEndCapture: js.Any
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTouchMoveCapture: js.Any
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTouchStartCapture: js.Any
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onTransitionEndCapture: js.Any
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onVolumeChangeCapture: js.Any
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onWaitingCapture: js.Any
  var onWheel: js.UndefOr[WheelEventHandler[HTMLIonVirtualScrollElement]] = js.undefined
  var onWheelCapture: js.Any
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Ref[HTMLIonVirtualScrollElement]] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object IonVirtualScrollPickHTMLA {
  @scala.inline
  def apply(
    onAbortCapture: js.Any,
    onAnimationEndCapture: js.Any,
    onAnimationIterationCapture: js.Any,
    onAnimationStartCapture: js.Any,
    onAuxClickCapture: js.Any,
    onBeforeInputCapture: js.Any,
    onBlurCapture: js.Any,
    onCanPlayCapture: js.Any,
    onCanPlayThroughCapture: js.Any,
    onChangeCapture: js.Any,
    onClickCapture: js.Any,
    onCompositionEndCapture: js.Any,
    onCompositionStartCapture: js.Any,
    onCompositionUpdateCapture: js.Any,
    onContextMenuCapture: js.Any,
    onCopyCapture: js.Any,
    onCutCapture: js.Any,
    onDoubleClickCapture: js.Any,
    onDragCapture: js.Any,
    onDragEndCapture: js.Any,
    onDragEnterCapture: js.Any,
    onDragExitCapture: js.Any,
    onDragLeaveCapture: js.Any,
    onDragOverCapture: js.Any,
    onDragStartCapture: js.Any,
    onDropCapture: js.Any,
    onDurationChangeCapture: js.Any,
    onEmptiedCapture: js.Any,
    onEncryptedCapture: js.Any,
    onEndedCapture: js.Any,
    onErrorCapture: js.Any,
    onFocusCapture: js.Any,
    onGotPointerCapture: js.Any,
    onGotPointerCaptureCapture: js.Any,
    onInputCapture: js.Any,
    onInvalidCapture: js.Any,
    onKeyDownCapture: js.Any,
    onKeyPressCapture: js.Any,
    onKeyUpCapture: js.Any,
    onLoadCapture: js.Any,
    onLoadStartCapture: js.Any,
    onLoadedDataCapture: js.Any,
    onLoadedMetadataCapture: js.Any,
    onLostPointerCapture: js.Any,
    onLostPointerCaptureCapture: js.Any,
    onMouseDownCapture: js.Any,
    onMouseMoveCapture: js.Any,
    onMouseOutCapture: js.Any,
    onMouseOverCapture: js.Any,
    onMouseUpCapture: js.Any,
    onPasteCapture: js.Any,
    onPauseCapture: js.Any,
    onPlayCapture: js.Any,
    onPlayingCapture: js.Any,
    onPointerCancelCapture: js.Any,
    onPointerDownCapture: js.Any,
    onPointerEnterCapture: js.Any,
    onPointerLeaveCapture: js.Any,
    onPointerMoveCapture: js.Any,
    onPointerOutCapture: js.Any,
    onPointerOverCapture: js.Any,
    onPointerUpCapture: js.Any,
    onProgressCapture: js.Any,
    onRateChangeCapture: js.Any,
    onResetCapture: js.Any,
    onScrollCapture: js.Any,
    onSeekedCapture: js.Any,
    onSeekingCapture: js.Any,
    onSelectCapture: js.Any,
    onStalledCapture: js.Any,
    onSubmitCapture: js.Any,
    onSuspendCapture: js.Any,
    onTimeUpdateCapture: js.Any,
    onTouchCancelCapture: js.Any,
    onTouchEndCapture: js.Any,
    onTouchMoveCapture: js.Any,
    onTouchStartCapture: js.Any,
    onTransitionEndCapture: js.Any,
    onVolumeChangeCapture: js.Any,
    onWaitingCapture: js.Any,
    onWheelCapture: js.Any,
    about: String = null,
    accessKey: String = null,
    approxFooterHeight: Int | Double = null,
    approxHeaderHeight: Int | Double = null,
    approxItemHeight: Int | Double = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    `class`: String = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    footerFn: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null] = null,
    footerHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    headerFn: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null] = null,
    headerHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    items: js.Array[_] = null,
    key: Key = null,
    lang: String = null,
    nodeRender: (/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double) => HTMLElement = null,
    onAbort: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onBlur: FocusEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onChange: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onClick: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onCut: ClipboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragEnd: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragEnter: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragExit: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragLeave: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragOver: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDragStart: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDrop: DragEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onEmptied: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onEnded: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onError: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onFocus: FocusEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onInput: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onInvalid: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onMouseDown: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLIonVirtualScrollElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPause: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onPlay: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onPlaying: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onPointerCancel: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onRateChange: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onReset: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onScroll: UIEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onSeeking: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onSelect: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onStalled: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onSubmit: FormEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onTouchCancel: TouchEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLIonVirtualScrollElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onWaiting: SyntheticEvent[HTMLIonVirtualScrollElement, Event_] => Unit = null,
    onWheel: WheelEvent[HTMLIonVirtualScrollElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: Ref[HTMLIonVirtualScrollElement] = null,
    renderFooter: (/* item */ js.Any, /* index */ Double) => _ = null,
    renderHeader: (/* item */ js.Any, /* index */ Double) => _ = null
  ): IonVirtualScrollPickHTMLA = {
    val __obj = js.Dynamic.literal(onAbortCapture = onAbortCapture.asInstanceOf[js.Any], onAnimationEndCapture = onAnimationEndCapture.asInstanceOf[js.Any], onAnimationIterationCapture = onAnimationIterationCapture.asInstanceOf[js.Any], onAnimationStartCapture = onAnimationStartCapture.asInstanceOf[js.Any], onAuxClickCapture = onAuxClickCapture.asInstanceOf[js.Any], onBeforeInputCapture = onBeforeInputCapture.asInstanceOf[js.Any], onBlurCapture = onBlurCapture.asInstanceOf[js.Any], onCanPlayCapture = onCanPlayCapture.asInstanceOf[js.Any], onCanPlayThroughCapture = onCanPlayThroughCapture.asInstanceOf[js.Any], onChangeCapture = onChangeCapture.asInstanceOf[js.Any], onClickCapture = onClickCapture.asInstanceOf[js.Any], onCompositionEndCapture = onCompositionEndCapture.asInstanceOf[js.Any], onCompositionStartCapture = onCompositionStartCapture.asInstanceOf[js.Any], onCompositionUpdateCapture = onCompositionUpdateCapture.asInstanceOf[js.Any], onContextMenuCapture = onContextMenuCapture.asInstanceOf[js.Any], onCopyCapture = onCopyCapture.asInstanceOf[js.Any], onCutCapture = onCutCapture.asInstanceOf[js.Any], onDoubleClickCapture = onDoubleClickCapture.asInstanceOf[js.Any], onDragCapture = onDragCapture.asInstanceOf[js.Any], onDragEndCapture = onDragEndCapture.asInstanceOf[js.Any], onDragEnterCapture = onDragEnterCapture.asInstanceOf[js.Any], onDragExitCapture = onDragExitCapture.asInstanceOf[js.Any], onDragLeaveCapture = onDragLeaveCapture.asInstanceOf[js.Any], onDragOverCapture = onDragOverCapture.asInstanceOf[js.Any], onDragStartCapture = onDragStartCapture.asInstanceOf[js.Any], onDropCapture = onDropCapture.asInstanceOf[js.Any], onDurationChangeCapture = onDurationChangeCapture.asInstanceOf[js.Any], onEmptiedCapture = onEmptiedCapture.asInstanceOf[js.Any], onEncryptedCapture = onEncryptedCapture.asInstanceOf[js.Any], onEndedCapture = onEndedCapture.asInstanceOf[js.Any], onErrorCapture = onErrorCapture.asInstanceOf[js.Any], onFocusCapture = onFocusCapture.asInstanceOf[js.Any], onGotPointerCapture = onGotPointerCapture.asInstanceOf[js.Any], onGotPointerCaptureCapture = onGotPointerCaptureCapture.asInstanceOf[js.Any], onInputCapture = onInputCapture.asInstanceOf[js.Any], onInvalidCapture = onInvalidCapture.asInstanceOf[js.Any], onKeyDownCapture = onKeyDownCapture.asInstanceOf[js.Any], onKeyPressCapture = onKeyPressCapture.asInstanceOf[js.Any], onKeyUpCapture = onKeyUpCapture.asInstanceOf[js.Any], onLoadCapture = onLoadCapture.asInstanceOf[js.Any], onLoadStartCapture = onLoadStartCapture.asInstanceOf[js.Any], onLoadedDataCapture = onLoadedDataCapture.asInstanceOf[js.Any], onLoadedMetadataCapture = onLoadedMetadataCapture.asInstanceOf[js.Any], onLostPointerCapture = onLostPointerCapture.asInstanceOf[js.Any], onLostPointerCaptureCapture = onLostPointerCaptureCapture.asInstanceOf[js.Any], onMouseDownCapture = onMouseDownCapture.asInstanceOf[js.Any], onMouseMoveCapture = onMouseMoveCapture.asInstanceOf[js.Any], onMouseOutCapture = onMouseOutCapture.asInstanceOf[js.Any], onMouseOverCapture = onMouseOverCapture.asInstanceOf[js.Any], onMouseUpCapture = onMouseUpCapture.asInstanceOf[js.Any], onPasteCapture = onPasteCapture.asInstanceOf[js.Any], onPauseCapture = onPauseCapture.asInstanceOf[js.Any], onPlayCapture = onPlayCapture.asInstanceOf[js.Any], onPlayingCapture = onPlayingCapture.asInstanceOf[js.Any], onPointerCancelCapture = onPointerCancelCapture.asInstanceOf[js.Any], onPointerDownCapture = onPointerDownCapture.asInstanceOf[js.Any], onPointerEnterCapture = onPointerEnterCapture.asInstanceOf[js.Any], onPointerLeaveCapture = onPointerLeaveCapture.asInstanceOf[js.Any], onPointerMoveCapture = onPointerMoveCapture.asInstanceOf[js.Any], onPointerOutCapture = onPointerOutCapture.asInstanceOf[js.Any], onPointerOverCapture = onPointerOverCapture.asInstanceOf[js.Any], onPointerUpCapture = onPointerUpCapture.asInstanceOf[js.Any], onProgressCapture = onProgressCapture.asInstanceOf[js.Any], onRateChangeCapture = onRateChangeCapture.asInstanceOf[js.Any], onResetCapture = onResetCapture.asInstanceOf[js.Any], onScrollCapture = onScrollCapture.asInstanceOf[js.Any], onSeekedCapture = onSeekedCapture.asInstanceOf[js.Any], onSeekingCapture = onSeekingCapture.asInstanceOf[js.Any], onSelectCapture = onSelectCapture.asInstanceOf[js.Any], onStalledCapture = onStalledCapture.asInstanceOf[js.Any], onSubmitCapture = onSubmitCapture.asInstanceOf[js.Any], onSuspendCapture = onSuspendCapture.asInstanceOf[js.Any], onTimeUpdateCapture = onTimeUpdateCapture.asInstanceOf[js.Any], onTouchCancelCapture = onTouchCancelCapture.asInstanceOf[js.Any], onTouchEndCapture = onTouchEndCapture.asInstanceOf[js.Any], onTouchMoveCapture = onTouchMoveCapture.asInstanceOf[js.Any], onTouchStartCapture = onTouchStartCapture.asInstanceOf[js.Any], onTransitionEndCapture = onTransitionEndCapture.asInstanceOf[js.Any], onVolumeChangeCapture = onVolumeChangeCapture.asInstanceOf[js.Any], onWaitingCapture = onWaitingCapture.asInstanceOf[js.Any], onWheelCapture = onWheelCapture.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (approxFooterHeight != null) __obj.updateDynamic("approxFooterHeight")(approxFooterHeight.asInstanceOf[js.Any])
    if (approxHeaderHeight != null) __obj.updateDynamic("approxHeaderHeight")(approxHeaderHeight.asInstanceOf[js.Any])
    if (approxItemHeight != null) __obj.updateDynamic("approxItemHeight")(approxItemHeight.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (footerFn != null) __obj.updateDynamic("footerFn")(js.Any.fromFunction3(footerFn))
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(js.Any.fromFunction2(footerHeight))
    if (headerFn != null) __obj.updateDynamic("headerFn")(js.Any.fromFunction3(headerFn))
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(js.Any.fromFunction2(headerHeight))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(js.Any.fromFunction2(itemHeight))
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (nodeRender != null) __obj.updateDynamic("nodeRender")(js.Any.fromFunction3(nodeRender))
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction2(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction2(renderHeader))
    __obj.asInstanceOf[IonVirtualScrollPickHTMLA]
  }
}

