package typings.iltorb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iltorbMod {
  import typings.node.Buffer
  import typings.std.Error

  type IltorbCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* output */ Buffer, Unit]
}
