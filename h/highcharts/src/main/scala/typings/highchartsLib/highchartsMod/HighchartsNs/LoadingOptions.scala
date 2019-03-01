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

object LoadingOptions {
  @scala.inline
  def apply(
    hideDuration: scala.Int | scala.Double = null,
    labelStyle: CSSObject = null,
    showDuration: scala.Int | scala.Double = null,
    style: js.Object = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (hideDuration != null) __obj.updateDynamic("hideDuration")(hideDuration.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (showDuration != null) __obj.updateDynamic("showDuration")(showDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LoadingOptions]
  }
}

