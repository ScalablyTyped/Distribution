package typings.ionRangeslider

import typings.ionRangeslider.ionRangesliderStrings.big
import typings.ionRangeslider.ionRangesliderStrings.flat
import typings.ionRangeslider.ionRangesliderStrings.modern
import typings.ionRangeslider.ionRangesliderStrings.round
import typings.ionRangeslider.ionRangesliderStrings.sharp
import typings.ionRangeslider.ionRangesliderStrings.square
import typings.ionRangeslider.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IonRangeSliderEvent extends StObject {
    
    // MAX values
    var from: Double
    
    // FROM value
    var from_percent: Double
    
    // MAX prettified (if used)
    var from_pretty: String
    
    // FROM value in percents
    var from_value: Double
    
    var input: JQuery
    
    // MIN value
    var max: Double
    
    // MIN prettified (if used)
    var max_pretty: String
    
    // jQuery-link to sliders container
    var min: Double
    
    // TO index in values array (if used)
    var min_pretty: String
    
    // jQuery-link to input
    var slider: JQuery
    
    // FROM index in values array (if used)
    var to: Double
    
    // TO value
    var to_percent: Double
    
    // FROM prettified (if used)
    var to_pretty: String
    
    // TO value in percents
    var to_value: Double
  }
  object IonRangeSliderEvent {
    
    inline def apply(
      from: Double,
      from_percent: Double,
      from_pretty: String,
      from_value: Double,
      input: JQuery,
      max: Double,
      max_pretty: String,
      min: Double,
      min_pretty: String,
      slider: JQuery,
      to: Double,
      to_percent: Double,
      to_pretty: String,
      to_value: Double
    ): IonRangeSliderEvent = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], from_percent = from_percent.asInstanceOf[js.Any], from_pretty = from_pretty.asInstanceOf[js.Any], from_value = from_value.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], max_pretty = max_pretty.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], min_pretty = min_pretty.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], to_percent = to_percent.asInstanceOf[js.Any], to_pretty = to_pretty.asInstanceOf[js.Any], to_value = to_value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonRangeSliderEvent]
    }
    
    extension [Self <: IonRangeSliderEvent](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFrom_percent(value: Double): Self = StObject.set(x, "from_percent", value.asInstanceOf[js.Any])
      
      inline def setFrom_pretty(value: String): Self = StObject.set(x, "from_pretty", value.asInstanceOf[js.Any])
      
      inline def setFrom_value(value: Double): Self = StObject.set(x, "from_value", value.asInstanceOf[js.Any])
      
      inline def setInput(value: JQuery): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMax_pretty(value: String): Self = StObject.set(x, "max_pretty", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMin_pretty(value: String): Self = StObject.set(x, "min_pretty", value.asInstanceOf[js.Any])
      
      inline def setSlider(value: JQuery): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTo_percent(value: Double): Self = StObject.set(x, "to_percent", value.asInstanceOf[js.Any])
      
      inline def setTo_pretty(value: String): Self = StObject.set(x, "to_pretty", value.asInstanceOf[js.Any])
      
      inline def setTo_value(value: Double): Self = StObject.set(x, "to_value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IonRangeSliderOptions extends StObject {
    
    // Locks slider and makes it inactive. Input is disabled too. Invisible to forms [Default: false]
    var block: js.UndefOr[Boolean] = js.undefined
    
    // Special postfix, used only for maximum value. Will be showed after handle will reach maximum right position. For example **0 — 100+** [Default: ]
    var decorate_both: js.UndefOr[Boolean] = js.undefined
    
    // Separator for **double** values in input value property. `<input value="25;42"> [Default:  ; ]
    var disable: js.UndefOr[Boolean] = js.undefined
    
    // Set minimum maximum between sliders. Only for **double** type [Default: -]
    var drag_interval: js.UndefOr[Boolean] = js.undefined
    
    // Locks slider and makes it inactive. Input is NOT disabled. Can be send with forms [Default: false]
    var extra_classes: js.UndefOr[String] = js.undefined
    
    // Set up your own prettify function. Can be anything. For example, you can set up unix time as slider values and than transform them to cool looking dates [Default: null]
    var force_edges: js.UndefOr[Boolean] = js.undefined
    
    // Set slider maximum value [Default: 100]
    var from: js.UndefOr[Double] = js.undefined
    
    // Set up your own array of possible slider values. They could be numbers or strings. If the values array is set up, min, max and step param, can no longer be changed [Default: []]
    var from_fixed: js.UndefOr[Boolean] = js.undefined
    
    // Set minimum limit for left (or single) handle [Default: min]
    var from_max: js.UndefOr[Double] = js.undefined
    
    // Fix position of left (or single) handle [Default: false]
    var from_min: js.UndefOr[Double] = js.undefined
    
    // Set maximum limit for left (or single) handle [Default: max]
    var from_shadow: js.UndefOr[Boolean] = js.undefined
    
    // Activates keyboard controls. Move left: &larr;, &darr;, A, S. Move right: &rarr;, &uarr;, W, D. [Default: true]
    var grid: js.UndefOr[Boolean] = js.undefined
    
    // Enables grid of values above the slider [Default: true]
    var grid_margin: js.UndefOr[Boolean] = js.undefined
    
    // Set left and right grid gaps [Default: true]
    var grid_num: js.UndefOr[Double] = js.undefined
    
    // Number of grid units [Default: 4]
    var grid_snap: js.UndefOr[Boolean] = js.undefined
    
    // Hides **min** and **max** labels [Default: false]
    var hide_from_to: js.UndefOr[Boolean] = js.undefined
    
    // Snap grid to sliders step (step param). If activated, grid_num will not be used. Max steps = 50 [Default: false]
    var hide_min_max: js.UndefOr[Boolean] = js.undefined
    
    // Set your own separator for close values. Used for **double** type. Default: **10 — 100**. Or you may set: **10 to 100, 10 + 100, 10 &rarr; 100** etc. [Default:  - ]
    var input_values_separator: js.UndefOr[String] = js.undefined
    
    // Sliders handles and tooltips will be always inside it's container [Default: false]
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    // Set slider minimum value [Default: 10]
    var max: js.UndefOr[Double] = js.undefined
    
    // Set minimum diapason between sliders. Only for **double** type [Default: -]
    var max_interval: js.UndefOr[Double] = js.undefined
    
    // Set postfix for values. Will be set up right after the number: 100**k** [Default: ]
    var max_postfix: js.UndefOr[String] = js.undefined
    
    // Choose slider type, could be `single` - for one handle, or `double` for two handles [Default: single]
    var min: js.UndefOr[Double] = js.undefined
    
    // Set sliders step. Always > 0. Could be fractional [Default: 1]
    var min_interval: js.UndefOr[Double] = js.undefined
    
    // Callback. Is called on slider start. Gets all slider data as a 1st attribute [Default: null]
    var onChange: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
    
    // Callback. IS called on each values change. Gets all slider data as a 1st attribute [Default: null]
    var onFinish: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
    
    // Scope for callbacks. Pass any object [Default: null]
    var onStart: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
    
    // Callback. Is called when user releases handle. Gets all slider data as a 1st attribute [Default: null]
    var onUpdate: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
    
    // Set prefix for values. Will be set up right before the number: **$**100 [Default: ]
    var postfix: js.UndefOr[String] = js.undefined
    
    // Hides **from** and **to** labels [Default: false]
    var prefix: js.UndefOr[String] = js.undefined
    
    // Set up your own separator for long numbers: 10000000 &rarr; 10,000,000 etc. [Default:  ]
    var prettify: js.UndefOr[js.Function1[/* num */ Double, String]] = js.undefined
    
    // Highlight the right handle [Default: false]
    var prettify_enabled: js.UndefOr[Boolean] = js.undefined
    
    // Improve readability of long numbers: 10000000 &rarr; 10 000 000 [Default: true]
    var prettify_separator: js.UndefOr[String] = js.undefined
    
    // Traverse extra CSS-classes to sliders container [Default: —]
    var scope: js.UndefOr[js.Any] = js.undefined
    
    var skin: js.UndefOr[flat | big | modern | round | sharp | square] = js.undefined
    
    // Set start position for right handle [Default: max]
    var step: js.UndefOr[Double] = js.undefined
    
    // Set start position for left handle (or for single handle) [Default: min]
    var to: js.UndefOr[Double] = js.undefined
    
    // Highlight the limits for left handle [Default: false]
    var to_fixed: js.UndefOr[Boolean] = js.undefined
    
    // Set minimum limit for right handle [Default: min]
    var to_max: js.UndefOr[Double] = js.undefined
    
    // Fix position of right handle [Default: false]
    var to_min: js.UndefOr[Double] = js.undefined
    
    // Set maximum limit for right handle [Default: max]
    var to_shadow: js.UndefOr[Boolean] = js.undefined
    
    // Set slider theme [Default: flat]
    var `type`: js.UndefOr[String] = js.undefined
    
    // Allow user to drag whole range. Only for **double** type [Default: false]
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    // Used for **double** type and only if prefix or postfix was set up. Determine how to decorate close values. For example: **$10k — $100k** or **$10 — 100k** [Default: true]
    var values_separator: js.UndefOr[String] = js.undefined
  }
  object IonRangeSliderOptions {
    
    inline def apply(): IonRangeSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonRangeSliderOptions]
    }
    
    extension [Self <: IonRangeSliderOptions](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setDecorate_both(value: Boolean): Self = StObject.set(x, "decorate_both", value.asInstanceOf[js.Any])
      
      inline def setDecorate_bothUndefined: Self = StObject.set(x, "decorate_both", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDrag_interval(value: Boolean): Self = StObject.set(x, "drag_interval", value.asInstanceOf[js.Any])
      
      inline def setDrag_intervalUndefined: Self = StObject.set(x, "drag_interval", js.undefined)
      
      inline def setExtra_classes(value: String): Self = StObject.set(x, "extra_classes", value.asInstanceOf[js.Any])
      
      inline def setExtra_classesUndefined: Self = StObject.set(x, "extra_classes", js.undefined)
      
      inline def setForce_edges(value: Boolean): Self = StObject.set(x, "force_edges", value.asInstanceOf[js.Any])
      
      inline def setForce_edgesUndefined: Self = StObject.set(x, "force_edges", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFrom_fixed(value: Boolean): Self = StObject.set(x, "from_fixed", value.asInstanceOf[js.Any])
      
      inline def setFrom_fixedUndefined: Self = StObject.set(x, "from_fixed", js.undefined)
      
      inline def setFrom_max(value: Double): Self = StObject.set(x, "from_max", value.asInstanceOf[js.Any])
      
      inline def setFrom_maxUndefined: Self = StObject.set(x, "from_max", js.undefined)
      
      inline def setFrom_min(value: Double): Self = StObject.set(x, "from_min", value.asInstanceOf[js.Any])
      
      inline def setFrom_minUndefined: Self = StObject.set(x, "from_min", js.undefined)
      
      inline def setFrom_shadow(value: Boolean): Self = StObject.set(x, "from_shadow", value.asInstanceOf[js.Any])
      
      inline def setFrom_shadowUndefined: Self = StObject.set(x, "from_shadow", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGrid_margin(value: Boolean): Self = StObject.set(x, "grid_margin", value.asInstanceOf[js.Any])
      
      inline def setGrid_marginUndefined: Self = StObject.set(x, "grid_margin", js.undefined)
      
      inline def setGrid_num(value: Double): Self = StObject.set(x, "grid_num", value.asInstanceOf[js.Any])
      
      inline def setGrid_numUndefined: Self = StObject.set(x, "grid_num", js.undefined)
      
      inline def setGrid_snap(value: Boolean): Self = StObject.set(x, "grid_snap", value.asInstanceOf[js.Any])
      
      inline def setGrid_snapUndefined: Self = StObject.set(x, "grid_snap", js.undefined)
      
      inline def setHide_from_to(value: Boolean): Self = StObject.set(x, "hide_from_to", value.asInstanceOf[js.Any])
      
      inline def setHide_from_toUndefined: Self = StObject.set(x, "hide_from_to", js.undefined)
      
      inline def setHide_min_max(value: Boolean): Self = StObject.set(x, "hide_min_max", value.asInstanceOf[js.Any])
      
      inline def setHide_min_maxUndefined: Self = StObject.set(x, "hide_min_max", js.undefined)
      
      inline def setInput_values_separator(value: String): Self = StObject.set(x, "input_values_separator", value.asInstanceOf[js.Any])
      
      inline def setInput_values_separatorUndefined: Self = StObject.set(x, "input_values_separator", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMax_interval(value: Double): Self = StObject.set(x, "max_interval", value.asInstanceOf[js.Any])
      
      inline def setMax_intervalUndefined: Self = StObject.set(x, "max_interval", js.undefined)
      
      inline def setMax_postfix(value: String): Self = StObject.set(x, "max_postfix", value.asInstanceOf[js.Any])
      
      inline def setMax_postfixUndefined: Self = StObject.set(x, "max_postfix", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMin_interval(value: Double): Self = StObject.set(x, "min_interval", value.asInstanceOf[js.Any])
      
      inline def setMin_intervalUndefined: Self = StObject.set(x, "min_interval", js.undefined)
      
      inline def setOnChange(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFinish(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnStart(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUpdate(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrettify(value: /* num */ Double => String): Self = StObject.set(x, "prettify", js.Any.fromFunction1(value))
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      inline def setPrettify_enabled(value: Boolean): Self = StObject.set(x, "prettify_enabled", value.asInstanceOf[js.Any])
      
      inline def setPrettify_enabledUndefined: Self = StObject.set(x, "prettify_enabled", js.undefined)
      
      inline def setPrettify_separator(value: String): Self = StObject.set(x, "prettify_separator", value.asInstanceOf[js.Any])
      
      inline def setPrettify_separatorUndefined: Self = StObject.set(x, "prettify_separator", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSkin(value: flat | big | modern | round | sharp | square): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTo_fixed(value: Boolean): Self = StObject.set(x, "to_fixed", value.asInstanceOf[js.Any])
      
      inline def setTo_fixedUndefined: Self = StObject.set(x, "to_fixed", js.undefined)
      
      inline def setTo_max(value: Double): Self = StObject.set(x, "to_max", value.asInstanceOf[js.Any])
      
      inline def setTo_maxUndefined: Self = StObject.set(x, "to_max", js.undefined)
      
      inline def setTo_min(value: Double): Self = StObject.set(x, "to_min", value.asInstanceOf[js.Any])
      
      inline def setTo_minUndefined: Self = StObject.set(x, "to_min", js.undefined)
      
      inline def setTo_shadow(value: Boolean): Self = StObject.set(x, "to_shadow", value.asInstanceOf[js.Any])
      
      inline def setTo_shadowUndefined: Self = StObject.set(x, "to_shadow", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      inline def setValues_separator(value: String): Self = StObject.set(x, "values_separator", value.asInstanceOf[js.Any])
      
      inline def setValues_separatorUndefined: Self = StObject.set(x, "values_separator", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def destroy(): Unit = js.native
      
      def ionRangeSlider(): JQuery = js.native
      def ionRangeSlider(options: IonRangeSliderOptions): JQuery = js.native
      
      def reset(): Unit = js.native
      
      def update(option: IonRangeSliderOptions): Unit = js.native
    }
  }
}
