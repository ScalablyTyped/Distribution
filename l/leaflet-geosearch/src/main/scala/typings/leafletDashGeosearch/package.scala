package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletDashGeosearch {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
