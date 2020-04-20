package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonSelectElement
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.selectInterfaceMod.SelectChangeEventDetail
import typings.ionicCore.selectInterfaceMod.SelectCompareFn
import typings.ionicCore.selectInterfaceMod.SelectInterface
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/select/select", JSImport.Namespace)
@js.native
object selectMod extends js.Object {
  @js.native
  class Select () extends ComponentInterface {
    var buttonEl: js.UndefOr[js.Any] = js.native
    /**
      * The text to display on the cancel button.
      */
    var cancelText: String = js.native
    /**
      * Close the select interface.
      */
    var close: js.Any = js.native
    /**
      * A property name or function used to compare object values
      */
    var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.native
    var createActionSheetButtons: js.Any = js.native
    var createAlertInputs: js.Any = js.native
    var createOverlay: js.Any = js.native
    var createPopoverOptions: js.Any = js.native
    var didInit: js.Any = js.native
    /**
      * If `true`, the user cannot interact with the select.
      */
    var disabled: Boolean = js.native
    var el: HTMLIonSelectElement = js.native
    var emitStyle: js.Any = js.native
    var getLabel: js.Any = js.native
    var getText: js.Any = js.native
    var hasValue: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * The interface the select should use: `action-sheet`, `popover` or `alert`.
      */
    var interface: SelectInterface = js.native
    /**
      * Any additional options that the `alert`, `action-sheet` or `popover` interface
      * can take. See the [AlertController API docs](../../alert/AlertController/#create), the
      * [ActionSheetController API docs](../../action-sheet/ActionSheetController/#create) and the
      * [PopoverController API docs](../../popover/PopoverController/#create) for the
      * create options for each interface.
      */
    var interfaceOptions: js.Any = js.native
    /**
      * Emitted when the select loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the selection is cancelled.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[SelectChangeEventDetail] = js.native
    /**
      * Emitted when the select has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var isExpanded: Boolean = js.native
    /**
      * If `true`, the select can accept multiple values.
      */
    var multiple: Boolean = js.native
    var mutationO: js.UndefOr[js.Any] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    /**
      * The text to display on the ok button.
      */
    var okText: String = js.native
    var onBlur: js.Any = js.native
    var onClick: js.Any = js.native
    var onFocus: js.Any = js.native
    var openActionSheet: js.Any = js.native
    var openAlert: js.Any = js.native
    var openPopover: js.Any = js.native
    var overlay: js.UndefOr[js.Any] = js.native
    /**
      * The text to display when the select is empty.
      */
    var placeholder: js.UndefOr[String | Null] = js.native
    /**
      * The text to display instead of the selected option's value.
      */
    var selectedText: js.UndefOr[String | Null] = js.native
    var setFocus: js.Any = js.native
    var updateOverlayOptions: js.Any = js.native
    /**
      * the value of the select.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    /* private */ def childOpts: js.Any = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MSelect(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MSelect(): js.Promise[Unit] = js.native
    def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSelect(): Unit = js.native
    /**
      * Open the select overlay. The overlay is either an alert, action sheet, or popover,
      * depending on the `interface` property on the `ion-select`.
      *
      * @param event The user interface event that called the open.
      */
    def open(): js.Promise[_] = js.native
    def open(event: UIEvent): js.Promise[_] = js.native
    @JSName("render")
    def render_MSelect(): js.Any = js.native
    def valueChanged(): Unit = js.native
  }
  
}

