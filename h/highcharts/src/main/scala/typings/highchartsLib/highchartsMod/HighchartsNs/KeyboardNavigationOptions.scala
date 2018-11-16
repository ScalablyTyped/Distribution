package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for keyboard navigation (accessibility.keyboardNavigation).
     * @since 5.0.0
     */

trait KeyboardNavigationOptions extends js.Object {
  /**
           * Enable keyboard navigation for the chart.
           * @since 5.0.0
           * @default true
           */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Skip null points when navigating through points with the keyboard.
           * @since 5.0.0
           * @default false
           */
  var skipNullPoints: js.UndefOr[scala.Boolean] = js.undefined
}

