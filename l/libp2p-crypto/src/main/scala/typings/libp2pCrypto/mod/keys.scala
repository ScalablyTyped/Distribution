package typings.libp2pCrypto.mod

import typings.libp2pCrypto.anon.GenSharedKey
import typings.libp2pCrypto.libp2pCryptoStrings.Ed25519
import typings.libp2pCrypto.libp2pCryptoStrings.RSA
import typings.libp2pCrypto.libp2pCryptoStrings.secp256k1
import typings.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PrivateKey
import typings.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPrivateKey
import typings.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PrivateKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "keys")
@js.native
object keys extends js.Object {
  
  def generateEphemeralKeyPair(curve: String): js.Promise[GenSharedKey] = js.native
  def generateEphemeralKeyPair(curve: CurveType): js.Promise[GenSharedKey] = js.native
  
  def generateKeyPair(`type`: String, bits: Double): js.Promise[PrivateKey] = js.native
  def generateKeyPair(`type`: KeyType, bits: Double): js.Promise[PrivateKey] = js.native
  
  def generateKeyPairFromSeed(`type`: String, seed: Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
  def generateKeyPairFromSeed(`type`: KeyType, seed: Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
  @JSName("generateKeyPairFromSeed")
  def generateKeyPairFromSeed_Ed25519(`type`: Ed25519, seed: Uint8Array, bits: Double): js.Promise[Ed25519PrivateKey] = js.native
  
  @JSName("generateKeyPair")
  def generateKeyPair_Ed25519(`type`: Ed25519): js.Promise[Ed25519PrivateKey] = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_RSA(`type`: RSA, bits: Double): js.Promise[RsaPrivateKey] = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_secp256k1(`type`: secp256k1): js.Promise[Secp256k1PrivateKey] = js.native
  
  /**
    * Converts a PEM password protected private key into its representative object.
    * @param pem Password protected private key in PEM format.
    * @param password The password used to protect the key.
    */
  @JSName("_import")
  def `import`(pem: String, password: String): js.Promise[RsaPrivateKey] = js.native
  @JSName("_import")
  def `import`(pem: String, password: String, format: String): js.Promise[RsaPrivateKey] = js.native
  
  def keyStretcher(cipherType: String, hashType: String, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: String, secret: Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: HashType, secret: Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: String, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: String, secret: Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: HashType, secret: Uint8Array): js.Promise[StretchPair] = js.native
  
  val keysPBM: js.Any = js.native
  
  def marshalPrivateKey(key: PrivateKey): Uint8Array = js.native
  def marshalPrivateKey(key: PrivateKey, `type`: String): Uint8Array = js.native
  def marshalPrivateKey(key: PrivateKey, `type`: KeyType): Uint8Array = js.native
  
  def marshalPublicKey(key: PublicKey): Uint8Array = js.native
  def marshalPublicKey(key: PublicKey, `type`: String): Uint8Array = js.native
  def marshalPublicKey(key: PublicKey, `type`: KeyType): Uint8Array = js.native
  
  def unmarshalPrivateKey(buf: Uint8Array): js.Promise[PrivateKey] = js.native
  
  def unmarshalPublicKey(buf: Uint8Array): PublicKey = js.native
  
  @js.native
  object supportedKeys extends js.Object {
    
    @js.native
    object ed25519 extends js.Object {
      
      def generateKeyPair(): js.Promise[Ed25519PrivateKey] = js.native
      
      def generateKeyPairFromSeed(seed: Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
      
      def unmarshalEd25519PrivateKey(buf: Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
      
      def unmarshalEd25519PublicKey(buf: Uint8Array): Ed25519PublicKey = js.native
      
      @js.native
      class Ed25519PrivateKey protected () extends PrivateKey {
        def this(key: Uint8Array, publicKey: Uint8Array) = this()
        
        @JSName("public")
        val public_Ed25519PrivateKey: Ed25519PublicKey = js.native
      }
      
      @js.native
      class Ed25519PublicKey protected () extends PublicKey {
        def this(key: Uint8Array) = this()
        
        def encrypt(bytes: Uint8Array): Uint8Array = js.native
      }
    }
    
    @js.native
    object rsa extends js.Object {
      
      def fromJwk(jwk: Uint8Array): js.Promise[RsaPrivateKey] = js.native
      
      def generateKeyPair(bits: Double): js.Promise[RsaPrivateKey] = js.native
      
      def unmarshalRsaPrivateKey(buf: Uint8Array): js.Promise[RsaPrivateKey] = js.native
      
      def unmarshalRsaPublicKey(buf: Uint8Array): RsaPublicKey = js.native
      
      @js.native
      class RsaPrivateKey protected () extends PrivateKey {
        def this(key: js.Any, publicKey: Uint8Array) = this()
        
        def decrypt(bytes: Uint8Array): Uint8Array = js.native
        
        def genSecret(): Uint8Array = js.native
        
        @JSName("public")
        val public_RsaPrivateKey: RsaPublicKey = js.native
      }
      
      @js.native
      class RsaPublicKey protected () extends PublicKey {
        def this(key: Uint8Array) = this()
        
        def encrypt(bytes: Uint8Array): Uint8Array = js.native
      }
    }
    
    @js.native
    object secp256k1 extends js.Object {
      
      def generateKeyPair(): js.Promise[Secp256k1PrivateKey] = js.native
      
      def unmarshalSecp256k1PrivateKey(bytes: Uint8Array): js.Promise[Secp256k1PrivateKey] = js.native
      
      def unmarshalSecp256k1PublicKey(bytes: Uint8Array): Secp256k1PublicKey = js.native
      
      @js.native
      class Secp256k1PrivateKey protected () extends PrivateKey {
        def this(key: Uint8Array, publicKey: Uint8Array) = this()
        
        @JSName("public")
        val public_Secp256k1PrivateKey: Secp256k1PublicKey = js.native
      }
      
      @js.native
      class Secp256k1PublicKey protected () extends PublicKey {
        def this(key: Uint8Array) = this()
        
        def encrypt(bytes: Uint8Array): Uint8Array = js.native
      }
    }
  }
}
