package typings.griddleReact.mod

import typings.griddleReact.AnonFilterPlaceholder
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleProps[T]
  extends GriddlePlugin
     with GriddleInitialState {
  var core: js.UndefOr[GriddlePlugin] = js.undefined
  var data: js.UndefOr[js.Array[T]] = js.undefined
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.undefined
  var storeKey: js.UndefOr[String] = js.undefined
}

object GriddleProps {
  @scala.inline
  def apply[T](
    components: GriddleComponents = null,
    core: GriddlePlugin = null,
    data: js.Array[T] = null,
    enableSettings: js.UndefOr[Boolean] = js.undefined,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[Listener] = null,
    pageProperties: GriddlePageProperties = null,
    plugins: js.Array[GriddlePlugin] = null,
    reducer: PropertyBag[Reducer] = null,
    reduxMiddleware: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    sortMethod: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    storeKey: String = null,
    styleConfig: GriddleStyleConfig = null,
    textProperties: AnonFilterPlaceholder = null
  ): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(reducer.asInstanceOf[js.Any])
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware.asInstanceOf[js.Any])
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties.asInstanceOf[js.Any])
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig.asInstanceOf[js.Any])
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleProps[T]]
  }
}

