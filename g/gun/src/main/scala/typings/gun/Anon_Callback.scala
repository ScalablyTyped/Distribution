package typings.gun

import typings.gun.gunMod.Gun.CryptoKeyPair
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /** Last known error */
  var err: js.UndefOr[Error] = js.native
  /** If you want SEA to throw while in development, turn SEA.throw = true on, but please do not use this in production. */
  var `throw`: js.UndefOr[Boolean] = js.native
  def decrypt(message: js.Any, pair: String): js.Promise[_] = js.native
  /**
    * Read the secret data, if and only if you are allowed to.
    * @param message is what comes from .encrypt.
    * @param pair from .pair or the passphrase to decypher the message.
    */
  def decrypt(message: js.Any, pair: CryptoKeyPair): js.Promise[_] = js.native
  def encrypt(data: js.Any, pair: String): js.Promise[String] = js.native
  /**
    * Takes some data that you want to keep secret and encrypts it so nobody else can read it.
    * @param data is the content that you want to encrypt.
    * @param pair from .pair or a passphrase you want to use as a cypher to encrypt with.
    */
  def encrypt(data: js.Any, pair: CryptoKeyPair): js.Promise[String] = js.native
  /**
    * This generates a cryptographically secure public/private key pair - be careful not to leak the private keys!
    * Note: API subject to change we may change the parameters to accept data and work, in addition to generation.
    * You will need this for most of SEA's API, see those method's examples.
    * The default cryptographic primitives for the asymmetric keys are ECDSA for signing and ECDH for encryption.
    */
  def pair(cb: js.Function1[/* data */ CryptoKeyPair, Unit]): js.Promise[js.UndefOr[CryptoKeyPair]] = js.native
  def pair(cb: js.Function1[/* data */ CryptoKeyPair, Unit], opt: js.Object): js.Promise[js.UndefOr[CryptoKeyPair]] = js.native
  /**
    * Adds a signature to a message, for data that you want to prevent attackers tampering with.
    * @param data is the content that you want to prove is authorized.
    * @param pair is from .pair.
    */
  def sign(data: js.Any, pair: CryptoKeyPair): js.Promise[js.UndefOr[String]] = js.native
  def verify(message: js.Any, pair: String): js.Promise[_] = js.native
  /**
    * Gets the data if and only if the message can be verified as coming from the person you expect.
    * @param message is what comes from .sign.
    * @param pair from .pair or its public key text (pair.pub).
    */
  def verify(message: js.Any, pair: CryptoKeyPair): js.Promise[_] = js.native
  /**
    * This gives you a Proof of Work (POW) / Hashing of Data
    * @param data The data to be hashed, work to be performed on.
    * @param pair (salt) You can pass pair of keys to use as salt. Salt will prevent others to pre-compute the work,
    *  so using your public key is not a good idea. If it is not specified, it will be random,
    *  which ruins your chance of ever being able to re-derive the work deterministically
    * @param callback function to executed upon execution of proof
    * @param opt default: {name: 'PBKDF2', encode: 'base64'}
    */
  def work(data: js.Any): js.Promise[js.UndefOr[String]] = js.native
  def work(data: js.Any, pair: js.Any): js.Promise[js.UndefOr[String]] = js.native
  def work(data: js.Any, pair: js.Any, callback: js.Function1[/* data */ js.UndefOr[String], Unit]): js.Promise[js.UndefOr[String]] = js.native
  def work(
    data: js.Any,
    pair: js.Any,
    callback: js.Function1[/* data */ js.UndefOr[String], Unit],
    opt: Partial[Anon_Base16]
  ): js.Promise[js.UndefOr[String]] = js.native
}

