package typings.ionRangeslider.mod

import typings.ionRangeslider.ionRangesliderStrings.big
import typings.ionRangeslider.ionRangesliderStrings.flat
import typings.ionRangeslider.ionRangesliderStrings.modern
import typings.ionRangeslider.ionRangesliderStrings.round
import typings.ionRangeslider.ionRangesliderStrings.sharp
import typings.ionRangeslider.ionRangesliderStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRangeSliderOptions extends js.Object {
  
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
  implicit class IonRangeSliderOptionsOps[Self <: IonRangeSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setDecorate_both(value: Boolean): Self = this.set("decorate_both", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorate_both: Self = this.set("decorate_both", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDrag_interval(value: Boolean): Self = this.set("drag_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag_interval: Self = this.set("drag_interval", js.undefined)
    
    @scala.inline
    def setExtra_classes(value: String): Self = this.set("extra_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra_classes: Self = this.set("extra_classes", js.undefined)
    
    @scala.inline
    def setForce_edges(value: Boolean): Self = this.set("force_edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_edges: Self = this.set("force_edges", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFrom_fixed(value: Boolean): Self = this.set("from_fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_fixed: Self = this.set("from_fixed", js.undefined)
    
    @scala.inline
    def setFrom_max(value: Double): Self = this.set("from_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_max: Self = this.set("from_max", js.undefined)
    
    @scala.inline
    def setFrom_min(value: Double): Self = this.set("from_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_min: Self = this.set("from_min", js.undefined)
    
    @scala.inline
    def setFrom_shadow(value: Boolean): Self = this.set("from_shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_shadow: Self = this.set("from_shadow", js.undefined)
    
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGrid_margin(value: Boolean): Self = this.set("grid_margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid_margin: Self = this.set("grid_margin", js.undefined)
    
    @scala.inline
    def setGrid_num(value: Double): Self = this.set("grid_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid_num: Self = this.set("grid_num", js.undefined)
    
    @scala.inline
    def setGrid_snap(value: Boolean): Self = this.set("grid_snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid_snap: Self = this.set("grid_snap", js.undefined)
    
    @scala.inline
    def setHide_from_to(value: Boolean): Self = this.set("hide_from_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide_from_to: Self = this.set("hide_from_to", js.undefined)
    
    @scala.inline
    def setHide_min_max(value: Boolean): Self = this.set("hide_min_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide_min_max: Self = this.set("hide_min_max", js.undefined)
    
    @scala.inline
    def setInput_values_separator(value: String): Self = this.set("input_values_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_values_separator: Self = this.set("input_values_separator", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMax_interval(value: Double): Self = this.set("max_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_interval: Self = this.set("max_interval", js.undefined)
    
    @scala.inline
    def setMax_postfix(value: String): Self = this.set("max_postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_postfix: Self = this.set("max_postfix", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMin_interval(value: Double): Self = this.set("min_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_interval: Self = this.set("min_interval", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* obj */ IonRangeSliderEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFinish(value: /* obj */ IonRangeSliderEvent => Unit): Self = this.set("onFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* obj */ IonRangeSliderEvent => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* obj */ IonRangeSliderEvent => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrettify(value: /* num */ Double => String): Self = this.set("prettify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
    
    @scala.inline
    def setPrettify_enabled(value: Boolean): Self = this.set("prettify_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettify_enabled: Self = this.set("prettify_enabled", js.undefined)
    
    @scala.inline
    def setPrettify_separator(value: String): Self = this.set("prettify_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettify_separator: Self = this.set("prettify_separator", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSkin(value: flat | big | modern | round | sharp | square): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setTo_fixed(value: Boolean): Self = this.set("to_fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_fixed: Self = this.set("to_fixed", js.undefined)
    
    @scala.inline
    def setTo_max(value: Double): Self = this.set("to_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_max: Self = this.set("to_max", js.undefined)
    
    @scala.inline
    def setTo_min(value: Double): Self = this.set("to_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_min: Self = this.set("to_min", js.undefined)
    
    @scala.inline
    def setTo_shadow(value: Boolean): Self = this.set("to_shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_shadow: Self = this.set("to_shadow", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setValues_separator(value: String): Self = this.set("values_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues_separator: Self = this.set("values_separator", js.undefined)
  }
}
