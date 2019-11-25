package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  import typings.k6.k6Mod.bytes
  import typings.k6.k6Strings.binary

  type BinaryEncoding = binary
  type Output[OE /* <: OutputEncoding */] = bytes | String
  type OutputEncoding = StringEncoding | BinaryEncoding
}
