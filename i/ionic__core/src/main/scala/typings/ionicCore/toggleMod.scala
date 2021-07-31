package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.ionicCore.toggleInterfaceMod.ToggleChangeEventDetail
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod {
  
  @JSImport("@ionic/core/dist/types/components/toggle/toggle", "Toggle")
  @js.native
  class Toggle ()
    extends StObject
       with ComponentInterface {
    
    var activated: Boolean = js.native
    
    /**
      * If `true`, the toggle is selected.
      */
    var checked: Boolean = js.native
    
    def checkedChanged(isChecked: Boolean): Unit = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MToggle(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToggle(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the user cannot interact with the toggle.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MToggle(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var emitStyle: js.Any = js.native
    
    var focusEl: js.Any = js.native
    
    var gesture: js.Any = js.native
    
    var getValue: js.Any = js.native
    
    var inputId: js.Any = js.native
    
    /**
      * Emitted when the toggle loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[ToggleChangeEventDetail] = js.native
    
    /**
      * Emitted when the toggle has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    var lastDrag: js.Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    var onBlur: js.Any = js.native
    
    var onClick: js.Any = js.native
    
    var onEnd: js.Any = js.native
    
    var onFocus: js.Any = js.native
    
    var onMove: js.Any = js.native
    
    var onStart: js.Any = js.native
    
    @JSName("render")
    def render_MToggle(): js.Any = js.native
    
    var setFocus: js.Any = js.native
    
    /**
      * The value of the toggle does not mean if it's checked or not, use the `checked`
      * property for that.
      *
      * The value of a toggle is analogous to the value of a `<input type="checkbox">`,
      * it's only used when the toggle participates in a native `<form>`.
      */
    var value: js.UndefOr[String | Null] = js.native
  }
}
