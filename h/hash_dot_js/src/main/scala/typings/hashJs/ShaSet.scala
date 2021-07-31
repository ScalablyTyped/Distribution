package typings.hashJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaSet extends StObject {
  
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
}
object ShaSet {
  
  @scala.inline
  def apply(
    sha1: () => Sha1,
    sha224: () => Sha224,
    sha256: () => Sha256,
    sha384: () => Sha384,
    sha512: () => Sha512
  ): ShaSet = {
    val __obj = js.Dynamic.literal(sha1 = js.Any.fromFunction0(sha1), sha224 = js.Any.fromFunction0(sha224), sha256 = js.Any.fromFunction0(sha256), sha384 = js.Any.fromFunction0(sha384), sha512 = js.Any.fromFunction0(sha512))
    __obj.asInstanceOf[ShaSet]
  }
  
  @scala.inline
  implicit class ShaSetMutableBuilder[Self <: ShaSet] (val x: Self) extends AnyVal {
    
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
  }
}
