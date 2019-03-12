package typings
package keysymLib.keysymMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keysym", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val records: js.Array[Record] = js.native
  def fromKeysym(keysym: scala.Double): js.UndefOr[Record] = js.native
  def fromName(name: java.lang.String): js.UndefOr[Record] = js.native
  def fromUnicode(code: java.lang.String): js.Array[Record] = js.native
  def fromUnicode(code: scala.Double): js.Array[Record] = js.native
}

