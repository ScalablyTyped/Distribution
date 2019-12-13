package typings.jose.joseMod.JWE

import typings.jose.joseMod.ProduceKeyInput
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.Encrypt")
@js.native
class Encrypt protected () extends js.Object {
  def this(cleartext: String) = this()
  def this(cleartext: Buffer) = this()
  def this(cleartext: String, `protected`: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, unprotected: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
  def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
  @JSName("encrypt")
  def encrypt_compact(serialization: compact): String = js.native
  @JSName("encrypt")
  def encrypt_flattened(serialization: flattened): FlattenedJWE = js.native
  @JSName("encrypt")
  def encrypt_general(serialization: general): GeneralJWE = js.native
  def recipient(key: ProduceKeyInput): Unit = js.native
  def recipient(key: ProduceKeyInput, header: js.Object): Unit = js.native
}

@JSImport("jose", "JWE.encrypt")
@js.native
object encrypt extends js.Object {
  def apply(payload: String, key: ProduceKeyInput): String = js.native
  def apply(payload: String, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def flattened(payload: String, key: ProduceKeyInput): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
  def general(payload: String, key: ProduceKeyInput): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
}

