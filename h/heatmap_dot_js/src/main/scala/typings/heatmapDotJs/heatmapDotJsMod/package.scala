package typings.heatmapDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object heatmapDotJsMod {
  import typings.std.Record

  type DataPoint[V /* <: String */, X /* <: String */, Y /* <: String */] = Record[V | X | Y, Double]
}
