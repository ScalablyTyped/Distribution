package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "KdbxUuid")
@js.native
class KdbxUuid protected () extends js.Object {
  def this(ab: java.lang.String) = this()
  def this(ab: stdLib.ArrayBuffer) = this()
  var empty: scala.Boolean = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  def equals(other: KdbxUuid): scala.Boolean = js.native
  def toBytes(): js.UndefOr[stdLib.Uint8Array] = js.native
}

@JSImport("kdbxweb", "KdbxUuid")
@js.native
object KdbxUuid extends js.Object {
  def random(): kdbxwebLib.kdbxwebMod.KdbxUuid = js.native
}

