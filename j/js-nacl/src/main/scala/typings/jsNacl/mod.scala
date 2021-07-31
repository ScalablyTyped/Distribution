package typings.jsNacl

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-nacl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def instantiate(cb: NaclCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def instantiate(cb: NaclCallback, opts: NaclOpts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(cb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BoxKeyPair extends StObject {
    
    var boxPk: BoxPublicKey
    
    var boxSk: BoxSecretKey
  }
  object BoxKeyPair {
    
    @scala.inline
    def apply(boxPk: BoxPublicKey, boxSk: BoxSecretKey): BoxKeyPair = {
      val __obj = js.Dynamic.literal(boxPk = boxPk.asInstanceOf[js.Any], boxSk = boxSk.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxKeyPair]
    }
    
    @scala.inline
    implicit class BoxKeyPairMutableBuilder[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxPk(value: BoxPublicKey): Self = StObject.set(x, "boxPk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSk(value: BoxSecretKey): Self = StObject.set(x, "boxSk", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxPublicKey = Uint8Array
  
  type BoxSecretKey = Uint8Array
  
  trait BoxSharedSecret extends StObject {
    
    var boxK: Uint8Array
  }
  object BoxSharedSecret {
    
    @scala.inline
    def apply(boxK: Uint8Array): BoxSharedSecret = {
      val __obj = js.Dynamic.literal(boxK = boxK.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxSharedSecret]
    }
    
    @scala.inline
    implicit class BoxSharedSecretMutableBuilder[Self <: BoxSharedSecret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxK(value: Uint8Array): Self = StObject.set(x, "boxK", value.asInstanceOf[js.Any])
    }
  }
  
  type CipherText = Uint8Array
  
  type Message = Uint8Array
  
  type MessageWithSignature = Uint8Array
  
  trait Nacl extends StObject {
    
    def crypto_box(msg: Message, nonce: Nonce, rcpt: BoxPublicKey, sender: BoxSecretKey): CipherText
    
    // crypto_box
    def crypto_box_keypair(): BoxKeyPair
    
    def crypto_box_keypair_from_raw_sk(seed: Uint8Array): BoxKeyPair
    
    def crypto_box_open(cipher: CipherText, nonce: Nonce, sender: BoxPublicKey, rcpt: BoxSecretKey): Message
    
    def crypto_box_open_precomputed(cipher: CipherText, nonce: Nonce, shared: BoxSharedSecret): Message
    
    def crypto_box_precompute(sender: BoxPublicKey, rcpt: BoxSecretKey): BoxSharedSecret
    
    def crypto_box_precomputed(msg: Message, nonce: Nonce, shared: BoxSharedSecret): CipherText
    
    def crypto_box_random_nonce(): Nonce
    
    def crypto_box_seed_keypair(seed: Uint8Array): BoxKeyPair
    
    // hash
    def crypto_hash(raw: Uint8Array): Uint8Array
    
    def crypto_hash_sha256(raw: Uint8Array): Uint8Array
    
    def crypto_secretbox(msg: Message, nonce: Nonce, key: BoxSecretKey): CipherText
    
    def crypto_secretbox_open(cipher: CipherText, nonce: Nonce, key: BoxSecretKey): Message
    
    // crypto_secretbox
    def crypto_secretbox_random_nonce(): Nonce
    
    def crypto_sign(msg: Message, sk: SignerSecretKey): MessageWithSignature
    
    def crypto_sign_detached(msg: Message, sk: SignerSecretKey): Signature
    
    // crypto_sign
    def crypto_sign_keypair(): SignKeyPair
    
    def crypto_sign_open(packet: MessageWithSignature, pk: SignerPublicKey): Message | Null
    
    // derived keys
    def crypto_sign_seed_keypair(seed: Uint8Array): SignKeyPair
    
    def crypto_sign_verify_detached(sig: Signature, msg: Message, pk: SignerPublicKey): Boolean
    
    def decode_latin1(arr: Uint8Array): String
    
    def decode_utf8(arr: Uint8Array): String
    
    def encode_latin1(latin1: String): Uint8Array
    
    def encode_utf8(utf8: String): Uint8Array
    
    def from_hex(hex: String): Uint8Array
    
    // random
    def random_bytes(length: Double): Uint8Array
    
    // strings vs. binary
    def to_hex(arr: Uint8Array): String
  }
  object Nacl {
    
    @scala.inline
    def apply(
      crypto_box: (Message, Nonce, BoxPublicKey, BoxSecretKey) => CipherText,
      crypto_box_keypair: () => BoxKeyPair,
      crypto_box_keypair_from_raw_sk: Uint8Array => BoxKeyPair,
      crypto_box_open: (CipherText, Nonce, BoxPublicKey, BoxSecretKey) => Message,
      crypto_box_open_precomputed: (CipherText, Nonce, BoxSharedSecret) => Message,
      crypto_box_precompute: (BoxPublicKey, BoxSecretKey) => BoxSharedSecret,
      crypto_box_precomputed: (Message, Nonce, BoxSharedSecret) => CipherText,
      crypto_box_random_nonce: () => Nonce,
      crypto_box_seed_keypair: Uint8Array => BoxKeyPair,
      crypto_hash: Uint8Array => Uint8Array,
      crypto_hash_sha256: Uint8Array => Uint8Array,
      crypto_secretbox: (Message, Nonce, BoxSecretKey) => CipherText,
      crypto_secretbox_open: (CipherText, Nonce, BoxSecretKey) => Message,
      crypto_secretbox_random_nonce: () => Nonce,
      crypto_sign: (Message, SignerSecretKey) => MessageWithSignature,
      crypto_sign_detached: (Message, SignerSecretKey) => Signature,
      crypto_sign_keypair: () => SignKeyPair,
      crypto_sign_open: (MessageWithSignature, SignerPublicKey) => Message | Null,
      crypto_sign_seed_keypair: Uint8Array => SignKeyPair,
      crypto_sign_verify_detached: (Signature, Message, SignerPublicKey) => Boolean,
      decode_latin1: Uint8Array => String,
      decode_utf8: Uint8Array => String,
      encode_latin1: String => Uint8Array,
      encode_utf8: String => Uint8Array,
      from_hex: String => Uint8Array,
      random_bytes: Double => Uint8Array,
      to_hex: Uint8Array => String
    ): Nacl = {
      val __obj = js.Dynamic.literal(crypto_box = js.Any.fromFunction4(crypto_box), crypto_box_keypair = js.Any.fromFunction0(crypto_box_keypair), crypto_box_keypair_from_raw_sk = js.Any.fromFunction1(crypto_box_keypair_from_raw_sk), crypto_box_open = js.Any.fromFunction4(crypto_box_open), crypto_box_open_precomputed = js.Any.fromFunction3(crypto_box_open_precomputed), crypto_box_precompute = js.Any.fromFunction2(crypto_box_precompute), crypto_box_precomputed = js.Any.fromFunction3(crypto_box_precomputed), crypto_box_random_nonce = js.Any.fromFunction0(crypto_box_random_nonce), crypto_box_seed_keypair = js.Any.fromFunction1(crypto_box_seed_keypair), crypto_hash = js.Any.fromFunction1(crypto_hash), crypto_hash_sha256 = js.Any.fromFunction1(crypto_hash_sha256), crypto_secretbox = js.Any.fromFunction3(crypto_secretbox), crypto_secretbox_open = js.Any.fromFunction3(crypto_secretbox_open), crypto_secretbox_random_nonce = js.Any.fromFunction0(crypto_secretbox_random_nonce), crypto_sign = js.Any.fromFunction2(crypto_sign), crypto_sign_detached = js.Any.fromFunction2(crypto_sign_detached), crypto_sign_keypair = js.Any.fromFunction0(crypto_sign_keypair), crypto_sign_open = js.Any.fromFunction2(crypto_sign_open), crypto_sign_seed_keypair = js.Any.fromFunction1(crypto_sign_seed_keypair), crypto_sign_verify_detached = js.Any.fromFunction3(crypto_sign_verify_detached), decode_latin1 = js.Any.fromFunction1(decode_latin1), decode_utf8 = js.Any.fromFunction1(decode_utf8), encode_latin1 = js.Any.fromFunction1(encode_latin1), encode_utf8 = js.Any.fromFunction1(encode_utf8), from_hex = js.Any.fromFunction1(from_hex), random_bytes = js.Any.fromFunction1(random_bytes), to_hex = js.Any.fromFunction1(to_hex))
      __obj.asInstanceOf[Nacl]
    }
    
    @scala.inline
    implicit class NaclMutableBuilder[Self <: Nacl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrypto_box(value: (Message, Nonce, BoxPublicKey, BoxSecretKey) => CipherText): Self = StObject.set(x, "crypto_box", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCrypto_box_keypair(value: () => BoxKeyPair): Self = StObject.set(x, "crypto_box_keypair", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCrypto_box_keypair_from_raw_sk(value: Uint8Array => BoxKeyPair): Self = StObject.set(x, "crypto_box_keypair_from_raw_sk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCrypto_box_open(value: (CipherText, Nonce, BoxPublicKey, BoxSecretKey) => Message): Self = StObject.set(x, "crypto_box_open", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCrypto_box_open_precomputed(value: (CipherText, Nonce, BoxSharedSecret) => Message): Self = StObject.set(x, "crypto_box_open_precomputed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCrypto_box_precompute(value: (BoxPublicKey, BoxSecretKey) => BoxSharedSecret): Self = StObject.set(x, "crypto_box_precompute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCrypto_box_precomputed(value: (Message, Nonce, BoxSharedSecret) => CipherText): Self = StObject.set(x, "crypto_box_precomputed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCrypto_box_random_nonce(value: () => Nonce): Self = StObject.set(x, "crypto_box_random_nonce", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCrypto_box_seed_keypair(value: Uint8Array => BoxKeyPair): Self = StObject.set(x, "crypto_box_seed_keypair", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCrypto_hash(value: Uint8Array => Uint8Array): Self = StObject.set(x, "crypto_hash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCrypto_hash_sha256(value: Uint8Array => Uint8Array): Self = StObject.set(x, "crypto_hash_sha256", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCrypto_secretbox(value: (Message, Nonce, BoxSecretKey) => CipherText): Self = StObject.set(x, "crypto_secretbox", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCrypto_secretbox_open(value: (CipherText, Nonce, BoxSecretKey) => Message): Self = StObject.set(x, "crypto_secretbox_open", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCrypto_secretbox_random_nonce(value: () => Nonce): Self = StObject.set(x, "crypto_secretbox_random_nonce", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCrypto_sign(value: (Message, SignerSecretKey) => MessageWithSignature): Self = StObject.set(x, "crypto_sign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCrypto_sign_detached(value: (Message, SignerSecretKey) => Signature): Self = StObject.set(x, "crypto_sign_detached", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCrypto_sign_keypair(value: () => SignKeyPair): Self = StObject.set(x, "crypto_sign_keypair", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCrypto_sign_open(value: (MessageWithSignature, SignerPublicKey) => Message | Null): Self = StObject.set(x, "crypto_sign_open", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCrypto_sign_seed_keypair(value: Uint8Array => SignKeyPair): Self = StObject.set(x, "crypto_sign_seed_keypair", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCrypto_sign_verify_detached(value: (Signature, Message, SignerPublicKey) => Boolean): Self = StObject.set(x, "crypto_sign_verify_detached", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDecode_latin1(value: Uint8Array => String): Self = StObject.set(x, "decode_latin1", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecode_utf8(value: Uint8Array => String): Self = StObject.set(x, "decode_utf8", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode_latin1(value: String => Uint8Array): Self = StObject.set(x, "encode_latin1", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode_utf8(value: String => Uint8Array): Self = StObject.set(x, "encode_utf8", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFrom_hex(value: String => Uint8Array): Self = StObject.set(x, "from_hex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRandom_bytes(value: Double => Uint8Array): Self = StObject.set(x, "random_bytes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTo_hex(value: Uint8Array => String): Self = StObject.set(x, "to_hex", js.Any.fromFunction1(value))
    }
  }
  
  type NaclCallback = js.Function1[/* nacl */ Nacl, Unit]
  
  type NaclOpts = StringDictionary[js.Any]
  
  type Nonce = Uint8Array
  
  trait SignKeyPair extends StObject {
    
    var signPk: SignerPublicKey
    
    var signSk: SignerSecretKey
  }
  object SignKeyPair {
    
    @scala.inline
    def apply(signPk: SignerPublicKey, signSk: SignerSecretKey): SignKeyPair = {
      val __obj = js.Dynamic.literal(signPk = signPk.asInstanceOf[js.Any], signSk = signSk.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignKeyPair]
    }
    
    @scala.inline
    implicit class SignKeyPairMutableBuilder[Self <: SignKeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignPk(value: SignerPublicKey): Self = StObject.set(x, "signPk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignSk(value: SignerSecretKey): Self = StObject.set(x, "signSk", value.asInstanceOf[js.Any])
    }
  }
  
  type Signature = Uint8Array
  
  type SignerPublicKey = Uint8Array
  
  type SignerSecretKey = Uint8Array
  
  type Stream = Uint8Array
  
  type StreamKey = Uint8Array
}
