package typings.k6

import typings.k6.cryptoMod.Algorithm
import typings.k6.cryptoMod.BinaryEncoding
import typings.k6.cryptoMod.Hasher
import typings.k6.cryptoMod.Output
import typings.k6.cryptoMod.OutputEncoding
import typings.k6.cryptoMod.StringEncoding
import typings.k6.k6Mod.bytes
import typings.k6.k6Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.md4
    - typings.k6.k6Strings.md5
    - typings.k6.k6Strings.sha1
    - typings.k6.k6Strings.sha256
    - typings.k6.k6Strings.sha384
    - typings.k6.k6Strings.sha512
    - typings.k6.k6Strings.sha512_224
    - typings.k6.k6Strings.sha512_256
    - typings.k6.k6Strings.ripemd160
  */
  trait Algorithm extends js.Object
  
  @js.native
  abstract class Hasher () extends js.Object {
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
    def update(input: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.hex
    - typings.k6.k6Strings.base64
    - typings.k6.k6Strings.base64url
    - typings.k6.k6Strings.base64rawurl
  */
  trait StringEncoding extends js.Object
  
  def createHMAC(algorithm: Algorithm, secret: String): Hasher = js.native
  def createHash(algorithm: Algorithm): Hasher = js.native
  def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, data: String, outputEncoding: OE): Output[OE] = js.native
  def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def randomBytes(size: Double): bytes = js.native
  def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512_224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512_256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  type BinaryEncoding = binary
  type Output[OE /* <: OutputEncoding */] = bytes | String
  type OutputEncoding = StringEncoding | BinaryEncoding
}

