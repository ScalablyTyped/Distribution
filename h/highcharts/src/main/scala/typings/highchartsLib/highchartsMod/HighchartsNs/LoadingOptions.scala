package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The loading options control the appearance of the loading screen that covers the plot area on chart operations. This
     * screen only appears after an explicit call to chart.showLoading(). It is a utility for developers to communicate to
     * the end user that something is going on, for example while retrieving new data via an XHR connection. The
     * 'Loading...' text itself is not part of this configuration object, but part of the lang object.
     */

trait LoadingOptions extends js.Object {
  /**
           * The duration in milliseconds of the fade out effect.
           * @default 100
           * @since 1.2.0
           */
  var hideDuration: js.UndefOr[scala.Double] = js.undefined
  /**
           * CSS styles for the loading label span.
           * @default { 'fontWeight': 'bold', 'position': 'relative', 'top': '45%' }
           */
  var labelStyle: js.UndefOr[CSSObject] = js.undefined
  /**
           * The duration in milliseconds of the fade in effect.
           * @default 100
           * @since 1.2.0
           */
  var showDuration: js.UndefOr[scala.Double] = js.undefined
  /**
           * CSS styles for the loading screen that covers the plot area.
           * @default { position: 'absolute', backgroundColor: 'white', opacity: 0.5, textAlign: 'center' }
           */
  var style: js.UndefOr[js.Object] = js.undefined
}

