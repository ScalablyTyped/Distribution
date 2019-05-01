package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddlePlugin extends GriddleExtensibility {
  var initialState: js.UndefOr[GriddleInitialState] = js.undefined
  var reduxMiddleware: js.UndefOr[
    js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ]
  ] = js.undefined
}

object GriddlePlugin {
  @scala.inline
  def apply(
    components: GriddleComponents = null,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[Listener] = null,
    reducer: PropertyBag[Reducer] = null,
    reduxMiddleware: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    styleConfig: GriddleStyleConfig = null
  ): GriddlePlugin = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components)
    if (events != null) __obj.updateDynamic("events")(events)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (reducer != null) __obj.updateDynamic("reducer")(reducer)
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware)
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects)
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig)
    __obj.asInstanceOf[GriddlePlugin]
  }
}

