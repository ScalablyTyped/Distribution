package typings.luminoWidgets.gridlayoutMod.GridLayout

import typings.luminoWidgets.layoutMod.Layout.FitPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a grid layout.
  */
trait IOptions
  extends typings.luminoWidgets.layoutMod.Layout.IOptions {
  /**
    * The initial column count for the layout.
    *
    * The default is `1`.
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  /**
    * The spacing between columns in the layout.
    *
    * The default is `4`.
    */
  var columnSpacing: js.UndefOr[Double] = js.undefined
  /**
    * The initial row count for the layout.
    *
    * The default is `1`.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /**
    * The spacing between rows in the layout.
    *
    * The default is `4`.
    */
  var rowSpacing: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    columnCount: js.UndefOr[Double] = js.undefined,
    columnSpacing: js.UndefOr[Double] = js.undefined,
    fitPolicy: FitPolicy = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowSpacing: js.UndefOr[Double] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSpacing)) __obj.updateDynamic("columnSpacing")(columnSpacing.get.asInstanceOf[js.Any])
    if (fitPolicy != null) __obj.updateDynamic("fitPolicy")(fitPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpacing)) __obj.updateDynamic("rowSpacing")(rowSpacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

