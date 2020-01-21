package typings.leveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Bytes = java.lang.String | typings.node.Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* size */ scala.Double, scala.Unit]
}
