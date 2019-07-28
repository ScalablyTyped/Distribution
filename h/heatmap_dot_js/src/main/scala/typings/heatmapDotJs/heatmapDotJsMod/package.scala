package typings.heatmapDotJs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object heatmapDotJsMod {
  type DataPoint[V /* <: String */, X /* <: String */, Y /* <: String */] = Record[V | X | Y, Double]
}
