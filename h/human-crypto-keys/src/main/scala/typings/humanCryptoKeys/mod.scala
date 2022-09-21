package typings.humanCryptoKeys

import typings.humanCryptoKeys.humanCryptoKeysStrings.ed25519
import typings.humanCryptoKeys.humanCryptoKeysStrings.rsa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-crypto-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKeyPair(
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm
  ): js.Promise[FullKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(algorithm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FullKeyPair]]
  inline def generateKeyPair(
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm,
    /**
    * Options to be used while composing keys
    */
  options: Options
  ): js.Promise[FullKeyPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FullKeyPair]]
  
  inline def getKeyPairFromMnemonic(
    /**
    * The mnemonic provided as one of the recovery methods for a key pair
    */
  mnemonic: String,
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm
  ): js.Promise[SimpleKeyPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairFromMnemonic")(mnemonic.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleKeyPair]]
  inline def getKeyPairFromMnemonic(
    /**
    * The mnemonic provided as one of the recovery methods for a key pair
    */
  mnemonic: String,
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm,
    /**
    * Options to be used while composing keys
    */
  options: Options
  ): js.Promise[SimpleKeyPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairFromMnemonic")(mnemonic.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleKeyPair]]
  
  inline def getKeyPairFromSeed(
    /**
    * The seed provided as one of the recovery methods for a key pair
    */
  seed: String,
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm
  ): js.Promise[SimpleKeyPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairFromSeed")(seed.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleKeyPair]]
  inline def getKeyPairFromSeed(
    /**
    * The seed provided as one of the recovery methods for a key pair
    */
  seed: String,
    /**
    * The algorithm identifier and the respective parameters to generate a key pair
    */
  algorithm: Algorithm,
    /**
    * Options to be used while composing keys
    */
  options: Options
  ): js.Promise[SimpleKeyPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairFromSeed")(seed.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleKeyPair]]
  
  /* Inlined human-crypto-keys.human-crypto-keys.ED25519Algorithm | human-crypto-keys.human-crypto-keys.RSAAlgorithm | human-crypto-keys.human-crypto-keys.ED25519Algorithm['id'] | human-crypto-keys.human-crypto-keys.RSAAlgorithm['id'] */
  /* Rewritten from type alias, can be one of: 
    - typings.humanCryptoKeys.humanCryptoKeysStrings.modulusLength
    - typings.humanCryptoKeys.humanCryptoKeysStrings.ed25519
    - typings.humanCryptoKeys.humanCryptoKeysStrings.rsa
    - typings.humanCryptoKeys.humanCryptoKeysStrings.method
    - typings.humanCryptoKeys.humanCryptoKeysStrings.id
    - typings.humanCryptoKeys.humanCryptoKeysStrings.publicExponent
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ed25519: typings.humanCryptoKeys.humanCryptoKeysStrings.ed25519 = "ed25519".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.ed25519]
    
    inline def id: typings.humanCryptoKeys.humanCryptoKeysStrings.id = "id".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.id]
    
    inline def method: typings.humanCryptoKeys.humanCryptoKeysStrings.method = "method".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.method]
    
    inline def modulusLength: typings.humanCryptoKeys.humanCryptoKeysStrings.modulusLength = "modulusLength".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.modulusLength]
    
    inline def publicExponent: typings.humanCryptoKeys.humanCryptoKeysStrings.publicExponent = "publicExponent".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.publicExponent]
    
    inline def rsa: typings.humanCryptoKeys.humanCryptoKeysStrings.rsa = "rsa".asInstanceOf[typings.humanCryptoKeys.humanCryptoKeysStrings.rsa]
  }
  
  trait ED25519Algorithm extends StObject {
    
    var id: ed25519
  }
  object ED25519Algorithm {
    
    inline def apply(): ED25519Algorithm = {
      val __obj = js.Dynamic.literal(id = "ed25519")
      __obj.asInstanceOf[ED25519Algorithm]
    }
    
    extension [Self <: ED25519Algorithm](x: Self) {
      
      inline def setId(value: ed25519): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullKeyPair extends StObject {
    
    /**
      * An object with the algorithm identifier and respective parameters that were used during generation
      */
    var algorithm: Algorithm
    
    /**
      * The mnemonic used to create a seed for generation
      */
    var mnemonic: String
    
    /**
      * The generated private key composed in a specific format
      */
    var privateKey: String
    
    /**
      * The generated public key composed in a specific format.
      */
    var publicKey: String
    
    /**
      * The seed used for generation
      */
    var seed: String
  }
  object FullKeyPair {
    
    inline def apply(algorithm: Algorithm, mnemonic: String, privateKey: String, publicKey: String, seed: String): FullKeyPair = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullKeyPair]
    }
    
    extension [Self <: FullKeyPair](x: Self) {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setMnemonic(value: String): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The encryption algorithm that will be used to encrypt the private key
      *
      * For more information please read the
      * [Encryption Algorithms](https://github.com/ipfs-shipyard/js-crypto-key-composer/tree/initial-impl#encryption-algorithms)
      * Section of [crypto-key-composer](https://github.com/ipfs-shipyard/js-crypto-key-composer) package
      */
    var encryptionAlgorithm: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The password to be used on the encryption of the private key
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The format in which the private key will be composed
      *
      * Keys can be composed in different formats and vary by algorithm. All formats available are described in the
      * [Formats Section](https://github.com/ipfs-shipyard/js-crypto-key-composer/tree/initial-impl#formats) of
      * [crypto-key-composer](https://github.com/ipfs-shipyard/js-crypto-key-composer) package.
      */
    var privateKeyFormat: js.UndefOr[String] = js.undefined
    
    /**
      * The format in which the public key will be composed
      *
      * Keys can be composed in different formats and vary by algorithm. All formats available are described in the
      * [Formats Section](https://github.com/ipfs-shipyard/js-crypto-key-composer/tree/initial-impl#formats) of
      * [crypto-key-composer](https://github.com/ipfs-shipyard/js-crypto-key-composer) package.
      */
    var publicKeyFormat: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncryptionAlgorithm(value: js.Object): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPrivateKeyFormat(value: String): Self = StObject.set(x, "privateKeyFormat", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyFormatUndefined: Self = StObject.set(x, "privateKeyFormat", js.undefined)
      
      inline def setPublicKeyFormat(value: String): Self = StObject.set(x, "publicKeyFormat", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyFormatUndefined: Self = StObject.set(x, "publicKeyFormat", js.undefined)
    }
  }
  
  trait RSAAlgorithm extends StObject {
    
    var id: rsa
    
    /**
      * @default 'PRIMEINC'
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * @default 2048
      */
    var modulusLength: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 65537
      */
    var publicExponent: js.UndefOr[Double] = js.undefined
  }
  object RSAAlgorithm {
    
    inline def apply(): RSAAlgorithm = {
      val __obj = js.Dynamic.literal(id = "rsa")
      __obj.asInstanceOf[RSAAlgorithm]
    }
    
    extension [Self <: RSAAlgorithm](x: Self) {
      
      inline def setId(value: rsa): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
      
      inline def setModulusLengthUndefined: Self = StObject.set(x, "modulusLength", js.undefined)
      
      inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    }
  }
  
  /* Inlined std.Pick<human-crypto-keys.human-crypto-keys.FullKeyPair, 'privateKey' | 'publicKey'> */
  trait SimpleKeyPair extends StObject {
    
    var privateKey: String
    
    var publicKey: String
  }
  object SimpleKeyPair {
    
    inline def apply(privateKey: String, publicKey: String): SimpleKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleKeyPair]
    }
    
    extension [Self <: SimpleKeyPair](x: Self) {
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
