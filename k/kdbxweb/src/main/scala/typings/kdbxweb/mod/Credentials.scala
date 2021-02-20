package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Credentials")
@js.native
class Credentials () extends StObject {
  def this(password: ProtectedValue) = this()
  def this(password: Null, keyFile: String) = this()
  def this(password: Null, keyFile: ArrayBuffer) = this()
  def this(password: Null, keyFile: Uint8Array) = this()
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
object Credentials {
  
  @JSImport("kdbxweb", "Credentials.createKeyFileWithHash")
  @js.native
  def createKeyFileWithHash(hash: String): Uint8Array = js.native
  
  @JSImport("kdbxweb", "Credentials.createRandomKeyFile")
  @js.native
  def createRandomKeyFile(): Uint8Array = js.native
}
