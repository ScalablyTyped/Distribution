package typings.griddleDashReact.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleExtensibility extends js.Object {
  var components: js.UndefOr[GriddleComponents] = js.undefined
  var events: js.UndefOr[GriddleEvents] = js.undefined
  var listeners: js.UndefOr[PropertyBag[Listener]] = js.undefined
  var reducer: js.UndefOr[PropertyBag[Reducer]] = js.undefined
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.undefined
  var selectors: js.UndefOr[PropertyBag[Selector]] = js.undefined
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.undefined
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.undefined
}

object GriddleExtensibility {
  @scala.inline
  def apply(
    components: GriddleComponents = null,
    events: GriddleEvents = null,
    listeners: PropertyBag[Listener] = null,
    reducer: PropertyBag[Reducer] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    styleConfig: GriddleStyleConfig = null
  ): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(reducer.asInstanceOf[js.Any])
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects.asInstanceOf[js.Any])
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleExtensibility]
  }
}

