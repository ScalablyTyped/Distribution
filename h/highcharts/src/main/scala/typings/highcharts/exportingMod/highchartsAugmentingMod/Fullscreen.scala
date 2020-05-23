package typings.highcharts.exportingMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handles displaying chart's container in the fullscreen mode.
  */
trait Fullscreen extends js.Object {
  /**
    * Chart managed by the fullscreen controller.
    */
  var chart: Chart
  /**
    * The flag is set to `true` when the chart is displayed in the
    * fullscreen mode.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Stops displaying the chart in fullscreen mode. Exporting module
    * required.
    */
  def close(): Unit
  /**
    * Displays the chart in fullscreen mode. When fired customly by user
    * before exporting context button is created, button's text will not be
    * replaced - it's on the user side. Exporting module required.
    */
  def open(): Unit
  /**
    * Toggles displaying the chart in fullscreen mode. By default, when the
    * exporting module is enabled, a context button with a drop down menu
    * in the upper right corner accesses this function. Exporting module
    * required.
    */
  def toggle(): Unit
}

object Fullscreen {
  @scala.inline
  def apply(
    chart: Chart,
    close: () => Unit,
    open: () => Unit,
    toggle: () => Unit,
    isOpen: js.UndefOr[Boolean] = js.undefined
  ): Fullscreen = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
}

