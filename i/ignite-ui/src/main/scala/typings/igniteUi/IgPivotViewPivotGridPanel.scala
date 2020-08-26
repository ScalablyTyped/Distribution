package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewPivotGridPanel
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Determines if the panel containing the igPivotGrid will initially collapsed.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the panel containing the igPivotGrid will be collapsible.
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the panel containing the igPivotGrid will be resizable.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Determines the size of the igPivotGrid panel.
    *
    * Valid values:
    * "string" The panel size can be set in pixels (px).
    * "number" The size can be set as a number.
    * "null" will automatically size the panel.
    */
  var size: js.UndefOr[String | Double] = js.native
}

object IgPivotViewPivotGridPanel {
  @scala.inline
  def apply(): IgPivotViewPivotGridPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridPanel]
  }
  @scala.inline
  implicit class IgPivotViewPivotGridPanelOps[Self <: IgPivotViewPivotGridPanel] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

