package typings
package atHyperlorisTysonLib.distTypesTypeAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/typeAdapter", "TypeAdapter")
@js.native
abstract class TypeAdapter[T] () extends js.Object {
  /* protected */ def _fromJson(json: js.Any): T | js.Array[T] = js.native
  /* protected */ def _toJson(src: T): js.Any = js.native
  def fromJson(json: js.Any): js.UndefOr[T | js.Array[T]] = js.native
  def toJson(src: T): js.Any = js.native
}

