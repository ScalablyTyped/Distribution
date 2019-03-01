package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleProps[T]
  extends GriddlePlugin
     with GriddleInitialState {
  var core: js.UndefOr[GriddlePlugin] = js.undefined
  var data: js.UndefOr[js.Array[T]] = js.undefined
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.undefined
  var storeKey: js.UndefOr[java.lang.String] = js.undefined
}

object GriddleProps {
  @scala.inline
  def apply[T](
    components: GriddleComponents = null,
    core: GriddlePlugin = null,
    data: js.Array[T] = null,
    enableSettings: js.UndefOr[scala.Boolean] = js.undefined,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[griddleDashReactLib.Listener] = null,
    pageProperties: GriddlePageProperties = null,
    plugins: js.Array[GriddlePlugin] = null,
    reducer: PropertyBag[griddleDashReactLib.Reducer] = null,
    reduxMiddleware: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[griddleDashReactLib.Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    sortMethod: js.Function3[
      /* data */ js.Array[_], 
      /* column */ java.lang.String, 
      /* sortAscending */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    storeKey: java.lang.String = null,
    styleConfig: GriddleStyleConfig = null,
    textProperties: griddleDashReactLib.Anon_FilterPlaceholder = null
  ): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components)
    if (core != null) __obj.updateDynamic("core")(core)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings)
    if (events != null) __obj.updateDynamic("events")(events)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (reducer != null) __obj.updateDynamic("reducer")(reducer)
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware)
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects)
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(sortMethod)
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties)
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig)
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties)
    __obj.asInstanceOf[GriddleProps[T]]
  }
}

