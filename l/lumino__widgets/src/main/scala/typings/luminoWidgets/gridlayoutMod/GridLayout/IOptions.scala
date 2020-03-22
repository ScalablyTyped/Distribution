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
    columnCount: Int | Double = null,
    columnSpacing: Int | Double = null,
    fitPolicy: FitPolicy = null,
    rowCount: Int | Double = null,
    rowSpacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnSpacing != null) __obj.updateDynamic("columnSpacing")(columnSpacing.asInstanceOf[js.Any])
    if (fitPolicy != null) __obj.updateDynamic("fitPolicy")(fitPolicy.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowSpacing != null) __obj.updateDynamic("rowSpacing")(rowSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

