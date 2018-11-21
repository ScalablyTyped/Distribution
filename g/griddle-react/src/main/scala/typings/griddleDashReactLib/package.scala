package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object griddleDashReactLib {
  type GriddleComponent[T] = (reactLib.reactMod.ReactNs.ComponentClass[T, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[T]
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], scala.Unit]
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
