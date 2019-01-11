package typings
package keysymLib.keysymMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keysym", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val records: js.Array[keysymLib.keysymMod.Record] = js.native
  def fromKeysym(keysym: scala.Double): js.UndefOr[keysymLib.keysymMod.Record] = js.native
  def fromName(name: java.lang.String): js.UndefOr[keysymLib.keysymMod.Record] = js.native
  def fromUnicode(code: java.lang.String): js.Array[keysymLib.keysymMod.Record] = js.native
  def fromUnicode(code: scala.Double): js.Array[keysymLib.keysymMod.Record] = js.native
}

