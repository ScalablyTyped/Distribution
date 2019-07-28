package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "Seed")
@js.native
object SeedNs extends js.Object {
  def fromMnemonic(words: js.Array[String]): Unit = js.native
  def fromMnemonic(words: js.Array[String], salt: String): Unit = js.native
  def fromMnemonic(words: Mnemonic): Unit = js.native
  def fromMnemonic(words: Mnemonic, salt: String): Unit = js.native
}

