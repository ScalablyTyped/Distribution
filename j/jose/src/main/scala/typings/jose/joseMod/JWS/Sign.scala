package typings.jose.joseMod.JWS

import typings.jose.joseMod.JWK.Key
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.Sign")
@js.native
class Sign protected () extends js.Object {
  def this(payload: String) = this()
  def this(payload: js.Object) = this()
  def this(payload: Buffer) = this()
  def recipient(key: Key): Unit = js.native
  def recipient(key: Key, `protected`: js.Object): Unit = js.native
  def recipient(key: Key, `protected`: js.Object, header: js.Object): Unit = js.native
  @JSName("sign")
  def sign_compact(serialization: compact): String = js.native
  @JSName("sign")
  def sign_flattened(serialization: flattened): FlattenedJWS = js.native
  @JSName("sign")
  def sign_general(serialization: general): GeneralJWS = js.native
}

@JSImport("jose", "JWS.sign")
@js.native
object sign extends js.Object {
  def apply(payload: String, key: Key): String = js.native
  def apply(payload: String, key: Key, `protected`: js.Object): String = js.native
  def apply(payload: js.Object, key: Key): String = js.native
  def apply(payload: js.Object, key: Key, `protected`: js.Object): String = js.native
  def apply(payload: Buffer, key: Key): String = js.native
  def apply(payload: Buffer, key: Key, `protected`: js.Object): String = js.native
  def flattened(payload: String, key: Key): FlattenedJWS = js.native
  def flattened(payload: String, key: Key, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: String, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: Key): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: Key, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: Key): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: Key, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def general(payload: String, key: Key): GeneralJWS = js.native
  def general(payload: String, key: Key, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: String, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: Key): GeneralJWS = js.native
  def general(payload: js.Object, key: Key, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: Key): GeneralJWS = js.native
  def general(payload: Buffer, key: Key, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
}

