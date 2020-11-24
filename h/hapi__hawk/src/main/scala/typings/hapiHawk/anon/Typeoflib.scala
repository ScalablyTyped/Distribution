package typings.hapiHawk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflib extends js.Object {
  
  /**
    * Base object for prototypal inheritance.
    */
  val Base: Create = js.native
  
  /**
    * Abstract base block cipher mode template.
    */
  val BlockCipherMode: js.Any = js.native
  
  val BufferedBlockAlgorithm: js.Any = js.native
  
  val Cipher: `1` = js.native
  
  val CipherParams: `0` = js.native
  
  val Hasher: CreateHelper = js.native
  
  /**
    * A serializable cipher wrapper that derives the key from a password,
    * and returns ciphertext as a serializable cipher params object.
    */
  val PasswordBasedCipher: Decrypt = js.native
  
  /**
    * A cipher wrapper that returns ciphertext as a serializable cipher params object.
    */
  val SerializableCipher: Encrypt = js.native
  
  val WordArray: Random = js.native
}
object Typeoflib {
  
  @scala.inline
  def apply(
    Base: Create,
    BlockCipherMode: js.Any,
    BufferedBlockAlgorithm: js.Any,
    Cipher: `1`,
    CipherParams: `0`,
    Hasher: CreateHelper,
    PasswordBasedCipher: Decrypt,
    SerializableCipher: Encrypt,
    WordArray: Random
  ): Typeoflib = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], BlockCipherMode = BlockCipherMode.asInstanceOf[js.Any], BufferedBlockAlgorithm = BufferedBlockAlgorithm.asInstanceOf[js.Any], Cipher = Cipher.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], Hasher = Hasher.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflib]
  }
  
  @scala.inline
  implicit class TypeoflibOps[Self <: Typeoflib] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Create): Self = this.set("Base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCipherMode(value: js.Any): Self = this.set("BlockCipherMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferedBlockAlgorithm(value: js.Any): Self = this.set("BufferedBlockAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipher(value: `1`): Self = this.set("Cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherParams(value: `0`): Self = this.set("CipherParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasher(value: CreateHelper): Self = this.set("Hasher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBasedCipher(value: Decrypt): Self = this.set("PasswordBasedCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializableCipher(value: Encrypt): Self = this.set("SerializableCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArray(value: Random): Self = this.set("WordArray", value.asInstanceOf[js.Any])
  }
}
