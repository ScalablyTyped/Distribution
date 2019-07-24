package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryEncoding = k6Lib.k6LibStrings.binary
  type Output[OE /* <: OutputEncoding */] = k6Lib.k6Mod.bytes | java.lang.String
  type OutputEncoding = StringEncoding | BinaryEncoding
}
