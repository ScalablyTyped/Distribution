package typings.griddleDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object griddleDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.griddleDashReact.griddleDashReactMod.componentsNs.ColumnDefinitionProps
  import typings.griddleDashReact.griddleDashReactMod.componentsNs.RowDefinitionProps
  import typings.immutable.immutableMod.List
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type ColumnRenderProperties = ColumnDefinitionProps
  type Griddle[T] = Component[GriddleProps[T], js.Any, js.Any]
  type GriddleComponent[T] = (ComponentClass[T, ComponentState]) | StatelessComponent[T]
  type GriddleFilter = String | RowFilter | (PropertyBag[String | RowFilter])
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PropertyBag[T] = StringDictionary[T]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], Unit]
  type RowFilter = js.Function3[/* row */ js.Any, /* index */ Double, /* data */ List[js.Any], Boolean]
  type RowRenderProperties = RowDefinitionProps
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
