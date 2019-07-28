package typings.keysym.keysymMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keysym", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val records: js.Array[Record] = js.native
  def fromKeysym(keysym: Double): js.UndefOr[Record] = js.native
  def fromName(name: String): js.UndefOr[Record] = js.native
  def fromUnicode(code: String): js.Array[Record] = js.native
  def fromUnicode(code: Double): js.Array[Record] = js.native
}

