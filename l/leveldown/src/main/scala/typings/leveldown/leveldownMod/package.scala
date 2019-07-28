package typings.leveldown

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leveldownMod {
  type Bytes = String | Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
}
