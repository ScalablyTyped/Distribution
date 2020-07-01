package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "Hasher")
@js.native
abstract class Hasher () extends js.Object {
  /**
    * Return a digest from the data added so far.
    * https://k6.io/docs/javascript-api/k6-crypto/hasher
    * @param outputEncoding - Output encoding.
    * @returns Digest of data added so far.
    * @example
    * let hasher = crypto.createHMAC('sha256', 'a secret');
    * hasher.update('hello ');
    * hasher.update('world!');
    * console.log(hasher.digest('hex'));
    */
  def digest[OE /* <: OutputEncoding */](outputEncoding: OE): Output[OE] = js.native
  /**
    * Add more data to the string we want to create a hash of.
    * https://k6.io/docs/javascript-api/k6-crypto/hasher
    * @param input - Data to add.
    * @example
    * let hasher = crypto.createHMAC('sha256', 'a secret');
    * hasher.update('hello ');
    * hasher.update('world!');
    * console.log(hasher.digest('hex'));
    */
  def update(input: String): Unit = js.native
}

