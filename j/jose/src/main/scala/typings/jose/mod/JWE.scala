package typings.jose.mod

import typings.jose.anon.DecryptOptionscompletetru
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.jose.mod.JWK.Key
import typings.jose.mod.JWK.OctKey
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWE {
  
  @JSImport("jose", "JWE")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose", "JWE.Encrypt")
  @js.native
  class Encrypt_ protected () extends StObject {
    def this(cleartext: String) = this()
    def this(cleartext: Buffer) = this()
    def this(cleartext: String, `protected`: js.Object) = this()
    def this(cleartext: Buffer, `protected`: js.Object) = this()
    def this(cleartext: String, `protected`: js.Object, aad: String) = this()
    def this(cleartext: String, `protected`: Unit, aad: String) = this()
    def this(cleartext: Buffer, `protected`: js.Object, aad: String) = this()
    def this(cleartext: Buffer, `protected`: Unit, aad: String) = this()
    def this(cleartext: String, `protected`: js.Object, aad: String, unprotected: js.Object) = this()
    def this(cleartext: String, `protected`: js.Object, aad: Unit, unprotected: js.Object) = this()
    def this(cleartext: String, `protected`: Unit, aad: String, unprotected: js.Object) = this()
    def this(cleartext: String, `protected`: Unit, aad: Unit, unprotected: js.Object) = this()
    def this(cleartext: Buffer, `protected`: js.Object, aad: String, unprotected: js.Object) = this()
    def this(cleartext: Buffer, `protected`: js.Object, aad: Unit, unprotected: js.Object) = this()
    def this(cleartext: Buffer, `protected`: Unit, aad: String, unprotected: js.Object) = this()
    def this(cleartext: Buffer, `protected`: Unit, aad: Unit, unprotected: js.Object) = this()
    
    @JSName("encrypt")
    def encrypt_compact(serialization: compact): String = js.native
    @JSName("encrypt")
    def encrypt_flattened(serialization: flattened): FlattenedJWE = js.native
    @JSName("encrypt")
    def encrypt_general(serialization: general): GeneralJWE = js.native
    
    def recipient(key: ProduceKeyInput): Unit = js.native
    def recipient(key: ProduceKeyInput, header: js.Object): Unit = js.native
  }
  
  @scala.inline
  def decrypt(jwe: String, key: ConsumeKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(jwe: String, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeDecrypt]
  @scala.inline
  def decrypt(jwe: String, key: ConsumeKeyInput, options: DecryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(jwe: FlattenedJWE, key: ConsumeKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeDecrypt]
  @scala.inline
  def decrypt(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(jwe: GeneralJWE, key: ConsumeKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeDecrypt]
  @scala.inline
  def decrypt(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object encrypt {
    
    @scala.inline
    def apply(payload: String, key: ProduceKeyInput): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(payload: String, key: ProduceKeyInput, `protected`: js.Object): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(payload: Buffer, key: ProduceKeyInput): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("jose", "JWE.encrypt")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: String): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: String, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: Unit, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: String): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: String, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: Unit, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: String): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: String, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: Unit, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: String): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: String, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    @scala.inline
    def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: Unit, header: js.Object): FlattenedJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWE]
    
    @scala.inline
    def general(payload: String, key: ProduceKeyInput): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: String): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: String, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, aad: Unit, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: String): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: String, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: String, key: ProduceKeyInput, `protected`: Unit, aad: Unit, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: String): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: String, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, aad: Unit, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: String): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: String, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
    @scala.inline
    def general(payload: Buffer, key: ProduceKeyInput, `protected`: Unit, aad: Unit, header: js.Object): GeneralJWE = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWE]
  }
  
  trait DecryptOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var contentEncryptionAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var keyManagementAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DecryptOptions {
    
    @scala.inline
    def apply(): DecryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecryptOptions]
    }
    
    @scala.inline
    implicit class DecryptOptionsMutableBuilder[Self <: DecryptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setContentEncryptionAlgorithms(value: js.Array[String]): Self = StObject.set(x, "contentEncryptionAlgorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncryptionAlgorithmsUndefined: Self = StObject.set(x, "contentEncryptionAlgorithms", js.undefined)
      
      @scala.inline
      def setContentEncryptionAlgorithmsVarargs(value: String*): Self = StObject.set(x, "contentEncryptionAlgorithms", js.Array(value :_*))
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      @scala.inline
      def setKeyManagementAlgorithms(value: js.Array[String]): Self = StObject.set(x, "keyManagementAlgorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManagementAlgorithmsUndefined: Self = StObject.set(x, "keyManagementAlgorithms", js.undefined)
      
      @scala.inline
      def setKeyManagementAlgorithmsVarargs(value: String*): Self = StObject.set(x, "keyManagementAlgorithms", js.Array(value :_*))
    }
  }
  
  trait FlattenedJWE
    extends StObject
       with JWERecipient
       with JWEJSON
  object FlattenedJWE {
    
    @scala.inline
    def apply(ciphertext: String, encrypted_key: String, iv: String, tag: String): FlattenedJWE = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], encrypted_key = encrypted_key.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedJWE]
    }
  }
  
  trait GeneralJWE
    extends StObject
       with JWEJSON {
    
    var recipients: js.Array[JWERecipient]
  }
  object GeneralJWE {
    
    @scala.inline
    def apply(ciphertext: String, iv: String, recipients: js.Array[JWERecipient], tag: String): GeneralJWE = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralJWE]
    }
    
    @scala.inline
    implicit class GeneralJWEMutableBuilder[Self <: GeneralJWE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecipients(value: js.Array[JWERecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsVarargs(value: JWERecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    }
  }
  
  trait JWEJSON extends StObject {
    
    var aad: js.UndefOr[String] = js.undefined
    
    var ciphertext: String
    
    var iv: String
    
    var `protected`: js.UndefOr[String] = js.undefined
    
    var tag: String
    
    var unprotected: js.UndefOr[js.Object] = js.undefined
  }
  object JWEJSON {
    
    @scala.inline
    def apply(ciphertext: String, iv: String, tag: String): JWEJSON = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWEJSON]
    }
    
    @scala.inline
    implicit class JWEJSONMutableBuilder[Self <: JWEJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAad(value: String): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      @scala.inline
      def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprotected(value: js.Object): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
    }
  }
  
  trait JWERecipient extends StObject {
    
    var encrypted_key: String
    
    var header: js.UndefOr[js.Object] = js.undefined
  }
  object JWERecipient {
    
    @scala.inline
    def apply(encrypted_key: String): JWERecipient = {
      val __obj = js.Dynamic.literal(encrypted_key = encrypted_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWERecipient]
    }
    
    @scala.inline
    implicit class JWERecipientMutableBuilder[Self <: JWERecipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncrypted_key(value: String): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait completeDecrypt extends StObject {
    
    var aad: js.UndefOr[String] = js.undefined
    
    var cek: OctKey
    
    var cleartext: Buffer
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var key: Key
    
    var `protected`: js.UndefOr[js.Object] = js.undefined
    
    var unprotected: js.UndefOr[js.Object] = js.undefined
  }
  object completeDecrypt {
    
    @scala.inline
    def apply(cek: OctKey, cleartext: Buffer, key: Key): completeDecrypt = {
      val __obj = js.Dynamic.literal(cek = cek.asInstanceOf[js.Any], cleartext = cleartext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[completeDecrypt]
    }
    
    @scala.inline
    implicit class completeDecryptMutableBuilder[Self <: completeDecrypt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAad(value: String): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      @scala.inline
      def setCek(value: OctKey): Self = StObject.set(x, "cek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleartext(value: Buffer): Self = StObject.set(x, "cleartext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: js.Object): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      @scala.inline
      def setUnprotected(value: js.Object): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
    }
  }
}
