package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Binaries")
@js.native
class Binaries () extends js.Object {
  def add(value: ProtectedValue): js.Promise[BinaryInforamtion] = js.native
  def add(value: stdLib.ArrayBuffer): js.Promise[BinaryInforamtion] = js.native
  def assignIds(): scala.Unit = js.native
  def getBinaryHash(binary: ProtectedValue): js.Promise[java.lang.String] = js.native
  def getBinaryHash(binary: stdLib.ArrayBuffer): js.Promise[java.lang.String] = js.native
  def getBinaryHash(binary: stdLib.Uint8Array): js.Promise[java.lang.String] = js.native
  def hash(): js.Promise[js.Array[_]] = js.native
}

