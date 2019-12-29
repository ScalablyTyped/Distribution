package typings.atHyperlorisTyson

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/reflect/typeToken", JSImport.Namespace)
@js.native
object distTypesReflectTypeTokenMod extends js.Object {
  @js.native
  trait ClassType[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
  
  @js.native
  class TypeToken[T] protected () extends js.Object {
    def this(`type`: js.Array[_]) = this()
    def this(`type`: ClassType[T]) = this()
    var _hash: js.Any = js.native
    var _type: js.Any = js.native
    val hash: String = js.native
    val `type`: ClassType[T] | js.Array[_] = js.native
  }
  
}

