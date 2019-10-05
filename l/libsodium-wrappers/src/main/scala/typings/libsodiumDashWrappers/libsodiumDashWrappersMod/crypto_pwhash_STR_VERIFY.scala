package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_pwhash_STR_VERIFY")
@js.native
object crypto_pwhash_STR_VERIFY extends TopLevel[Double]

@JSImport("libsodium-wrappers", "crypto_pwhash_str_verify")
@js.native
object crypto_pwhash_str_verify extends js.Object {
  def apply(hashed_password: String, password: String): Boolean = js.native
  def apply(hashed_password: String, password: Uint8Array): Boolean = js.native
}

