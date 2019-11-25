package typings.griddleDashReact.griddleDashReactMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddlePlugin extends GriddleExtensibility {
  var initialState: js.UndefOr[GriddleInitialState] = js.undefined
  var reduxMiddleware: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.undefined
}

object GriddlePlugin {
  @scala.inline
  def apply(
    components: GriddleComponents = null,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[Listener] = null,
    reducer: PropertyBag[Reducer] = null,
    reduxMiddleware: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    styleConfig: GriddleStyleConfig = null
  ): GriddlePlugin = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(reducer.asInstanceOf[js.Any])
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware.asInstanceOf[js.Any])
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects.asInstanceOf[js.Any])
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddlePlugin]
  }
}

