package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seed extends js.Object {
  var data: Uint8Array
}

@JSImport("libra-core", "Seed")
@js.native
object Seed extends js.Object {
  def apply(data: Uint8Array): Unit = js.native
  def fromMnemonic(words: js.Array[String]): Unit = js.native
  def fromMnemonic(words: js.Array[String], salt: String): Unit = js.native
  def fromMnemonic(words: Mnemonic): Unit = js.native
  def fromMnemonic(words: Mnemonic, salt: String): Unit = js.native
}

