package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorLineColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var connectorLineColor: js.UndefOr[String] = js.native
  var disabledTextColor: js.UndefOr[String] = js.native
  var hoverBackgroundColor: js.UndefOr[String] = js.native
  var hoveredIconColor: js.UndefOr[String] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var inactiveIconColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object ConnectorLineColor {
  @scala.inline
  def apply(): ConnectorLineColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineColor]
  }
  @scala.inline
  implicit class ConnectorLineColorOps[Self <: ConnectorLineColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setConnectorLineColor(value: String): Self = this.set("connectorLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorLineColor: Self = this.set("connectorLineColor", js.undefined)
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    @scala.inline
    def setHoverBackgroundColor(value: String): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBackgroundColor: Self = this.set("hoverBackgroundColor", js.undefined)
    @scala.inline
    def setHoveredIconColor(value: String): Self = this.set("hoveredIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoveredIconColor: Self = this.set("hoveredIconColor", js.undefined)
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setInactiveIconColor(value: String): Self = this.set("inactiveIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveIconColor: Self = this.set("inactiveIconColor", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

