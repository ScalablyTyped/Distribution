package typings.kdbxweb.mod

import typings.kdbxweb.anon.Bool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "VarDictionary")
@js.native
class VarDictionary () extends StObject {
  
  def get(key: String): js.Object = js.native
  
  def keys(): js.Array[String] = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String, `type`: Double, value: js.Object): Unit = js.native
  
  def write(stm: BinaryStream): Unit = js.native
}
/* static members */
object VarDictionary {
  
  @JSImport("kdbxweb", "VarDictionary")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "VarDictionary.ValueType")
  @js.native
  def ValueType: Bool = js.native
  @scala.inline
  def ValueType_=(x: Bool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "VarDictionary.read")
  @js.native
  def read(stm: BinaryStream): VarDictionary = js.native
}
