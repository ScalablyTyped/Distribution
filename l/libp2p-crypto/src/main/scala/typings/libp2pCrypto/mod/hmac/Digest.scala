package typings.libp2pCrypto.mod.hmac

import typings.libp2pCrypto.libp2pCryptoNumbers.`20`
import typings.libp2pCrypto.libp2pCryptoNumbers.`32`
import typings.libp2pCrypto.libp2pCryptoNumbers.`64`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HMAC Digest.
  */
@js.native
trait Digest extends js.Object {
  
  def digest(data: Uint8Array): js.Promise[Uint8Array] = js.native
  
  var length: `20` | `32` | `64` | Double = js.native
}
object Digest {
  
  @scala.inline
  def apply(digest: Uint8Array => js.Promise[Uint8Array], length: `20` | `32` | `64` | Double): Digest = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDigest(value: Uint8Array => js.Promise[Uint8Array]): Self = this.set("digest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: `20` | `32` | `64` | Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
