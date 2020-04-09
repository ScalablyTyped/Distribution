package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.componentsMod._Global_.HTMLIonContentElement
import typings.ionicCore.contentInterfaceMod.ScrollBaseDetail
import typings.ionicCore.contentInterfaceMod.ScrollDetail
import typings.ionicCore.mod.Color
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
import typings.react.mod.NativeUIEvent
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
import typings.std.CustomEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.JSX.IonContent & std.Pick<react.react.HTMLAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonContentElement>, 'hidden' | 'dir' | 'slot' | 'title' | 'color' | 'children' | 'className' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'contentEditable' | 'contextMenu' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'translate' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture'> & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonContentElement> */
trait IonContentPickHTMLAttribu extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
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
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color with String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onAbortCapture: js.Any
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLIonContentElement]] = js.undefined
  var onAnimationEndCapture: js.Any
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLIonContentElement]] = js.undefined
  var onAnimationIterationCapture: js.Any
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLIonContentElement]] = js.undefined
  var onAnimationStartCapture: js.Any
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onAuxClickCapture: js.Any
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onBeforeInputCapture: js.Any
  var onBlur: js.UndefOr[FocusEventHandler[HTMLIonContentElement]] = js.undefined
  var onBlurCapture: js.Any
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onCanPlayCapture: js.Any
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onCanPlayThroughCapture: js.Any
  var onChange: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onChangeCapture: js.Any
  var onClick: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onClickCapture: js.Any
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLIonContentElement]] = js.undefined
  var onCompositionEndCapture: js.Any
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLIonContentElement]] = js.undefined
  var onCompositionStartCapture: js.Any
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLIonContentElement]] = js.undefined
  var onCompositionUpdateCapture: js.Any
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onContextMenuCapture: js.Any
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onCopyCapture: js.Any
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onCutCapture: js.Any
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onDoubleClickCapture: js.Any
  var onDrag: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragCapture: js.Any
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragEndCapture: js.Any
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragEnterCapture: js.Any
  var onDragExit: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragExitCapture: js.Any
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragLeaveCapture: js.Any
  var onDragOver: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragOverCapture: js.Any
  var onDragStart: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDragStartCapture: js.Any
  var onDrop: js.UndefOr[DragEventHandler[HTMLIonContentElement]] = js.undefined
  var onDropCapture: js.Any
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onDurationChangeCapture: js.Any
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onEmptiedCapture: js.Any
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onEncryptedCapture: js.Any
  var onEnded: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onEndedCapture: js.Any
  var onError: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onErrorCapture: js.Any
  var onFocus: js.UndefOr[FocusEventHandler[HTMLIonContentElement]] = js.undefined
  var onFocusCapture: js.Any
  var onGotPointerCapture: js.Any
  var onGotPointerCaptureCapture: js.Any
  var onInput: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onInputCapture: js.Any
  var onInvalid: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onInvalidCapture: js.Any
  /**
    * Emitted while scrolling. This event is disabled by default. Look at the property: `scrollEvents`
    */
  var onIonScroll: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollDetail], Unit]] = js.undefined
  /**
    * Emitted when the scroll has ended.
    */
  var onIonScrollEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  /**
    * Emitted when the scroll has started.
    */
  var onIonScrollStart: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onKeyDownCapture: js.Any
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onKeyPressCapture: js.Any
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onKeyUpCapture: js.Any
  var onLoad: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onLoadCapture: js.Any
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onLoadStartCapture: js.Any
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onLoadedDataCapture: js.Any
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onLoadedMetadataCapture: js.Any
  var onLostPointerCapture: js.Any
  var onLostPointerCaptureCapture: js.Any
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseDownCapture: js.Any
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseMoveCapture: js.Any
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseOutCapture: js.Any
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseOverCapture: js.Any
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLIonContentElement]] = js.undefined
  var onMouseUpCapture: js.Any
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLIonContentElement]] = js.undefined
  var onPasteCapture: js.Any
  var onPause: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onPauseCapture: js.Any
  var onPlay: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onPlayCapture: js.Any
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onPlayingCapture: js.Any
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerCancelCapture: js.Any
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerDownCapture: js.Any
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerEnterCapture: js.Any
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerLeaveCapture: js.Any
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerMoveCapture: js.Any
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerOutCapture: js.Any
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerOverCapture: js.Any
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLIonContentElement]] = js.undefined
  var onPointerUpCapture: js.Any
  var onProgress: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onProgressCapture: js.Any
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onRateChangeCapture: js.Any
  var onReset: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onResetCapture: js.Any
  var onScroll: js.UndefOr[UIEventHandler[HTMLIonContentElement]] = js.undefined
  var onScrollCapture: js.Any
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onSeekedCapture: js.Any
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onSeekingCapture: js.Any
  var onSelect: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onSelectCapture: js.Any
  var onStalled: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onStalledCapture: js.Any
  var onSubmit: js.UndefOr[FormEventHandler[HTMLIonContentElement]] = js.undefined
  var onSubmitCapture: js.Any
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onSuspendCapture: js.Any
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onTimeUpdateCapture: js.Any
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLIonContentElement]] = js.undefined
  var onTouchCancelCapture: js.Any
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLIonContentElement]] = js.undefined
  var onTouchEndCapture: js.Any
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLIonContentElement]] = js.undefined
  var onTouchMoveCapture: js.Any
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLIonContentElement]] = js.undefined
  var onTouchStartCapture: js.Any
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLIonContentElement]] = js.undefined
  var onTransitionEndCapture: js.Any
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onVolumeChangeCapture: js.Any
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLIonContentElement]] = js.undefined
  var onWaitingCapture: js.Any
  var onWheel: js.UndefOr[WheelEventHandler[HTMLIonContentElement]] = js.undefined
  var onWheelCapture: js.Any
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Ref[HTMLIonContentElement]] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: js.UndefOr[Boolean] = js.undefined
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

