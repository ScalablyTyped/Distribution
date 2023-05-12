package typings.k6

import typings.k6.k6Ints.`128`
import typings.k6.k6Ints.`192`
import typings.k6.k6Ints.`256`
import typings.k6.k6Strings.HMAC
import typings.k6.k6Strings.`AES-CBC`
import typings.k6.k6Strings.`AES-CFB`
import typings.k6.k6Strings.`AES-CTR`
import typings.k6.k6Strings.`AES-GCM`
import typings.k6.k6Strings.`AES-KW`
import typings.k6.k6Strings.`SHA-1`
import typings.k6.k6Strings.`SHA-256`
import typings.k6.k6Strings.`SHA-384`
import typings.k6.k6Strings.`SHA-512`
import typings.k6.k6Strings.`private`
import typings.k6.k6Strings.decrypt
import typings.k6.k6Strings.encrypt
import typings.k6.k6Strings.public
import typings.k6.k6Strings.raw
import typings.k6.k6Strings.secret
import typings.k6.k6Strings.sign
import typings.k6.k6Strings.verify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalWebcryptoMod {
  
  @JSImport("k6/experimental/webcrypto", "crypto")
  @js.native
  val crypto: Crypto_ = js.native
  
  trait AesCbcParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * The initialization vector to use for the operation.
      * This must be 16-byte long (the AES block size), unpredictable, and
      * preferably cryptographically random. However, it is not required to be
      * secret (it may be transmitted unencrypted along with the ciphertext).
      */
    var iv: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_AesCbcParams: `AES-CBC`
  }
  object AesCbcParams {
    
    inline def apply(iv: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): AesCbcParams = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = "AES-CBC")
      __obj.asInstanceOf[AesCbcParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AesCbcParams] (val x: Self) extends AnyVal {
      
      inline def setIv(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setName(value: `AES-CBC`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AesCtrParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * The initial value of the counter block. This must be 16-byte
      * long (the AES block size). The rightmost `length` bits of this
      * block are used for the counter, and the rest is used for the
      * nonce.
      */
    var counter: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView
    
    /**
      * The number of bits in the counter block that are used for the actual
      * counter. The counter must be big enough that it doesn't wrap. If the
      * message is `n` blocks and the counter is `m` bits long, then the following
      * must be true: `n < 2^m`.
      */
    var length: Double
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_AesCtrParams: `AES-CTR`
  }
  object AesCtrParams {
    
    inline def apply(
      counter: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView,
      length: Double
    ): AesCtrParams = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = "AES-CTR")
      __obj.asInstanceOf[AesCtrParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AesCtrParams] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: `AES-CTR`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AesGcmParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * Contains additional data that will not be encrypted but will be
      * authenticated. This is optional, and can be omitted if you don't
      * need to pass any additional data. If `additionalData` is specified,
      * then the same data must be given in the corresponding call to `decrypt()`.
      * If the data is not the same, then the decryption will fail. This gives
      * you a way to authenticate the data, without having to encrypt it.
      */
    var additionalData: js.UndefOr[
        js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView
      ] = js.undefined
    
    /**
      * The initialization vector to use for the operation.
      * This must be 12-byte long (the GCM block size), unpredictable, and
      * preferably cryptographically random. This must be unique for every
      * encryption operation carried out with a given key. Put another way,
      * never reuse an IV with the same key.
      */
    var iv: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_AesGcmParams: `AES-GCM`
    
    /**
      * The length of the authentication tag, in bits. This must be of size
      * 96.
      */
    var tagLength: js.UndefOr[Double] = js.undefined
  }
  object AesGcmParams {
    
    inline def apply(iv: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): AesGcmParams = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = "AES-GCM")
      __obj.asInstanceOf[AesGcmParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AesGcmParams] (val x: Self) extends AnyVal {
      
      inline def setAdditionalData(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setIv(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setName(value: `AES-GCM`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
      
      inline def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
    }
  }
  
  trait AesKeyGenParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * The length of the key, in bits.
      */
    var length: `128` | `192` | `256`
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_AesKeyGenParams: `AES-GCM` | `AES-CBC` | `AES-CTR` | `AES-CFB` | `AES-KW`
  }
  object AesKeyGenParams {
    
    inline def apply(length: `128` | `192` | `256`, name: `AES-GCM` | `AES-CBC` | `AES-CTR` | `AES-CFB` | `AES-KW`): AesKeyGenParams = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AesKeyGenParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AesKeyGenParams] (val x: Self) extends AnyVal {
      
      inline def setLength(value: `128` | `192` | `256`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: `AES-GCM` | `AES-CBC` | `AES-CTR` | `AES-CFB` | `AES-KW`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Algorithm[I /* <: AlgorithmIdentifier | HashAlgorithmIdentifier */] extends StObject {
    
    /**
      * The name of the algorithm to use.
      */
    var name: I
  }
  object Algorithm {
    
    inline def apply[I /* <: AlgorithmIdentifier | HashAlgorithmIdentifier */](name: I): Algorithm[I] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm[I]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithm[?], I /* <: AlgorithmIdentifier | HashAlgorithmIdentifier */] (val x: Self & Algorithm[I]) extends AnyVal {
      
      inline def setName(value: I): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type AlgorithmIdentifier = String
  
  trait CryptoKey extends StObject {
    
    /**
      * An object describing the algorithm for which this key can be used
      * and any associated extra parameters.
      */
    val algorithm: js.Object
    
    /**
      * A boolean value indicating whether or not the
      * key may be extracted using `SubtleCrypto.exportKey()` or
      * `SubtleCrypto.wrapKey()`.
      */
    val extractable: Boolean
    
    /**
      * The type of key the object represents.
      */
    val `type`: secret | `private` | public
    
    /**
      * An array of strings, indicating what can be done with the key.
      */
    val usages: js.Array[encrypt | decrypt | sign | verify]
  }
  object CryptoKey {
    
    inline def apply(
      algorithm: js.Object,
      extractable: Boolean,
      `type`: secret | `private` | public,
      usages: js.Array[encrypt | decrypt | sign | verify]
    ): CryptoKey = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: js.Object): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setType(value: secret | `private` | public): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[encrypt | decrypt | sign | verify]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: (encrypt | decrypt | sign | verify)*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  @js.native
  trait Crypto_
    extends StObject
       with SubtleCrypto {
    
    /**
      * Fills the passed TypedArray with cryptographically sound random values.
      *
      *
      * @param typedArray - The TypedArray to fill with random values.
      * @throws {QuotaExceededError} - thrown if the `byteLength` of `typedArray` exceeds 65536.
      * @returns The typedArray argument.
      */
    def getRandomValues(typedArray: TypedArray): TypedArray = js.native
    
    /**
      * Returns a 36 character long string containing a cryptographically random UUID v4.
      *
      * @returns A 36 character long string containing a cryptographically random UUID v4.
      */
    def randomUUID(): String = js.native
    
    /**
      * Returns a SubtleCrypto object providing access to common cryptographic
      * primitives, like hashing, signing, encryption, or decryption.
      */
    val subtle: SubtleCrypto = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.`SHA-1`
    - typings.k6.k6Strings.`SHA-256`
    - typings.k6.k6Strings.`SHA-384`
    - typings.k6.k6Strings.`SHA-512`
  */
  trait HashAlgorithmIdentifier extends StObject
  object HashAlgorithmIdentifier {
    
    inline def `SHA-1`: typings.k6.k6Strings.`SHA-1` = "SHA-1".asInstanceOf[typings.k6.k6Strings.`SHA-1`]
    
    inline def `SHA-256`: typings.k6.k6Strings.`SHA-256` = "SHA-256".asInstanceOf[typings.k6.k6Strings.`SHA-256`]
    
    inline def `SHA-384`: typings.k6.k6Strings.`SHA-384` = "SHA-384".asInstanceOf[typings.k6.k6Strings.`SHA-384`]
    
    inline def `SHA-512`: typings.k6.k6Strings.`SHA-512` = "SHA-512".asInstanceOf[typings.k6.k6Strings.`SHA-512`]
  }
  
  trait HmacImportParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * The name of the digest function to use.
      */
    var hash: HashAlgorithmIdentifier
    
    /**
      * The length of the key, in bits. If the length is not specified,
      * then the generated key will be as long as the block size of
      * the hash function you have chosen. Unless you have a good reason
      * to use a different length, omit this property and use the default.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_HmacImportParams: HMAC
  }
  object HmacImportParams {
    
    inline def apply(hash: HashAlgorithmIdentifier): HmacImportParams = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = "HMAC")
      __obj.asInstanceOf[HmacImportParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HmacImportParams] (val x: Self) extends AnyVal {
      
      inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: HMAC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HmacKeyGenParams
    extends StObject
       with Algorithm[AlgorithmIdentifier] {
    
    /**
      * A string representing the name of the digest function to use.
      */
    var hash: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`
    
    /**
      * The length of the key, in bits. If the length is not specified,
      * then the generated key will be as long as the block size of
      * the hash function you have chosen. Unless you have a good reason
      * to use a different length, omit this property and use the default.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the algorithm to use.
      */
    @JSName("name")
    var name_HmacKeyGenParams: HMAC
  }
  object HmacKeyGenParams {
    
    inline def apply(hash: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`): HmacKeyGenParams = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = "HMAC")
      __obj.asInstanceOf[HmacKeyGenParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HmacKeyGenParams] (val x: Self) extends AnyVal {
      
      inline def setHash(value: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: HMAC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubtleCrypto extends StObject {
    
    def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    /**
      * The `decrypt()` method decrypts some encrypted data.
      *
      * @param algorithm defines the algorithm to use and any extra-parameters.
      * @param key the key to use for decryption.
      * @param data the data to decrypt (also known as "ciphertext").
      * @throws {InvalidAccessError} - if the provided key cannot be used for the decrypt operation.
      * @throws {OperationError} - if the operation failed for an operation-specific reason.
      * @returns A promise that resolves with the decrypted data (also known as "plaintext").
      */
    def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def digest(algorithm: Algorithm[HashAlgorithmIdentifier], data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: Algorithm[HashAlgorithmIdentifier], data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: Algorithm[HashAlgorithmIdentifier], data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    /**
      * The `digest()` method computes a cryptographic digest of the given data using the
      * given algorithm.
      *
      * A digest is a fixed-length hash of the original data. It is often used
      * to verify the integrity of the original data, or to create a
      * "fingerprint" or "summary" of the original data that can be used to
      * identify it.
      *
      * Cryptographic digests should exhibit collision-resistance, meaning that it's hard to
      * come up with two different inputs that have the same digest value.
      *
      * @param algorithm names the algorithm to use.
      * @param data the data to be digested
      * @returns A promise that resolves with the digest value.
      */
    def digest(algorithm: HashAlgorithmIdentifier, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: HashAlgorithmIdentifier, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: HashAlgorithmIdentifier, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    /**
      * The `encrypt()` method encrypts data.
      *
      * @param algorithm defines the algorithm to use and any extra-parameters.
      * @param key the key to use for encryption.
      * @param data the data to encrypt (also known as "plaintext").
      * @throws {InvalidAccessError} - if the provided key cannot be used for the encrypt operation.
      * @throws {OperationError} - if the operation failed for an operation-specific reason.
      * @returns A promise that resolves with the encrypted data (also known as "ciphertext").
      */
    def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * The `exportKey()` method exports a key: that is, it takes as input a `CryptoKey`
      * object and gives you the key in an external, portable format.
      *
      * To export a key, the key must have `CryptoKey.extractable` set to `true`.
      *
      * @param format the format in which to export the key. Currently, only "raw" is supported.
      * @param key the key to export.
      * @throws {InvalidAccessError} - if the key is not extractable.
      * @throws {NotSupportedError} - if the format is not supported.
      * @throws {TypeError} - when trying to use an invalid format.
      * @returns A promise that resolves with the exported key.
      */
    @JSName("exportKey")
    def exportKey_raw(format: raw, key: CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Use the `generateKey()` method to generate a new key (for symmetric
      * algorithms) or key pair (for public-key algorithms).
      *
      * @param algorithm defines the type of key to generate and providing extra algorithm-specific parameters.
      * @param extractable indicates whether it will be possible to export the key using `SubtleCrypto.exportKey()` or `SubtleCrypto.wrapKey`.
      * @param keyUsages indicates what can be done with the newly generated key.
      * @throws {SyntaxError} - if the result is a `CryptoKey` of type `secret` or `private` but `keyUsages is empty.
      * @returns A promise that resolves with the newly generated `CryptoKey` or `CryptoKeyPair`.
      */
    def generateKey(
      algorithm: AesKeyGenParams,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def generateKey(
      algorithm: HmacKeyGenParams,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: `AES-CBC` | `AES-CTR` | `AES-GCM`,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: Algorithm[`AES-CBC` | `AES-CTR` | `AES-GCM`],
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBuffer,
      algorithm: `AES-CBC` | `AES-CTR` | `AES-GCM`,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    /**
      * The `importKey()` method imports a key into a `CryptoKey` object.
      * It takes as input a key in an external, portable format and gives you
      * a `CryptoKey` object that can be used in the Web Crypto API.
      *
      * @param format the format of the key to import. Currently, only "raw" is supported.
      * @param keyData the key data to import.
      * @param algorithm defines the algorithm to use and any extra-parameters.
      * @param extractable indicates whether it will be possible to export the key using `SubtleCrypto.exportKey()` or `SubtleCrypto.wrapKey`.
      * @param keyUsages indicates what can be done with the newly generated key.
      * @throws {SyntaxError} - if the result is a `CryptoKey` of type `secret` or `private` but `keyUsages is empty.
      * @throws {TypeError} - when trying to use an invalid format or if the `keyData` is not suited for that format.
      * @returns A promise that resolves with the imported `CryptoKey`.
      */
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBuffer,
      algorithm: Algorithm[`AES-CBC` | `AES-CTR` | `AES-GCM`],
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.ArrayBuffer,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.DataView,
      algorithm: `AES-CBC` | `AES-CTR` | `AES-GCM`,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.DataView,
      algorithm: Algorithm[`AES-CBC` | `AES-CTR` | `AES-GCM`],
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: raw,
      keyData: js.typedarray.DataView,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[encrypt | decrypt | sign | verify]
    ): js.Promise[CryptoKey] = js.native
    
    /**
      * The `sign()` method generates a digital signature.
      *
      * It takes as its argument a key to sign with, some algorithm-identifier
      * specific parameters, and the data to sign.
      *
      * @param algorithm defines the algorithm to use and any extra-parameters.
      * @param key the key to use for signing. If `algorithm` identifies a public-key cryptosystem, this is the private key.
      * @param data the data to sign.
      * @throws {InvalidAccessError} - if the provided key cannot be used for the sign operation.
      * @returns A promise that resolves with the signature.
      */
    @JSName("sign")
    def sign_HMAC(algorithm: Algorithm[HMAC], key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    @JSName("sign")
    def sign_HMAC(algorithm: Algorithm[HMAC], key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    @JSName("sign")
    def sign_HMAC(algorithm: Algorithm[HMAC], key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    @JSName("sign")
    def sign_HMAC(algorithm: HMAC, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    @JSName("sign")
    def sign_HMAC(algorithm: HMAC, key: CryptoKey, data: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    @JSName("sign")
    def sign_HMAC(algorithm: HMAC, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.DataView
    ): js.Promise[Boolean] = js.native
    /**
      * The `verify()` method verifies a digital signature.
      *
      * @param algorithm defines the algorithm to use and any extra-parameters.
      * @param key the key to use for verifying. It is the secret key for a symmetric algorithm and the public key for a public-key system.
      * @param signature the signature to verify.
      * @param data the data to verify.
      * @throws {InvalidAccessError} - if the provided key cannot be used for the verify operation.
      * @returns A promise that resolves with a boolean indicating whether the signature is valid.
      */
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.DataView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.DataView,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.DataView,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: Algorithm[HMAC],
      key: CryptoKey,
      signature: js.typedarray.DataView,
      data: js.typedarray.DataView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBufferView,
      data: js.typedarray.DataView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.DataView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.DataView,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(
      algorithm: HMAC,
      key: CryptoKey,
      signature: js.typedarray.DataView,
      data: js.typedarray.ArrayBufferView
    ): js.Promise[Boolean] = js.native
    @JSName("verify")
    def verify_HMAC(algorithm: HMAC, key: CryptoKey, signature: js.typedarray.DataView, data: js.typedarray.DataView): js.Promise[Boolean] = js.native
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array
}
