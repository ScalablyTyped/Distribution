package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/MenuItem.MenuItemProps> */
trait PartialMenuItemProps extends js.Object {
  var ContainerComponent: js.UndefOr[
    reactLib.reactMod.ReactType[reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement]]
  ] = js.undefined
  var ContainerProps: js.UndefOr[reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  var TouchRippleProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.buttonBaseTouchRippleMod.TouchRippleProps]
  ] = js.undefined
  var about: js.UndefOr[java.lang.String] = js.undefined
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[
    js.Function1[
      /* actions */ atMaterialDashUiCoreLib.buttonBaseButtonBaseMod.ButtonBaseActions, 
      scala.Unit
    ]
  ] = js.undefined
  var alignItems: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`flex-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center
  ] = js.undefined
  var `aria-activedescendant`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-atomic`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-autocomplete`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`inline` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.list | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.both
  ] = js.undefined
  var `aria-busy`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-checked`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.mixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-colcount`: js.UndefOr[scala.Double] = js.undefined
  var `aria-colindex`: js.UndefOr[scala.Double] = js.undefined
  var `aria-colspan`: js.UndefOr[scala.Double] = js.undefined
  var `aria-controls`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-current`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.page | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.step | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.location | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.date | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.time
  ] = js.undefined
  var `aria-describedby`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-details`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-disabled`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-dropeffect`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.copy | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.execute | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.link | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.move | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.popup
  ] = js.undefined
  var `aria-errormessage`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-expanded`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-flowto`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-grabbed`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-haspopup`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.menu | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.listbox | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.tree | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.grid | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dialog
  ] = js.undefined
  var `aria-hidden`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-invalid`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.grammar | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.spelling
  ] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-level`: js.UndefOr[scala.Double] = js.undefined
  var `aria-live`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.assertive | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.polite
  ] = js.undefined
  var `aria-modal`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-multiline`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-multiselectable`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-orientation`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.horizontal | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.vertical
  ] = js.undefined
  var `aria-owns`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-placeholder`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-posinset`: js.UndefOr[scala.Double] = js.undefined
  var `aria-pressed`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.mixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-readonly`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-relevant`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.additions | (atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`additions text`) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.all | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.removals | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text
  ] = js.undefined
  var `aria-required`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-roledescription`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-rowcount`: js.UndefOr[scala.Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[scala.Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[scala.Double] = js.undefined
  var `aria-selected`: js.UndefOr[
    scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true`
  ] = js.undefined
  var `aria-setsize`: js.UndefOr[scala.Double] = js.undefined
  var `aria-sort`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.ascending | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.descending | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.other
  ] = js.undefined
  var `aria-valuemax`: js.UndefOr[scala.Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[scala.Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[scala.Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[java.lang.String] = js.undefined
  var autoCapitalize: js.UndefOr[java.lang.String] = js.undefined
  var autoCorrect: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autoSave: js.UndefOr[java.lang.String] = js.undefined
  var button: js.UndefOr[scala.Boolean] = js.undefined
  var buttonRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.menuItemMenuItemMod.MenuItemClassKey]
    ]
  ] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[
    reactLib.reactMod.ReactType[atMaterialDashUiCoreLib.menuItemMenuItemMod.MenuItemProps]
  ] = js.undefined
  var contentEditable: js.UndefOr[scala.Boolean] = js.undefined
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[reactLib.Anon_Html] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dense: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var disableGutters: js.UndefOr[scala.Boolean] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var focusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusVisibleClassName: js.UndefOr[java.lang.String] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var formAction: js.UndefOr[java.lang.String] = js.undefined
  var formEncType: js.UndefOr[java.lang.String] = js.undefined
  var formMethod: js.UndefOr[java.lang.String] = js.undefined
  var formNoValidate: js.UndefOr[scala.Boolean] = js.undefined
  var formTarget: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var hrefLang: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var inputMode: js.UndefOr[java.lang.String] = js.undefined
  var is: js.UndefOr[java.lang.String] = js.undefined
  var itemID: js.UndefOr[java.lang.String] = js.undefined
  var itemProp: js.UndefOr[java.lang.String] = js.undefined
  var itemRef: js.UndefOr[java.lang.String] = js.undefined
  var itemScope: js.UndefOr[scala.Boolean] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onAbort: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAbortCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationStart: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAuxClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onAuxClickCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onBeforeInput: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onBlurCapture: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCanPlay: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCanPlayCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onChangeCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onClickCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionStart: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onContextMenu: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onContextMenuCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCopy: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCopyCapture: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCut: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onCutCapture: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDoubleClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDrag: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragEnd: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragEndCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragEnter: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragEnterCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragExit: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragExitCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragLeave: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragOverCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragStart: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDragStartCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDrop: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDropCapture: js.UndefOr[reactLib.reactMod.DragEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDurationChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEmptied: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEmptiedCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEncrypted: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEncryptedCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEnded: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onEndedCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onError: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onErrorCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onFocusCapture: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]] = js.undefined
  var onFocusVisible: js.UndefOr[reactLib.reactMod.FocusEventHandler[_]] = js.undefined
  var onGotPointerCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onInput: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onInputCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onInvalid: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onInvalidCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyDownCapture: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyPress: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyPressCapture: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyUp: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyUpCapture: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoad: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadStart: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadStartCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadedData: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLostPointerCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseDown: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseDownCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseMove: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseOut: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseOutCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseOver: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseOverCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseUp: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseUpCapture: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPaste: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPasteCapture: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPause: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPauseCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPlay: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPlayCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPlaying: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPlayingCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerCancel: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerDown: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerDownCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerEnter: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerLeave: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerMove: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerOut: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerOutCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerOver: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerOverCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerUp: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPointerUpCapture: js.UndefOr[reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement]] = js.undefined
  var onProgress: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onProgressCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onRateChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onRateChangeCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onReset: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onResetCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onScroll: js.UndefOr[reactLib.reactMod.UIEventHandler[stdLib.HTMLElement]] = js.undefined
  var onScrollCapture: js.UndefOr[reactLib.reactMod.UIEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSeeked: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSeekedCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSeeking: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSeekingCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSelect: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSelectCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onStalled: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onStalledCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSubmit: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSubmitCapture: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSuspend: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onSuspendCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchCancel: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchEnd: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchEndCapture: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchMove: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchStartCapture: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[reactLib.reactMod.TransitionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[reactLib.reactMod.TransitionEventHandler[stdLib.HTMLElement]] = js.undefined
  var onVolumeChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onWaiting: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onWaitingCapture: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement]] = js.undefined
  var onWheel: js.UndefOr[reactLib.reactMod.WheelEventHandler[stdLib.HTMLElement]] = js.undefined
  var onWheelCapture: js.UndefOr[reactLib.reactMod.WheelEventHandler[stdLib.HTMLElement]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var radioGroup: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var typeof: js.UndefOr[java.lang.String] = js.undefined
  var unselectable: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.on | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off
  ] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
  var vocab: js.UndefOr[java.lang.String] = js.undefined
}

object PartialMenuItemProps {
  @scala.inline
  def apply(
    ContainerComponent: reactLib.reactMod.ReactType[reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement]] = null,
    ContainerProps: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    TouchRippleProps: stdLib.Partial[atMaterialDashUiCoreLib.buttonBaseTouchRippleMod.TouchRippleProps] = null,
    about: java.lang.String = null,
    accessKey: java.lang.String = null,
    action: /* actions */ atMaterialDashUiCoreLib.buttonBaseButtonBaseMod.ButtonBaseActions => scala.Unit = null,
    alignItems: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`flex-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center = null,
    `aria-activedescendant`: java.lang.String = null,
    `aria-atomic`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-autocomplete`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`inline` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.list | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.both = null,
    `aria-busy`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-checked`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.mixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-colcount`: scala.Int | scala.Double = null,
    `aria-colindex`: scala.Int | scala.Double = null,
    `aria-colspan`: scala.Int | scala.Double = null,
    `aria-controls`: java.lang.String = null,
    `aria-current`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.page | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.step | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.location | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.date | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.time = null,
    `aria-describedby`: java.lang.String = null,
    `aria-details`: java.lang.String = null,
    `aria-disabled`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-dropeffect`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.copy | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.execute | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.link | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.move | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.popup = null,
    `aria-errormessage`: java.lang.String = null,
    `aria-expanded`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-flowto`: java.lang.String = null,
    `aria-grabbed`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-haspopup`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.menu | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.listbox | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.tree | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.grid | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dialog = null,
    `aria-hidden`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-invalid`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.grammar | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.spelling = null,
    `aria-keyshortcuts`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    `aria-level`: scala.Int | scala.Double = null,
    `aria-live`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.assertive | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.polite = null,
    `aria-modal`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-multiline`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-multiselectable`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-orientation`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.horizontal | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.vertical = null,
    `aria-owns`: java.lang.String = null,
    `aria-placeholder`: java.lang.String = null,
    `aria-posinset`: scala.Int | scala.Double = null,
    `aria-pressed`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.mixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-readonly`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-relevant`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.additions | (atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`additions text`) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.all | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.removals | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text = null,
    `aria-required`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-roledescription`: java.lang.String = null,
    `aria-rowcount`: scala.Int | scala.Double = null,
    `aria-rowindex`: scala.Int | scala.Double = null,
    `aria-rowspan`: scala.Int | scala.Double = null,
    `aria-selected`: scala.Boolean | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`false` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`true` = null,
    `aria-setsize`: scala.Int | scala.Double = null,
    `aria-sort`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.ascending | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.descending | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.other = null,
    `aria-valuemax`: scala.Int | scala.Double = null,
    `aria-valuemin`: scala.Int | scala.Double = null,
    `aria-valuenow`: scala.Int | scala.Double = null,
    `aria-valuetext`: java.lang.String = null,
    autoCapitalize: java.lang.String = null,
    autoCorrect: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoSave: java.lang.String = null,
    button: js.UndefOr[scala.Boolean] = js.undefined,
    buttonRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.menuItemMenuItemMod.MenuItemClassKey]
    ] = null,
    color: java.lang.String = null,
    component: reactLib.reactMod.ReactType[atMaterialDashUiCoreLib.menuItemMenuItemMod.MenuItemProps] = null,
    contentEditable: js.UndefOr[scala.Boolean] = js.undefined,
    contextMenu: java.lang.String = null,
    dangerouslySetInnerHTML: reactLib.Anon_Html = null,
    datatype: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String | js.Array[java.lang.String] = null,
    dense: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    disableGutters: js.UndefOr[scala.Boolean] = js.undefined,
    disableRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    focusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusVisibleClassName: java.lang.String = null,
    form: java.lang.String = null,
    formAction: java.lang.String = null,
    formEncType: java.lang.String = null,
    formMethod: java.lang.String = null,
    formNoValidate: js.UndefOr[scala.Boolean] = js.undefined,
    formTarget: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    hrefLang: java.lang.String = null,
    id: java.lang.String = null,
    inlist: js.Any = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    inputMode: java.lang.String = null,
    is: java.lang.String = null,
    itemID: java.lang.String = null,
    itemProp: java.lang.String = null,
    itemRef: java.lang.String = null,
    itemScope: js.UndefOr[scala.Boolean] = js.undefined,
    itemType: java.lang.String = null,
    lang: java.lang.String = null,
    media: java.lang.String = null,
    name: java.lang.String = null,
    onAbort: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onAnimationEnd: reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement] = null,
    onAnimationIteration: reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement] = null,
    onAnimationStart: reactLib.reactMod.AnimationEventHandler[stdLib.HTMLElement] = null,
    onAuxClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onBeforeInput: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] = null,
    onCanPlay: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onCanPlayThrough: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onCompositionEnd: reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement] = null,
    onCompositionStart: reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement] = null,
    onCompositionUpdate: reactLib.reactMod.CompositionEventHandler[stdLib.HTMLElement] = null,
    onContextMenu: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onCopy: reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement] = null,
    onCut: reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement] = null,
    onDoubleClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onDrag: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragEnd: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragEnter: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragExit: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragLeave: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragOver: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDragStart: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDrop: reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] = null,
    onDurationChange: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onEmptied: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onEncrypted: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onEnded: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onError: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] = null,
    onFocusVisible: reactLib.reactMod.FocusEventHandler[_] = null,
    onInput: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onInvalid: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onLoad: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onLoadStart: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onLoadedData: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onLoadedMetadata: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onMouseDown: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseMove: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseOut: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseOver: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseUp: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onPaste: reactLib.reactMod.ClipboardEventHandler[stdLib.HTMLElement] = null,
    onPause: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onPlay: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onPlaying: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onPointerCancel: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerDown: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerEnter: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerLeave: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerMove: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerOut: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerOver: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onPointerUp: reactLib.reactMod.PointerEventHandler[stdLib.HTMLElement] = null,
    onProgress: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onRateChange: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onReset: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onScroll: reactLib.reactMod.UIEventHandler[stdLib.HTMLElement] = null,
    onSeeked: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onSeeking: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onSelect: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onStalled: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onSubmit: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    onSuspend: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onTimeUpdate: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onTouchCancel: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchEnd: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchMove: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTransitionEnd: reactLib.reactMod.TransitionEventHandler[stdLib.HTMLElement] = null,
    onVolumeChange: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onWaiting: reactLib.reactMod.ReactEventHandler[stdLib.HTMLElement] = null,
    onWheel: reactLib.reactMod.WheelEventHandler[stdLib.HTMLElement] = null,
    placeholder: java.lang.String = null,
    prefix: java.lang.String = null,
    property: java.lang.String = null,
    radioGroup: java.lang.String = null,
    referrerPolicy: java.lang.String = null,
    rel: java.lang.String = null,
    resource: java.lang.String = null,
    results: scala.Int | scala.Double = null,
    role: java.lang.String = null,
    security: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    slot: java.lang.String = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    typeof: java.lang.String = null,
    unselectable: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.on | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null,
    vocab: java.lang.String = null
  ): PartialMenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (ContainerComponent != null) __obj.updateDynamic("ContainerComponent")(ContainerComponent.asInstanceOf[js.Any])
    if (ContainerProps != null) __obj.updateDynamic("ContainerProps")(ContainerProps)
    if (TouchRippleProps != null) __obj.updateDynamic("TouchRippleProps")(TouchRippleProps)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`)
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`)
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`)
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`)
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`)
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (buttonRef != null) __obj.updateDynamic("buttonRef")(buttonRef.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disableGutters)) __obj.updateDynamic("disableGutters")(disableGutters)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (download != null) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(focusRipple)) __obj.updateDynamic("focusRipple")(focusRipple)
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (media != null) __obj.updateDynamic("media")(media)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick)
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onFocusVisible != null) __obj.updateDynamic("onFocusVisible")(onFocusVisible)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel)
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown)
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter)
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave)
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove)
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut)
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver)
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (security != null) __obj.updateDynamic("security")(security)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning)
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    __obj.asInstanceOf[PartialMenuItemProps]
  }
}

