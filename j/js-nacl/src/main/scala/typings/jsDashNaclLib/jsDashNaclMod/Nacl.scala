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

