package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonRangeElement
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeChangeEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@ionic/core/dist/types/components/range/range", "Range")
  @js.native
  class Range ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var clampBounds: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRange(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRange(): Unit = js.native
    
    /**
      * How long, in milliseconds, to wait to trigger the
      * `ionChange` event after each change in the range value.
      * This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /* private */ var didLoad: js.Any = js.native
    
    /**
      * If `true`, the user cannot interact with the range.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRange(): Unit = js.native
    
    /**
      * Show two knobs.
      */
    var dualKnobs: Boolean = js.native
    
    var el: HTMLIonRangeElement = js.native
    
    /* private */ var emitStyle: js.Any = js.native
    
    /* private */ var ensureValueInBounds: js.Any = js.native
    
    /* private */ var gesture: js.Any = js.native
    
    /* private */ var getValue: js.Any = js.native
    
    /* private */ var handleKeyboard: js.Any = js.native
    
    /* private */ var hasFocus: js.Any = js.native
    
    /**
      * Emitted when the range loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[RangeChangeEventDetail] = js.native
    
    /**
      * Emitted when the range has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * Maximum integer value of the range.
      */
    var max: Double = js.native
    
    /* protected */ def maxChanged(): Unit = js.native
    
    /**
      * Minimum integer value of the range.
      */
    var min: Double = js.native
    
    /* protected */ def minChanged(): Unit = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var noUpdate: js.Any = js.native
    
    /* private */ var onBlur: js.Any = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onFocus: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    /**
      * If `true`, a pin with integer value is shown when the knob
      * is pressed.
      */
    var pin: Boolean = js.native
    
    /* private */ var pressedKnob: js.Any = js.native
    
    /* private */ var rangeSlider: js.Any = js.native
    
    /* private */ var ratioA: js.Any = js.native
    
    /* private */ var ratioB: js.Any = js.native
    
    /* private */ def ratioLower: js.Any = js.native
    
    /* private */ def ratioUpper: js.Any = js.native
    
    /* private */ var rect: js.Any = js.native
    
    @JSName("render")
    def render_MRange(): js.Any = js.native
    
    /* private */ var setFocus: js.Any = js.native
    
    /* private */ var setupGesture: js.Any = js.native
    
    /**
      * If `true`, the knob snaps to tick marks evenly spaced based
      * on the step property value.
      */
    var snaps: Boolean = js.native
    
    /**
      * Specifies the value granularity.
      */
    var step: Double = js.native
    
    /**
      * If `true`, tick marks are displayed based on the step value.
      * Only applies when `snaps` is `true`.
      */
    var ticks: Boolean = js.native
    
    /* private */ var update: js.Any = js.native
    
    /* private */ var updateRatio: js.Any = js.native
    
    /* private */ var updateValue: js.Any = js.native
    
    /* private */ def valA: js.Any = js.native
    
    /* private */ def valB: js.Any = js.native
    
    /**
      * the value of the range.
      */
    var value: RangeValue = js.native
    
    /* protected */ def valueChanged(value: RangeValue): Unit = js.native
  }
}
