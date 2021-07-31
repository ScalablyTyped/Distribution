package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  def hmac(hash: BlockHash[js.Any], key: js.Any): Hmac
  @JSName("hmac")
  var hmac_Original: HmacConstructor
  @JSName("hmac")
  def hmac_hex(hash: BlockHash[js.Any], key: js.Any, enc: hex): Hmac
  
  var ripemd: RipemdSet
  
  def ripemd160(): Ripemd160
  @JSName("ripemd160")
  var ripemd160_Original: Ripemd160Constructor
  
  var sha: ShaSet
  
  def sha1(): Sha1
  @JSName("sha1")
  var sha1_Original: Sha1Constructor
  
  def sha224(): Sha224
  @JSName("sha224")
  var sha224_Original: Sha224Constructor
  
  def sha256(): Sha256
  @JSName("sha256")
  var sha256_Original: Sha256Constructor
  
  def sha384(): Sha384
  @JSName("sha384")
  var sha384_Original: Sha384Constructor
  
  def sha512(): Sha512
  @JSName("sha512")
  var sha512_Original: Sha512Constructor
  
  var utils: Utils
}
object Hash {
  
  @scala.inline
  def apply(
    hmac: (/* hash */ BlockHash[js.Any], /* key */ js.Any, /* enc */ js.UndefOr[hex]) => Hmac,
    ripemd: RipemdSet,
    ripemd160: () => Ripemd160,
    sha: ShaSet,
    sha1: () => Sha1,
    sha224: () => Sha224,
    sha256: () => Sha256,
    sha384: () => Sha384,
    sha512: () => Sha512,
    utils: Utils
  ): Hash = {
    val __obj = js.Dynamic.literal(hmac = js.Any.fromFunction3(hmac), ripemd = ripemd.asInstanceOf[js.Any], ripemd160 = js.Any.fromFunction0(ripemd160), sha = sha.asInstanceOf[js.Any], sha1 = js.Any.fromFunction0(sha1), sha224 = js.Any.fromFunction0(sha224), sha256 = js.Any.fromFunction0(sha256), sha384 = js.Any.fromFunction0(sha384), sha512 = js.Any.fromFunction0(sha512), utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHmac(value: (/* hash */ BlockHash[js.Any], /* key */ js.Any, /* enc */ js.UndefOr[hex]) => Hmac): Self = StObject.set(x, "hmac", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRipemd(value: RipemdSet): Self = StObject.set(x, "ripemd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRipemd160(value: () => Ripemd160): Self = StObject.set(x, "ripemd160", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha(value: ShaSet): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: () => Sha1): Self = StObject.set(x, "sha1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha224(value: () => Sha224): Self = StObject.set(x, "sha224", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha256(value: () => Sha256): Self = StObject.set(x, "sha256", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha384(value: () => Sha384): Self = StObject.set(x, "sha384", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha512(value: () => Sha512): Self = StObject.set(x, "sha512", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
  }
}
