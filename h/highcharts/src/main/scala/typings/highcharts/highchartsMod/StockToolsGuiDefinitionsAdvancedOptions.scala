package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsAdvancedOptions extends js.Object {
  var fibonacci: js.UndefOr[StockToolsGuiDefinitionsAdvancedFibonacciOptions] = js.undefined
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var parallelChannel: js.UndefOr[StockToolsGuiDefinitionsAdvancedParallelChannelOptions] = js.undefined
  var pitchfork: js.UndefOr[StockToolsGuiDefinitionsAdvancedPitchforkOptions] = js.undefined
}

object StockToolsGuiDefinitionsAdvancedOptions {
  @scala.inline
  def apply(
    fibonacci: StockToolsGuiDefinitionsAdvancedFibonacciOptions = null,
    items: js.Array[_] = null,
    parallelChannel: StockToolsGuiDefinitionsAdvancedParallelChannelOptions = null,
    pitchfork: StockToolsGuiDefinitionsAdvancedPitchforkOptions = null
  ): StockToolsGuiDefinitionsAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (fibonacci != null) __obj.updateDynamic("fibonacci")(fibonacci.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (parallelChannel != null) __obj.updateDynamic("parallelChannel")(parallelChannel.asInstanceOf[js.Any])
    if (pitchfork != null) __obj.updateDynamic("pitchfork")(pitchfork.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedOptions]
  }
}

