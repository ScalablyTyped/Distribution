package typings.ipfsCore.mod

import typings.ipfsCore.anon.Typeofaes
import typings.ipfsCore.anon.Typeofhmac
import typings.ipfsCore.anon.Typeofkeys
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src", "crypto")
@js.native
object crypto extends js.Object {
  
  val aes: Typeofaes = js.native
  
  val hmac: Typeofhmac = js.native
  
  val keys: Typeofkeys = js.native
  
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, hash: String): Uint8Array = js.native
  def pbkdf2(password: String, salt: Uint8Array, iterations: Double, keySize: Double, hash: String): Uint8Array = js.native
  def pbkdf2(password: Uint8Array, salt: String, iterations: Double, keySize: Double, hash: String): Uint8Array = js.native
  def pbkdf2(password: Uint8Array, salt: Uint8Array, iterations: Double, keySize: Double, hash: String): Uint8Array = js.native
  
  def randomBytes(number: Double): Uint8Array = js.native
}
