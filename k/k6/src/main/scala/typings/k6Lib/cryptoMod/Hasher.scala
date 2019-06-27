package typings
package k6Lib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "Hasher")
@js.native
abstract class Hasher () extends js.Object {
  var __brand: scala.Nothing = js.native
  def digest(outputEncoding: BinaryEncoding): k6Lib.k6Mod.bytes = js.native
  def digest(outputEncoding: StringEncoding): java.lang.String = js.native
  def update(input: java.lang.String): scala.Unit = js.native
}

