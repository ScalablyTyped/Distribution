package typings.ids

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idsMod {
  type ID = String
  type Seed = (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
}
