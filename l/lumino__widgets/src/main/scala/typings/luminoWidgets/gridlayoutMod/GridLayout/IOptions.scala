package typings.luminoWidgets.gridlayoutMod.GridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a grid layout.
  */
@js.native
trait IOptions
  extends typings.luminoWidgets.layoutMod.Layout.IOptions {
  /**
    * The initial column count for the layout.
    *
    * The default is `1`.
    */
  var columnCount: js.UndefOr[Double] = js.native
  /**
    * The spacing between columns in the layout.
    *
    * The default is `4`.
    */
  var columnSpacing: js.UndefOr[Double] = js.native
  /**
    * The initial row count for the layout.
    *
    * The default is `1`.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * The spacing between rows in the layout.
    *
    * The default is `4`.
    */
  var rowSpacing: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnSpacing(value: Double): Self = this.set("columnSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpacing: Self = this.set("columnSpacing", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowSpacing(value: Double): Self = this.set("rowSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpacing: Self = this.set("rowSpacing", js.undefined)
  }
  
}

