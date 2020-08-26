package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleExtensibility extends js.Object {
  var components: js.UndefOr[GriddleComponents] = js.native
  var events: js.UndefOr[GriddleEvents] = js.native
  var listeners: js.UndefOr[PropertyBag[Listener]] = js.native
  var reducer: js.UndefOr[PropertyBag[Reducer]] = js.native
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.native
  var selectors: js.UndefOr[PropertyBag[Selector]] = js.native
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.native
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.native
}

object GriddleExtensibility {
  @scala.inline
  def apply(): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleExtensibility]
  }
  @scala.inline
  implicit class GriddleExtensibilityOps[Self <: GriddleExtensibility] (val x: Self) extends AnyVal {
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
    def setComponents(value: GriddleComponents): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setEvents(value: GriddleEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setListeners(value: PropertyBag[Listener]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    @scala.inline
    def setReducer(value: PropertyBag[Reducer]): Self = this.set("reducer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReducer: Self = this.set("reducer", js.undefined)
    @scala.inline
    def setRenderProperties(value: GriddleRenderProperties): Self = this.set("renderProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderProperties: Self = this.set("renderProperties", js.undefined)
    @scala.inline
    def setSelectors(value: PropertyBag[Selector]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    @scala.inline
    def setSettingsComponentObjects(value: PropertyBag[SettingsComponentObject]): Self = this.set("settingsComponentObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsComponentObjects: Self = this.set("settingsComponentObjects", js.undefined)
    @scala.inline
    def setStyleConfig(value: GriddleStyleConfig): Self = this.set("styleConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleConfig: Self = this.set("styleConfig", js.undefined)
  }
  
}

