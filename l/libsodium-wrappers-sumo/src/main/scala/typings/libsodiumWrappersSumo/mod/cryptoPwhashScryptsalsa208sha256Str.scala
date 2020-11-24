package typings.libsodiumWrappersSumo.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_str")
@js.native
object cryptoPwhashScryptsalsa208sha256Str extends js.Object {
  
  def apply(password: String, opsLimit: Double, memLimit: Double): String = js.native
  def apply(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
}
