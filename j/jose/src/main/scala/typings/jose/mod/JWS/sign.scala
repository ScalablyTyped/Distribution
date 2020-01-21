package typings.jose.mod.JWS

import typings.jose.mod.ProduceKeyInput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.sign")
@js.native
object sign extends js.Object {
  def apply(payload: String, key: ProduceKeyInput): String = js.native
  def apply(payload: String, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInput): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def flattened(payload: String, key: ProduceKeyInput): FlattenedJWS = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInput): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def general(payload: String, key: ProduceKeyInput): GeneralJWS = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInput): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInput, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInput): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
}

