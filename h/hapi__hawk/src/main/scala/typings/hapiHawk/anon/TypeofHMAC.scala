package typings.hapiHawk.anon

import org.scalablytyped.runtime.Instantiable0
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.WordArray
import typings.cryptoJs.mod.algo.HMAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHMAC extends Instantiable0[HMAC] {
  
  def create(hasher: HasherStatic, key: String): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
  /**
    * Initializes a newly created HMAC.
    *
    * @param hasher The hash algorithm to use.
    * @param key The secret key.
    *
    * @example
    *
    *     var hmacHasher = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, key);
    */
  def create(hasher: HasherStatic, key: WordArray): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
}
