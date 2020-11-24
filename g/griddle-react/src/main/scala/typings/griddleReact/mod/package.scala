package typings.griddleReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ColumnRenderProperties = typings.griddleReact.mod.components.ColumnDefinitionProps
  
  type Griddle[T] = typings.react.mod.Component[typings.griddleReact.mod.GriddleProps[T], js.Any, js.Any]
  
  type GriddleComponent[T] = (typings.react.mod.ComponentClass[T, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[T]
  
  type GriddleFilter = java.lang.String | typings.griddleReact.mod.RowFilter | (typings.griddleReact.mod.PropertyBag[java.lang.String | typings.griddleReact.mod.RowFilter])
  
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
    /* data */ typings.immutable.Immutable.List[js.Any], 
    scala.Boolean
  ]
  
  type RowRenderProperties = typings.griddleReact.mod.components.RowDefinitionProps
  
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
