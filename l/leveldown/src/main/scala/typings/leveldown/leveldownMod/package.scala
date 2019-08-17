package typings.leveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leveldownMod {
  import typings.node.Buffer
  import typings.std.Error

  type Bytes = String | Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
}
