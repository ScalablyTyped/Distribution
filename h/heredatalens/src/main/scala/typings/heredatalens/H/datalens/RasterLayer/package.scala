package typings.heredatalens.H.datalens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RasterLayer {
  /**
    * Slice of data (eg Data Lens query data row) that represents a data point.
    * Each row is transformed into TilePoint and passed to renderTile callback. By default each row is an Object where property names correspond to data column names.
    * This representation can be changed with the dataToRows callback.
    */
  type Row = scala.Double
  /**
    * Tile X coordinate (column)
    * Coordinate in XYZ tile numbering scheme.
    */
  type X = scala.Double
  /**
    * Tile Y coordinate (row)
    * Coordinate in XYZ tile numbering scheme.
    */
  type Y = scala.Double
}
