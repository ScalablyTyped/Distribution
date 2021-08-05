package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonSelectElement
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.selectInterfaceMod.SelectChangeEventDetail
import typings.ionicCore.selectInterfaceMod.SelectCompareFn
import typings.ionicCore.selectInterfaceMod.SelectInterface
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@ionic/core/dist/types/components/select/select", "Select")
  @js.native
  class Select ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var buttonEl: js.Any = js.native
    
    /**
      * The text to display on the cancel button.
      */
    var cancelText: String = js.native
    
    /* private */ def childOpts: js.Any = js.native
    
    /**
      * Close the select interface.
      */
    /* private */ var close: js.Any = js.native
    
    /**
      * A property name or function used to compare object values
      */
    var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MSelect(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSelect(): js.Promise[Unit] = js.native
    
    /* private */ var createActionSheetButtons: js.Any = js.native
    
    /* private */ var createAlertInputs: js.Any = js.native
    
    /* private */ var createOverlay: js.Any = js.native
    
    /* private */ var createPopoverOptions: js.Any = js.native
    
    /* private */ var didInit: js.Any = js.native
    
    /**
      * If `true`, the user cannot interact with the select.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSelect(): Unit = js.native
    
    var el: HTMLIonSelectElement = js.native
    
    /* private */ var emitStyle: js.Any = js.native
    
    /* private */ var getLabel: js.Any = js.native
    
    /* private */ var getText: js.Any = js.native
    
    /* private */ var hasValue: js.Any = js.native
    
    /* private */ var inputId: js.Any = js.native
    
    /**
      * The interface the select should use: `action-sheet`, `popover` or `alert`.
      */
    var interface: SelectInterface = js.native
    
    /**
      * Any additional options that the `alert`, `action-sheet` or `popover` interface
      * can take. See the [ion-alert docs](../alert), the
      * [ion-action-sheet docs](../action-sheet) and the
      * [ion-popover docs](../popover) for the
      * create options for each interface.
      *
      * Note: `interfaceOptions` will not override `inputs` or `buttons` with the `alert` interface.
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
    var ionChange: EventEmitter[SelectChangeEventDetail[js.Any]] = js.native
    
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
    
    /* private */ var mutationO: js.Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /**
      * The text to display on the ok button.
      */
    var okText: String = js.native
    
    /* private */ var onBlur: js.Any = js.native
    
    /* private */ var onClick: js.Any = js.native
    
    /* private */ var onFocus: js.Any = js.native
    
    /**
      * Open the select overlay. The overlay is either an alert, action sheet, or popover,
      * depending on the `interface` property on the `ion-select`.
      *
      * @param event The user interface event that called the open.
      */
    def open(): js.Promise[js.Any] = js.native
    def open(event: UIEvent): js.Promise[js.Any] = js.native
    
    /* private */ var openActionSheet: js.Any = js.native
    
    /* private */ var openAlert: js.Any = js.native
    
    /* private */ var openPopover: js.Any = js.native
    
    /* private */ var overlay: js.Any = js.native
    
    /**
      * The text to display when the select is empty.
      */
    var placeholder: js.UndefOr[String | Null] = js.native
    
    @JSName("render")
    def render_MSelect(): js.Any = js.native
    
    /**
      * The text to display instead of the selected option's value.
      */
    var selectedText: js.UndefOr[String | Null] = js.native
    
    /* private */ var setFocus: js.Any = js.native
    
    /* private */ var updateOverlayOptions: js.Any = js.native
    
    /**
      * the value of the select.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    
    def valueChanged(): Unit = js.native
  }
}
