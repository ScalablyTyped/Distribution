package typings.jsNacl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-nacl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instantiate(cb: NaclCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def instantiate(cb: NaclCallback, opts: NaclOpts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(cb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BoxKeyPair extends StObject {
    
    var boxPk: js.typedarray.Uint8Array
    
    var boxSk: js.typedarray.Uint8Array
  }
  object BoxKeyPair {
    
    inline def apply(boxPk: js.typedarray.Uint8Array, boxSk: js.typedarray.Uint8Array): BoxKeyPair = {
      val __obj = js.Dynamic.literal(boxPk = boxPk.asInstanceOf[js.Any], boxSk = boxSk.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxKeyPair]
    }
    
    extension [Self <: BoxKeyPair](x: Self) {
      
      inline def setBoxPk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "boxPk", value.asInstanceOf[js.Any])
      
      inline def setBoxSk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "boxSk", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxPublicKey = js.typedarray.Uint8Array
  
  type BoxSecretKey = js.typedarray.Uint8Array
  
  trait BoxSharedSecret extends StObject {
    
    var boxK: js.typedarray.Uint8Array
  }
  object BoxSharedSecret {
    
    inline def apply(boxK: js.typedarray.Uint8Array): BoxSharedSecret = {
      val __obj = js.Dynamic.literal(boxK = boxK.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxSharedSecret]
    }
    
    extension [Self <: BoxSharedSecret](x: Self) {
      
      inline def setBoxK(value: js.typedarray.Uint8Array): Self = StObject.set(x, "boxK", value.asInstanceOf[js.Any])
    }
  }
  
  type CipherText = js.typedarray.Uint8Array
  
  type Message = js.typedarray.Uint8Array
  
  type MessageWithSignature = js.typedarray.Uint8Array
  
  trait Nacl extends StObject {
    
    def crypto_box(
      msg: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      rcpt: js.typedarray.Uint8Array,
      sender: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array
    
    // crypto_box
    def crypto_box_keypair(): BoxKeyPair
    
    def crypto_box_keypair_from_raw_sk(seed: js.typedarray.Uint8Array): BoxKeyPair
    
    def crypto_box_open(
      cipher: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      sender: js.typedarray.Uint8Array,
      rcpt: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array
    
    def crypto_box_open_precomputed(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array
    
    def crypto_box_precompute(sender: js.typedarray.Uint8Array, rcpt: js.typedarray.Uint8Array): BoxSharedSecret
    
    def crypto_box_precomputed(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array
    
    def crypto_box_random_nonce(): js.typedarray.Uint8Array
    
    def crypto_box_seed_keypair(seed: js.typedarray.Uint8Array): BoxKeyPair
    
    // hash
    def crypto_hash(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def crypto_hash_sha256(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def crypto_secretbox(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def crypto_secretbox_open(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    // crypto_secretbox
    def crypto_secretbox_random_nonce(): js.typedarray.Uint8Array
    
    def crypto_sign(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def crypto_sign_detached(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    // crypto_sign
    def crypto_sign_keypair(): SignKeyPair
    
    def crypto_sign_open(packet: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null
    
    // derived keys
    def crypto_sign_seed_keypair(seed: js.typedarray.Uint8Array): SignKeyPair
    
    def crypto_sign_verify_detached(sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): Boolean
    
    def decode_latin1(arr: js.typedarray.Uint8Array): String
    
    def decode_utf8(arr: js.typedarray.Uint8Array): String
    
    def encode_latin1(latin1: String): js.typedarray.Uint8Array
    
    def encode_utf8(utf8: String): js.typedarray.Uint8Array
    
    def from_hex(hex: String): js.typedarray.Uint8Array
    
    // random
    def random_bytes(length: Double): js.typedarray.Uint8Array
    
    // strings vs. binary
    def to_hex(arr: js.typedarray.Uint8Array): String
  }
  object Nacl {
    
    inline def apply(
      crypto_box: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_box_keypair: () => BoxKeyPair,
      crypto_box_keypair_from_raw_sk: js.typedarray.Uint8Array => BoxKeyPair,
      crypto_box_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_box_open_precomputed: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array,
      crypto_box_precompute: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => BoxSharedSecret,
      crypto_box_precomputed: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array,
      crypto_box_random_nonce: () => js.typedarray.Uint8Array,
      crypto_box_seed_keypair: js.typedarray.Uint8Array => BoxKeyPair,
      crypto_hash: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      crypto_hash_sha256: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      crypto_secretbox: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_secretbox_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_secretbox_random_nonce: () => js.typedarray.Uint8Array,
      crypto_sign: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_sign_detached: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      crypto_sign_keypair: () => SignKeyPair,
      crypto_sign_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null,
      crypto_sign_seed_keypair: js.typedarray.Uint8Array => SignKeyPair,
      crypto_sign_verify_detached: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean,
      decode_latin1: js.typedarray.Uint8Array => String,
      decode_utf8: js.typedarray.Uint8Array => String,
      encode_latin1: String => js.typedarray.Uint8Array,
      encode_utf8: String => js.typedarray.Uint8Array,
      from_hex: String => js.typedarray.Uint8Array,
      random_bytes: Double => js.typedarray.Uint8Array,
      to_hex: js.typedarray.Uint8Array => String
    ): Nacl = {
      val __obj = js.Dynamic.literal(crypto_box = js.Any.fromFunction4(crypto_box), crypto_box_keypair = js.Any.fromFunction0(crypto_box_keypair), crypto_box_keypair_from_raw_sk = js.Any.fromFunction1(crypto_box_keypair_from_raw_sk), crypto_box_open = js.Any.fromFunction4(crypto_box_open), crypto_box_open_precomputed = js.Any.fromFunction3(crypto_box_open_precomputed), crypto_box_precompute = js.Any.fromFunction2(crypto_box_precompute), crypto_box_precomputed = js.Any.fromFunction3(crypto_box_precomputed), crypto_box_random_nonce = js.Any.fromFunction0(crypto_box_random_nonce), crypto_box_seed_keypair = js.Any.fromFunction1(crypto_box_seed_keypair), crypto_hash = js.Any.fromFunction1(crypto_hash), crypto_hash_sha256 = js.Any.fromFunction1(crypto_hash_sha256), crypto_secretbox = js.Any.fromFunction3(crypto_secretbox), crypto_secretbox_open = js.Any.fromFunction3(crypto_secretbox_open), crypto_secretbox_random_nonce = js.Any.fromFunction0(crypto_secretbox_random_nonce), crypto_sign = js.Any.fromFunction2(crypto_sign), crypto_sign_detached = js.Any.fromFunction2(crypto_sign_detached), crypto_sign_keypair = js.Any.fromFunction0(crypto_sign_keypair), crypto_sign_open = js.Any.fromFunction2(crypto_sign_open), crypto_sign_seed_keypair = js.Any.fromFunction1(crypto_sign_seed_keypair), crypto_sign_verify_detached = js.Any.fromFunction3(crypto_sign_verify_detached), decode_latin1 = js.Any.fromFunction1(decode_latin1), decode_utf8 = js.Any.fromFunction1(decode_utf8), encode_latin1 = js.Any.fromFunction1(encode_latin1), encode_utf8 = js.Any.fromFunction1(encode_utf8), from_hex = js.Any.fromFunction1(from_hex), random_bytes = js.Any.fromFunction1(random_bytes), to_hex = js.Any.fromFunction1(to_hex))
      __obj.asInstanceOf[Nacl]
    }
    
    extension [Self <: Nacl](x: Self) {
      
      inline def setCrypto_box(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_box", js.Any.fromFunction4(value))
      
      inline def setCrypto_box_keypair(value: () => BoxKeyPair): Self = StObject.set(x, "crypto_box_keypair", js.Any.fromFunction0(value))
      
      inline def setCrypto_box_keypair_from_raw_sk(value: js.typedarray.Uint8Array => BoxKeyPair): Self = StObject.set(x, "crypto_box_keypair_from_raw_sk", js.Any.fromFunction1(value))
      
      inline def setCrypto_box_open(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_box_open", js.Any.fromFunction4(value))
      
      inline def setCrypto_box_open_precomputed(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_box_open_precomputed", js.Any.fromFunction3(value))
      
      inline def setCrypto_box_precompute(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => BoxSharedSecret): Self = StObject.set(x, "crypto_box_precompute", js.Any.fromFunction2(value))
      
      inline def setCrypto_box_precomputed(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_box_precomputed", js.Any.fromFunction3(value))
      
      inline def setCrypto_box_random_nonce(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_box_random_nonce", js.Any.fromFunction0(value))
      
      inline def setCrypto_box_seed_keypair(value: js.typedarray.Uint8Array => BoxKeyPair): Self = StObject.set(x, "crypto_box_seed_keypair", js.Any.fromFunction1(value))
      
      inline def setCrypto_hash(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_hash", js.Any.fromFunction1(value))
      
      inline def setCrypto_hash_sha256(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_hash_sha256", js.Any.fromFunction1(value))
      
      inline def setCrypto_secretbox(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_secretbox", js.Any.fromFunction3(value))
      
      inline def setCrypto_secretbox_open(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "crypto_secretbox_open", js.Any.fromFunction3(value))
      
      inline def setCrypto_secretbox_random_nonce(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_secretbox_random_nonce", js.Any.fromFunction0(value))
      
      inline def setCrypto_sign(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_sign", js.Any.fromFunction2(value))
      
      inline def setCrypto_sign_detached(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "crypto_sign_detached", js.Any.fromFunction2(value))
      
      inline def setCrypto_sign_keypair(value: () => SignKeyPair): Self = StObject.set(x, "crypto_sign_keypair", js.Any.fromFunction0(value))
      
      inline def setCrypto_sign_open(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null): Self = StObject.set(x, "crypto_sign_open", js.Any.fromFunction2(value))
      
      inline def setCrypto_sign_seed_keypair(value: js.typedarray.Uint8Array => SignKeyPair): Self = StObject.set(x, "crypto_sign_seed_keypair", js.Any.fromFunction1(value))
      
      inline def setCrypto_sign_verify_detached(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean): Self = StObject.set(x, "crypto_sign_verify_detached", js.Any.fromFunction3(value))
      
      inline def setDecode_latin1(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "decode_latin1", js.Any.fromFunction1(value))
      
      inline def setDecode_utf8(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "decode_utf8", js.Any.fromFunction1(value))
      
      inline def setEncode_latin1(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "encode_latin1", js.Any.fromFunction1(value))
      
      inline def setEncode_utf8(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "encode_utf8", js.Any.fromFunction1(value))
      
      inline def setFrom_hex(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "from_hex", js.Any.fromFunction1(value))
      
      inline def setRandom_bytes(value: Double => js.typedarray.Uint8Array): Self = StObject.set(x, "random_bytes", js.Any.fromFunction1(value))
      
      inline def setTo_hex(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "to_hex", js.Any.fromFunction1(value))
    }
  }
  
  type NaclCallback = js.Function1[/* nacl */ Nacl, Unit]
  
  type NaclOpts = StringDictionary[Any]
  
  type Nonce = js.typedarray.Uint8Array
  
  trait SignKeyPair extends StObject {
    
    var signPk: js.typedarray.Uint8Array
    
    var signSk: js.typedarray.Uint8Array
  }
  object SignKeyPair {
    
    inline def apply(signPk: js.typedarray.Uint8Array, signSk: js.typedarray.Uint8Array): SignKeyPair = {
      val __obj = js.Dynamic.literal(signPk = signPk.asInstanceOf[js.Any], signSk = signSk.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignKeyPair]
    }
    
    extension [Self <: SignKeyPair](x: Self) {
      
      inline def setSignPk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signPk", value.asInstanceOf[js.Any])
      
      inline def setSignSk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signSk", value.asInstanceOf[js.Any])
    }
  }
  
  type Signature = js.typedarray.Uint8Array
  
  type SignerPublicKey = js.typedarray.Uint8Array
  
  type SignerSecretKey = js.typedarray.Uint8Array
  
  type Stream = js.typedarray.Uint8Array
  
  type StreamKey = js.typedarray.Uint8Array
}
