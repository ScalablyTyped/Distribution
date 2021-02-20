package typings.jose.mod

import typings.jose.anon.VerifyOptionscompletetrue
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.jose.mod.JWK.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWS {
  
  @JSImport("jose", "JWS.Sign")
  @js.native
  class Sign_ protected () extends StObject {
    def this(payload: String) = this()
    def this(payload: js.Object) = this()
    def this(payload: Buffer) = this()
    
    def recipient(key: ProduceKeyInputWithNone): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: js.UndefOr[scala.Nothing], header: js.Object): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): Unit = js.native
    
    @JSName("sign")
    def sign_compact(serialization: compact): String = js.native
    @JSName("sign")
    def sign_flattened(serialization: flattened): FlattenedJWS = js.native
    @JSName("sign")
    def sign_general(serialization: general): GeneralJWS = js.native
  }
  
  object sign {
    
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: String, key: ProduceKeyInputWithNone): String = js.native
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: js.Object, key: ProduceKeyInputWithNone): String = js.native
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: Buffer, key: ProduceKeyInputWithNone): String = js.native
    @JSImport("jose", "JWS.sign")
    @js.native
    def apply(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
    
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: String, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(
      payload: String,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: js.Object, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(
      payload: js.Object,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: Buffer, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(
      payload: Buffer,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
    @JSImport("jose", "JWS.sign.flattened")
    @js.native
    def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: String, key: ProduceKeyInputWithNone): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(
      payload: String,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: js.Object, key: ProduceKeyInputWithNone): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(
      payload: js.Object,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: Buffer, key: ProduceKeyInputWithNone): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(
      payload: Buffer,
      key: ProduceKeyInputWithNone,
      `protected`: js.UndefOr[scala.Nothing],
      header: js.Object
    ): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
    @JSImport("jose", "JWS.sign.general")
    @js.native
    def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  }
  
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: String, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: FlattenedJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: FlattenedJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: GeneralJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  @JSImport("jose", "JWS.verify")
  @js.native
  def verify(jws: GeneralJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  
  @js.native
  trait FlattenedJWS
    extends JWSRecipient
       with JWSJSON
  object FlattenedJWS {
    
    @scala.inline
    def apply(payload: String | Buffer, signature: String): FlattenedJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedJWS]
    }
  }
  
  @js.native
  trait GeneralJWS extends JWSJSON {
    
    var signatures: js.Array[JWSRecipient] = js.native
  }
  object GeneralJWS {
    
    @scala.inline
    def apply(payload: String | Buffer, signatures: js.Array[JWSRecipient]): GeneralJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralJWS]
    }
    
    @scala.inline
    implicit class GeneralJWSMutableBuilder[Self <: GeneralJWS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignatures(value: js.Array[JWSRecipient]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignaturesVarargs(value: JWSRecipient*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    }
  }
  
  @js.native
  trait JWSJSON extends StObject {
    
    var payload: String | Buffer = js.native
  }
  object JWSJSON {
    
    @scala.inline
    def apply(payload: String | Buffer): JWSJSON = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWSJSON]
    }
    
    @scala.inline
    implicit class JWSJSONMutableBuilder[Self <: JWSJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JWSRecipient extends StObject {
    
    var header: js.UndefOr[js.Object] = js.native
    
    var `protected`: js.UndefOr[String] = js.native
    
    var signature: String = js.native
  }
  object JWSRecipient {
    
    @scala.inline
    def apply(signature: String): JWSRecipient = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWSRecipient]
    }
    
    @scala.inline
    implicit class JWSRecipientMutableBuilder[Self <: JWSRecipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
    
    var complete: js.UndefOr[Boolean] = js.native
    
    var crit: js.UndefOr[js.Array[String]] = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
    }
  }
  
  @js.native
  trait completeVerification[T] extends StObject {
    
    var header: js.UndefOr[js.Object] = js.native
    
    var key: T = js.native
    
    var payload: Buffer = js.native
    
    var `protected`: js.UndefOr[js.Object] = js.native
  }
  object completeVerification {
    
    @scala.inline
    def apply[T](key: T, payload: Buffer): completeVerification[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[completeVerification[T]]
    }
    
    @scala.inline
    implicit class completeVerificationMutableBuilder[Self <: completeVerification[_], T] (val x: Self with completeVerification[T]) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: js.Object): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    }
  }
}
