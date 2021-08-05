package typings.jose.mod

import typings.jose.anon.VerifyOptionscompletetrue
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.jose.mod.JWK.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWS {
  
  @JSImport("jose", "JWS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose", "JWS.Sign")
  @js.native
  class Sign_ protected () extends StObject {
    def this(payload: String) = this()
    def this(payload: js.Object) = this()
    def this(payload: Buffer) = this()
    
    def recipient(key: ProduceKeyInputWithNone): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): Unit = js.native
    def recipient(key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): Unit = js.native
    
    @JSName("sign")
    def sign_compact(serialization: compact): String = js.native
    @JSName("sign")
    def sign_flattened(serialization: flattened): FlattenedJWS = js.native
    @JSName("sign")
    def sign_general(serialization: general): GeneralJWS = js.native
  }
  
  object sign {
    
    inline def apply(payload: String, key: ProduceKeyInputWithNone): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(payload: js.Object, key: ProduceKeyInputWithNone): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(payload: Buffer, key: ProduceKeyInputWithNone): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): String = (^.asInstanceOf[js.Dynamic].apply(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("jose", "JWS.sign")
    @js.native
    val ^ : js.Any = js.native
    
    inline def flattened(payload: String, key: ProduceKeyInputWithNone): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: js.Object, key: ProduceKeyInputWithNone): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: Buffer, key: ProduceKeyInputWithNone): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    inline def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): FlattenedJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("flattened")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[FlattenedJWS]
    
    inline def general(payload: String, key: ProduceKeyInputWithNone): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: String, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: js.Object, key: ProduceKeyInputWithNone): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: Buffer, key: ProduceKeyInputWithNone): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
    inline def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: Unit, header: js.Object): GeneralJWS = (^.asInstanceOf[js.Dynamic].applyDynamic("general")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `protected`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[GeneralJWS]
  }
  
  inline def verify(jws: String, key: ConsumeKeyInputWithNone): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: String, key: ConsumeKeyInputWithNone, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: String, key: ConsumeKeyInput, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: String, key: EmbeddedVerifyKeys): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: String, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: String, key: EmbeddedVerifyKeys, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: String, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[NoneKey]]
  inline def verify(jws: FlattenedJWS, key: ConsumeKeyInputWithNone): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: FlattenedJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: FlattenedJWS, key: ConsumeKeyInput, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: FlattenedJWS, key: EmbeddedVerifyKeys): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: FlattenedJWS, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: FlattenedJWS, key: EmbeddedVerifyKeys, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: FlattenedJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[NoneKey]]
  inline def verify(jws: GeneralJWS, key: ConsumeKeyInputWithNone): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: GeneralJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: GeneralJWS, key: ConsumeKeyInput, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: GeneralJWS, key: EmbeddedVerifyKeys): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: GeneralJWS, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[Key]]
  inline def verify(jws: GeneralJWS, key: EmbeddedVerifyKeys, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def verify(jws: GeneralJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeVerification[NoneKey]]
  
  trait FlattenedJWS
    extends StObject
       with JWSRecipient
       with JWSJSON
  object FlattenedJWS {
    
    inline def apply(payload: String | Buffer, signature: String): FlattenedJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedJWS]
    }
  }
  
  trait GeneralJWS
    extends StObject
       with JWSJSON {
    
    var signatures: js.Array[JWSRecipient]
  }
  object GeneralJWS {
    
    inline def apply(payload: String | Buffer, signatures: js.Array[JWSRecipient]): GeneralJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralJWS]
    }
    
    extension [Self <: GeneralJWS](x: Self) {
      
      inline def setSignatures(value: js.Array[JWSRecipient]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: JWSRecipient*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    }
  }
  
  trait JWSJSON extends StObject {
    
    var payload: String | Buffer
  }
  object JWSJSON {
    
    inline def apply(payload: String | Buffer): JWSJSON = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWSJSON]
    }
    
    extension [Self <: JWSJSON](x: Self) {
      
      inline def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait JWSRecipient extends StObject {
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var `protected`: js.UndefOr[String] = js.undefined
    
    var signature: String
  }
  object JWSRecipient {
    
    inline def apply(signature: String): JWSRecipient = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWSRecipient]
    }
    
    extension [Self <: JWSRecipient](x: Self) {
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
    }
  }
  
  trait completeVerification[T] extends StObject {
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var key: T
    
    var payload: Buffer
    
    var `protected`: js.UndefOr[js.Object] = js.undefined
  }
  object completeVerification {
    
    inline def apply[T](key: T, payload: Buffer): completeVerification[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[completeVerification[T]]
    }
    
    extension [Self <: completeVerification[?], T](x: Self & completeVerification[T]) {
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: js.Object): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    }
  }
}
