package typings.hyperlorisTyson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/typeAdapter", JSImport.Namespace)
@js.native
object typeAdapterMod extends js.Object {
  @js.native
  abstract class TypeAdapter[T] () extends js.Object {
    /* protected */ def _fromJson(json: js.Any): T | js.Array[T] = js.native
    /* protected */ def _toJson(src: T): js.Any = js.native
    def fromJson(json: js.Any): js.UndefOr[T | js.Array[T]] = js.native
    def toJson(src: T): js.Any = js.native
  }
  
}

