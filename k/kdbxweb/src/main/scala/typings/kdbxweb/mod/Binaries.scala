package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Binaries")
@js.native
class Binaries () extends js.Object {
  
  def add(value: ProtectedValue): js.Promise[BinaryInforamtion] = js.native
  def add(value: ArrayBuffer): js.Promise[BinaryInforamtion] = js.native
  
  def assignIds(): Unit = js.native
  
  def getBinaryHash(binary: ProtectedValue): js.Promise[String] = js.native
  def getBinaryHash(binary: ArrayBuffer): js.Promise[String] = js.native
  def getBinaryHash(binary: Uint8Array): js.Promise[String] = js.native
  
  def hash(): js.Promise[js.Array[_]] = js.native
}
