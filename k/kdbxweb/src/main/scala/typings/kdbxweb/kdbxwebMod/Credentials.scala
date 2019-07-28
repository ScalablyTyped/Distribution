package typings.kdbxweb.kdbxwebMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Credentials")
@js.native
class Credentials protected () extends js.Object {
  def this(password: ProtectedValue, keyFile: String) = this()
  def this(password: ProtectedValue, keyFile: ArrayBuffer) = this()
  def this(password: ProtectedValue, keyFile: Uint8Array) = this()
  def getHash(): js.Promise[ArrayBuffer] = js.native
  def setKeyFile(): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: ArrayBuffer): js.Promise[Unit] = js.native
  def setKeyFile(keyFile: Uint8Array): js.Promise[Unit] = js.native
  def setPassword(): js.Promise[Unit] = js.native
  def setPassword(password: ProtectedValue): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("kdbxweb", "Credentials")
@js.native
object Credentials extends js.Object {
  def createKeyFileWithHash(hash: String): Uint8Array = js.native
  def createRandomKeyFile(): Uint8Array = js.native
}

