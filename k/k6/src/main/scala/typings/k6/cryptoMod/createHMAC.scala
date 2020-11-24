package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/crypto", "createHMAC")
@js.native
object createHMAC extends js.Object {
  
  def apply(algorithm: Algorithm, secret: String): Hasher = js.native
}
