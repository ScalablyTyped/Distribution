package typings
package griddleDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object griddleDashReactMod {
  type ColumnRenderProperties = griddleDashReactLib.griddleDashReactMod.componentsNs.ColumnDefinitionProps
  type Griddle[T] = reactLib.reactMod.Component[GriddleProps[T], js.Any, js.Any]
  type GriddleComponent[T] = (reactLib.reactMod.ComponentClass[T, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[T]
  type GriddleFilter = java.lang.String | RowFilter | (PropertyBag[java.lang.String | RowFilter])
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PropertyBag[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], scala.Unit]
  type RowFilter = js.Function3[
    /* row */ js.Any, 
    /* index */ scala.Double, 
    /* data */ immutableLib.immutableMod.List[js.Any], 
    scala.Boolean
  ]
  type RowRenderProperties = griddleDashReactLib.griddleDashReactMod.componentsNs.RowDefinitionProps
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
