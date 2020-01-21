package typings.materialUiCore.tableCellTableCellMod

import typings.materialUiCore.materialUiCoreStrings.`additions text`
import typings.materialUiCore.materialUiCoreStrings.`inline`
import typings.materialUiCore.materialUiCoreStrings.additions
import typings.materialUiCore.materialUiCoreStrings.all
import typings.materialUiCore.materialUiCoreStrings.ascending
import typings.materialUiCore.materialUiCoreStrings.assertive
import typings.materialUiCore.materialUiCoreStrings.baseline
import typings.materialUiCore.materialUiCoreStrings.both
import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.center
import typings.materialUiCore.materialUiCoreStrings.char
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
import typings.materialUiCore.materialUiCoreStrings.justify
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.link
import typings.materialUiCore.materialUiCoreStrings.list
import typings.materialUiCore.materialUiCoreStrings.listbox
import typings.materialUiCore.materialUiCoreStrings.location
import typings.materialUiCore.materialUiCoreStrings.menu
import typings.materialUiCore.materialUiCoreStrings.middle
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
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.search
import typings.materialUiCore.materialUiCoreStrings.spelling
import typings.materialUiCore.materialUiCoreStrings.step
import typings.materialUiCore.materialUiCoreStrings.tel
import typings.materialUiCore.materialUiCoreStrings.text
import typings.materialUiCore.materialUiCoreStrings.time
import typings.materialUiCore.materialUiCoreStrings.top
import typings.materialUiCore.materialUiCoreStrings.tree
import typings.materialUiCore.materialUiCoreStrings.url
import typings.materialUiCore.materialUiCoreStrings.vertical
import typings.materialUiCore.materialUiCoreStrings.yes
import typings.react.AnonHtml
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableHeaderCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ThHTMLAttributes<std.HTMLTableHeaderCellElement> & react.react.TdHTMLAttributes<std.HTMLTableDataCellElement> */
@js.native
trait TableCellBaseProps extends js.Object {
  var abbr: js.UndefOr[String] = js.native
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  var align: js.UndefOr[left | center | right | justify | char] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var headers: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  // Media Events
  var onAbort: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onAnimationEnd: js.UndefOr[
    AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onAnimationIteration: js.UndefOr[
    AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[
    AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onBeforeInput: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onBlur: js.UndefOr[
    FocusEventHandler[HTMLTableHeaderCellElement] with FocusEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onCanPlay: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onCanPlayThrough: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Form Events
  var onChange: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onClick: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[
    CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onCompositionStart: js.UndefOr[
    CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onCompositionUpdate: js.UndefOr[
    CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onContextMenu: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[
    ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onCut: js.UndefOr[
    ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDoubleClick: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDrag: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragEnd: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragEnter: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragExit: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragLeave: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragOver: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDragStart: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDrop: js.UndefOr[
    DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onDurationChange: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onEmptied: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onEncrypted: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onEnded: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onError: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Focus Events
  var onFocus: js.UndefOr[
    FocusEventHandler[HTMLTableHeaderCellElement] with FocusEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onInput: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onInvalid: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[
    KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onKeyPress: js.UndefOr[
    KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onKeyUp: js.UndefOr[
    KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Image Events
  var onLoad: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onLoadStart: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onLoadedData: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onLoadedMetadata: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseDown: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseEnter: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseLeave: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseMove: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseOut: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseOver: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onMouseUp: js.UndefOr[
    MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPaste: js.UndefOr[
    ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPause: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPlay: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPlaying: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerCancel: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerEnter: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerLeave: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerMove: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerOut: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerOver: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onPointerUp: js.UndefOr[
    PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onProgress: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onRateChange: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onReset: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // UI Events
  var onScroll: js.UndefOr[
    UIEventHandler[HTMLTableHeaderCellElement] with UIEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onSeeked: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onSeeking: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Selection Events
  var onSelect: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onStalled: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onSubmit: js.UndefOr[
    FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onSuspend: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onTimeUpdate: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[
    TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onTouchEnd: js.UndefOr[
    TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onTouchMove: js.UndefOr[
    TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onTouchStart: js.UndefOr[
    TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[
    TransitionEventHandler[HTMLTableHeaderCellElement] with TransitionEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onVolumeChange: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var onWaiting: js.UndefOr[
    ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement]
  ] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[
    WheelEventHandler[HTMLTableHeaderCellElement] with WheelEventHandler[HTMLTableDataCellElement]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object TableCellBaseProps {
  @scala.inline
  def apply(
    abbr: String = null,
    about: String = null,
    accessKey: String = null,
    align: left | center | right | justify | char = null,
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
    className: String = null,
    colSpan: Int | Double = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    headers: String = null,
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
    lang: String = null,
    onAbort: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onAnimationEnd: AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement] = null,
    onAnimationIteration: AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement] = null,
    onAnimationStart: AnimationEventHandler[HTMLTableHeaderCellElement] with AnimationEventHandler[HTMLTableDataCellElement] = null,
    onAuxClick: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onBeforeInput: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onBlur: FocusEventHandler[HTMLTableHeaderCellElement] with FocusEventHandler[HTMLTableDataCellElement] = null,
    onCanPlay: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onCanPlayThrough: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onChange: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onClick: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onCompositionEnd: CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement] = null,
    onCompositionStart: CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement] = null,
    onCompositionUpdate: CompositionEventHandler[HTMLTableHeaderCellElement] with CompositionEventHandler[HTMLTableDataCellElement] = null,
    onContextMenu: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onCopy: ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement] = null,
    onCut: ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement] = null,
    onDoubleClick: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onDrag: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragEnd: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragEnter: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragExit: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragLeave: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragOver: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDragStart: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDrop: DragEventHandler[HTMLTableHeaderCellElement] with DragEventHandler[HTMLTableDataCellElement] = null,
    onDurationChange: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onEmptied: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onEncrypted: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onEnded: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onError: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onFocus: FocusEventHandler[HTMLTableHeaderCellElement] with FocusEventHandler[HTMLTableDataCellElement] = null,
    onInput: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onInvalid: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLTableHeaderCellElement] with KeyboardEventHandler[HTMLTableDataCellElement] = null,
    onLoad: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onLoadStart: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onLoadedData: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onLoadedMetadata: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onMouseDown: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseEnter: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseLeave: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseMove: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseOut: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseOver: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onMouseUp: MouseEventHandler[HTMLTableHeaderCellElement] with MouseEventHandler[HTMLTableDataCellElement] = null,
    onPaste: ClipboardEventHandler[HTMLTableHeaderCellElement] with ClipboardEventHandler[HTMLTableDataCellElement] = null,
    onPause: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onPlay: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onPlaying: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onPointerCancel: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerDown: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerEnter: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerLeave: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerMove: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerOut: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerOver: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onPointerUp: PointerEventHandler[HTMLTableHeaderCellElement] with PointerEventHandler[HTMLTableDataCellElement] = null,
    onProgress: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onRateChange: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onReset: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onScroll: UIEventHandler[HTMLTableHeaderCellElement] with UIEventHandler[HTMLTableDataCellElement] = null,
    onSeeked: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onSeeking: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onSelect: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onStalled: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onSubmit: FormEventHandler[HTMLTableHeaderCellElement] with FormEventHandler[HTMLTableDataCellElement] = null,
    onSuspend: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onTimeUpdate: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onTouchCancel: TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement] = null,
    onTouchEnd: TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement] = null,
    onTouchMove: TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement] = null,
    onTouchStart: TouchEventHandler[HTMLTableHeaderCellElement] with TouchEventHandler[HTMLTableDataCellElement] = null,
    onTransitionEnd: TransitionEventHandler[HTMLTableHeaderCellElement] with TransitionEventHandler[HTMLTableDataCellElement] = null,
    onVolumeChange: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onWaiting: ReactEventHandler[HTMLTableHeaderCellElement] with ReactEventHandler[HTMLTableDataCellElement] = null,
    onWheel: WheelEventHandler[HTMLTableHeaderCellElement] with WheelEventHandler[HTMLTableDataCellElement] = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rowSpan: Int | Double = null,
    scope: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    valign: top | middle | bottom | baseline = null,
    vocab: String = null
  ): TableCellBaseProps = {
    val __obj = js.Dynamic.literal()
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
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
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
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
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(onCut.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(onPause.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel.asInstanceOf[js.Any])
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown.asInstanceOf[js.Any])
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter.asInstanceOf[js.Any])
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave.asInstanceOf[js.Any])
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove.asInstanceOf[js.Any])
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut.asInstanceOf[js.Any])
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver.asInstanceOf[js.Any])
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked.asInstanceOf[js.Any])
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend.asInstanceOf[js.Any])
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd.asInstanceOf[js.Any])
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange.asInstanceOf[js.Any])
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting.asInstanceOf[js.Any])
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellBaseProps]
  }
}

