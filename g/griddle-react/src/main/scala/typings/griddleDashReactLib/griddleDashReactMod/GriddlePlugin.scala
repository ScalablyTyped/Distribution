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

