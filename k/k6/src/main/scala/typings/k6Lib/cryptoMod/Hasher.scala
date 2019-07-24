package typings
package k6Lib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "Hasher")
@js.native
abstract class Hasher () extends js.Object {
  var __brand: scala.Nothing = js.native
  /**
    * Return a digest from the data added so far.
    * @param outputEncoding - Output encoding.
    * @returns Digest of data added so far.
    */
  def digest[OE /* <: OutputEncoding */](outputEncoding: OE): Output[OE] = js.native
  /**
    * Add more data to the string we want to create a hash of.
    * @param input - Data to add.
    */
  def update(input: java.lang.String): scala.Unit = js.native
}