object IonContentPickHTMLAttribu {
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
    color: Color with String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    forceOverscroll: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    lang: String = null,
    onAbort: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLIonContentElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLIonContentElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLIonContentElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLIonContentElement] => Unit = null,
    onBlur: FocusEvent[HTMLIonContentElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onChange: FormEvent[HTMLIonContentElement] => Unit = null,
    onClick: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLIonContentElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLIonContentElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLIonContentElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLIonContentElement] => Unit = null,
    onCut: ClipboardEvent[HTMLIonContentElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragEnd: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragEnter: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragExit: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragLeave: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragOver: DragEvent[HTMLIonContentElement] => Unit = null,
    onDragStart: DragEvent[HTMLIonContentElement] => Unit = null,
    onDrop: DragEvent[HTMLIonContentElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onEmptied: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onEnded: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onError: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onFocus: FocusEvent[HTMLIonContentElement] => Unit = null,
    onInput: FormEvent[HTMLIonContentElement] => Unit = null,
    onInvalid: FormEvent[HTMLIonContentElement] => Unit = null,
    onIonScroll: /* event */ CustomEvent[ScrollDetail] => Unit = null,
    onIonScrollEnd: /* event */ CustomEvent[ScrollBaseDetail] => Unit = null,
    onIonScrollStart: /* event */ CustomEvent[ScrollBaseDetail] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLIonContentElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLIonContentElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLIonContentElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onMouseDown: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLIonContentElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLIonContentElement] => Unit = null,
    onPause: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onPlay: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onPlaying: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onPointerCancel: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLIonContentElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLIonContentElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onRateChange: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onReset: FormEvent[HTMLIonContentElement] => Unit = null,
    onScroll: UIEvent[HTMLIonContentElement, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onSeeking: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onSelect: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onStalled: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onSubmit: FormEvent[HTMLIonContentElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onTouchCancel: TouchEvent[HTMLIonContentElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLIonContentElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLIonContentElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLIonContentElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLIonContentElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onWaiting: SyntheticEvent[HTMLIonContentElement, Event_] => Unit = null,
    onWheel: WheelEvent[HTMLIonContentElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: Ref[HTMLIonContentElement] = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollEvents: js.UndefOr[Boolean] = js.undefined,
    scrollX: js.UndefOr[Boolean] = js.undefined,
    scrollY: js.UndefOr[Boolean] = js.undefined,
    security: String = null
  ): IonContentPickHTMLAttribu = {
    val __obj = js.Dynamic.literal(onAbortCapture = onAbortCapture.asInstanceOf[js.Any], onAnimationEndCapture = onAnimationEndCapture.asInstanceOf[js.Any], onAnimationIterationCapture = onAnimationIterationCapture.asInstanceOf[js.Any], onAnimationStartCapture = onAnimationStartCapture.asInstanceOf[js.Any], onAuxClickCapture = onAuxClickCapture.asInstanceOf[js.Any], onBeforeInputCapture = onBeforeInputCapture.asInstanceOf[js.Any], onBlurCapture = onBlurCapture.asInstanceOf[js.Any], onCanPlayCapture = onCanPlayCapture.asInstanceOf[js.Any], onCanPlayThroughCapture = onCanPlayThroughCapture.asInstanceOf[js.Any], onChangeCapture = onChangeCapture.asInstanceOf[js.Any], onClickCapture = onClickCapture.asInstanceOf[js.Any], onCompositionEndCapture = onCompositionEndCapture.asInstanceOf[js.Any], onCompositionStartCapture = onCompositionStartCapture.asInstanceOf[js.Any], onCompositionUpdateCapture = onCompositionUpdateCapture.asInstanceOf[js.Any], onContextMenuCapture = onContextMenuCapture.asInstanceOf[js.Any], onCopyCapture = onCopyCapture.asInstanceOf[js.Any], onCutCapture = onCutCapture.asInstanceOf[js.Any], onDoubleClickCapture = onDoubleClickCapture.asInstanceOf[js.Any], onDragCapture = onDragCapture.asInstanceOf[js.Any], onDragEndCapture = onDragEndCapture.asInstanceOf[js.Any], onDragEnterCapture = onDragEnterCapture.asInstanceOf[js.Any], onDragExitCapture = onDragExitCapture.asInstanceOf[js.Any], onDragLeaveCapture = onDragLeaveCapture.asInstanceOf[js.Any], onDragOverCapture = onDragOverCapture.asInstanceOf[js.Any], onDragStartCapture = onDragStartCapture.asInstanceOf[js.Any], onDropCapture = onDropCapture.asInstanceOf[js.Any], onDurationChangeCapture = onDurationChangeCapture.asInstanceOf[js.Any], onEmptiedCapture = onEmptiedCapture.asInstanceOf[js.Any], onEncryptedCapture = onEncryptedCapture.asInstanceOf[js.Any], onEndedCapture = onEndedCapture.asInstanceOf[js.Any], onErrorCapture = onErrorCapture.asInstanceOf[js.Any], onFocusCapture = onFocusCapture.asInstanceOf[js.Any], onGotPointerCapture = onGotPointerCapture.asInstanceOf[js.Any], onGotPointerCaptureCapture = onGotPointerCaptureCapture.asInstanceOf[js.Any], onInputCapture = onInputCapture.asInstanceOf[js.Any], onInvalidCapture = onInvalidCapture.asInstanceOf[js.Any], onKeyDownCapture = onKeyDownCapture.asInstanceOf[js.Any], onKeyPressCapture = onKeyPressCapture.asInstanceOf[js.Any], onKeyUpCapture = onKeyUpCapture.asInstanceOf[js.Any], onLoadCapture = onLoadCapture.asInstanceOf[js.Any], onLoadStartCapture = onLoadStartCapture.asInstanceOf[js.Any], onLoadedDataCapture = onLoadedDataCapture.asInstanceOf[js.Any], onLoadedMetadataCapture = onLoadedMetadataCapture.asInstanceOf[js.Any], onLostPointerCapture = onLostPointerCapture.asInstanceOf[js.Any], onLostPointerCaptureCapture = onLostPointerCaptureCapture.asInstanceOf[js.Any], onMouseDownCapture = onMouseDownCapture.asInstanceOf[js.Any], onMouseMoveCapture = onMouseMoveCapture.asInstanceOf[js.Any], onMouseOutCapture = onMouseOutCapture.asInstanceOf[js.Any], onMouseOverCapture = onMouseOverCapture.asInstanceOf[js.Any], onMouseUpCapture = onMouseUpCapture.asInstanceOf[js.Any], onPasteCapture = onPasteCapture.asInstanceOf[js.Any], onPauseCapture = onPauseCapture.asInstanceOf[js.Any], onPlayCapture = onPlayCapture.asInstanceOf[js.Any], onPlayingCapture = onPlayingCapture.asInstanceOf[js.Any], onPointerCancelCapture = onPointerCancelCapture.asInstanceOf[js.Any], onPointerDownCapture = onPointerDownCapture.asInstanceOf[js.Any], onPointerEnterCapture = onPointerEnterCapture.asInstanceOf[js.Any], onPointerLeaveCapture = onPointerLeaveCapture.asInstanceOf[js.Any], onPointerMoveCapture = onPointerMoveCapture.asInstanceOf[js.Any], onPointerOutCapture = onPointerOutCapture.asInstanceOf[js.Any], onPointerOverCapture = onPointerOverCapture.asInstanceOf[js.Any], onPointerUpCapture = onPointerUpCapture.asInstanceOf[js.Any], onProgressCapture = onProgressCapture.asInstanceOf[js.Any], onRateChangeCapture = onRateChangeCapture.asInstanceOf[js.Any], onResetCapture = onResetCapture.asInstanceOf[js.Any], onScrollCapture = onScrollCapture.asInstanceOf[js.Any], onSeekedCapture = onSeekedCapture.asInstanceOf[js.Any], onSeekingCapture = onSeekingCapture.asInstanceOf[js.Any], onSelectCapture = onSelectCapture.asInstanceOf[js.Any], onStalledCapture = onStalledCapture.asInstanceOf[js.Any], onSubmitCapture = onSubmitCapture.asInstanceOf[js.Any], onSuspendCapture = onSuspendCapture.asInstanceOf[js.Any], onTimeUpdateCapture = onTimeUpdateCapture.asInstanceOf[js.Any], onTouchCancelCapture = onTouchCancelCapture.asInstanceOf[js.Any], onTouchEndCapture = onTouchEndCapture.asInstanceOf[js.Any], onTouchMoveCapture = onTouchMoveCapture.asInstanceOf[js.Any], onTouchStartCapture = onTouchStartCapture.asInstanceOf[js.Any], onTransitionEndCapture = onTransitionEndCapture.asInstanceOf[js.Any], onVolumeChangeCapture = onVolumeChangeCapture.asInstanceOf[js.Any], onWaitingCapture = onWaitingCapture.asInstanceOf[js.Any], onWheelCapture = onWheelCapture.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (!js.isUndefined(forceOverscroll)) __obj.updateDynamic("forceOverscroll")(forceOverscroll.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
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
    if (onIonScroll != null) __obj.updateDynamic("onIonScroll")(js.Any.fromFunction1(onIonScroll))
    if (onIonScrollEnd != null) __obj.updateDynamic("onIonScrollEnd")(js.Any.fromFunction1(onIonScrollEnd))
    if (onIonScrollStart != null) __obj.updateDynamic("onIonScrollStart")(js.Any.fromFunction1(onIonScrollStart))
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
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEvents)) __obj.updateDynamic("scrollEvents")(scrollEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonContentPickHTMLAttribu]
  }
}

