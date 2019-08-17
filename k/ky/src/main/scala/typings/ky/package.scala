package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ky {
  import typings.std.Exclude
  import typings.std.Pick

  type _Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
