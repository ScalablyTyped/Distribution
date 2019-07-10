package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonRange")
@js.native
class IonRange protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonRange {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  /* CompleteClass */
  override var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  override var dualKnobs: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  override var max: scala.Double = js.native
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  override var min: scala.Double = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  override var pin: scala.Boolean = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  override var snaps: scala.Boolean = js.native
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  override var step: scala.Double = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  override var ticks: scala.Boolean = js.native
  /**
    * the value of the range.
    */
  /* CompleteClass */
  override var value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RangeValue */ js.Any = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

