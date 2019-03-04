package typings
package jsDashNaclLib.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nacl extends js.Object {
  def crypto_box(msg: Message, nonce: Nonce, rcpt: BoxPublicKey, sender: BoxSecretKey): CipherText
  // crypto_box
  def crypto_box_keypair(): BoxKeyPair
  def crypto_box_keypair_from_raw_sk(seed: stdLib.Uint8Array): BoxKeyPair
  def crypto_box_open(cipher: CipherText, nonce: Nonce, sender: BoxPublicKey, rcpt: BoxSecretKey): Message
  def crypto_box_open_precomputed(cipher: CipherText, nonce: Nonce, shared: BoxSharedSecret): Message
  def crypto_box_precompute(sender: BoxPublicKey, rcpt: BoxSecretKey): BoxSharedSecret
  def crypto_box_precomputed(msg: Message, nonce: Nonce, shared: BoxSharedSecret): CipherText
  def crypto_box_random_nonce(): Nonce
  def crypto_box_seed_keypair(seed: stdLib.Uint8Array): BoxKeyPair
  // hash
  def crypto_hash(raw: stdLib.Uint8Array): stdLib.Uint8Array
  def crypto_hash_sha256(raw: stdLib.Uint8Array): stdLib.Uint8Array
  def crypto_secretbox(msg: Message, nonce: Nonce, key: BoxSecretKey): CipherText
  def crypto_secretbox_open(cipher: CipherText, nonce: Nonce, key: BoxSecretKey): Message
  // crypto_secretbox
  def crypto_secretbox_random_nonce(): Nonce
  def crypto_sign(msg: Message, sk: SignerSecretKey): MessageWithSignature
  def crypto_sign_detached(msg: Message, sk: SignerSecretKey): Signature
  // crypto_sign
  def crypto_sign_keypair(): SignKeyPair
  def crypto_sign_open(packet: MessageWithSignature, pk: SignerPublicKey): Message | scala.Null
  // derived keys
  def crypto_sign_seed_keypair(seed: stdLib.Uint8Array): SignKeyPair
  def crypto_sign_verify_detached(sig: Signature, msg: Message, pk: SignerPublicKey): scala.Boolean
  def decode_latin1(arr: stdLib.Uint8Array): java.lang.String
  def decode_utf8(arr: stdLib.Uint8Array): java.lang.String
  def encode_latin1(latin1: java.lang.String): stdLib.Uint8Array
  def encode_utf8(utf8: java.lang.String): stdLib.Uint8Array
  def from_hex(hex: java.lang.String): stdLib.Uint8Array
  // strings vs. binary
  def to_hex(arr: stdLib.Uint8Array): java.lang.String
}

object Nacl {
  @scala.inline
  def apply(
    crypto_box: js.Function4[Message, Nonce, BoxPublicKey, BoxSecretKey, CipherText],
    crypto_box_keypair: js.Function0[BoxKeyPair],
    crypto_box_keypair_from_raw_sk: js.Function1[stdLib.Uint8Array, BoxKeyPair],
    crypto_box_open: js.Function4[CipherText, Nonce, BoxPublicKey, BoxSecretKey, Message],
    crypto_box_open_precomputed: js.Function3[CipherText, Nonce, BoxSharedSecret, Message],
    crypto_box_precompute: js.Function2[BoxPublicKey, BoxSecretKey, BoxSharedSecret],
    crypto_box_precomputed: js.Function3[Message, Nonce, BoxSharedSecret, CipherText],
    crypto_box_random_nonce: js.Function0[Nonce],
    crypto_box_seed_keypair: js.Function1[stdLib.Uint8Array, BoxKeyPair],
    crypto_hash: js.Function1[stdLib.Uint8Array, stdLib.Uint8Array],
    crypto_hash_sha256: js.Function1[stdLib.Uint8Array, stdLib.Uint8Array],
    crypto_secretbox: js.Function3[Message, Nonce, BoxSecretKey, CipherText],
    crypto_secretbox_open: js.Function3[CipherText, Nonce, BoxSecretKey, Message],
    crypto_secretbox_random_nonce: js.Function0[Nonce],
    crypto_sign: js.Function2[Message, SignerSecretKey, MessageWithSignature],
    crypto_sign_detached: js.Function2[Message, SignerSecretKey, Signature],
    crypto_sign_keypair: js.Function0[SignKeyPair],
    crypto_sign_open: js.Function2[MessageWithSignature, SignerPublicKey, Message | scala.Null],
    crypto_sign_seed_keypair: js.Function1[stdLib.Uint8Array, SignKeyPair],
    crypto_sign_verify_detached: js.Function3[Signature, Message, SignerPublicKey, scala.Boolean],
    decode_latin1: js.Function1[stdLib.Uint8Array, java.lang.String],
    decode_utf8: js.Function1[stdLib.Uint8Array, java.lang.String],
    encode_latin1: js.Function1[java.lang.String, stdLib.Uint8Array],
    encode_utf8: js.Function1[java.lang.String, stdLib.Uint8Array],
    from_hex: js.Function1[java.lang.String, stdLib.Uint8Array],
    to_hex: js.Function1[stdLib.Uint8Array, java.lang.String]
  ): Nacl = {
    val __obj = js.Dynamic.literal(crypto_box = crypto_box, crypto_box_keypair = crypto_box_keypair, crypto_box_keypair_from_raw_sk = crypto_box_keypair_from_raw_sk, crypto_box_open = crypto_box_open, crypto_box_open_precomputed = crypto_box_open_precomputed, crypto_box_precompute = crypto_box_precompute, crypto_box_precomputed = crypto_box_precomputed, crypto_box_random_nonce = crypto_box_random_nonce, crypto_box_seed_keypair = crypto_box_seed_keypair, crypto_hash = crypto_hash, crypto_hash_sha256 = crypto_hash_sha256, crypto_secretbox = crypto_secretbox, crypto_secretbox_open = crypto_secretbox_open, crypto_secretbox_random_nonce = crypto_secretbox_random_nonce, crypto_sign = crypto_sign, crypto_sign_detached = crypto_sign_detached, crypto_sign_keypair = crypto_sign_keypair, crypto_sign_open = crypto_sign_open, crypto_sign_seed_keypair = crypto_sign_seed_keypair, crypto_sign_verify_detached = crypto_sign_verify_detached, decode_latin1 = decode_latin1, decode_utf8 = decode_utf8, encode_latin1 = encode_latin1, encode_utf8 = encode_utf8, from_hex = from_hex, to_hex = to_hex)
  
    __obj.asInstanceOf[Nacl]
  }
}

