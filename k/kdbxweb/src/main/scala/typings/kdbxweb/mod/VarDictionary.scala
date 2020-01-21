package typings.kdbxweb.mod

import typings.kdbxweb.AnonBool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "VarDictionary")
@js.native
class VarDictionary () extends js.Object {
  def get(key: String): js.Object = js.native
  def keys(): js.Array[String] = js.native
  def remove(key: String): Unit = js.native
  def set(key: String, `type`: Double, value: js.Object): Unit = js.native
  def write(stm: BinaryStream): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "VarDictionary")
@js.native
object VarDictionary extends js.Object {
  var ValueType: AnonBool = js.native
  def read(stm: BinaryStream): VarDictionary = js.native
}

