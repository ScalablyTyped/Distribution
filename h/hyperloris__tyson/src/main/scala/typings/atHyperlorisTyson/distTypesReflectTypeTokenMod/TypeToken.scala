package typings.atHyperlorisTyson.distTypesReflectTypeTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/reflect/typeToken", "TypeToken")
@js.native
class TypeToken[T] protected () extends js.Object {
  def this(`type`: js.Array[_]) = this()
  def this(`type`: ClassType[T]) = this()
  var _hash: js.Any = js.native
  var _type: js.Any = js.native
  val hash: String = js.native
  val `type`: ClassType[T] | js.Array[_] = js.native
}

