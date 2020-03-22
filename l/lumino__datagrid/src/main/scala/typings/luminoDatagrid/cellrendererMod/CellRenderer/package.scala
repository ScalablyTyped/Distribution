package typings.luminoDatagrid.cellrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CellRenderer {
  /**
    * A type alias for a cell renderer config function.
    *
    * This type is used to compute a value from a cell config object.
    */
  type ConfigFunc[T] = js.Function1[/* config */ typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig, T]
  /**
    * A type alias for a cell renderer config option.
    *
    * A config option can be a static value or a config function.
    */
  type ConfigOption[T] = T | typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigFunc[T]
}
