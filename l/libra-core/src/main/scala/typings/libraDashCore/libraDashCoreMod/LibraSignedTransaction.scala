package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraSignedTransaction extends js.Object {
  var publicKey: Uint8Array
  var signature: Uint8Array
  var transaction: LibraTransaction
}

@JSImport("libra-core", "LibraSignedTransaction")
@js.native
object LibraSignedTransaction extends js.Object {
  def apply(transaction: LibraTransaction, publicKey: Uint8Array, signature: Uint8Array): Unit = js.native
}

