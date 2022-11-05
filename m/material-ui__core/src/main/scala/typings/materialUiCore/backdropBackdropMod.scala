package typings.materialUiCore

import typings.materialUiCore.anon.PartialClassNameMapBackdr
import typings.materialUiCore.materialUiCoreStrings.`additions removals`
import typings.materialUiCore.materialUiCoreStrings.`additions text`
import typings.materialUiCore.materialUiCoreStrings.`inline`
import typings.materialUiCore.materialUiCoreStrings.`removals additions`
import typings.materialUiCore.materialUiCoreStrings.`removals text`
import typings.materialUiCore.materialUiCoreStrings.`text additions`
import typings.materialUiCore.materialUiCoreStrings.`text removals`
import typings.materialUiCore.materialUiCoreStrings.additions
import typings.materialUiCore.materialUiCoreStrings.all
import typings.materialUiCore.materialUiCoreStrings.ascending
import typings.materialUiCore.materialUiCoreStrings.assertive
import typings.materialUiCore.materialUiCoreStrings.both
import typings.materialUiCore.materialUiCoreStrings.copy
import typings.materialUiCore.materialUiCoreStrings.date
import typings.materialUiCore.materialUiCoreStrings.decimal
import typings.materialUiCore.materialUiCoreStrings.descending
import typings.materialUiCore.materialUiCoreStrings.dialog
import typings.materialUiCore.materialUiCoreStrings.email
import typings.materialUiCore.materialUiCoreStrings.execute
import typings.materialUiCore.materialUiCoreStrings.grammar
import typings.materialUiCore.materialUiCoreStrings.grid
import typings.materialUiCore.materialUiCoreStrings.horizontal
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.link
import typings.materialUiCore.materialUiCoreStrings.list
import typings.materialUiCore.materialUiCoreStrings.listbox
import typings.materialUiCore.materialUiCoreStrings.location
import typings.materialUiCore.materialUiCoreStrings.menu
import typings.materialUiCore.materialUiCoreStrings.mixed
import typings.materialUiCore.materialUiCoreStrings.move
import typings.materialUiCore.materialUiCoreStrings.no
import typings.materialUiCore.materialUiCoreStrings.none
import typings.materialUiCore.materialUiCoreStrings.numeric
import typings.materialUiCore.materialUiCoreStrings.off
import typings.materialUiCore.materialUiCoreStrings.on
import typings.materialUiCore.materialUiCoreStrings.other
import typings.materialUiCore.materialUiCoreStrings.page
import typings.materialUiCore.materialUiCoreStrings.polite
import typings.materialUiCore.materialUiCoreStrings.popup
import typings.materialUiCore.materialUiCoreStrings.removals
import typings.materialUiCore.materialUiCoreStrings.search
import typings.materialUiCore.materialUiCoreStrings.spelling
import typings.materialUiCore.materialUiCoreStrings.step
import typings.materialUiCore.materialUiCoreStrings.tel
import typings.materialUiCore.materialUiCoreStrings.text
import typings.materialUiCore.materialUiCoreStrings.time
import typings.materialUiCore.materialUiCoreStrings.tree
import typings.materialUiCore.materialUiCoreStrings.url
import typings.materialUiCore.materialUiCoreStrings.vertical
import typings.materialUiCore.materialUiCoreStrings.yes
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
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
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropBackdropMod {
  
  @JSImport("@material-ui/core/Backdrop/Backdrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: BackdropProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.invisible
  */
  trait BackdropClassKey extends StObject
  object BackdropClassKey {
    
    inline def invisible: typings.materialUiCore.materialUiCoreStrings.invisible = "invisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.invisible]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/Fade.FadeProps, 'children'>>, @material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey, never> */
  trait BackdropProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var addEndListener: js.UndefOr[Any] = js.undefined
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapBackdr] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disableStrictModeCompat: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * If `true`, the backdrop is invisible.
      * It can be used when rendering a popover or a custom select component.
      */
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var mountOnEnter: js.UndefOr[Any] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEnter: js.UndefOr[Any] = js.undefined
    
    var onEntered: js.UndefOr[Any] = js.undefined
    
    var onEntering: js.UndefOr[Any] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onExit: js.UndefOr[Any] = js.undefined
    
    var onExited: js.UndefOr[Any] = js.undefined
    
    var onExiting: js.UndefOr[Any] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * If `true`, the backdrop is open.
      */
    var open: Boolean
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * Inlined react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/Fade.FadeProps, 'children'>> * /
    {  defaultChecked :boolean | undefined,   defaultValue :string | number | std.ReadonlyArray<string> | undefined,   suppressContentEditableWarning :boolean | undefined,   suppressHydrationWarning :boolean | undefined,   accessKey :string | undefined,   className :string | undefined,   contentEditable :react.react.Booleanish | 'inherit' | undefined,   contextMenu :string | undefined,   dir :string | undefined,   draggable :react.react.Booleanish | undefined,   hidden :boolean | undefined,   id :string | undefined,   lang :string | undefined,   nonce :string | undefined,   placeholder :string | undefined,   slot :string | undefined,   spellCheck :react.react.Booleanish | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | undefined,   title :string | undefined,   translate :'yes' | 'no' | undefined,   radioGroup :string | undefined,   role :react.react.AriaRole | undefined,   about :string | undefined,   datatype :string | undefined,   inlist :any | undefined,   prefix :string | undefined,   property :string | undefined,   resource :string | undefined,   typeof :string | undefined,   vocab :string | undefined,   autoCapitalize :string | undefined,   autoCorrect :string | undefined,   autoSave :string | undefined,   color :string | undefined,   itemProp :string | undefined,   itemScope :boolean | undefined,   itemType :string | undefined,   itemID :string | undefined,   itemRef :string | undefined,   results :number | undefined,   security :string | undefined,   unselectable :'on' | 'off' | undefined,   inputMode :'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined,   is :string | undefined,   aria-activedescendant :string | undefined,   aria-atomic :react.react.Booleanish | undefined,   aria-autocomplete :'none' | 'inline' | 'list' | 'both' | undefined,   aria-busy :react.react.Booleanish | undefined,   aria-checked :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-colcount :number | undefined,   aria-colindex :number | undefined,   aria-colspan :number | undefined,   aria-controls :string | undefined,   aria-current :boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined,   aria-describedby :string | undefined,   aria-details :string | undefined,   aria-disabled :react.react.Booleanish | undefined,   aria-dropeffect :'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined,   aria-errormessage :string | undefined,   aria-expanded :react.react.Booleanish | undefined,   aria-flowto :string | undefined,   aria-grabbed :react.react.Booleanish | undefined,   aria-haspopup :boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined,   aria-hidden :react.react.Booleanish | undefined,   aria-invalid :boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined,   aria-keyshortcuts :string | undefined,   aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-level :number | undefined,   aria-live :'off' | 'assertive' | 'polite' | undefined,   aria-modal :react.react.Booleanish | undefined,   aria-multiline :react.react.Booleanish | undefined,   aria-multiselectable :react.react.Booleanish | undefined,   aria-orientation :'horizontal' | 'vertical' | undefined,   aria-owns :string | undefined,   aria-placeholder :string | undefined,   aria-posinset :number | undefined,   aria-pressed :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-readonly :react.react.Booleanish | undefined,   aria-relevant :'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined,   aria-required :react.react.Booleanish | undefined,   aria-roledescription :string | undefined,   aria-rowcount :number | undefined,   aria-rowindex :number | undefined,   aria-rowspan :number | undefined,   aria-selected :react.react.Booleanish | undefined,   aria-setsize :number | undefined,   aria-sort :'none' | 'ascending' | 'descending' | 'other' | undefined,   aria-valuemax :number | undefined,   aria-valuemin :number | undefined,   aria-valuenow :number | undefined,   aria-valuetext :string | undefined,   children :react.react.ReactNode | undefined,   dangerouslySetInnerHTML :react.anon.Html | undefined,   onCopy :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCut :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onPaste :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCompositionEnd :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionStart :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionUpdate :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onFocus :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onBlur :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onChange :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onBeforeInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onReset :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onSubmit :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInvalid :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onLoad :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onError :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyPress :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyUp :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onAbort :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlayThrough :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onDurationChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEmptied :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEncrypted :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEnded :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedData :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedMetadata :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadStart :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPause :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlaying :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onProgress :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onRateChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onResize :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeked :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeking :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onStalled :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSuspend :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTimeUpdate :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onVolumeChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onWaiting :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onAuxClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onContextMenu :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDoubleClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDrag :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnd :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnter :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragExit :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragLeave :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragOver :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragStart :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDrop :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onMouseDown :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseEnter :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseLeave :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseMove :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOut :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOver :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseUp :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onSelect :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTouchCancel :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchEnd :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchMove :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchStart :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onPointerDown :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerMove :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerUp :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerCancel :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerEnter :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerLeave :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOver :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOut :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onScroll :react.react.UIEventHandler<std.HTMLDivElement> | undefined,   onWheel :react.react.WheelEventHandler<std.HTMLDivElement> | undefined,   onAnimationStart :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationEnd :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationIteration :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onTransitionEnd :react.react.TransitionEventHandler<std.HTMLDivElement> | undefined,   onExit :any | undefined,   onExited :any | undefined,   exit :boolean | undefined,   onEnter :any | undefined,   onExiting :any | undefined,   onEntered :any | undefined,   appear :boolean | undefined,   in :boolean | undefined,   style :react.react.CSSProperties | undefined,   ref :react.react.Ref<unknown> | undefined,   disableStrictModeCompat :boolean | undefined,   enter :boolean | undefined,   mountOnEnter :any | undefined,   onEntering :any | undefined,   addEndListener :any | undefined,   timeout :any | undefined,   unmountOnExit :any | undefined} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ])
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The duration for the transition, in milliseconds.
      * You may specify a single timeout for all transitions, or individually with an object.
      */
    var transitionDuration: js.UndefOr[Any] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unmountOnExit: js.UndefOr[Any] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object BackdropProps {
    
    inline def apply(
      open: Boolean,
      ref: js.UndefOr[Ref[Any]] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: / * Inlined react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/Fade.FadeProps, 'children'>> * /
    {  defaultChecked :boolean | undefined,   defaultValue :string | number | std.ReadonlyArray<string> | undefined,   suppressContentEditableWarning :boolean | undefined,   suppressHydrationWarning :boolean | undefined,   accessKey :string | undefined,   className :string | undefined,   contentEditable :react.react.Booleanish | 'inherit' | undefined,   contextMenu :string | undefined,   dir :string | undefined,   draggable :react.react.Booleanish | undefined,   hidden :boolean | undefined,   id :string | undefined,   lang :string | undefined,   nonce :string | undefined,   placeholder :string | undefined,   slot :string | undefined,   spellCheck :react.react.Booleanish | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | undefined,   title :string | undefined,   translate :'yes' | 'no' | undefined,   radioGroup :string | undefined,   role :react.react.AriaRole | undefined,   about :string | undefined,   datatype :string | undefined,   inlist :any | undefined,   prefix :string | undefined,   property :string | undefined,   resource :string | undefined,   typeof :string | undefined,   vocab :string | undefined,   autoCapitalize :string | undefined,   autoCorrect :string | undefined,   autoSave :string | undefined,   color :string | undefined,   itemProp :string | undefined,   itemScope :boolean | undefined,   itemType :string | undefined,   itemID :string | undefined,   itemRef :string | undefined,   results :number | undefined,   security :string | undefined,   unselectable :'on' | 'off' | undefined,   inputMode :'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined,   is :string | undefined,   aria-activedescendant :string | undefined,   aria-atomic :react.react.Booleanish | undefined,   aria-autocomplete :'none' | 'inline' | 'list' | 'both' | undefined,   aria-busy :react.react.Booleanish | undefined,   aria-checked :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-colcount :number | undefined,   aria-colindex :number | undefined,   aria-colspan :number | undefined,   aria-controls :string | undefined,   aria-current :boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined,   aria-describedby :string | undefined,   aria-details :string | undefined,   aria-disabled :react.react.Booleanish | undefined,   aria-dropeffect :'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined,   aria-errormessage :string | undefined,   aria-expanded :react.react.Booleanish | undefined,   aria-flowto :string | undefined,   aria-grabbed :react.react.Booleanish | undefined,   aria-haspopup :boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined,   aria-hidden :react.react.Booleanish | undefined,   aria-invalid :boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined,   aria-keyshortcuts :string | undefined,   aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-level :number | undefined,   aria-live :'off' | 'assertive' | 'polite' | undefined,   aria-modal :react.react.Booleanish | undefined,   aria-multiline :react.react.Booleanish | undefined,   aria-multiselectable :react.react.Booleanish | undefined,   aria-orientation :'horizontal' | 'vertical' | undefined,   aria-owns :string | undefined,   aria-placeholder :string | undefined,   aria-posinset :number | undefined,   aria-pressed :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-readonly :react.react.Booleanish | undefined,   aria-relevant :'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined,   aria-required :react.react.Booleanish | undefined,   aria-roledescription :string | undefined,   aria-rowcount :number | undefined,   aria-rowindex :number | undefined,   aria-rowspan :number | undefined,   aria-selected :react.react.Booleanish | undefined,   aria-setsize :number | undefined,   aria-sort :'none' | 'ascending' | 'descending' | 'other' | undefined,   aria-valuemax :number | undefined,   aria-valuemin :number | undefined,   aria-valuenow :number | undefined,   aria-valuetext :string | undefined,   children :react.react.ReactNode | undefined,   dangerouslySetInnerHTML :react.anon.Html | undefined,   onCopy :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCut :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onPaste :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCompositionEnd :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionStart :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionUpdate :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onFocus :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onBlur :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onChange :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onBeforeInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onReset :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onSubmit :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInvalid :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onLoad :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onError :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyPress :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyUp :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onAbort :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlayThrough :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onDurationChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEmptied :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEncrypted :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEnded :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedData :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedMetadata :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadStart :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPause :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlaying :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onProgress :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onRateChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onResize :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeked :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeking :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onStalled :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSuspend :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTimeUpdate :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onVolumeChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onWaiting :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onAuxClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onContextMenu :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDoubleClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDrag :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnd :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnter :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragExit :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragLeave :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragOver :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragStart :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDrop :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onMouseDown :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseEnter :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseLeave :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseMove :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOut :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOver :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseUp :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onSelect :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTouchCancel :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchEnd :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchMove :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchStart :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onPointerDown :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerMove :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerUp :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerCancel :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerEnter :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerLeave :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOver :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOut :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onScroll :react.react.UIEventHandler<std.HTMLDivElement> | undefined,   onWheel :react.react.WheelEventHandler<std.HTMLDivElement> | undefined,   onAnimationStart :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationEnd :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationIteration :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onTransitionEnd :react.react.TransitionEventHandler<std.HTMLDivElement> | undefined,   onExit :any | undefined,   onExited :any | undefined,   exit :boolean | undefined,   onEnter :any | undefined,   onExiting :any | undefined,   onEntered :any | undefined,   appear :boolean | undefined,   in :boolean | undefined,   style :react.react.CSSProperties | undefined,   ref :react.react.Ref<unknown> | undefined,   disableStrictModeCompat :boolean | undefined,   enter :boolean | undefined,   mountOnEnter :any | undefined,   onEntering :any | undefined,   addEndListener :any | undefined,   timeout :any | undefined,   unmountOnExit :any | undefined} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
        ])
    ): BackdropProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackdropProps]
    }
    
    extension [Self <: BackdropProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAddEndListener(value: Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapBackdr): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisableStrictModeCompat(value: Boolean): Self = StObject.set(x, "disableStrictModeCompat", value.asInstanceOf[js.Any])
      
      inline def setDisableStrictModeCompatUndefined: Self = StObject.set(x, "disableStrictModeCompat", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMountOnEnter(value: Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnEnter(value: Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExit(value: Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRef(
        value: js.UndefOr[Ref[Any]] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: / * Inlined react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core.Omit<@material-ui/core.@material-ui/core/Fade.FadeProps, 'children'>> * /
      {  defaultChecked :boolean | undefined,   defaultValue :string | number | std.ReadonlyArray<string> | undefined,   suppressContentEditableWarning :boolean | undefined,   suppressHydrationWarning :boolean | undefined,   accessKey :string | undefined,   className :string | undefined,   contentEditable :react.react.Booleanish | 'inherit' | undefined,   contextMenu :string | undefined,   dir :string | undefined,   draggable :react.react.Booleanish | undefined,   hidden :boolean | undefined,   id :string | undefined,   lang :string | undefined,   nonce :string | undefined,   placeholder :string | undefined,   slot :string | undefined,   spellCheck :react.react.Booleanish | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | undefined,   title :string | undefined,   translate :'yes' | 'no' | undefined,   radioGroup :string | undefined,   role :react.react.AriaRole | undefined,   about :string | undefined,   datatype :string | undefined,   inlist :any | undefined,   prefix :string | undefined,   property :string | undefined,   resource :string | undefined,   typeof :string | undefined,   vocab :string | undefined,   autoCapitalize :string | undefined,   autoCorrect :string | undefined,   autoSave :string | undefined,   color :string | undefined,   itemProp :string | undefined,   itemScope :boolean | undefined,   itemType :string | undefined,   itemID :string | undefined,   itemRef :string | undefined,   results :number | undefined,   security :string | undefined,   unselectable :'on' | 'off' | undefined,   inputMode :'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined,   is :string | undefined,   aria-activedescendant :string | undefined,   aria-atomic :react.react.Booleanish | undefined,   aria-autocomplete :'none' | 'inline' | 'list' | 'both' | undefined,   aria-busy :react.react.Booleanish | undefined,   aria-checked :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-colcount :number | undefined,   aria-colindex :number | undefined,   aria-colspan :number | undefined,   aria-controls :string | undefined,   aria-current :boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined,   aria-describedby :string | undefined,   aria-details :string | undefined,   aria-disabled :react.react.Booleanish | undefined,   aria-dropeffect :'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined,   aria-errormessage :string | undefined,   aria-expanded :react.react.Booleanish | undefined,   aria-flowto :string | undefined,   aria-grabbed :react.react.Booleanish | undefined,   aria-haspopup :boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined,   aria-hidden :react.react.Booleanish | undefined,   aria-invalid :boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined,   aria-keyshortcuts :string | undefined,   aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-level :number | undefined,   aria-live :'off' | 'assertive' | 'polite' | undefined,   aria-modal :react.react.Booleanish | undefined,   aria-multiline :react.react.Booleanish | undefined,   aria-multiselectable :react.react.Booleanish | undefined,   aria-orientation :'horizontal' | 'vertical' | undefined,   aria-owns :string | undefined,   aria-placeholder :string | undefined,   aria-posinset :number | undefined,   aria-pressed :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-readonly :react.react.Booleanish | undefined,   aria-relevant :'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined,   aria-required :react.react.Booleanish | undefined,   aria-roledescription :string | undefined,   aria-rowcount :number | undefined,   aria-rowindex :number | undefined,   aria-rowspan :number | undefined,   aria-selected :react.react.Booleanish | undefined,   aria-setsize :number | undefined,   aria-sort :'none' | 'ascending' | 'descending' | 'other' | undefined,   aria-valuemax :number | undefined,   aria-valuemin :number | undefined,   aria-valuenow :number | undefined,   aria-valuetext :string | undefined,   children :react.react.ReactNode | undefined,   dangerouslySetInnerHTML :react.anon.Html | undefined,   onCopy :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCut :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onPaste :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCompositionEnd :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionStart :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionUpdate :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onFocus :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onBlur :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onChange :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onBeforeInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onReset :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onSubmit :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInvalid :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onLoad :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onError :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyPress :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyUp :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onAbort :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlayThrough :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onDurationChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEmptied :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEncrypted :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEnded :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedData :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedMetadata :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadStart :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPause :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlaying :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onProgress :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onRateChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onResize :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeked :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeking :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onStalled :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSuspend :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTimeUpdate :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onVolumeChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onWaiting :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onAuxClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onContextMenu :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDoubleClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDrag :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnd :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnter :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragExit :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragLeave :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragOver :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragStart :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDrop :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onMouseDown :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseEnter :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseLeave :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseMove :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOut :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOver :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseUp :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onSelect :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTouchCancel :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchEnd :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchMove :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchStart :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onPointerDown :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerMove :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerUp :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerCancel :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerEnter :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerLeave :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOver :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOut :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onScroll :react.react.UIEventHandler<std.HTMLDivElement> | undefined,   onWheel :react.react.WheelEventHandler<std.HTMLDivElement> | undefined,   onAnimationStart :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationEnd :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationIteration :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onTransitionEnd :react.react.TransitionEventHandler<std.HTMLDivElement> | undefined,   onExit :any | undefined,   onExited :any | undefined,   exit :boolean | undefined,   onEnter :any | undefined,   onExiting :any | undefined,   onEntered :any | undefined,   appear :boolean | undefined,   in :boolean | undefined,   style :react.react.CSSProperties | undefined,   ref :react.react.Ref<unknown> | undefined,   disableStrictModeCompat :boolean | undefined,   enter :boolean | undefined,   mountOnEnter :any | undefined,   onEntering :any | undefined,   addEndListener :any | undefined,   timeout :any | undefined,   unmountOnExit :any | undefined} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
            ])
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionDuration(value: Any): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnmountOnExit(value: Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}
