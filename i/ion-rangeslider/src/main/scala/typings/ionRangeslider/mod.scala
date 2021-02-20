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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait IonRangeSliderEvent extends StObject {
    
    // MAX values
    var from: Double = js.native
    
    // FROM value
    var from_percent: Double = js.native
    
    // MAX prettified (if used)
    var from_pretty: String = js.native
    
    // FROM value in percents
    var from_value: Double = js.native
    
    var input: JQuery = js.native
    
    // MIN value
    var max: Double = js.native
    
    // MIN prettified (if used)
    var max_pretty: String = js.native
    
    // jQuery-link to sliders container
    var min: Double = js.native
    
    // TO index in values array (if used)
    var min_pretty: String = js.native
    
    // jQuery-link to input
    var slider: JQuery = js.native
    
    // FROM index in values array (if used)
    var to: Double = js.native
    
    // TO value
    var to_percent: Double = js.native
    
    // FROM prettified (if used)
    var to_pretty: String = js.native
    
    // TO value in percents
    var to_value: Double = js.native
  }
  object IonRangeSliderEvent {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IonRangeSliderEventMutableBuilder[Self <: IonRangeSliderEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_percent(value: Double): Self = StObject.set(x, "from_percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_pretty(value: String): Self = StObject.set(x, "from_pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_value(value: Double): Self = StObject.set(x, "from_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: JQuery): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_pretty(value: String): Self = StObject.set(x, "max_pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_pretty(value: String): Self = StObject.set(x, "min_pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlider(value: JQuery): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_percent(value: Double): Self = StObject.set(x, "to_percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_pretty(value: String): Self = StObject.set(x, "to_pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_value(value: Double): Self = StObject.set(x, "to_value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IonRangeSliderOptions extends StObject {
    
    // Locks slider and makes it inactive. Input is disabled too. Invisible to forms [Default: false]
    var block: js.UndefOr[Boolean] = js.native
    
    // Special postfix, used only for maximum value. Will be showed after handle will reach maximum right position. For example **0 — 100+** [Default: ]
    var decorate_both: js.UndefOr[Boolean] = js.native
    
    // Separator for **double** values in input value property. `<input value="25;42"> [Default:  ; ]
    var disable: js.UndefOr[Boolean] = js.native
    
    // Set minimum maximum between sliders. Only for **double** type [Default: -]
    var drag_interval: js.UndefOr[Boolean] = js.native
    
    // Locks slider and makes it inactive. Input is NOT disabled. Can be send with forms [Default: false]
    var extra_classes: js.UndefOr[String] = js.native
    
    // Set up your own prettify function. Can be anything. For example, you can set up unix time as slider values and than transform them to cool looking dates [Default: null]
    var force_edges: js.UndefOr[Boolean] = js.native
    
    // Set slider maximum value [Default: 100]
    var from: js.UndefOr[Double] = js.native
    
    // Set up your own array of possible slider values. They could be numbers or strings. If the values array is set up, min, max and step param, can no longer be changed [Default: []]
    var from_fixed: js.UndefOr[Boolean] = js.native
    
    // Set minimum limit for left (or single) handle [Default: min]
    var from_max: js.UndefOr[Double] = js.native
    
    // Fix position of left (or single) handle [Default: false]
    var from_min: js.UndefOr[Double] = js.native
    
    // Set maximum limit for left (or single) handle [Default: max]
    var from_shadow: js.UndefOr[Boolean] = js.native
    
    // Activates keyboard controls. Move left: &larr;, &darr;, A, S. Move right: &rarr;, &uarr;, W, D. [Default: true]
    var grid: js.UndefOr[Boolean] = js.native
    
    // Enables grid of values above the slider [Default: true]
    var grid_margin: js.UndefOr[Boolean] = js.native
    
    // Set left and right grid gaps [Default: true]
    var grid_num: js.UndefOr[Double] = js.native
    
    // Number of grid units [Default: 4]
    var grid_snap: js.UndefOr[Boolean] = js.native
    
    // Hides **min** and **max** labels [Default: false]
    var hide_from_to: js.UndefOr[Boolean] = js.native
    
    // Snap grid to sliders step (step param). If activated, grid_num will not be used. Max steps = 50 [Default: false]
    var hide_min_max: js.UndefOr[Boolean] = js.native
    
    // Set your own separator for close values. Used for **double** type. Default: **10 — 100**. Or you may set: **10 to 100, 10 + 100, 10 &rarr; 100** etc. [Default:  - ]
    var input_values_separator: js.UndefOr[String] = js.native
    
    // Sliders handles and tooltips will be always inside it's container [Default: false]
    var keyboard: js.UndefOr[Boolean] = js.native
    
    // Set slider minimum value [Default: 10]
    var max: js.UndefOr[Double] = js.native
    
    // Set minimum diapason between sliders. Only for **double** type [Default: -]
    var max_interval: js.UndefOr[Double] = js.native
    
    // Set postfix for values. Will be set up right after the number: 100**k** [Default: ]
    var max_postfix: js.UndefOr[String] = js.native
    
    // Choose slider type, could be `single` - for one handle, or `double` for two handles [Default: single]
    var min: js.UndefOr[Double] = js.native
    
    // Set sliders step. Always > 0. Could be fractional [Default: 1]
    var min_interval: js.UndefOr[Double] = js.native
    
    // Callback. Is called on slider start. Gets all slider data as a 1st attribute [Default: null]
    var onChange: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
    
    // Callback. IS called on each values change. Gets all slider data as a 1st attribute [Default: null]
    var onFinish: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
    
    // Scope for callbacks. Pass any object [Default: null]
    var onStart: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
    
    // Callback. Is called when user releases handle. Gets all slider data as a 1st attribute [Default: null]
    var onUpdate: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
    
    // Set prefix for values. Will be set up right before the number: **$**100 [Default: ]
    var postfix: js.UndefOr[String] = js.native
    
    // Hides **from** and **to** labels [Default: false]
    var prefix: js.UndefOr[String] = js.native
    
    // Set up your own separator for long numbers: 10000000 &rarr; 10,000,000 etc. [Default:  ]
    var prettify: js.UndefOr[js.Function1[/* num */ Double, String]] = js.native
    
    // Highlight the right handle [Default: false]
    var prettify_enabled: js.UndefOr[Boolean] = js.native
    
    // Improve readability of long numbers: 10000000 &rarr; 10 000 000 [Default: true]
    var prettify_separator: js.UndefOr[String] = js.native
    
    // Traverse extra CSS-classes to sliders container [Default: —]
    var scope: js.UndefOr[js.Any] = js.native
    
    var skin: js.UndefOr[flat | big | modern | round | sharp | square] = js.native
    
    // Set start position for right handle [Default: max]
    var step: js.UndefOr[Double] = js.native
    
    // Set start position for left handle (or for single handle) [Default: min]
    var to: js.UndefOr[Double] = js.native
    
    // Highlight the limits for left handle [Default: false]
    var to_fixed: js.UndefOr[Boolean] = js.native
    
    // Set minimum limit for right handle [Default: min]
    var to_max: js.UndefOr[Double] = js.native
    
    // Fix position of right handle [Default: false]
    var to_min: js.UndefOr[Double] = js.native
    
    // Set maximum limit for right handle [Default: max]
    var to_shadow: js.UndefOr[Boolean] = js.native
    
    // Set slider theme [Default: flat]
    var `type`: js.UndefOr[String] = js.native
    
    // Allow user to drag whole range. Only for **double** type [Default: false]
    var values: js.UndefOr[js.Array[_]] = js.native
    
    // Used for **double** type and only if prefix or postfix was set up. Determine how to decorate close values. For example: **$10k — $100k** or **$10 — 100k** [Default: true]
    var values_separator: js.UndefOr[String] = js.native
  }
  object IonRangeSliderOptions {
    
    @scala.inline
    def apply(): IonRangeSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonRangeSliderOptions]
    }
    
    @scala.inline
    implicit class IonRangeSliderOptionsMutableBuilder[Self <: IonRangeSliderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setDecorate_both(value: Boolean): Self = StObject.set(x, "decorate_both", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorate_bothUndefined: Self = StObject.set(x, "decorate_both", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDrag_interval(value: Boolean): Self = StObject.set(x, "drag_interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrag_intervalUndefined: Self = StObject.set(x, "drag_interval", js.undefined)
      
      @scala.inline
      def setExtra_classes(value: String): Self = StObject.set(x, "extra_classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra_classesUndefined: Self = StObject.set(x, "extra_classes", js.undefined)
      
      @scala.inline
      def setForce_edges(value: Boolean): Self = StObject.set(x, "force_edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_edgesUndefined: Self = StObject.set(x, "force_edges", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFrom_fixed(value: Boolean): Self = StObject.set(x, "from_fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_fixedUndefined: Self = StObject.set(x, "from_fixed", js.undefined)
      
      @scala.inline
      def setFrom_max(value: Double): Self = StObject.set(x, "from_max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_maxUndefined: Self = StObject.set(x, "from_max", js.undefined)
      
      @scala.inline
      def setFrom_min(value: Double): Self = StObject.set(x, "from_min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_minUndefined: Self = StObject.set(x, "from_min", js.undefined)
      
      @scala.inline
      def setFrom_shadow(value: Boolean): Self = StObject.set(x, "from_shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_shadowUndefined: Self = StObject.set(x, "from_shadow", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGrid_margin(value: Boolean): Self = StObject.set(x, "grid_margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid_marginUndefined: Self = StObject.set(x, "grid_margin", js.undefined)
      
      @scala.inline
      def setGrid_num(value: Double): Self = StObject.set(x, "grid_num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid_numUndefined: Self = StObject.set(x, "grid_num", js.undefined)
      
      @scala.inline
      def setGrid_snap(value: Boolean): Self = StObject.set(x, "grid_snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid_snapUndefined: Self = StObject.set(x, "grid_snap", js.undefined)
      
      @scala.inline
      def setHide_from_to(value: Boolean): Self = StObject.set(x, "hide_from_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide_from_toUndefined: Self = StObject.set(x, "hide_from_to", js.undefined)
      
      @scala.inline
      def setHide_min_max(value: Boolean): Self = StObject.set(x, "hide_min_max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide_min_maxUndefined: Self = StObject.set(x, "hide_min_max", js.undefined)
      
      @scala.inline
      def setInput_values_separator(value: String): Self = StObject.set(x, "input_values_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_values_separatorUndefined: Self = StObject.set(x, "input_values_separator", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMax_interval(value: Double): Self = StObject.set(x, "max_interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_intervalUndefined: Self = StObject.set(x, "max_interval", js.undefined)
      
      @scala.inline
      def setMax_postfix(value: String): Self = StObject.set(x, "max_postfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_postfixUndefined: Self = StObject.set(x, "max_postfix", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMin_interval(value: Double): Self = StObject.set(x, "min_interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_intervalUndefined: Self = StObject.set(x, "min_interval", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFinish(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* obj */ IonRangeSliderEvent => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrettify(value: /* num */ Double => String): Self = StObject.set(x, "prettify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      @scala.inline
      def setPrettify_enabled(value: Boolean): Self = StObject.set(x, "prettify_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettify_enabledUndefined: Self = StObject.set(x, "prettify_enabled", js.undefined)
      
      @scala.inline
      def setPrettify_separator(value: String): Self = StObject.set(x, "prettify_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettify_separatorUndefined: Self = StObject.set(x, "prettify_separator", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSkin(value: flat | big | modern | round | sharp | square): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTo_fixed(value: Boolean): Self = StObject.set(x, "to_fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_fixedUndefined: Self = StObject.set(x, "to_fixed", js.undefined)
      
      @scala.inline
      def setTo_max(value: Double): Self = StObject.set(x, "to_max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_maxUndefined: Self = StObject.set(x, "to_max", js.undefined)
      
      @scala.inline
      def setTo_min(value: Double): Self = StObject.set(x, "to_min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_minUndefined: Self = StObject.set(x, "to_min", js.undefined)
      
      @scala.inline
      def setTo_shadow(value: Boolean): Self = StObject.set(x, "to_shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_shadowUndefined: Self = StObject.set(x, "to_shadow", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setValues_separator(value: String): Self = StObject.set(x, "values_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues_separatorUndefined: Self = StObject.set(x, "values_separator", js.undefined)
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
