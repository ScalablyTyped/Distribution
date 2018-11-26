package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ProtectedValue")
@js.native
class ProtectedValue protected () extends js.Object {
  def this(value: stdLib.ArrayBuffer, salt: stdLib.ArrayBuffer) = this()
  def getBinary(): stdLib.Uint8Array = js.native
  def getHash(): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def getText(): java.lang.String = js.native
  def includes(str: java.lang.String): scala.Boolean = js.native
  def setSalt(newSalt: stdLib.ArrayBuffer): scala.Unit = js.native
}

@JSImport("kdbxweb", "ProtectedValue")
@js.native
object ProtectedValue extends js.Object {
  def fromBinary(binary: stdLib.ArrayBuffer): kdbxwebLib.kdbxwebMod.ProtectedValue = js.native
  def fromString(str: java.lang.String): kdbxwebLib.kdbxwebMod.ProtectedValue = js.native
}

