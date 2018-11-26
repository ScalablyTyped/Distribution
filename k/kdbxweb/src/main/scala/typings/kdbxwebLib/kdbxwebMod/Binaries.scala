package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Binaries")
@js.native
class Binaries () extends js.Object {
  def add(value: ProtectedValue): stdLib.Promise[BinaryInforamtion] = js.native
  def add(value: stdLib.ArrayBuffer): stdLib.Promise[BinaryInforamtion] = js.native
  def assignIds(): scala.Unit = js.native
  def getBinaryHash(binary: ProtectedValue): stdLib.Promise[java.lang.String] = js.native
  def getBinaryHash(binary: stdLib.ArrayBuffer): stdLib.Promise[java.lang.String] = js.native
  def getBinaryHash(binary: stdLib.Uint8Array): stdLib.Promise[java.lang.String] = js.native
  def hash(): stdLib.Promise[js.Array[_]] = js.native
}

