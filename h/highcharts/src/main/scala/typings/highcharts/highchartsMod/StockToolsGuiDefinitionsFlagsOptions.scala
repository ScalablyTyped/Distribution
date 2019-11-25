package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsFlagsOptions extends js.Object {
  var flagCirclepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagCirclepinOptions] = js.undefined
  var flagDiamondpin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions] = js.undefined
  var flagSimplepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSimplepinOptions] = js.undefined
  var flagSquarepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSquarepinOptions] = js.undefined
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
}

object StockToolsGuiDefinitionsFlagsOptions {
  @scala.inline
  def apply(
    flagCirclepin: StockToolsGuiDefinitionsFlagsFlagCirclepinOptions = null,
    flagDiamondpin: StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions = null,
    flagSimplepin: StockToolsGuiDefinitionsFlagsFlagSimplepinOptions = null,
    flagSquarepin: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions = null,
    items: js.Array[_] = null
  ): StockToolsGuiDefinitionsFlagsOptions = {
    val __obj = js.Dynamic.literal()
    if (flagCirclepin != null) __obj.updateDynamic("flagCirclepin")(flagCirclepin.asInstanceOf[js.Any])
    if (flagDiamondpin != null) __obj.updateDynamic("flagDiamondpin")(flagDiamondpin.asInstanceOf[js.Any])
    if (flagSimplepin != null) __obj.updateDynamic("flagSimplepin")(flagSimplepin.asInstanceOf[js.Any])
    if (flagSquarepin != null) __obj.updateDynamic("flagSquarepin")(flagSquarepin.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsOptions]
  }
}

