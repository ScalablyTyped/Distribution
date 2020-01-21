package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonRangeElement
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeChangeEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/range/range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  @js.native
  class Range () extends ComponentInterface {
    var clampBounds: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * How long, in milliseconds, to wait to trigger the
      * `ionChange` event after each change in the range value.
      */
    var debounce: Double = js.native
    /**
      * If `true`, the user cannot interact with the range.
      */
    var disabled: Boolean = js.native
    /**
      * Show two knobs.
      */
    var dualKnobs: Boolean = js.native
    var el: HTMLIonRangeElement = js.native
    var emitStyle: js.Any = js.native
    var ensureValueInBounds: js.Any = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    var getValue: js.Any = js.native
    var handleKeyboard: js.Any = js.native
    var hasFocus: js.Any = js.native
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
    /**
      * Minimum integer value of the range.
      */
    var min: Double = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var noUpdate: js.Any = js.native
    var onBlur: js.Any = js.native
    var onEnd: js.Any = js.native
    var onFocus: js.Any = js.native
    var onMove: js.Any = js.native
    var onStart: js.Any = js.native
    /**
      * If `true`, a pin with integer value is shown when the knob
      * is pressed.
      */
    var pin: Boolean = js.native
    var pressedKnob: js.Any = js.native
    var rangeSlider: js.UndefOr[js.Any] = js.native
    var ratioA: js.Any = js.native
    var ratioB: js.Any = js.native
    val ratioLower: js.Any = js.native
    val ratioUpper: js.Any = js.native
    var rect: js.Any = js.native
    var setFocus: js.Any = js.native
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
    var update: js.Any = js.native
    var updateRatio: js.Any = js.native
    var updateValue: js.Any = js.native
    val valA: js.Any = js.native
    val valB: js.Any = js.native
    /**
      * the value of the range.
      */
    var value: RangeValue = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MRange(): js.Promise[Unit] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MRange(): Unit = js.native
    /* protected */ def debounceChanged(): Unit = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRange(): Unit = js.native
    /* protected */ def maxChanged(): Unit = js.native
    /* protected */ def minChanged(): Unit = js.native
    @JSName("render")
    def render_MRange(): js.Any = js.native
    /* protected */ def valueChanged(value: RangeValue): Unit = js.native
  }
  
}

