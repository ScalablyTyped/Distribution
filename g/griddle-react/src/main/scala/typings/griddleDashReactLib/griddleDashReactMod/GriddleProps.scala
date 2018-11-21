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

