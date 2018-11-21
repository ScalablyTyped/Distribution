package typings
package griddleDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object griddleDashReactMod {
  type ColumnRenderProperties = griddleDashReactLib.griddleDashReactMod.componentsNs.ColumnDefinitionProps
  type Griddle[T] = reactLib.reactMod.Component[GriddleProps[T], js.Any, js.Any]
  type GriddleFilter = java.lang.String | RowFilter | (PropertyBag[java.lang.String | RowFilter])
  type RowFilter = js.Function3[
    /* row */ js.Any, 
    /* index */ scala.Double, 
    /* data */ immutableLib.immutableMod.List[js.Any], 
    scala.Boolean
  ]
  type RowRenderProperties = griddleDashReactLib.griddleDashReactMod.componentsNs.RowDefinitionProps
}
