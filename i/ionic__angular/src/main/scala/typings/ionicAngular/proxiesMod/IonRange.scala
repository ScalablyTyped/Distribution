package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonRange")
@js.native
class IonRange protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonRange {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  var dualKnobs: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  var max: Double = js.native
  
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  var min: Double = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  var pin: Boolean = js.native
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  var snaps: Boolean = js.native
  
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  var step: Double = js.native
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  var ticks: Boolean = js.native
  
  /**
    * the value of the range.
    */
  /* CompleteClass */
  var value: RangeValue = js.native
  
  var z: NgZone = js.native
}
