package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "Mnemonic")
@js.native
class Mnemonic () extends js.Object {
  def this(words: js.Array[String]) = this()
  def toBytes(): Uint8Array = js.native
}

