package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends StObject {
  
  def hmac(hash: BlockHash[_], key: js.Any): Hmac = js.native
  @JSName("hmac")
  var hmac_Original: HmacConstructor = js.native
  @JSName("hmac")
  def hmac_hex(hash: BlockHash[_], key: js.Any, enc: hex): Hmac = js.native
  
  var ripemd: RipemdSet = js.native
  
  def ripemd160(): Ripemd160 = js.native
  @JSName("ripemd160")
  var ripemd160_Original: Ripemd160Constructor = js.native
  
  var sha: ShaSet = js.native
  
  def sha1(): Sha1 = js.native
  @JSName("sha1")
  var sha1_Original: Sha1Constructor = js.native
  
  def sha224(): Sha224 = js.native
  @JSName("sha224")
  var sha224_Original: Sha224Constructor = js.native
  
  def sha256(): Sha256 = js.native
  @JSName("sha256")
  var sha256_Original: Sha256Constructor = js.native
  
  def sha384(): Sha384 = js.native
  @JSName("sha384")
  var sha384_Original: Sha384Constructor = js.native
  
  def sha512(): Sha512 = js.native
  @JSName("sha512")
  var sha512_Original: Sha512Constructor = js.native
  
  var utils: Utils = js.native
}
