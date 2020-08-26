package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLayoutManagerItem
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Column index of the item in the grid
    *
    */
  var colIndex: js.UndefOr[Double] = js.native
  /**
    * ColSpan of the item
    *
    */
  var colSpan: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets individual item height, either in px or percentage
    *                         string The default height can be set in pixels (px), %, em and other units.
    *
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Row index of the item in the grid
    *
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * RowSpan of the item
    *
    */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets individual item width, either in px or percentage
    *                         string The default width can be set in pixels (px), %, em and other units.
    *
    */
  var width: js.UndefOr[Double] = js.native
}

object IgLayoutManagerItem {
  @scala.inline
  def apply(): IgLayoutManagerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerItem]
  }
  @scala.inline
  implicit class IgLayoutManagerItemOps[Self <: IgLayoutManagerItem] (val x: Self) extends AnyVal {
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
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

