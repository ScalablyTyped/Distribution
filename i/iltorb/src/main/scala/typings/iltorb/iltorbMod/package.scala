package typings.iltorb

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iltorbMod {
  type IltorbCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* output */ Buffer, Unit]
}
