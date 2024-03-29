package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.rangeInterfaceMod.RangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRange extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: Double
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: Boolean
  
  /**
    * Show two knobs.
    */
  var dualKnobs: Boolean
  
  /**
    * Maximum integer value of the range.
    */
  var max: Double
  
  /**
    * Minimum integer value of the range.
    */
  var min: Double
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: Boolean
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: Boolean
  
  /**
    * Specifies the value granularity.
    */
  var step: Double
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: Boolean
  
  /**
    * the value of the range.
    */
  var value: RangeValue
}
object IonRange {
  
  inline def apply(
    debounce: Double,
    disabled: Boolean,
    dualKnobs: Boolean,
    max: Double,
    min: Double,
    name: String,
    pin: Boolean,
    snaps: Boolean,
    step: Double,
    ticks: Boolean,
    value: RangeValue
  ): IonRange = {
    val __obj = js.Dynamic.literal(debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dualKnobs = dualKnobs.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], snaps = snaps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRange]
  }
  
  extension [Self <: IonRange](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDualKnobs(value: Boolean): Self = StObject.set(x, "dualKnobs", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setSnaps(value: Boolean): Self = StObject.set(x, "snaps", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
