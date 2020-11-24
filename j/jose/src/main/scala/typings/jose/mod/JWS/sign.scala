package typings.jose.mod.JWS

import typings.jose.mod.ProduceKeyInputWithNone
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.sign")
@js.native
object sign extends js.Object {
  
  def apply(payload: String, key: ProduceKeyInputWithNone): String = js.native
  def apply(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInputWithNone): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInputWithNone): String = js.native
  def apply(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): String = js.native
  
  def flattened(payload: String, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
  def flattened(
    payload: String,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): FlattenedJWS = js.native
  def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
  def flattened(
    payload: js.Object,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInputWithNone): FlattenedJWS = js.native
  def flattened(
    payload: Buffer,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): FlattenedJWS = js.native
  def flattened(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
  
  def general(payload: String, key: ProduceKeyInputWithNone): GeneralJWS = js.native
  def general(
    payload: String,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): GeneralJWS = js.native
  def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: String, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInputWithNone): GeneralJWS = js.native
  def general(
    payload: js.Object,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: js.Object, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInputWithNone): GeneralJWS = js.native
  def general(
    payload: Buffer,
    key: ProduceKeyInputWithNone,
    `protected`: js.UndefOr[scala.Nothing],
    header: js.Object
  ): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object): GeneralJWS = js.native
  def general(payload: Buffer, key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
}
