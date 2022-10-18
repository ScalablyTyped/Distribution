package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.anon.Body
import typings.matrixBotSdk.anon.Dictk
import typings.matrixBotSdk.anon.SignedCurve25519OTKfallba
import typings.matrixBotSdk.libModelsCryptoMod.EncryptionAlgorithm.MegolmV1AesSha2
import typings.matrixBotSdk.libModelsCryptoMod.EncryptionAlgorithm.OlmV1Curve25519AesSha2
import typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm.Signed
import typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm.Unsigned
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsCryptoMod {
  
  @js.native
  sealed trait DeviceKeyAlgorithm extends StObject
  @JSImport("matrix-bot-sdk/lib/models/Crypto", "DeviceKeyAlgorithm")
  @js.native
  object DeviceKeyAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DeviceKeyAlgorithm & String] = js.native
    
    @js.native
    sealed trait Curve25519
      extends StObject
         with DeviceKeyAlgorithm
    /* "curve25519" */ val Curve25519: typings.matrixBotSdk.libModelsCryptoMod.DeviceKeyAlgorithm.Curve25519 & String = js.native
    
    @js.native
    sealed trait Ed25519
      extends StObject
         with DeviceKeyAlgorithm
    /* "ed25519" */ val Ed25519: typings.matrixBotSdk.libModelsCryptoMod.DeviceKeyAlgorithm.Ed25519 & String = js.native
  }
  
  @js.native
  sealed trait EncryptionAlgorithm extends StObject
  @JSImport("matrix-bot-sdk/lib/models/Crypto", "EncryptionAlgorithm")
  @js.native
  object EncryptionAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EncryptionAlgorithm & String] = js.native
    
    @js.native
    sealed trait MegolmV1AesSha2
      extends StObject
         with EncryptionAlgorithm
    /* "m.megolm.v1.aes-sha2" */ val MegolmV1AesSha2: typings.matrixBotSdk.libModelsCryptoMod.EncryptionAlgorithm.MegolmV1AesSha2 & String = js.native
    
    @js.native
    sealed trait OlmV1Curve25519AesSha2
      extends StObject
         with EncryptionAlgorithm
    /* "m.olm.v1.curve25519-aes-sha2" */ val OlmV1Curve25519AesSha2: typings.matrixBotSdk.libModelsCryptoMod.EncryptionAlgorithm.OlmV1Curve25519AesSha2 & String = js.native
  }
  
  @js.native
  sealed trait OTKAlgorithm extends StObject
  @JSImport("matrix-bot-sdk/lib/models/Crypto", "OTKAlgorithm")
  @js.native
  object OTKAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OTKAlgorithm & String] = js.native
    
    @js.native
    sealed trait Signed
      extends StObject
         with OTKAlgorithm
    /* "signed_curve25519" */ val Signed: typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm.Signed & String = js.native
    
    @js.native
    sealed trait Unsigned
      extends StObject
         with OTKAlgorithm
    /* "curve25519" */ val Unsigned: typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm.Unsigned & String = js.native
  }
  
  type DeviceKeyLabel[Algorithm /* <: DeviceKeyAlgorithm */, ID /* <: String */] = /* template literal string: ${Algorithm}:${ID} */ String
  
  trait FallbackKey extends StObject {
    
    var key: SignedCurve25519OTKfallba
    
    var keyId: String
  }
  object FallbackKey {
    
    inline def apply(key: SignedCurve25519OTKfallba, keyId: String): FallbackKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackKey]
    }
    
    extension [Self <: FallbackKey](x: Self) {
      
      inline def setKey(value: SignedCurve25519OTKfallba): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMegolmEncrypted extends StObject {
    
    var algorithm: MegolmV1AesSha2
    
    var ciphertext: String
    
    var device_id: String
    
    var sender_key: String
    
    var session_id: String
  }
  object IMegolmEncrypted {
    
    inline def apply(
      algorithm: MegolmV1AesSha2,
      ciphertext: String,
      device_id: String,
      sender_key: String,
      session_id: String
    ): IMegolmEncrypted = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], sender_key = sender_key.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMegolmEncrypted]
    }
    
    extension [Self <: IMegolmEncrypted](x: Self) {
      
      inline def setAlgorithm(value: MegolmV1AesSha2): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setSender_key(value: String): Self = StObject.set(x, "sender_key", value.asInstanceOf[js.Any])
      
      inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOlmEncrypted extends StObject {
    
    var algorithm: OlmV1Curve25519AesSha2
    
    var ciphertext: StringDictionary[Body]
    
    var sender_key: String
  }
  object IOlmEncrypted {
    
    inline def apply(algorithm: OlmV1Curve25519AesSha2, ciphertext: StringDictionary[Body], sender_key: String): IOlmEncrypted = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], sender_key = sender_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOlmEncrypted]
    }
    
    extension [Self <: IOlmEncrypted](x: Self) {
      
      inline def setAlgorithm(value: OlmV1Curve25519AesSha2): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCiphertext(value: StringDictionary[Body]): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setSender_key(value: String): Self = StObject.set(x, "sender_key", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToDeviceMessage[T] extends StObject {
    
    var content: T
    
    var sender: String
    
    var `type`: String
  }
  object IToDeviceMessage {
    
    inline def apply[T](content: T, sender: String, `type`: String): IToDeviceMessage[T] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToDeviceMessage[T]]
    }
    
    extension [Self <: IToDeviceMessage[?], T](x: Self & IToDeviceMessage[T]) {
      
      inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiUserDeviceListResponse extends StObject {
    
    /**
      * A map of user ID to device ID to device.
      */
    var device_keys: Record[String, Record[String, UserDevice]]
    
    /**
      * Federation failures, keyed by server name. The mapped object should be a standard
      * error object.
      */
    var failures: StringDictionary[Any]
  }
  object MultiUserDeviceListResponse {
    
    inline def apply(device_keys: Record[String, Record[String, UserDevice]], failures: StringDictionary[Any]): MultiUserDeviceListResponse = {
      val __obj = js.Dynamic.literal(device_keys = device_keys.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiUserDeviceListResponse]
    }
    
    extension [Self <: MultiUserDeviceListResponse](x: Self) {
      
      inline def setDevice_keys(value: Record[String, Record[String, UserDevice]]): Self = StObject.set(x, "device_keys", value.asInstanceOf[js.Any])
      
      inline def setFailures(value: StringDictionary[Any]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    }
  }
  
  trait OTKClaimResponse extends StObject {
    
    /**
      * Federation failures, keyed by server name. The mapped object should be a standard
      * error object.
      */
    var failures: StringDictionary[Any]
    
    /**
      * The claimed One Time Keys, as a map from user ID to device ID to key ID to OTK.
      */
    var one_time_keys: Record[String, Record[String, OTKs]]
  }
  object OTKClaimResponse {
    
    inline def apply(failures: StringDictionary[Any], one_time_keys: Record[String, Record[String, OTKs]]): OTKClaimResponse = {
      val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], one_time_keys = one_time_keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[OTKClaimResponse]
    }
    
    extension [Self <: OTKClaimResponse](x: Self) {
      
      inline def setFailures(value: StringDictionary[Any]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setOne_time_keys(value: Record[String, Record[String, OTKs]]): Self = StObject.set(x, "one_time_keys", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ alg in matrix-bot-sdk.matrix-bot-sdk/lib/models/Crypto.OTKAlgorithm ]:? number}
    }}}
    */
  @js.native
  trait OTKCounts extends StObject
  
  type OTKLabel[Algorithm /* <: OTKAlgorithm */, ID /* <: String */] = /* template literal string: ${Algorithm}:${ID} */ String
  
  type OTKs = (Record[OTKLabel[Signed, String], SignedCurve25519OTK]) & (Record[OTKLabel[Unsigned, String], String])
  
  trait OwnUserDevice extends StObject {
    
    var device_id: String
    
    var display_name: js.UndefOr[String] = js.undefined
    
    var last_seen_ip: js.UndefOr[String] = js.undefined
    
    var last_seen_ts: js.UndefOr[Double] = js.undefined
  }
  object OwnUserDevice {
    
    inline def apply(device_id: String): OwnUserDevice = {
      val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OwnUserDevice]
    }
    
    extension [Self <: OwnUserDevice](x: Self) {
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_ipUndefined: Self = StObject.set(x, "last_seen_ip", js.undefined)
      
      inline def setLast_seen_ts(value: Double): Self = StObject.set(x, "last_seen_ts", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_tsUndefined: Self = StObject.set(x, "last_seen_ts", js.undefined)
    }
  }
  
  type Signatures = StringDictionary[StringDictionary[String]]
  
  trait SignedCurve25519OTK extends StObject {
    
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    var key: String
    
    var signatures: Signatures
  }
  object SignedCurve25519OTK {
    
    inline def apply(key: String, signatures: Signatures): SignedCurve25519OTK = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedCurve25519OTK]
    }
    
    extension [Self <: SignedCurve25519OTK](x: Self) {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: Signatures): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserDevice extends StObject {
    
    var algorithms: js.Array[EncryptionAlgorithm | String]
    
    var device_id: String
    
    var keys: Record[DeviceKeyLabel[DeviceKeyAlgorithm, String], String]
    
    var signatures: Signatures
    
    var unsigned: js.UndefOr[Dictk] = js.undefined
    
    var user_id: String
  }
  object UserDevice {
    
    inline def apply(
      algorithms: js.Array[EncryptionAlgorithm | String],
      device_id: String,
      keys: Record[DeviceKeyLabel[DeviceKeyAlgorithm, String], String],
      signatures: Signatures,
      user_id: String
    ): UserDevice = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDevice]
    }
    
    extension [Self <: UserDevice](x: Self) {
      
      inline def setAlgorithms(value: js.Array[EncryptionAlgorithm | String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsVarargs(value: (EncryptionAlgorithm | String)*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Record[DeviceKeyLabel[DeviceKeyAlgorithm, String], String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: Signatures): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setUnsigned(value: Dictk): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
