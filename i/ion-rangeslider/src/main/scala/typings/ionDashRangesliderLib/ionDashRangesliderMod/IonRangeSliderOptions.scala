package typings
package ionDashRangesliderLib.ionDashRangesliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRangeSliderOptions extends js.Object {
     // Locks slider and makes it inactive. Input is disabled too. Invisible to forms [Default: false]
  var block: js.UndefOr[scala.Boolean] = js.undefined
      // Special postfix, used only for maximum value. Will be showed after handle will reach maximum right position. For example **0 — 100+** [Default: ]
  var decorate_both: js.UndefOr[scala.Boolean] = js.undefined
      // Separator for **double** values in input value property. `<input value="25;42"> [Default:  ; ]
  var disable: js.UndefOr[scala.Boolean] = js.undefined
      // Set minimum maximum between sliders. Only for **double** type [Default: -]
  var drag_interval: js.UndefOr[scala.Boolean] = js.undefined
     // Locks slider and makes it inactive. Input is NOT disabled. Can be send with forms [Default: false]
  var extra_classes: js.UndefOr[java.lang.String] = js.undefined
   // Set up your own prettify function. Can be anything. For example, you can set up unix time as slider values and than transform them to cool looking dates [Default: null]
  var force_edges: js.UndefOr[scala.Boolean] = js.undefined
      // Set slider maximum value [Default: 100]
  var from: js.UndefOr[scala.Double] = js.undefined
       // Set up your own array of possible slider values. They could be numbers or strings. If the values array is set up, min, max and step param, can no longer be changed [Default: []]
  var from_fixed: js.UndefOr[scala.Boolean] = js.undefined
      // Set minimum limit for left (or single) handle [Default: min]
  var from_max: js.UndefOr[scala.Double] = js.undefined
     // Fix position of left (or single) handle [Default: false]
  var from_min: js.UndefOr[scala.Double] = js.undefined
      // Set maximum limit for left (or single) handle [Default: max]
  var from_shadow: js.UndefOr[scala.Boolean] = js.undefined
     // Activates keyboard controls. Move left: &larr;, &darr;, A, S. Move right: &rarr;, &uarr;, W, D. [Default: true]
  var grid: js.UndefOr[scala.Boolean] = js.undefined
     // Enables grid of values above the slider [Default: true]
  var grid_margin: js.UndefOr[scala.Boolean] = js.undefined
     // Set left and right grid gaps [Default: true]
  var grid_num: js.UndefOr[scala.Double] = js.undefined
      // Number of grid units [Default: 4]
  var grid_snap: js.UndefOr[scala.Boolean] = js.undefined
     // Hides **min** and **max** labels [Default: false]
  var hide_from_to: js.UndefOr[scala.Boolean] = js.undefined
     // Snap grid to sliders step (step param). If activated, grid_num will not be used. Max steps = 50 [Default: false]
  var hide_min_max: js.UndefOr[scala.Boolean] = js.undefined
      // Set your own separator for close values. Used for **double** type. Default: **10 — 100**. Or you may set: **10 to 100, 10 + 100, 10 &rarr; 100** etc. [Default:  - ]
  var input_values_separator: js.UndefOr[java.lang.String] = js.undefined
     // Sliders handles and tooltips will be always inside it's container [Default: false]
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
      // Set slider minimum value [Default: 10]
  var max: js.UndefOr[scala.Double] = js.undefined
      // Set minimum diapason between sliders. Only for **double** type [Default: -]
  var max_interval: js.UndefOr[scala.Double] = js.undefined
      // Set postfix for values. Will be set up right after the number: 100**k** [Default: ]
  var max_postfix: js.UndefOr[java.lang.String] = js.undefined
      // Choose slider type, could be `single` - for one handle, or `double` for two handles [Default: single]
  var min: js.UndefOr[scala.Double] = js.undefined
      // Set sliders step. Always > 0. Could be fractional [Default: 1]
  var min_interval: js.UndefOr[scala.Double] = js.undefined
   // Callback. Is called on slider start. Gets all slider data as a 1st attribute [Default: null]
  var onChange: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, scala.Unit]] = js.undefined
   // Callback. IS called on each values change. Gets all slider data as a 1st attribute [Default: null]
  var onFinish: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, scala.Unit]] = js.undefined
         // Scope for callbacks. Pass any object [Default: null]
  var onStart: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, scala.Unit]] = js.undefined
   // Callback. Is called when user releases handle. Gets all slider data as a 1st attribute [Default: null]
  var onUpdate: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, scala.Unit]] = js.undefined
      // Set prefix for values. Will be set up right before the number: **$**100 [Default: ]
  var postfix: js.UndefOr[java.lang.String] = js.undefined
     // Hides **from** and **to** labels [Default: false]
  var prefix: js.UndefOr[java.lang.String] = js.undefined
      // Set up your own separator for long numbers: 10000000 &rarr; 10,000,000 etc. [Default:  ]
  var prettify: js.UndefOr[js.Function1[/* num */ scala.Double, java.lang.String]] = js.undefined
     // Highlight the right handle [Default: false]
  var prettify_enabled: js.UndefOr[scala.Boolean] = js.undefined
     // Improve readability of long numbers: 10000000 &rarr; 10 000 000 [Default: true]
  var prettify_separator: js.UndefOr[java.lang.String] = js.undefined
      // Traverse extra CSS-classes to sliders container [Default: —]
  var scope: js.UndefOr[js.Any] = js.undefined
      // Set start position for right handle [Default: max]
  var step: js.UndefOr[scala.Double] = js.undefined
      // Set start position for left handle (or for single handle) [Default: min]
  var to: js.UndefOr[scala.Double] = js.undefined
     // Highlight the limits for left handle [Default: false]
  var to_fixed: js.UndefOr[scala.Boolean] = js.undefined
      // Set minimum limit for right handle [Default: min]
  var to_max: js.UndefOr[scala.Double] = js.undefined
     // Fix position of right handle [Default: false]
  var to_min: js.UndefOr[scala.Double] = js.undefined
      // Set maximum limit for right handle [Default: max]
  var to_shadow: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
     // Allow user to drag whole range. Only for **double** type [Default: false]
  var values: js.UndefOr[js.Array[_]] = js.undefined
     // Used for **double** type and only if prefix or postfix was set up. Determine how to decorate close values. For example: **$10k — $100k** or **$10 — 100k** [Default: true]
  var values_separator: js.UndefOr[java.lang.String] = js.undefined
}

