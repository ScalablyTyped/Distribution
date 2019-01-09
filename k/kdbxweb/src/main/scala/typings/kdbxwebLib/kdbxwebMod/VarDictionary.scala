package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "VarDictionary")
@js.native
class VarDictionary () extends js.Object {
  def get(key: java.lang.String): js.Object = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, `type`: scala.Double, value: js.Object): scala.Unit = js.native
  def write(stm: BinaryStream): scala.Unit = js.native
}

@JSImport("kdbxweb", "VarDictionary")
@js.native
object VarDictionary extends js.Object {
  var ValueType: kdbxwebLib.Anon_Bool = js.native
  def read(stm: kdbxwebLib.kdbxwebMod.BinaryStream): kdbxwebLib.kdbxwebMod.VarDictionary = js.native
}

