package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immer {
  import typings.std.Exclude

  type ArrayMethod = Exclude[String, Double]
  type Indices[T] = Exclude[String, ArrayMethod]
}
