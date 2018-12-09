package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Credentials")
@js.native
class Credentials protected () extends js.Object {
  def this(password: ProtectedValue, keyFile: java.lang.String) = this()
  def this(password: ProtectedValue, keyFile: stdLib.ArrayBuffer) = this()
  def this(password: ProtectedValue, keyFile: stdLib.Uint8Array) = this()
  def getHash(): js.Promise[stdLib.ArrayBuffer] = js.native
  def setKeyFile(): js.Promise[scala.Unit] = js.native
  def setKeyFile(keyFile: stdLib.ArrayBuffer): js.Promise[scala.Unit] = js.native
  def setKeyFile(keyFile: stdLib.Uint8Array): js.Promise[scala.Unit] = js.native
  def setPassword(): js.Promise[scala.Unit] = js.native
  def setPassword(password: ProtectedValue): js.Promise[scala.Unit] = js.native
}

@JSImport("kdbxweb", "Credentials")
@js.native
object Credentials extends js.Object {
  def createKeyFileWithHash(hash: java.lang.String): stdLib.Uint8Array = js.native
  def createRandomKeyFile(): stdLib.Uint8Array = js.native
}

