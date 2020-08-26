package typings.jose.mod.JWE

import typings.jose.mod.ProduceKeyInput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.encrypt")
@js.native
object encrypt extends js.Object {
  def apply(payload: String, key: ProduceKeyInput): String = js.native
  def apply(payload: String, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): String = js.native
  def flattened(payload: String, key: ProduceKeyInput): FlattenedJWE = js.native
  def flattened(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.UndefOr[scala.Nothing], header: js.Object): FlattenedJWE = js.native
  def flattened(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object,
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = js.native
  def flattened(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.Object,
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
  def flattened(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput): FlattenedJWE = js.native
  def flattened(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.UndefOr[scala.Nothing], header: js.Object): FlattenedJWE = js.native
  def flattened(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object,
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): FlattenedJWE = js.native
  def flattened(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.Object,
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
  def flattened(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
  def general(payload: String, key: ProduceKeyInput): GeneralJWE = js.native
  def general(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.UndefOr[scala.Nothing], header: js.Object): GeneralJWE = js.native
  def general(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object,
    aad: String
  ): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = js.native
  def general(
    payload: String,
    key: ProduceKeyInput,
    `protected`: js.Object,
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
  def general(payload: String, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput): GeneralJWE = js.native
  def general(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.UndefOr[scala.Nothing], header: js.Object): GeneralJWE = js.native
  def general(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object,
    aad: String
  ): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object): GeneralJWE = js.native
  def general(
    payload: Buffer,
    key: ProduceKeyInput,
    `protected`: js.Object,
    header: js.UndefOr[scala.Nothing],
    aad: String
  ): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
  def general(payload: Buffer, key: ProduceKeyInput, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
}

